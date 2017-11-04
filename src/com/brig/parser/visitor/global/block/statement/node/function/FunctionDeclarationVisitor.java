package com.brig.parser.visitor.global.block.statement.node.function;

import java.util.List;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.expression.node.Function;
import com.brig.parser.domain.expression.node.FunctionDeclaration;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class FunctionDeclarationVisitor extends brigBaseVisitor<TypeWrapper>{
	
	private StatementBlockVisitor statementBlockVisitor;
	private ArgumentVisitor argumentsVisitor;
	private Scope scope;
	
	public FunctionDeclarationVisitor(Scope scope){
		this.scope = scope;
		this.statementBlockVisitor = new StatementBlockVisitor(this.scope);
		this.argumentsVisitor = new ArgumentVisitor(this.scope);	
	}

	@Override 
	public TypeWrapper visitFunction_declaration(brigParser.Function_declarationContext ctx) {
		String name = ctx.funName.getText();
		List<TypeWrapper> arguments = null;
		
		if(ctx.arguments() != null)
			arguments = ctx.arguments().accept(argumentsVisitor);
		
		FunctionDeclaration functionDeclaration = new FunctionDeclaration(new Function(name, arguments));

		this.scope.addFunctionDeclaration(functionDeclaration);
		
		if(this.scope.isFunctionSignature(functionDeclaration)){						// if we encountered any function previously
			this.scope.getFunctionSignature(name).getBlock().accept(this.statementBlockVisitor);		//	visit function body
			return this.scope.getFunctionSignature(name).getValue();
		}
		
		return new TypeWrapper(null);		// if function is void
	}

}
