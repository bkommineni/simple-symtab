package symtab;

/**
 * Created by bharu on 2/22/17.
 */
public interface Scope {

    String getScopeName();
    void define(Symbol s);
    Symbol resolve(String name); // bind or lookup
    Scope getEnclosingScope();
}
