/*
MIT License

Copyright (c) 2017 Klevin Delimeta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

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
		
		FunctionSignature functionSignature = new FunctionSignature(new Function(name, body, parameters), this.functionScope);
		
		this.scope.addFunctionSignature(functionSignature);

		if(this.scope.isFunctionDeclaration(functionSignature)){					// if we encountered any declared/called function previously
			this.scope.getFunctionSignature(name).getBlock().accept(this.statementBlockVisitor);		// Then visit the function body
			return this.scope.getFunctionSignature(name).getValue();
		}
		
		return new TypeWrapper(null);		// if function void???
	}
}
