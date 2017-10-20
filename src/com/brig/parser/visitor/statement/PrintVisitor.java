package com.brig.parser.visitor.statement;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigParser;
import generated.brigBaseVisitor;

public class PrintVisitor  extends brigBaseVisitor<TypeWrapper> { 
	private Scope scope;
	
	public PrintVisitor(Scope scope){
		this.scope = scope;
	}
	
	@Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	String output = ctx.expression().getText();
    	String printing = ctx.print_exp().getText();
    	System.out.println(scope.localVariables.get(output));
    	switch(printing){
    		case "print" : System.out.print(output); break;
    		case "println" : System.out.println(output); break;
    		default : throw new RuntimeException("Undefined parameter" + printing);
    	}
    	
        return scope.localVariables.get(output);
	}
}
