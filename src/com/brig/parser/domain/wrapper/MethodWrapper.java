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
