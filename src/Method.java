import java.util.List;

import generated.brigParser.Stat_blockContext;
import wrapper.TypeWrapper;

public interface Method {
	
    public String getMethodName();

	public void setMethodName(String methodName);

	public Stat_blockContext getMethodInstructions();

	public void setMethodInstructions(Stat_blockContext methodInstructions);

	public List<String> getMethodArgumentName();
	
	public void setMethodArgumentName(List<String> setMethodArgumentsName);

	public List<TypeWrapper> getMethodArgumentValue();

	public void setMethodArgumentValue(List<TypeWrapper> setMethodArgumentsValue);
}
