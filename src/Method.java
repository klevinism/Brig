import java.util.List;

import generated.brigParser.Stat_blockContext;
import wrapper.TypeWrapper;

public interface Method {
	
	public String getMethodName();

	public void setMethodName(String methodName);

	public Stat_blockContext getMethodInstructions();

	public void setMethodInstructions(Stat_blockContext methodInstructions);

	public List<String> getMethodArgumentsName();

	public void setMethodArgumentsName(List<String> methodArgumentsName);

	public List<TypeWrapper> getMethodArgumentsValue();

	public void setMethodArgumentsValue(List<TypeWrapper> methodArgumentsValue);
	
	public String toString();	
}
