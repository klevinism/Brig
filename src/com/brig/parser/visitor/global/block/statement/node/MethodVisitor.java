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

package com.brig.parser.visitor.global.block.statement.node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brig.parser.domain.wrapper.MethodWrapper;

import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.GlobalVisitor;

import generated.brigBaseVisitor;
import generated.brigParser;
import generated.brigParser.Stat_blockContext;

public class MethodVisitor extends brigBaseVisitor<TypeWrapper>{
	
	public static MethodVisitor methodVisitor = new MethodVisitor();
	
	private MethodWrapper methodWrapper = new MethodWrapper();
        
	// stores method into memory, only one function scope
	public static Map<String, TypeWrapper> methodMemory = new HashMap<String, TypeWrapper>();
	
	// stores method context to be executed when method gets called
	public Map<String, Stat_blockContext> methodContext = new HashMap<String, Stat_blockContext>();

    @Override
    public TypeWrapper visitNumberAtom(brigParser.NumberAtomContext ctx){
        return new TypeWrapper(Integer.parseInt(ctx.getText()));
    }
    
    @Override
    public TypeWrapper visitBooleanAtom(brigParser.BooleanAtomContext ctx) {
        return new TypeWrapper(Boolean.valueOf(ctx.getText()));
    }
    
    @Override
    public TypeWrapper visitParExpr(brigParser.ParExprContext ctx) {
        return this.visit(ctx.expression());
    }
    
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {

        String id = ctx.ID().getText();
        TypeWrapper tw = new TypeWrapper(""); 
        if(ctx.expression() != null)
        	tw = this.visit(ctx.expression());
        
        return methodMemory.put(id, tw);
    }
	
    @Override
    public TypeWrapper visitStringAtom(brigParser.StringAtomContext ctx){ 
    	String str = ctx.getText();
    	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
    	return new TypeWrapper(str);
    }

	@Override public TypeWrapper visitIdAtom(brigParser.IdAtomContext ctx) { 
		String id = ctx.ID().getText();
		TypeWrapper tw = methodMemory.get(id);
        if(tw == null) {
        	if(GlobalVisitor.globalScopeVar.get(id) == null)
                throw new RuntimeException("no such variable: " + id);
        }
        return tw; 
	}
	
	@Override public TypeWrapper visitFunction(brigParser.FunctionContext ctx) { 
		String methodId = ctx.ID().getText();
		Stat_blockContext methodInstructions = ctx.stat_block();
		
		methodWrapper.setMethodName(methodId);						//save method name
		methodWrapper.setMethodInstructions(methodInstructions);	//save method instructions
		
		methodContext.put(methodId, methodInstructions);
		
		if(ctx.arguments() != null){
			this.visit(ctx.arguments());
		}
		
		if(GlobalVisitor.globalScopeVar.get(methodId) != null){
			return GlobalVisitor.globalScopeVar.put(methodId,this.visit(methodInstructions));
		}else{
			return GlobalVisitor.globalScopeVar.put(methodId,new TypeWrapper(""));
		}
	}

	
	@Override public TypeWrapper visitFunction_declaration(brigParser.Function_declarationContext ctx) {
		
		String methodId = ctx.ID().getText();
		
		if(ctx.arguments() != null){
			this.visit(ctx.arguments());
		}
		
		if(GlobalVisitor.globalScopeVar.get(methodId) != null){
			return GlobalVisitor.globalScopeVar.put(methodId,this.visit(methodContext.get(methodId)));
		}else{
			return GlobalVisitor.globalScopeVar.put(methodId,new TypeWrapper(""));
		}
	}
	
	@Override public TypeWrapper visitReturn_statement(brigParser.Return_statementContext ctx) {
		if(ctx.statement() != null)
			return methodMemory.put(methodWrapper.getMethodName(), this.visit(ctx.statement()));
		else
			return methodMemory.put(methodWrapper.getMethodName(), this.visit(ctx.expression()));
	}
	
	@Override public TypeWrapper visitArguments(brigParser.ArgumentsContext ctx) { 
	
		List<String> argsName = new ArrayList<String>();
		List<TypeWrapper> argsValue = new ArrayList<TypeWrapper>();
				
		for(brigParser.AssignContext assign : ctx.assign()){		// store function parameters
			argsName.add(assign.ID().getText());
			this.visit(assign);
		}
		
		if(argsName.size() != 0)			// check if argument's names are stored
			methodWrapper.setMethodArgumentName(argsName);
		
		for(brigParser.ExpressionContext exp : ctx.expression()){	// store function arguments
			argsValue.add(this.visit(exp));
		}
		
		if(argsValue.size() != 0)			// check if argument's values are stored
			methodWrapper.setMethodArgumentValue(argsValue);

		if(methodWrapper.getMethodArgumentName() != null && methodWrapper.getMethodArgumentValue() != null)				
			this.bindArgValue();
		
		return visitChildren(ctx); 
	}

    @Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	TypeWrapper output = new TypeWrapper("");
    	String printing = ctx.print_exp().getText();
    	
    	switch(printing){
    		case "print" : System.out.print(output); break;
    		case "println" : System.out.println(output); break;
    		default : throw new RuntimeException("Undefined parameter" + printing);
    	}
        return output;
    }   
    
	public void bindArgValue() {
		List<String> argName = methodWrapper.getMethodArgumentName();
		List<TypeWrapper> argValue = methodWrapper.getMethodArgumentValue();
		
		if(argName.size() == argName.size()){
			for(int x=0; x<argName.size(); x++){
				methodMemory.put(argName.get(x), argValue.get(x));
			}
		}
	}

	public void setMethodArgumentsName(String argName){
		if(argName != null){
			List<String> args = new ArrayList<String>();
			
			for(String arg : argName.split("[\\s,]+")){
				args.add(arg);
			}
			
			methodWrapper.setMethodArgumentName(args);
		}
	}

	public void setMethodArgumentsValue(String argValue){
		if(argValue != null){
			List<TypeWrapper> args = new ArrayList<TypeWrapper>();
			
			for(String arg : argValue.split("[\\s,]+")){
				args.add(new TypeWrapper(arg));
			}
			
			methodWrapper.setMethodArgumentValue(args);
		}
	}
}

