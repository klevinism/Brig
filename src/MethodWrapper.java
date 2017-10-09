import java.util.List;

import generated.brigParser.Stat_blockContext;
import wrapper.TypeWrapper;

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

	@Override
	public List<String> getMethodArgumentsName() {
		return methodArgumentsName;
	}

	@Override
	public void setMethodArgumentsName(List<String> methodArgumentsName) {
		this.methodArgumentsName = methodArgumentsName;
	}

	@Override
	public List<TypeWrapper> getMethodArgumentsValue() {
		return methodArgumentsValue;
	}

	@Override
	public void setMethodArgumentsValue(List<TypeWrapper> methodArgumentsValue) {
		this.methodArgumentsValue = methodArgumentsValue;
	}
	

	@Override
	public String toString() {
		return "MethodWrapper [methodName=" + methodName + ", methodInstructions=" + methodInstructions
				+ ", methodArgumentsName=" + methodArgumentsName + ", methodArgumentsValues=" + methodArgumentsValue
				+ "]";
	}
	
}
