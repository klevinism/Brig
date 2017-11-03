package com.brig.parser.domain.expression.node;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

public class LocalVariable implements Variable {

	private String name;
	private TypeWrapper value;
	private Scope scope;
	
	public LocalVariable(String name, LocalVariable variable){
		this.name = name;
		this.value = variable.value;
		this.scope = variable.scope;
	}
	
	public LocalVariable(String name, TypeWrapper value){
		this.name = name;
		this.value = value;
	}
	
	public LocalVariable(String name, TypeWrapper value, Scope scope){
		this.name = name;
		this.value = value;
		this.scope = scope;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName(String name) {
		return this.name;
	}

	@Override
	public TypeWrapper getValue() {
		return this.value;
	}

	@Override
	public void setValue(TypeWrapper value) {
		this.value = value;
	}

	@Override
	public Scope getScope() {
		return this.scope;
	}

	@Override
	public void setScope(Scope scope) {
		this.scope = scope;
	}
}
