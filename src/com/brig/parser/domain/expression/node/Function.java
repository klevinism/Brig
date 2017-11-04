package com.brig.parser.domain.expression.node;

import java.util.List;

import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigParser.Stat_blockContext;

public class Function {

	private String name;
	private Stat_blockContext block;
	private List<TypeWrapper> arguments;
	private List<String> parameters;
	
	public Function(String name, Stat_blockContext block, List<String> parameters){
		this.name = name;
		this.block = block;
		this.parameters = parameters;
	}

	public Function(String name,  List<TypeWrapper> arguments){
		this.name = name;
		this.arguments = arguments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getParameters() {
		return parameters;
	}

	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	public Stat_blockContext getBlock() {
		return block;
	}

	public void setBlock(Stat_blockContext block) {
		this.block = block;
	}
	
	public List<TypeWrapper> getArguments() {
		return arguments;
	}

	public void setArguments(List<TypeWrapper> arguments) {
		this.arguments = arguments;
	}

	public Function getFunction(){
		return this;
	}
	
	@Override
	public String toString() {
		return "Function [name=" + name + ", parameters=" + parameters + ", block=" + block + "]";
	}
	
}
