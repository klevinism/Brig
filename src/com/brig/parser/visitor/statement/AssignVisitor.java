package com.brig.parser.visitor.statement;

import generated.brigParser;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigBaseVisitor;

public class AssignVisitor extends brigBaseVisitor<TypeWrapper> {
	Scope scope;
	
	public AssignVisitor(Scope scope){
		this.scope = scope;
	}
	
	//assignment/id overrides
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        TypeWrapper tw = new TypeWrapper(ctx.expression().getText());
        return scope.localVariables.put(id, tw);
    }
}