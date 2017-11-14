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

package com.brig.parser.domain.wrapper;
import java.util.List;

import com.brig.parser.domain.expression.Method;

import generated.brigParser.Stat_blockContext;
import com.brig.parser.domain.wrapper.TypeWrapper;

public class MethodWrapper implements Method {

	private String methodName;

	private Stat_blockContext methodInstructions;
	
	private List<String> methodArgumentsName;
	
	private List<TypeWrapper> methodArgumentsValue;
	
	@Override
    public String getMethodName() {
		return methodName;
	}

	@Override
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	@Override
	public Stat_blockContext getMethodInstructions() {
		return methodInstructions;
	}

	@Override
	public void setMethodInstructions(Stat_blockContext methodInstructions) {
		this.methodInstructions = methodInstructions;
	}

	public List<String> getMethodArgumentName() {
		return methodArgumentsName;
	}

	public void setMethodArgumentName(List<String> setMethodArgumentsName) {
		this.methodArgumentsName = setMethodArgumentsName;
	}

	public List<TypeWrapper> getMethodArgumentValue() {
		return methodArgumentsValue;
	}

	public void setMethodArgumentValue(List<TypeWrapper> setMethodArgumentsValue) {
		this.methodArgumentsValue = setMethodArgumentsValue;
	}

	@Override
	public String toString() {
		return "MethodWrapper [methodName=" + methodName + ", methodInstructions=" + methodInstructions
				+ ", setMethodArgumentsName=" + methodArgumentsName + ", setMethodArgumentsValue="
				+ methodArgumentsValue + "]";
	}
}
