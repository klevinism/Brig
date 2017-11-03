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
