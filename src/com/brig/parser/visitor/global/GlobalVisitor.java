package com.brig.parser.visitor.global;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import com.brig.parser.domain.Scope;
import generated.brigBaseVisitor;
import generated.brigLexer;
import generated.brigParser;
import com.brig.parser.domain.wrapper.TypeWrapper;
import com.brig.parser.visitor.global.block.statement.StatementVisitor;
import com.brig.parser.visitor.global.block.statement.node.MethodVisitor;

public class GlobalVisitor extends brigBaseVisitor<TypeWrapper>{ 
	
	public Scope scope;
	
    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // method visitor, visits only functions/methods
    public static MethodVisitor methodVisitor = new MethodVisitor();
    
    // store variables (there's only one global scope!)
    public static Map<String, TypeWrapper> globalScopeVar = new HashMap<String, TypeWrapper>();    
  
    public GlobalVisitor(Scope scope){
    	this.scope = scope;
    }
    
	@Override 
	public TypeWrapper visitImportBlocks(brigParser.ImportBlocksContext ctx) { 
		String importTxt = ctx.expression(0).getText();
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
		
		return tree.accept(new GlobalVisitor(this.scope)); 
	}

	@Override 
	public TypeWrapper visitStatement(@NotNull brigParser.StatementContext ctx) { 
		return ctx.accept(new StatementVisitor(scope)); 
	}
}
