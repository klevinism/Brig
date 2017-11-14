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

package com.brig.parser.visitor;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.brig.parser.domain.Scope;
import com.brig.parser.visitor.global.GlobalVisitor;

import generated.brigLexer;
import generated.brigParser;

public class Main{
	public static void main(String[] args) {
	    try {
	        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
	    	Scope globalScope = new Scope("Global");

	        brigLexer lexer = new brigLexer(input);
	        brigParser parser = new brigParser(new CommonTokenStream(lexer));

	        ParseTree tree = parser.program();
	        GlobalVisitor visitor = new GlobalVisitor(globalScope);
	        
	        tree.accept(visitor);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}