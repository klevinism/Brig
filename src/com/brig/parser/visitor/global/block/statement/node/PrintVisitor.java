package com.brig.parser.visitor.global.block.statement.node;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class PrintVisitor  extends brigBaseVisitor<TypeWrapper> { 
	
	private ExpressionVisitor expressionVisitor;
	private Scope scope;
	
	public PrintVisitor(Scope scope){
		this.scope = scope;
		this.expressionVisitor = new ExpressionVisitor(this.scope);
	}
	
	@Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	String printCommand = ctx.print_exp().getText();
    	TypeWrapper printValue = ctx.expression().accept(expressionVisitor);

    	switch(printCommand){
    		case "print" : System.out.print(printValue); break;
    		case "println" : System.out.println("\n"+printValue); break;
    		default : throw new RuntimeException("Undefined parameter" + printCommand);
    	}
    	
        return printValue;
	}
}
