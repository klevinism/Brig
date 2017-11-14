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
