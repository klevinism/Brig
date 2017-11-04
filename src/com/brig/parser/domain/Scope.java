package com.brig.parser.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brig.parser.domain.expression.node.FunctionDeclaration;
import com.brig.parser.domain.expression.node.FunctionSignature;
import com.brig.parser.domain.expression.node.LocalVariable;
import com.brig.parser.domain.wrapper.TypeWrapper;

public class Scope {
	
	private List<FunctionDeclaration> functionDeclaration;
	private List<FunctionSignature> functionSignature;
    private Map<String, LocalVariable> localVariables;
	private FunctionSignature lastFunctionSignature;
    private String className;
	
	public Scope(String className){
		this.className = className;
		this.localVariables = new HashMap<>();
		this.functionSignature = new ArrayList<FunctionSignature>();
		this.functionDeclaration = new ArrayList<FunctionDeclaration>();
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void addVariable(String name, LocalVariable var){
		this.localVariables.put(name, var);
	}
	
	public LocalVariable getVariable(String name){
		return this.localVariables.get(name);
	}
	
	public void addFunctionSignature(FunctionSignature functionSignature){
		this.functionSignature.add(functionSignature);
	}
	
	public void addFunctionDeclaration(FunctionDeclaration functionDeclaration){
		this.functionDeclaration.add(functionDeclaration);
	}
	
	public boolean isFunctionSignature(FunctionDeclaration functionDeclaration){
		if(this.hasSameFunctionName(functionDeclaration))
			if(this.hasSameNrParams(functionDeclaration)){
				this.bindArgumentsWithValues(functionDeclaration);
				return true;
			}
			else
				return false;
		else 
			return false;
	}
	
	public boolean isFunctionDeclaration(FunctionSignature functionSignature){
		if(this.hasSameFunctionName(functionSignature))
			if(this.hasSameNrArgs(functionSignature)){
				this.bindArgumentsWithValues(functionSignature);
				return true;
			}
			else
				return false;
		else
			return false;
	}

	public FunctionSignature getFunctionSignature(String name){
		lastFunctionSignature = this.functionSignature.stream()
				.filter(x -> x.getName().equals(name))
				.findFirst()
				.get();
		
		return lastFunctionSignature;
	}
	
	public FunctionSignature getCurrentFunctionSignature(){
		return lastFunctionSignature;
	}
	
	private boolean hasSameNrArgs(FunctionSignature functionSignature){		
		return this.functionSignature.stream()
				.allMatch(x -> (
						(x.getParameters() == null && functionSignature.getParameters() == null)	// check if function declaration and function signature have no arguments
						||(x.getParameters().size() == functionSignature.getArguments().size())		// check that if they do, they must have the same number
						)
				);
	}
	
	private boolean hasSameNrParams(FunctionDeclaration functionDeclaration){
		return this.functionSignature.stream()
				.allMatch(x -> (
						(x.getArguments() == null && functionDeclaration.getParameters() == null)	// check if function signature and function declaration have no arguments
						||(x.getArguments().size() == functionDeclaration.getParameters().size())	// check that if they do, they must have the same number
						)
				);
	}
	
	private boolean hasSameFunctionName(FunctionSignature functionSignature){			// For function declaration
		return this.functionDeclaration.stream()
				.anyMatch(x -> x.getName().equals(functionSignature.getName()));
	}
	
	private boolean hasSameFunctionName(FunctionDeclaration functionDeclaration){		// For function Signature
		return this.functionSignature.stream()
				.anyMatch(x -> x.getName().equals(functionDeclaration.getName()));
	}
	
	private boolean bindArgumentsWithValues(FunctionSignature functionSignature){
		
		List<String> params = functionSignature.getParameters();
		
		List<TypeWrapper> args = this.functionDeclaration.stream()
				.map(x -> x.getArguments())
				.findFirst()
				.get();
		
		for(int cnt=0; cnt<params.size(); cnt++){
			this.localVariables.put(params.get(cnt), new LocalVariable(params.get(cnt), args.get(cnt)));	// Bind arguments and parameters args=params in memory
		}
		
		return false;
	}
	
	private void bindArgumentsWithValues(FunctionDeclaration functionDeclaration){
		
		List<String> params = this.functionSignature.stream()
				.map(x -> x.getParameters())
				.findFirst()
				.get();
		
		List<TypeWrapper> args = functionDeclaration.getArguments();
		
		for(int cnt=0; cnt<params.size(); cnt++){
			this.localVariables.put(params.get(cnt), new LocalVariable(params.get(cnt), args.get(cnt)));	// Bind arguments and parameters args=params in memory
		}	
	}
}
