package com.brig.parser.domain.wrapper;

public class TypeWrapper {

    public static TypeWrapper VOID = new TypeWrapper(new Object());

    final Object value;

    public TypeWrapper(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return (Boolean)value;
    }

    public Double asDouble() {
        return (Double)value;
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }
    
    public Integer asInteger(){
    	return (Integer) value;
    }
    
    public boolean isInteger(){
    	return value instanceof Integer;
    }

    @Override
    public int hashCode() {

        if(value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if(value == o) {
            return true;
        }

        if(value == null || o == null || o.getClass() != value.getClass()) {
            return false;
        }

        TypeWrapper that = (TypeWrapper)o;

        return this.value.equals(that.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
	
}
