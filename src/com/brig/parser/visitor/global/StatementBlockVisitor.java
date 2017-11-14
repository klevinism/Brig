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

package com.brig.parser.visitor.global;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.BlockVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class StatementBlockVisitor extends brigBaseVisitor<TypeWrapper> {
	
	private ExpressionVisitor expressionVisitor;
	private BlockVisitor blockVisitor;
	private Scope scope;
	
	public StatementBlockVisitor(Scope scope){
		this.expressionVisitor = new ExpressionVisitor(scope);
		this.blockVisitor = new BlockVisitor(scope);
		this.scope = scope;		
	}
	
    @Override 
    public TypeWrapper visitStat_block(brigParser.Stat_blockContext ctx) {
    	
    	if(ctx.expression() != null)
    		return ctx.expression().accept(this.expressionVisitor);
    	else {
    		return ctx.block().accept(this.blockVisitor);
    	}
    }
}
