package com.brig.parser.visitor.global.block.statement.node;

import generated.brigParser;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.expression.node.LocalVariable;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.StatementVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigBaseVisitor;

public class AssignVisitor extends brigBaseVisitor<TypeWrapper> {
	
	private final Scope scope;
	private ExpressionVisitor expressionVisitor;
	private StatementVisitor statementVisitor;
	
	public AssignVisitor(Scope scope){
		this.scope = scope;
		this.statementVisitor = new StatementVisitor(this.scope);
		this.expressionVisitor = new ExpressionVisitor(this.scope);
	}
	
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        TypeWrapper tw = new TypeWrapper("");
        
        if(ctx.expression() != null)
        	tw = ctx.expression().accept(expressionVisitor);

        if(ctx.statement() != null){
        	tw = ctx.statement().accept(statementVisitor);
        }
        
        LocalVariable variable = new LocalVariable(id, tw, this.scope);

        scope.addVariable(id, variable);
        
        return variable.getValue();
    }
}