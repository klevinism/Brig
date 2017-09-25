import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import generated.rougeBaseVisitor;
import generated.rougeParser;
import generated.rougeParser.Condition_blockContext;
import generated.rougeParser.Stat_blockContext;
import generated.rougeParser.Switch_expressionContext;
import wrapper.TypeWrapper;

public class EvalVisitor extends rougeBaseVisitor<TypeWrapper>{

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, TypeWrapper> memory = new HashMap<String, TypeWrapper>();    

    // store methods
    private Map<String, Stat_blockContext> memoryFunctions = new HashMap<String, Stat_blockContext>();
    
    // assignment/id overrides
    @Override
    public TypeWrapper visitAssign(rougeParser.AssignContext ctx) {
    	System.out.println(ctx.getText());

        String id = ctx.ID().getText();
        TypeWrapper tw = this.visit(ctx.expression());
        return memory.put(id, tw);
    }
    
    @Override
    public TypeWrapper visitNumberAtom(rougeParser.NumberAtomContext ctx){
        return new TypeWrapper(Integer.parseInt(ctx.getText()));
    }
    
    @Override
    public TypeWrapper visitBooleanAtom(rougeParser.BooleanAtomContext ctx) {
        return new TypeWrapper(Boolean.valueOf(ctx.getText()));
    }
    
    // expr overrides
    @Override
    public TypeWrapper visitParExpr(rougeParser.ParExprContext ctx) {
        return this.visit(ctx.expression());
    }
    
    @Override
    public TypeWrapper visitStringAtom(rougeParser.StringAtomContext ctx){        
    	String str = ctx.getText();
    	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
    	return new TypeWrapper(str);
    }

    @Override
    public TypeWrapper visitAdditiveExpr(@NotNull rougeParser.AdditiveExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));
	    	
        switch (ctx.op.getType()) {
            case rougeParser.PLUS:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(left.asInteger() + right.asInteger()) :
                        new TypeWrapper(left.asString() + right.asString());
            case rougeParser.MINUS:
                return new TypeWrapper(left.asInteger() - right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + rougeParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override	
    public TypeWrapper visitRelationalExpr(@NotNull rougeParser.RelationalExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case rougeParser.LT:
                return new TypeWrapper(left.asInteger() < right.asInteger());
            case rougeParser.LTEQ:
                return new TypeWrapper(left.asInteger() <= right.asInteger());
            case rougeParser.GT:
                return new TypeWrapper(left.asInteger() > right.asInteger());
            case rougeParser.GTEQ:
                return new TypeWrapper(left.asInteger() >= right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + rougeParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public TypeWrapper visitEqualityExpr(@NotNull rougeParser.EqualityExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

    	switch (ctx.op.getType()) {
            case rougeParser.EQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) < SMALL_VALUE) :
                        new TypeWrapper(left.equals(right));
            case rougeParser.NEQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) >= SMALL_VALUE) :
                        new TypeWrapper(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + rougeParser.tokenNames[ctx.op.getType()]);
        }
    }
    
	@Override public TypeWrapper visitIdAtom(@NotNull rougeParser.IdAtomContext ctx) { 
		String id = ctx.ID().getText();
		TypeWrapper tw = memory.get(id);
        if(tw == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return tw; 
	}

    @Override
    public TypeWrapper visitMultiplicationExpr(@NotNull rougeParser.MultiplicationExprContext ctx) {

    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case rougeParser.MULT:
                return new TypeWrapper(left.asInteger() * right.asInteger());
            case rougeParser.DIV:
                return new TypeWrapper(left.asInteger() / right.asInteger());
            case rougeParser.MOD:
                return new TypeWrapper(left.asInteger() % right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + rougeParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public TypeWrapper visitIf_statement(rougeParser.If_statementContext ctx) {
        List<rougeParser.Condition_blockContext> conditions =  ctx.condition_block();

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
	public TypeWrapper visitWhile_statement(rougeParser.While_statementContext ctx) { 
		TypeWrapper expression = this.visit(ctx.expression(0));
		while(expression.asBoolean()){
			this.visit(ctx.stat_block());
			expression = this.visit(ctx.expression(0));
		}
			return expression.VOID; 
	}
	
	@Override 
	public TypeWrapper visitFor_statement(rougeParser.For_statementContext ctx) {
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
	
	@Override public TypeWrapper visitSwitch_statement(rougeParser.Switch_statementContext ctx) { 
		TypeWrapper expression = this.visit(ctx.expression(0));
		TypeWrapper switchStatement = null;
		List<rougeParser.Switch_expressionContext>switchExpressionList = ctx.switch_expression();
		
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

    //TODO: Fixing ARGS !important!
	@Override public TypeWrapper visitFunction(rougeParser.FunctionContext ctx) { 
		String id = ctx.ID().getText();
		TypeWrapper args = null;
		if(ctx.arguments() != null)
			args = this.visit(ctx.arguments());
		
		if(memory.get(id) != null)
			return memory.put(id, this.visit(ctx.stat_block()));	//TODO: Needs to check if stat_block has return
		else
			memoryFunctions.put(id, ctx.stat_block());	//Save functions body with id -> visitFunction_declaration
		return null;
	}
	
	@Override public TypeWrapper visitFunction_declaration(rougeParser.Function_declarationContext ctx) { 
		String id = ctx.ID().getText();
		TypeWrapper stat_block = new TypeWrapper("");
		TypeWrapper args = null;
		if(ctx.arguments() != null)
			args = this.visit(ctx.arguments());//?????
		
		if(memoryFunctions.get(id) != null){
			 stat_block = this.visit(memoryFunctions.get(id));
			 return stat_block.VOID;			//TODO: Needs to check if function has return. Object
		}	
		else
			return memory.put(id, stat_block);	//Empty initialization -> visitFunction
	}

	
    @Override 
    public TypeWrapper visitStat_block(rougeParser.Stat_blockContext ctx) {
    	return visitChildren(ctx); 
    }
    
    @Override
    public TypeWrapper visitPrint(rougeParser.PrintContext ctx){
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
