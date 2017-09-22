import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.rougeLexer;
import generated.rougeParser;

public class Main{
public static void main(String[] args) {
    try {
        ANTLRInputStream input = new ANTLRInputStream(
            new FileInputStream(args[0]));

        rougeLexer lexer = new rougeLexer(input);
        rougeParser parser = new rougeParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}