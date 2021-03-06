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

package com.brig.parser.domain.expression.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

public class FunctionDeclaration extends Function {

	private Map<Function, Scope> functionDeclarations = new HashMap<Function, Scope>(); 
	
	public FunctionDeclaration(String name, List<TypeWrapper> arguments) {
		super(name, arguments);
	}

	public FunctionDeclaration(Function function){
		super(function.getName(), function.getArguments());
	}
	
	public void add(Function function, Scope scope){
		this.functionDeclarations.put(function, scope);
	}

	public Map<Function, Scope> get(Function function){
		System.out.println(this.functionDeclarations.entrySet().stream().anyMatch(x -> x.getKey().getName() == function.getName()));
		return null;//this.functionsfunction.getName());
	}
}
