package com.brig.parser.visitor.global.block.statement.node;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class WhileVisitor  extends brigBaseVisitor<TypeWrapper> {

	private StatementBlockVisitor statementBlockVisitor;
	private ExpressionVisitor expressionVisitor;
	private Scope scope;
	
	public WhileVisitor(Scope scope){
		this.scope = scope;
		this.expressionVisitor = new ExpressionVisitor(scope);
		this.statementBlockVisitor = new StatementBlockVisitor(scope);
	}
	
	@Override
	public TypeWrapper visitWhile_statement(brigParser.While_statementContext ctx) { 
		TypeWrapper expression = ctx.expression(0).accept(this.expressionVisitor);
		while(expression.asBoolean()){
			ctx.stat_block().accept(this.statementBlockVisitor);
			expression = ctx.expression(0).accept(this.expressionVisitor);
		}
		return expression.VOID; 
	}
}
