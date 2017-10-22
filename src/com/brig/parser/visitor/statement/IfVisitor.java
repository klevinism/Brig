package com.brig.parser.visitor.statement;

import java.util.List;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.StatementBlockVisitor;
import com.brig.parser.visitor.statement.node.ExpressionVisitor;

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
