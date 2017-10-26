package com.brig.parser.visitor.global;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.BlockVisitor;
import com.brig.parser.visitor.global.block.statement.node.expression.ExpressionVisitor;

import generated.brigParser;
import generated.brigBaseVisitor;

public class StatementBlockVisitor extends brigBaseVisitor<TypeWrapper> {
	
	private ExpressionVisitor expressionVisitor;
	private BlockVisitor blockVisitor;
	private Scope scope;
	
	public StatementBlockVisitor(Scope scope){
		this.expressionVisitor = new ExpressionVisitor(scope);
		this.blockVisitor = new BlockVisitor(scope);
		this.scope = scope;		
	}
	
    @Override 
    public TypeWrapper visitStat_block(brigParser.Stat_blockContext ctx) {
    	
    	if(ctx.expression() != null)
    		return ctx.expression().accept(this.expressionVisitor);
    	else {
    		return ctx.block().accept(this.blockVisitor);
    	}
    }
}
