package symtab;

/**
 * Created by bharu on 2/22/17.
 */
public abstract class Symbol {

    String name;
    Type type;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name,Type type)
    {
        this.name = name;
        this.type = type;
    }
}
