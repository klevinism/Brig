package com.brig.parser.domain;

import java.util.HashMap;
import java.util.Map;

import com.brig.parser.domain.expression.node.LocalVariable;

public class Scope {
	private String className;
    public Map<String,LocalVariable> localVariables;
	
	public Scope(String className){
		this.className = className;
		this.localVariables = new HashMap<>();
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
	
}
