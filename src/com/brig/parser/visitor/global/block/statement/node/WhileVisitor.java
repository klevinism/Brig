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

package com.brig.parser.visitor.global.block.statement.node;

import org.antlr.v4.runtime.misc.NotNull;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class WhileVisitor  extends brigBaseVisitor<TypeWrapper> {

	private StatementBlockVisitor statementBlockVisitor;
	private ExpressionVisitor expressionVisitor;
	private Scope scope;
	
	public WhileVisitor(Scope scope){
		this.scope = scope;
		this.expressionVisitor = new ExpressionVisitor(scope);
		this.statementBlockVisitor = new StatementBlockVisitor(scope);
	}
	
	/**
	 * Once walker encounters a while loop this method will be called. 
	 * 
	 * @param ctx : context of the while loop statement
	 * @return void : On TypeWrapper
	 */
	@Override
	public TypeWrapper visitWhile_statement(@NotNull brigParser.While_statementContext ctx) { 
		TypeWrapper expression = ctx.expression(0).accept(this.expressionVisitor);
		while(expression.asBoolean()){
			ctx.stat_block().accept(this.statementBlockVisitor);
			expression = ctx.expression(0).accept(this.expressionVisitor);
		}
		return expression.VOID; 
	}
}
