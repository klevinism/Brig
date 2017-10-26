package com.brig.parser.visitor.global.block.statement.node;

import generated.brigParser;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.expression.node.LocalVariable;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigBaseVisitor;

public class AssignVisitor extends brigBaseVisitor<TypeWrapper> {
	private final Scope scope;
	private ExpressionVisitor expression;
	
	public AssignVisitor(Scope scope){
		this.scope = scope;
		expression = new ExpressionVisitor(scope);
	}
	
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        
        TypeWrapper tw = ctx.expression().accept(expression);

        LocalVariable variable = new LocalVariable(id, tw, this.scope);

        scope.addVariable(id, variable);
        
        return variable.getValue();
    }
}