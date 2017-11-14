/*
MIT License

Copyright (c) 2017 Klevin Delimeta

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */

package com.brig.parser.visitor.global.block.statement;

import org.antlr.v4.runtime.misc.NotNull;

import com.brig.parser.domain.Scope;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.node.AssignVisitor;
import com.brig.parser.visitor.global.block.statement.node.ForVisitor;
import com.brig.parser.visitor.global.block.statement.node.IfVisitor;
import com.brig.parser.visitor.global.block.statement.node.PrintVisitor;
import com.brig.parser.visitor.global.block.statement.node.SwitchStatement;
import com.brig.parser.visitor.global.block.statement.node.WhileVisitor;
import com.brig.parser.visitor.global.block.statement.node.function.FunctionDeclarationVisitor;
import com.brig.parser.visitor.global.block.statement.node.function.FunctionVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;

public class StatementVisitor extends brigBaseVisitor<TypeWrapper>{

	private final Scope functionScope = new Scope("function");
	private final Scope scope;
	
	public StatementVisitor(Scope scope){
		this.scope = scope;
	}
	
    @Override
    public TypeWrapper visitAssign(@NotNull brigParser.AssignContext ctx) {
        return ctx.accept(new AssignVisitor(this.scope));
    }
    
    @Override
    public TypeWrapper visitPrint(@NotNull brigParser.PrintContext ctx){
        return ctx.accept(new PrintVisitor(this.scope));
    }
    
    @Override
    public TypeWrapper visitIf_statement(@NotNull brigParser.If_statementContext ctx) {
        return ctx.accept(new IfVisitor(this.scope));
    }

	@Override 
	public TypeWrapper visitWhile_statement(@NotNull brigParser.While_statementContext ctx) { 
		return ctx.accept(new WhileVisitor(this.scope)); 
	}

	@Override 
	public TypeWrapper visitFor_statement(@NotNull brigParser.For_statementContext ctx) {
		return ctx.accept(new ForVisitor(this.scope)); 
	}
	
	@Override
	public TypeWrapper visitSwitch_statement(@NotNull brigParser.Switch_statementContext ctx){
		return ctx.accept(new SwitchStatement(this.scope));
	}
	
	@Override 
	public TypeWrapper visitFunction(@NotNull brigParser.FunctionContext ctx) {
		return ctx.accept(new FunctionVisitor(this.scope));
	}
	
	@Override 
	public TypeWrapper visitFunction_declaration(brigParser.Function_declarationContext ctx) {
		return ctx.accept(new FunctionDeclarationVisitor(this.scope));
	}
	
	@Override 
	public TypeWrapper visitReturn_statement(brigParser.Return_statementContext ctx) {
		return ctx.accept(new ReturnVisitor(this.scope));
	}
}
