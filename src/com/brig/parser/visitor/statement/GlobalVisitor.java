package com.brig.parser.visitor.statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.brig.parser.domain.Scope;

import generated.brigBaseVisitor;
import generated.brigLexer;
import generated.brigParser;
import generated.brigParser.Condition_blockContext;
import generated.brigParser.Switch_expressionContext;
import wrapper.TypeWrapper;

public class GlobalVisitor extends brigBaseVisitor<TypeWrapper>{

	
	private Scope scope = new Scope("Global");
    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // static reference to self
    public static GlobalVisitor visitor = new GlobalVisitor();
    
    // method visitor, visits only functions/methods
    public static MethodVisitor methodVisitor = new MethodVisitor();
    
    // store variables (there's only one global scope!)
    public static Map<String, TypeWrapper> globalScopeVar = new HashMap<String, TypeWrapper>();    
  
	@Override public TypeWrapper visitImportBlocks(brigParser.ImportBlocksContext ctx) { 
		String importTxt = ctx.atom().getText();
		String importPath = importTxt.substring(importTxt.indexOf('"')+1, importTxt.lastIndexOf('"'));	
		
        ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(importPath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		brigLexer lexer = new brigLexer(input);
        brigParser parser = new brigParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.program();
		
		return this.visit(tree); 
	}

    // assignment/id overrides
    @Override
    public TypeWrapper visitAssign(brigParser.AssignContext ctx) {
        ctx.accept(new AssignVisitor(scope));
        return null;
    }
    
    @Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	ctx.accept(new PrintVisitor(scope));
        return null;
    }
}
