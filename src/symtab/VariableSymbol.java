package symtab;

/**
 * Created by bharu on 2/22/17.
 */
public class VariableSymbol extends Symbol {

    public VariableSymbol(String name) {
        super(name);
    }

    public VariableSymbol(String name, Type type) {
        super(name, type);
    }

    @Override
    public String toString() {
        if(type != null)
            return name + " : " + type.getTypeName();
        return null;
    }
}
