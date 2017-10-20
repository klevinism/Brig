package com.brig.parser.domain;

import java.util.HashMap;
import java.util.Map;

import com.brig.parser.domain.wrapper.TypeWrapper;

public class Scope {
	private String className;
    public Map<String,TypeWrapper> localVariables;
	
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
}
