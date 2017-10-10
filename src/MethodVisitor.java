
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import generated.brigBaseVisitor;
import generated.brigParser;
import wrapper.TypeWrapper;

public class MethodVisitor extends brigBaseVisitor<TypeWrapper>{
	public static MethodVisitor methodVisitor = new MethodVisitor();
	private MethodWrapper methodWrapper = new MethodWrapper();
    
	public static Map<String, TypeWrapper> methodMemory = new HashMap<String, TypeWrapper>();
	
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
        TypeWrapper tw = this.visit(ctx.expression());
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
		
		methodWrapper.setMethodName(ctx.ID().getText());
		methodWrapper.setMethodInstructions(ctx.stat_block());
		
		if(ctx.arguments() != null){
			this.setMethodArgumentsName(ctx.arguments().getText());
			if(methodWrapper.getMethodArgumentsValue() != null)
				this.bindArgValue();
		}

		if(GlobalVisitor.globalScopeVar.get(methodWrapper.getMethodName()) != null){
			return GlobalVisitor.globalScopeVar.put(methodWrapper.getMethodName(),this.visit(methodWrapper.getMethodInstructions()));
<<<<<<< HEAD
		}
		return this.visitChildren(ctx);
=======
		}else{
			return GlobalVisitor.globalScopeVar.put(methodWrapper.getMethodName(),new TypeWrapper(""));
		}
>>>>>>> branch 'master' of https://github.com/klevinism/Brig.git
	}

	
	@Override public TypeWrapper visitFunction_declaration(brigParser.Function_declarationContext ctx) {
		methodWrapper.setMethodName(ctx.ID().getText());
		
		if(ctx.arguments() != null){
			this.setMethodArgumentsValue(ctx.arguments().getText());
			if(methodWrapper.getMethodArgumentsName() != null)
				this.bindArgValue();
		}

		if(GlobalVisitor.globalScopeVar.get(methodWrapper.getMethodName()) != null){
			return GlobalVisitor.globalScopeVar.put(methodWrapper.getMethodName(),this.visit(methodWrapper.getMethodInstructions()));
		}else{
			return GlobalVisitor.globalScopeVar.put(methodWrapper.getMethodName(),new TypeWrapper(""));
		}
	}
	
/*	@Override public TypeWrapper visitReturn_statement(brigParser.Return_statementContext ctx) {
		System.out.println(ctx.getText()+"ASDFasd");
		return this.visitChildren(ctx);
	}
*/
    @Override
    public TypeWrapper visitPrint(brigParser.PrintContext ctx){
    	TypeWrapper output = new TypeWrapper("");
    	String printing = ctx.print_exp().getText();

    	if(this.visit(ctx.atom()) == null){
    		output = GlobalVisitor.visitor.visit(ctx.atom());
    	}else{
    		output = this.visit(ctx.atom());
    	}
    	switch(printing){
    		case "print" : System.out.print(output); break;
    		case "println" : System.out.println(output); break;
    		default : throw new RuntimeException("Undefined parameter" + printing);
    	}
        return output;
    }   
    
	public void bindArgValue() {
		List<String> argName = methodWrapper.getMethodArgumentsName();
		List<TypeWrapper> argValue = methodWrapper.getMethodArgumentsValue();
		
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
			methodWrapper.setMethodArgumentsName(args);
		}
	}

	public void setMethodArgumentsValue(String argValue){
		if(argValue != null){
			List<TypeWrapper> args = new ArrayList<TypeWrapper>();
			
			for(String arg : argValue.split("[\\s,]+")){
				args.add(new TypeWrapper(arg));
			}
			methodWrapper.setMethodArgumentsValue(args);
		}
	}
}

