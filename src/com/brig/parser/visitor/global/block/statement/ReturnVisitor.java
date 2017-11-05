package com.brig.parser.visitor.global.block.statement;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class ReturnVisitor extends brigBaseVisitor<TypeWrapper>{

	private ExpressionVisitor expressionVisitor;
	private StatementVisitor statementVisitor;
	private Scope globalScope;
	private Scope scope;
	
	public ReturnVisitor(Scope scope){
		this.globalScope = scope;
		this.scope = scope.getCurrentFunctionSignature().getScope();		// Scope of function
		this.statementVisitor = new StatementVisitor(this.scope);
		this.expressionVisitor = new ExpressionVisitor(this.scope);
	}
	
	@Override 
	public TypeWrapper visitReturn_statement(brigParser.Return_statementContext ctx) {
		
		TypeWrapper returnObject = null;
		
		if(ctx.statement() != null)
			returnObject = ctx.statement().accept(statementVisitor);
		else if(ctx.expression() != null)
			returnObject = ctx.expression().accept(expressionVisitor);
		else
			System.err.println("Unknown statement" + ctx.getText());
	
		this.globalScope.getCurrentFunctionSignature().addValue(returnObject);
		
		return returnObject;
	}
}
