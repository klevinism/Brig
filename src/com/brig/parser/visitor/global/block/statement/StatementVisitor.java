package com.brig.parser.visitor.global.block.statement;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.node.AssignVisitor;
import com.brig.parser.visitor.global.block.statement.node.ForVisitor;
import com.brig.parser.visitor.global.block.statement.node.IfVisitor;
import com.brig.parser.visitor.global.block.statement.node.PrintVisitor;
import com.brig.parser.visitor.global.block.statement.node.WhileVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class StatementVisitor extends brigBaseVisitor<TypeWrapper>{

	private Scope scope;
	
	public StatementVisitor(Scope scope){
		this.scope = scope;
	}
	
    // assignment/id overrides
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {
        return ctx.accept(new AssignVisitor(scope));
    }
    
    @Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
        return ctx.accept(new PrintVisitor(scope));
    }
    
    @Override
    public TypeWrapper visitIf_statement(brigParser.If_statementContext ctx) {
        return ctx.accept(new IfVisitor(scope));
    }

	@Override 
	public TypeWrapper visitWhile_statement(brigParser.While_statementContext ctx) { 
		return ctx.accept(new WhileVisitor(scope)); 
	}

	@Override 
	public TypeWrapper visitFor_statement(brigParser.For_statementContext ctx) {
		return ctx.accept(new ForVisitor(scope)); 
	}
}
