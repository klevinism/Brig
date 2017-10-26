package com.brig.parser.visitor.global.block.statement.node;

import org.antlr.v4.runtime.misc.NotNull;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class ForVisitor extends brigBaseVisitor<TypeWrapper> {

	private StatementBlockVisitor statementBlockVisitor;
	private ExpressionVisitor expressionVisitor;
	private AssignVisitor assignVisitor;
	private Scope scope;
	
	public ForVisitor(Scope scope){
		this.scope = scope;
		this.assignVisitor = new AssignVisitor(this.scope);
		this.expressionVisitor = new ExpressionVisitor(this.scope);
		this.statementBlockVisitor = new StatementBlockVisitor(this.scope);
	}
	
	@Override 
	public TypeWrapper visitFor_statement(@NotNull brigParser.For_statementContext ctx) {	
		TypeWrapper assign = ctx.assign(0).accept(this.assignVisitor);
		TypeWrapper condition = ctx.expression().accept(this.expressionVisitor);
		TypeWrapper body = null;
		
		while (condition.asBoolean()){
			
			body = ctx.stat_block().accept(this.statementBlockVisitor);		// step into for loop's {body block}
			
			condition = ctx.expression().accept(this.expressionVisitor);	// step into condition again
			
			assign = ctx.assign(1).accept(this.assignVisitor);				// second for loop's assignment
		
		}
		
		return body.VOID; 
	}

	
}
