package com.brig.parser.visitor.global.block.statement.node.expression.atom;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.expression.node.LocalVariable;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigParser;
import generated.brigBaseVisitor;

public class AtomVisitor extends brigBaseVisitor<TypeWrapper> {

	private Scope scope;
	
	public AtomVisitor(Scope scope){
		this.scope = scope;
	}
	
	@Override 
	public TypeWrapper visitIdAtom( brigParser.IdAtomContext ctx) { 
		String id = ctx.ID().getText();
		LocalVariable tw = scope.getVariable(id);
		
        if(tw == null) {
               throw new RuntimeException("no such variable: " + id);
        }
        
        return tw.getValue();
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
