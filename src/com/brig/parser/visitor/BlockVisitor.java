package com.brig.parser.visitor;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigBaseVisitor;
import generated.brigParser;

public class BlockVisitor  extends brigBaseVisitor<TypeWrapper> {

	private StatementVisitor statementVisitor;
	private Scope scope;
	
	public BlockVisitor(Scope scope){
		this.scope = scope;
		this.statementVisitor = new StatementVisitor(this.scope);
	}
	
	@Override public TypeWrapper visitBlock(brigParser.BlockContext ctx) {
		return ctx.statement(0).accept(this.statementVisitor); 
	}

}
