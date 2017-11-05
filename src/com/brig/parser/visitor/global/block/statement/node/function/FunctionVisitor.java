package com.brig.parser.visitor.global.block.statement.node.function;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.expression.node.Function;
import com.brig.parser.domain.expression.node.FunctionSignature;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.StatementBlockVisitor;

import generated.brigBaseVisitor;
import generated.brigParser.FunctionContext;
import generated.brigParser.Stat_blockContext;

public class FunctionVisitor extends brigBaseVisitor<TypeWrapper>{
	
	private StatementBlockVisitor statementBlockVisitor;
	private ParameterVisitor parametersVisitor;
	private Scope functionScope;
	private Scope scope;

	public FunctionVisitor(Scope scope){
		this.scope = scope;
		this.functionScope = new Scope("function");
		this.functionScope.setLocalVariables(this.scope.getLocalVariables());
		this.parametersVisitor = new ParameterVisitor(this.functionScope);		// new scope for parameters of functions
		this.statementBlockVisitor = new StatementBlockVisitor(this.functionScope);		
	}

	@Override 
	public TypeWrapper visitFunction(@NotNull FunctionContext ctx){
		String name = ctx.funName.getText();
		Stat_blockContext body = ctx.stat_block();
		List<String> parameters = null;

		if(ctx.arguments() != null)
			parameters = ctx.arguments().accept(this.parametersVisitor);
		
		FunctionSignature functionSignature = new FunctionSignature(new Function(name, body, parameters), new Scope("function"));
		
		this.scope.addFunctionSignature(functionSignature);

		if(this.scope.isFunctionDeclaration(functionSignature)){					// if we encountered any declared/called function previously
			this.scope.getFunctionSignature(name).getBlock().accept(this.statementBlockVisitor);		// Then visit the function body
			return this.scope.getFunctionSignature(name).getValue();
		}
		
		return new TypeWrapper(null);		// if function void???
	}
}
