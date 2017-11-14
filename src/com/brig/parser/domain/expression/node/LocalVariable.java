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
