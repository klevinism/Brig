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

public class SwitchStatement extends brigBaseVisitor<TypeWrapper> {
	
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
