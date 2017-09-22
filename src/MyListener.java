import java.util.HashMap;
import java.util.Map;

import generated.GYOOBaseListener;
import generated.GYOOParser.AddContext;
import generated.GYOOParser.AssignContext;
import generated.GYOOParser.PrintContext;

public class MyListener extends GYOOBaseListener {

    private Map<String, Integer> variables;
    
    public MyListener() {
        variables = new HashMap<>();
    }
    
    @Override
    public void exitAssign(AssignContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement
        
        // Get variable name
        String variableName = ctx.ID(0).getText();
        
        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
                : ctx.NUMBER().getText();
        
        // Add variable to map		
        if(ctx.ID().size() > 1)
            variables.put(variableName, variables.get(value));
        else
            variables.put(variableName, Integer.parseInt(value));
    }
    
    @Override
    public void exitAdd(AddContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement
        
        String variableName = ctx.ID(ctx.ID().size()-1).getText();

        String operatorName = ctx.NUMBER().size() > 0 ? ctx.NUMBER(0).getText() 
                : ctx.ID(0).getText();
        
        String operator = ctx.OPERATOR().getText();
        
        String operatorName2 = ctx.NUMBER().size() > 1 ? ctx.NUMBER(1).getText() 
                : ctx.ID(1).getText();
        
        if(ctx.NUMBER().size() > 1){
        	switch(operator){
	        	case "-": variables.put(variableName, Integer.parseInt(operatorName) - Integer.parseInt(operatorName2));break; 
	        	case "+": variables.put(variableName, Integer.parseInt(operatorName) + Integer.parseInt(operatorName2));break;
	        	case "*": variables.put(variableName, Integer.parseInt(operatorName) * Integer.parseInt(operatorName2));break;
	        	case "/": variables.put(variableName, Integer.parseInt(operatorName) / Integer.parseInt(operatorName2));break;
	        	case "":break;
        	}	
        }else if(ctx.NUMBER().size() == 1){
        	if(Character.isDigit(operatorName.charAt(0))){
            	switch(operator){
	        	case "-": variables.put(variableName, Integer.parseInt(operatorName) - variables.get(operatorName2));break; 
	        	case "+": variables.put(variableName, Integer.parseInt(operatorName) + variables.get(operatorName2));break;
	        	case "*": variables.put(variableName, Integer.parseInt(operatorName) * variables.get(operatorName2));break;
	        	case "/": variables.put(variableName, Integer.parseInt(operatorName) / variables.get(operatorName2));break;
	        	case "":break;
            	}	        		
        	}else{
            	switch(operator){
	        	case "-": variables.put(variableName, variables.get(operatorName) - Integer.parseInt(operatorName2));break; 
	        	case "+": variables.put(variableName, variables.get(operatorName) + Integer.parseInt(operatorName2));break;
	        	case "*": variables.put(variableName, variables.get(operatorName) * Integer.parseInt(operatorName2));break;
	        	case "/": variables.put(variableName, variables.get(operatorName) / Integer.parseInt(operatorName2));break;
	        	case "":break;
            	}	
        	}
        }else{
        	switch(operator){
	        	case "-": variables.put(variableName, variables.get(operatorName) - variables.get(operatorName2));break; 
	        	case "+": variables.put(variableName, variables.get(operatorName) + variables.get(operatorName2));break;
	        	case "*": variables.put(variableName, variables.get(operatorName) * variables.get(operatorName2));break;
	        	case "/": variables.put(variableName, variables.get(operatorName) / variables.get(operatorName2));break;
	        	case "":break;
        	}	
        }
    }
    
    @Override
    public void exitPrint(PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement
        
        String output = ctx.ID() == null ? ctx.NUMBER().getText() 
                : variables.get(ctx.ID().getText()).toString();
        System.out.println(output);
    }

}