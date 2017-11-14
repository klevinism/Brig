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
		LocalVariable tw = this.scope.getVariable(id);

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
