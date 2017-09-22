import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import generated.GYOOBaseVisitor;
import generated.GYOOParser;
import generated.GYOOParser.Condition_blockContext;
import generated.GYOOParser.Switch_expressionContext;
import wrapper.TypeWrapper;

public class EvalVisitor extends GYOOBaseVisitor<TypeWrapper>{

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, TypeWrapper> memory = new HashMap<String, TypeWrapper>();

    // assignment/id overrides
    @Override
    public TypeWrapper visitAssign(GYOOParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        TypeWrapper tw = this.visit(ctx.expression());
        return memory.put(id, tw);
    }
    
    @Override
    public TypeWrapper visitNumberAtom(GYOOParser.NumberAtomContext ctx){
        return new TypeWrapper(Integer.parseInt(ctx.getText()));
    }
    
    @Override
    public TypeWrapper visitBooleanAtom(GYOOParser.BooleanAtomContext ctx) {
        return new TypeWrapper(Boolean.valueOf(ctx.getText()));
    }
    
    // expr overrides
    @Override
    public TypeWrapper visitParExpr(GYOOParser.ParExprContext ctx) {
        return this.visit(ctx.expression());
    }
    
    @Override
    public TypeWrapper visitStringAtom(GYOOParser.StringAtomContext ctx){        
    	String str = ctx.getText();
    	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
    	return new TypeWrapper(str);
    }

    @Override
    public TypeWrapper visitAdditiveExpr(@NotNull GYOOParser.AdditiveExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));
	    	
        switch (ctx.op.getType()) {
            case GYOOParser.PLUS:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(left.asInteger() + right.asInteger()) :
                        new TypeWrapper(left.asString() + right.asString());
            case GYOOParser.MINUS:
                return new TypeWrapper(left.asInteger() - right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + GYOOParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public TypeWrapper visitRelationalExpr(@NotNull GYOOParser.RelationalExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case GYOOParser.LT:
                return new TypeWrapper(left.asInteger() < right.asInteger());
            case GYOOParser.LTEQ:
                return new TypeWrapper(left.asInteger() <= right.asInteger());
            case GYOOParser.GT:
                return new TypeWrapper(left.asInteger() > right.asInteger());
            case GYOOParser.GTEQ:
                return new TypeWrapper(left.asInteger() >= right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + GYOOParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public TypeWrapper visitEqualityExpr(@NotNull GYOOParser.EqualityExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

    	switch (ctx.op.getType()) {
            case GYOOParser.EQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) < SMALL_VALUE) :
                        new TypeWrapper(left.equals(right));
            case GYOOParser.NEQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) >= SMALL_VALUE) :
                        new TypeWrapper(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + GYOOParser.tokenNames[ctx.op.getType()]);
        }
    }
    
	@Override public TypeWrapper visitIdAtom(@NotNull GYOOParser.IdAtomContext ctx) { 
		String id = ctx.ID().getText();
		TypeWrapper tw = memory.get(id);
        if(tw == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return tw; 
	}


    @Override
    public TypeWrapper visitMultiplicationExpr(@NotNull GYOOParser.MultiplicationExprContext ctx) {

    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case GYOOParser.MULT:
                return new TypeWrapper(left.asInteger() * right.asInteger());
            case GYOOParser.DIV:
                return new TypeWrapper(left.asInteger() / right.asInteger());
            case GYOOParser.MOD:
                return new TypeWrapper(left.asInteger() % right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + GYOOParser.tokenNames[ctx.op.getType()]);
        }
    }
    
 // if override
    @Override
    public TypeWrapper visitIf_statement(GYOOParser.If_statementContext ctx) {
        List<GYOOParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(Condition_blockContext condition : conditions) {      	
        	TypeWrapper evaluated = this.visit(condition.expression());
            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            this.visit(ctx.stat_block());
        }

        return TypeWrapper.VOID;
    }
    
	@Override 
	public TypeWrapper visitWhile_statement(GYOOParser.While_statementContext ctx) { 
		TypeWrapper expression = this.visit(ctx.expression(0));
		while(expression.asBoolean()){
			this.visit(ctx.stat_block());
			expression = this.visit(ctx.expression(0));
		}
			return expression.VOID; 
	}
	
	@Override 
	public TypeWrapper visitFor_statement(GYOOParser.For_statementContext ctx) {
		TypeWrapper assign = this.visit(ctx.assign());
		TypeWrapper condition = this.visit(ctx.expression());
		TypeWrapper stat_blck2 = null;

		while (condition.asBoolean()){
			stat_blck2 = this.visit(ctx.stat_block(1));
			TypeWrapper stat_blck = this.visit(ctx.stat_block(0));
			condition = this.visit(ctx.expression());
		}
		
		return stat_blck2.VOID; 
	}
	
	@Override public TypeWrapper visitSwitch_statement(GYOOParser.Switch_statementContext ctx) { 
		TypeWrapper expression = this.visit(ctx.expression(0));
		TypeWrapper switchStatement = null;
		List<GYOOParser.Switch_expressionContext>switchExpressionList = ctx.switch_expression();
		
		boolean eval = false;
		
        for(Switch_expressionContext condition : switchExpressionList) {
        	TypeWrapper case_exp = null;

        	if(condition.expression() == null){
    			eval = true;
    			switchStatement = this.visit(condition.statement());
    			break;	
        	}else{
        		case_exp = this.visit(condition.expression());	
        	}
        	
    		if(expression.asString().equals(case_exp.asString())){
    			eval = true;
    			switchStatement = this.visit(condition.stat_block());
    			break;	
    		}
        }
        
        return TypeWrapper.VOID;
	}

	

    @Override 
    public TypeWrapper visitStat_block(GYOOParser.Stat_blockContext ctx) {
    	return visitChildren(ctx); 
    }
    
    @Override
    public TypeWrapper visitPrint(GYOOParser.PrintContext ctx){
    	TypeWrapper output = this.visit(ctx.atom());
    	String printing = ctx.print_exp().getText();
    	switch(printing){
    		case "print" :System.out.print(output);break;
    		case "println" :System.out.println(output);break;
    		default : throw new RuntimeException("Undefined parameter" + printing);
    	}
        return output;
    }
}
