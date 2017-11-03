package com.brig.parser.visitor.global.block.statement.node.function;

import java.util.ArrayList;
import java.util.List;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class ArgumentVisitor extends brigBaseVisitor<List<TypeWrapper>>{

	private ExpressionVisitor expressionVisitor;
	private Scope scope;
	
	public ArgumentVisitor(Scope scope) {
		this.scope = scope;
		this.expressionVisitor = new ExpressionVisitor(this.scope);
	}

	@Override 
	public List<TypeWrapper> visitArguments(brigParser.ArgumentsContext ctx) { 
		List<TypeWrapper> args = new ArrayList<TypeWrapper>();
		
		for(brigParser.ExpressionContext exp : ctx.expression()){	
			args.add(exp.accept(expressionVisitor));			// store function arguments
		}
		
		return args;
	}

}
