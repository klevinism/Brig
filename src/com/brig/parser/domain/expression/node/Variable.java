package com.brig.parser.domain.expression.node;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

public interface Variable {
	
	public void setName(String name);
	
	public String getName(String name);
	
	public TypeWrapper getValue();
	
	public void setValue(TypeWrapper value);

	public Scope getScope();

	public void setScope(Scope scope);
}
