package com.brig.parser.visitor.statement.node;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigParser;
import generated.brigBaseVisitor;

public class AtomVisitor extends brigBaseVisitor<TypeWrapper> {

	private Scope scope;
	
	public AtomVisitor(Scope scope){
		this.scope = scope;
	}
	
	@Override public TypeWrapper visitIdAtom( brigParser.IdAtomContext ctx) { 
		//String id = ctx.ID().getText();
		TypeWrapper tw = new TypeWrapper("");//globalScopeVar.get(id);
        //if(tw == null) {
           //if(MethodVisitor.methodMemory.get(id) == null){
             //  throw new RuntimeException("no such variable: " + id);
           //}
        //}
        return tw;
	}
	
    @Override
    public TypeWrapper visitNumberAtom(brigParser.NumberAtomContext ctx){
        return new TypeWrapper(Integer.parseInt(ctx.getText()));
    }
    
    @Override
    public TypeWrapper visitBooleanAtom(brigParser.BooleanAtomContext ctx) {
        return new TypeWrapper(Boolean.valueOf(ctx.getText()));
    }
	
    @Override
    public TypeWrapper visitStringAtom(brigParser.StringAtomContext ctx){       
    	String str = ctx.getText();
    	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
    	return new TypeWrapper(str);
    }
    
}
