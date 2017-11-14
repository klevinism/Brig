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
	private FunctionSignature currentFunctionSignature;
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
	
	public void setLocalVariables(Map<String, LocalVariable> localVariables){
		this.localVariables = localVariables;
	}
	
	public Map<String, LocalVariable> getLocalVariables(){
		return this.localVariables;
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
			if(!this.hasNoArgs(functionDeclaration)){
				if(this.hasSameNrArgs(functionDeclaration)){
					this.bindArgumentsWithValues(functionDeclaration);
					return true;
				}
				else
					return false;
			}
			else
				return true;
		else 
			return false;
	}
	
	public boolean isFunctionDeclaration(FunctionSignature functionSignature){
		
		if(this.hasSameFunctionName(functionSignature))
			if(this.hasNoArgs(functionSignature))
				return true;
			else if(this.hasSameNrArgs(functionSignature)){
				this.bindArgumentsWithValues(functionSignature);
				return true;
			}else
				return false;
		
		return false;
	}

	public FunctionSignature getFunctionSignature(String name){
		currentFunctionSignature = this.functionSignature.stream()
				.filter(x -> x.getName().equals(name))
				.findFirst()
				.get();
		
		return currentFunctionSignature;
	}
	
	public FunctionSignature getCurrentFunctionSignature(){
		return currentFunctionSignature;
	}
	
	private boolean hasNoArgs(FunctionSignature functionSignature){		
		System.out.println(
		this.functionDeclaration.stream()
				.filter(x -> x.getName().equals(functionSignature.getName()))
				.allMatch(x -> x.getArguments() == null && functionSignature.getParameters() == null 
				)
		);
		return false;
	}
	
	private boolean hasNoArgs(FunctionDeclaration functionDeclaration){
		return this.functionSignature.stream()
				.filter(x -> x.getName().equals(functionDeclaration.getName()))
				.allMatch(x -> x.getParameters() == null && functionDeclaration.getArguments() == null  // check if function signature and function declaration
				);
	}
	
	
	private boolean hasSameNrArgs(FunctionSignature functionSignature){		
		return this.functionDeclaration.stream()
				.filter(x -> x.getName().equals(functionSignature.getName()))
				.allMatch(x -> x.getArguments().size() == functionSignature.getParameters().size()	// check that if they do, they must have the same number
				);
	}
	
	private boolean hasSameNrArgs(FunctionDeclaration functionDeclaration){
		return this.functionSignature.stream()
				.filter(x -> x.getName().equals(functionDeclaration.getName()))
				.anyMatch(x -> (x.getParameters().size() == functionDeclaration.getArguments().size())	// check that if they do, they must have the same number
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
				.filter(x -> x.getName().equals(functionSignature.getName()))
				.map(x -> x.getArguments())
				.findFirst()
				.get();
		
		for(int cnt=0; cnt<params.size(); cnt++)
			functionSignature.getScope().localVariables.put(params.get(cnt), new LocalVariable(params.get(cnt), args.get(cnt)));	// Bind arguments and parameters args=params in memory
		
		return false;
	}
	
	private void bindArgumentsWithValues(FunctionDeclaration functionDeclaration){
		
		List<String> params = this.functionSignature.stream()
				.filter(x -> x.getName().equals(functionDeclaration.getName()))
				.map(x -> x.getParameters())
				.findFirst()
				.get();
		
		List<TypeWrapper> args = functionDeclaration.getArguments();
		
		
		for(int cnt=0; cnt<params.size(); cnt++){
			this.getFunctionSignature(functionDeclaration.getName()).getScope().localVariables.put(params.get(cnt), new LocalVariable(params.get(cnt), args.get(cnt)));	// Bind arguments and parameters args=params in memory
		}	
	}
}
