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

import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;
import com.brig.parser.visitor.global.block.statement.StatementVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigParser.Switch_expressionContext;

import org.antlr.v4.runtime.misc.NotNull;

import com.brig.parser.domain.Scope;
import generated.brigBaseVisitor;

public class SwitchStatement extends brigBaseVisitor<TypeWrapper>{
	
	private StatementBlockVisitor statementBlockVisitor;
	private ExpressionVisitor expressionVisitor;
	private StatementVisitor statementVisitor;
	private Scope scope;
	
	public SwitchStatement(Scope scope){
		this.scope = scope;
		this.statementVisitor = new StatementVisitor(this.scope);
		this.expressionVisitor = new ExpressionVisitor(this.scope);
		this.statementBlockVisitor = new StatementBlockVisitor(this.scope);
	}
	
	@Override 
	public TypeWrapper visitSwitch_statement(@NotNull brigParser.Switch_statementContext ctx) { 
		TypeWrapper expression = ctx.expression(0).accept(expressionVisitor);
		TypeWrapper switchStatement = null;
		TypeWrapper case_exp = null;
		
        for(Switch_expressionContext condition : ctx.switch_expression()) {				// for each 'case' expression
        	
        	if(condition.expression() != null)											// check if it is 'case' expression
        		case_exp = condition.expression().accept(this.expressionVisitor);
        	else																		// else it is 'default' expression
        		switchStatement = condition.statement().accept(this.statementVisitor);
        	
        	if(case_exp == expression){													// check each case 
            	switchStatement = condition.stat_block().accept(this.statementBlockVisitor);
            	break;
        	}
        }
        
        return switchStatement;
	}

}
