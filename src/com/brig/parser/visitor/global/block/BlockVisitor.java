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

package com.brig.parser.visitor.global.block;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.StatementVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;
import generated.brigParser.StatementContext;

public class BlockVisitor  extends brigBaseVisitor<TypeWrapper> {

	private StatementVisitor statementVisitor;
	private Scope scope;
	
	public BlockVisitor(Scope scope){
		this.scope = scope;
		this.statementVisitor = new StatementVisitor(this.scope);
	}
	
	@Override public TypeWrapper visitBlock(brigParser.BlockContext ctx) {
		for(StatementContext statement : ctx.statement()){
			statement.accept(this.statementVisitor);	
		}
		return null;
	}

}
