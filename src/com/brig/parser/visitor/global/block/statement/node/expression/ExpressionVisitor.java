/*
MIT License

Copyright (c) 2017 Klevin Delimeta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package com.brig.parser.visitor.global.block.statement.node.expression;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.util.ConstantValue;
import com.brig.parser.visitor.global.block.statement.node.expression.atom.AtomVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class ExpressionVisitor extends brigBaseVisitor<TypeWrapper> {
	
	private ExpressionVisitor expressionVisitor;
	private AtomVisitor atomVisitor;
	private Scope scope;
	
	public ExpressionVisitor(Scope scope){
		this.scope = scope;
		this.expressionVisitor = this;
		this.atomVisitor = new AtomVisitor(this.scope);
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
