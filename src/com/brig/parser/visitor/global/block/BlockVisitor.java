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
