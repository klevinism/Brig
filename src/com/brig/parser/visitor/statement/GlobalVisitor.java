package com.brig.parser.visitor.statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.brigBaseVisitor;
import antlr.brigLexer;
import antlr.brigParser;
import antlr.brigParser.Condition_blockContext;
import antlr.brigParser.Switch_expressionContext;
import wrapper.TypeWrapper;

public class GlobalVisitor extends brigBaseVisitor<TypeWrapper>{

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // static reference to self
    public static GlobalVisitor visitor = new GlobalVisitor();
    
    // method visitor, visits only functions/methods
    public static MethodVisitor methodVisitor = new MethodVisitor();
    
    // store variables (there's only one global scope!)
    public static Map<String, TypeWrapper> globalScopeVar = new HashMap<String, TypeWrapper>();    
  
	@Override public TypeWrapper visitImportBlocks(brigParser.ImportBlocksContext ctx) { 
		String importTxt = ctx.atom().getText();
		String importPath = importTxt.substring(importTxt.indexOf('"')+1, importTxt.lastIndexOf('"'));	
		
        ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(importPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		brigLexer lexer = new brigLexer(input);
        brigParser parser = new brigParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.program();
		
		return this.visit(tree); 
	}

    // assignment/id overrides
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        TypeWrapper tw = this.visit(ctx.expression());
        
        return globalScopeVar.put(id, tw);
    }
    
    @Override
    public TypeWrapper visitNumberAtom(brigParser.NumberAtomContext ctx){
        return new TypeWrapper(Integer.parseInt(ctx.getText()));
    }
    
    @Override
    public TypeWrapper visitBooleanAtom(brigParser.BooleanAtomContext ctx) {
        return new TypeWrapper(Boolean.valueOf(ctx.getText()));
    }
    
    // expr overrides
    @Override
    public TypeWrapper visitParExpr(brigParser.ParExprContext ctx) {
        return this.visit(ctx.expression());
    }
    
    @Override
    public TypeWrapper visitStringAtom(brigParser.StringAtomContext ctx){       
    	String str = ctx.getText();
    	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
    	return new TypeWrapper(str);
    }

	@Override public TypeWrapper visitFunction(brigParser.FunctionContext ctx) { 
		return methodVisitor.visit(ctx);
	}

	
	@Override public TypeWrapper visitFunction_declaration(brigParser.Function_declarationContext ctx) {
		return methodVisitor.visit(ctx);
	}
    
    @Override
    public TypeWrapper visitAdditiveExpr(brigParser.AdditiveExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));
	    	
        switch (ctx.op.getType()) {
            case brigParser.PLUS:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(left.asInteger() + right.asInteger()) :
                        new TypeWrapper(left.asString() + right.asString());
            case brigParser.MINUS:
                return new TypeWrapper(left.asInteger() - right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + brigParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public TypeWrapper visitRelationalExpr(brigParser.RelationalExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case brigParser.LT:
                return new TypeWrapper(left.asInteger() < right.asInteger());
            case brigParser.LTEQ:
                return new TypeWrapper(left.asInteger() <= right.asInteger());
            case brigParser.GT:
                return new TypeWrapper(left.asInteger() > right.asInteger());
            case brigParser.GTEQ:
                return new TypeWrapper(left.asInteger() >= right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + brigParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public TypeWrapper visitEqualityExpr( brigParser.EqualityExprContext ctx) {
    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

    	switch (ctx.op.getType()) {
            case brigParser.EQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) < SMALL_VALUE) :
                        new TypeWrapper(left.equals(right));
            case brigParser.NEQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) >= SMALL_VALUE) :
                        new TypeWrapper(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + brigParser.tokenNames[ctx.op.getType()]);
        }
    }
        
	@Override public TypeWrapper visitIdAtom( brigParser.IdAtomContext ctx) { 
		String id = ctx.ID().getText();
		TypeWrapper tw = globalScopeVar.get(id);
        if(tw == null) {
           if(MethodVisitor.methodMemory.get(id) == null){
               throw new RuntimeException("no such variable: " + id);
           }
        }
        return tw;
	}

    @Override
    public TypeWrapper visitMultiplicationExpr(brigParser.MultiplicationExprContext ctx) {

    	TypeWrapper left = this.visit(ctx.expression(0));
    	TypeWrapper right = this.visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case brigParser.MULT:
                return new TypeWrapper(left.asInteger() * right.asInteger());
            case brigParser.DIV:
                return new TypeWrapper(left.asInteger() / right.asInteger());
            case brigParser.MOD:
                return new TypeWrapper(left.asInteger() % right.asInteger());
            default:
                throw new RuntimeException("unknown operator: " + brigParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public TypeWrapper visitIf_statement(brigParser.If_statementContext ctx) {
        List<brigParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(brigParser.Condition_blockContext condition : conditions) {      	
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
    

	@Override public TypeWrapper visitReturn_statement(brigParser.Return_statementContext ctx) {
		//System.out.println(ctx.getText()+"ASDFasd");
		return methodVisitor.visitChildren(ctx);
	}

    
	@Override 
	public TypeWrapper visitWhile_statement(brigParser.While_statementContext ctx) { 
		TypeWrapper expression = this.visit(ctx.expression(0));
		while(expression.asBoolean()){
			this.visit(ctx.stat_block());
			expression = this.visit(ctx.expression(0));
		}
			return expression.VOID; 
	}
	
	@Override 
	public TypeWrapper visitFor_statement(brigParser.For_statementContext ctx) {
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
	
	@Override public TypeWrapper visitSwitch_statement(brigParser.Switch_statementContext ctx) { 
		TypeWrapper expression = this.visit(ctx.expression(0));
		TypeWrapper switchStatement = null;
		List<brigParser.Switch_expressionContext>switchExpressionList = ctx.switch_expression();
		
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
    public TypeWrapper visitStat_block(brigParser.Stat_blockContext ctx) {
    	return visitChildren(ctx); 
    }

    @Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	TypeWrapper output = new TypeWrapper("");
    	String printing = ctx.print_exp().getText();
    	
    	if(ctx.expression() != null){
    		
	    	if(this.visit(ctx.expression()) != null){
	    		output = this.visit(ctx.expression());
	    	}else{
	    		output = methodVisitor.visit(ctx.expression());
	    	}
    	}else{    		
	    	if(this.visit(ctx.statement()) != null){
	    		System.out.println(ctx.statement().getText());
	    		output = this.visit(ctx.statement());
	    	}else{
	    		output = methodVisitor.visit(ctx.statement());
	    	}

    	}
    	
    	switch(printing){
    		case "print" : System.out.print(output); break;
    		case "println" : System.out.println(output); break;
    		default : throw new RuntimeException("Undefined parameter" + printing);
    	}
    	
        return output;
    }
}
