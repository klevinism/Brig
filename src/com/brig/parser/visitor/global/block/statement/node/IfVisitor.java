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

import java.util.List;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class IfVisitor extends brigBaseVisitor<TypeWrapper> {

	private StatementBlockVisitor statementBlockVisitor;
	private ExpressionVisitor expression;
	private Scope scope;
	
	public IfVisitor(Scope scope){
		this.scope = scope;
		this.expression = new ExpressionVisitor(this.scope);
		this.statementBlockVisitor = new StatementBlockVisitor(this.scope);
	}
	
    @Override
    public TypeWrapper visitIf_statement(brigParser.If_statementContext ctx) {
        List<brigParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;
        for(brigParser.Condition_blockContext condition : conditions) {   
        	TypeWrapper evaluated = condition.expression().accept(this.expression);
            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                condition.stat_block().accept(statementBlockVisitor);
                break;
            }
        }

        if(!evaluatedBlock && ctx.stat_block() != null) {
            ctx.stat_block().accept(statementBlockVisitor);
        }

        return TypeWrapper.VOID;
    }

	
}
