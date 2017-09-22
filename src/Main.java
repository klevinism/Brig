import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.GYOOLexer;
import generated.GYOOParser;

public class Main{
public static void main(String[] args) {
    try {
        ANTLRInputStream input = new ANTLRInputStream(
            new FileInputStream(args[0]));

        GYOOLexer lexer = new GYOOLexer(input);
        GYOOParser parser = new GYOOParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}