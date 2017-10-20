package com.brig.parser;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.brig.parser.visitor.statement.GlobalVisitor;

import generated.brigLexer;
import generated.brigParser;

public class Main{
	public static void main(String[] args) {
	    try {
	        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
	
	        brigLexer lexer = new brigLexer(input);
	        brigParser parser = new brigParser(new CommonTokenStream(lexer));

	        ParseTree tree = parser.program();
	        GlobalVisitor visitor = new GlobalVisitor();
	        
	        tree.accept(visitor);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
}