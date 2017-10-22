package com.brig.parser.visitor.statement;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;

import generated.brigBaseVisitor;
import generated.brigParser;

public class PrintVisitor  extends brigBaseVisitor<TypeWrapper> { 
	private Scope scope;
	
	public PrintVisitor(Scope scope){
		this.scope = scope;
	}
	
	@Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	String printing = ctx.print_exp().getText();
		TypeWrapper output = scope.getVariable(ctx.expression().getText()).getValue();

    	switch(printing){
    		case "print" : System.out.print(output); break;
    		case "println" : System.out.println(output); break;
    		default : throw new RuntimeException("Undefined parameter" + printing);
    	}
    	
        return output;
	}
}
