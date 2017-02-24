import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import symtab.BasicScope;
import symtab.Type;

import java.io.IOException;

/**
 * Created by bharu on 2/22/17.
 */
public class TestLala {

    public static void main(String[] args) throws IOException
    {
        ANTLRInputStream input = new ANTLRFileStream("test.lala");
        lalaLexer lexer = new lalaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        lalaParser parser = new lalaParser(tokens);
        //ParseTree tree = parser.prog();
        //System.out.println(tree.toStringTree(parser));
        lalaParser.ProgContext tree = parser.prog();

        DefSymbols def = new DefSymbols();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(def,tree);

        //System.out.println(def.globals.symbols);
        System.out.println(((BasicScope)tree.globals).symbols);
    }
}
