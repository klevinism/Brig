package com.brig.parser.domain.expression.node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigParser.Stat_blockContext;


public class FunctionSignature extends Function{

	private Map<Function, Scope> functionSignatures = new HashMap<Function, Scope>(); 

	public FunctionSignature(String name, Stat_blockContext block, List<String> parameters) {	// default constructor for 
		super(name, block, parameters);
	}
	
	public FunctionSignature(Function function){
		super(function.getName(), function.getBlock(), function.getParameters());
	}

	public void add(Function function, Scope scope){
		this.functionSignatures.put(function, scope);
	}

	public Map<Function, Scope> get(Function function){
		System.out.println(this.functionSignatures.entrySet().stream().anyMatch(x -> x.getKey().getName() == function.getName()));
		return null;//this.functionsfunction.getName());
	}
}
