package com.brig.parser.visitor.statement;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.statement.node.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class WhileVisitor  extends brigBaseVisitor<TypeWrapper> {

	private ExpressionVisitor expressionVisitor;
	private Scope scope;
	
	public WhileVisitor(Scope scope){
		this.scope = scope;
		this.expressionVisitor = new ExpressionVisitor(scope);
	}
	
	@Override 
	public TypeWrapper visitWhile_statement(brigParser.While_statementContext ctx) { 
		TypeWrapper expression = ctx.expression(0).accept(this.expressionVisitor);
		while(expression.asBoolean()){
			this.visit(ctx.stat_block());
			expression = ctx.expression(0).accept(this.expressionVisitor);
		}
		
		return expression.VOID; 
	}
}
