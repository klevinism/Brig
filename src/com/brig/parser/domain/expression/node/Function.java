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

import java.util.List;

import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigParser.Stat_blockContext;

public class Function {

	private String name;
	private Stat_blockContext block;
	private List<TypeWrapper> arguments;
	private List<String> parameters;
	
	/**
	 * Function constructor. Used only for functions with a body, 
	 * not function declaration
	 * 
	 * @param String name : Name of function 
	 * @param Stat_blockContext block : Function body
	 * @param List<String> parameters : Parameters of function
	 */
	public Function(String name, Stat_blockContext block, List<String> parameters){
		this.name = name;
		this.block = block;
		this.parameters = parameters;
	}

	/**
	 * Function constructor. Used only for functions declarations, no function body.
	 * 
	 * @param String name : Name of function 
	 * @param List<TypeWrapper> arguments : Arguments of function declaration
	 */
	public Function(String name,  List<TypeWrapper> arguments){
		this.name = name;
		this.arguments = arguments;
	}

	/**
	 * Getter function
	 * 
	 * @return String name: Name of function
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter function
	 * 
	 * @param String name: Name of function
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter function
	 * 
	 * @return List<String> parameters: Parameters of function
	 */
	public List<String> getParameters() {
		return parameters;
	}

	/**
	 * Setter function
	 * 
	 * @param List<String> parameters: Parameters of the function
	 */
	public void setParameters(List<String> parameters) {
		this.parameters = parameters;
	}

	/**
	 * Getter function
	 * 
	 * @return Stat_blockContext block: Body of the function
	 */
	public Stat_blockContext getBlock() {
		return block;
	}

	/**
	 * Setter function
	 * 
	 * @param Stat_blockContext block: Body of the function
	 */
	public void setBlock(Stat_blockContext block) {
		this.block = block;
	}
	
	/**
	 * Getter function
	 * 
	 * @return List<TypeWrapper> arguments: Arguments of function declaration
	 */
	public List<TypeWrapper> getArguments() {
		return arguments;
	}

	/**
	 * Setter function
	 * 
	 * @param List<TypeWrapper> arguments: Arguments of the function
	 */
	public void setArguments(List<TypeWrapper> arguments) {
		this.arguments = arguments;
	}

	/**
	 * Getter function
	 * 
	 * @return Function this: This instance of function or function declaration
	 */
	public Function getFunction(){
		return this;
	}
	
	@Override
	public String toString() {
		return "Function [name=" + name + ", parameters=" + parameters + ", block=" + block + "]";
	}
	
}
