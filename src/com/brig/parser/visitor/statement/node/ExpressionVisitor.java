package com.brig.parser.visitor.statement.node;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.util.ConstantValue;
import com.brig.parser.util.Util;

import generated.brigParser;
import generated.brigBaseVisitor;

public class ExpressionVisitor extends brigBaseVisitor<TypeWrapper> {
	
	private ExpressionVisitor expressionVisitor;
	
	private AtomVisitor atomVisitor;
	
	public ExpressionVisitor(Scope scope){
		atomVisitor = new AtomVisitor(scope);
		 this.expressionVisitor = this;
	}
	
    @Override
    public TypeWrapper visitRelationalExpr(brigParser.RelationalExprContext ctx) {
    	TypeWrapper left = ctx.expression(0).accept(expressionVisitor);
    	TypeWrapper right = ctx.expression(1).accept(expressionVisitor);
    	
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
    	TypeWrapper left = ctx.expression(0).accept(expressionVisitor);
    	TypeWrapper right = ctx.expression(1).accept(expressionVisitor);

    	switch (ctx.op.getType()) {
            case brigParser.EQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) < ConstantValue.SMALL_VALUE) :
                        new TypeWrapper(left.equals(right));
            case brigParser.NEQ:
                return left.isInteger() && right.isInteger() ?
                        new TypeWrapper(Math.abs(left.asInteger() - right.asInteger()) >= ConstantValue.SMALL_VALUE) :
                        new TypeWrapper(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + brigParser.tokenNames[ctx.op.getType()]);
        }
    }
    
    @Override
    public TypeWrapper visitMultiplicationExpr(brigParser.MultiplicationExprContext ctx) {
    	TypeWrapper left = ctx.expression(0).accept(expressionVisitor);
    	TypeWrapper right = ctx.expression(1).accept(expressionVisitor);

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
    public TypeWrapper visitAdditiveExpr(brigParser.AdditiveExprContext ctx) {
    	TypeWrapper left = ctx.expression(0).accept(expressionVisitor);
    	TypeWrapper right = ctx.expression(1).accept(expressionVisitor);
	    	
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
    public TypeWrapper visitParExpr(brigParser.ParExprContext ctx) {
        return ctx.expression().accept(expressionVisitor);
    }
    
	@Override public TypeWrapper visitAtomExpr(brigParser.AtomExprContext ctx) { 
		return ctx.accept(atomVisitor); 
	}
   
}
