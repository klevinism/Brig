package com.brig.parser.visitor.global.block.statement.node.function;

import java.util.ArrayList;
import java.util.List;

import com.brig.parser.domain.Scope;
import com.brig.parser.visitor.global.block.statement.StatementVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class ParameterVisitor extends brigBaseVisitor<List<String>>{

	private StatementVisitor statementVisitor;
	private Scope scope;
	
	public ParameterVisitor(Scope scope) {
		this.scope = scope;
		this.statementVisitor = new StatementVisitor(this.scope);
	}

	@Override 
	public List<String> visitArguments(brigParser.ArgumentsContext ctx) { 
		
		List<String> params = new ArrayList<String>();
		
		for(brigParser.AssignContext assign : ctx.assign()){		
			params.add(assign.ID().getText());			// store function parameters
			assign.accept(statementVisitor);			// visit assign statement to assign default value to params
		}
		
		return params; 
	}
}
