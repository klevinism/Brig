package com.brig.parser.visitor;

import java.util.List;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.statement.AssignVisitor;
import com.brig.parser.visitor.statement.IfVisitor;
import com.brig.parser.visitor.statement.PrintVisitor;
import com.brig.parser.visitor.statement.WhileVisitor;

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

}
