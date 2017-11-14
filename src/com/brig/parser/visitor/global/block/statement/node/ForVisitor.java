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

import generated.brigBaseVisitor;
import generated.brigParser;

public class ForVisitor extends brigBaseVisitor<TypeWrapper> {

	private StatementBlockVisitor statementBlockVisitor;
	private ExpressionVisitor expressionVisitor;
	private AssignVisitor assignVisitor;
	private Scope scope;
	
	public ForVisitor(Scope scope){
		this.scope = scope;
		this.assignVisitor = new AssignVisitor(this.scope);
		this.expressionVisitor = new ExpressionVisitor(this.scope);
		this.statementBlockVisitor = new StatementBlockVisitor(this.scope);
	}
	
	@Override 
	public TypeWrapper visitFor_statement(@NotNull brigParser.For_statementContext ctx) {	
		
		@SuppressWarnings("unused")
		TypeWrapper assign = ctx.assign(0).accept(this.assignVisitor);
		TypeWrapper condition = ctx.expression().accept(this.expressionVisitor);
		TypeWrapper body = null;
		
		while (condition.asBoolean()){
			body = ctx.stat_block().accept(this.statementBlockVisitor);		// step into for loop's {body block}
			
			assign = ctx.assign(1).accept(this.assignVisitor);				// step into second for loop's assignment
		
			condition = ctx.expression().accept(this.expressionVisitor);	// step into condition again
		}
		
		return body; 
	}

	
}
