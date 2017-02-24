package symtab;

/**
 * Created by bharu on 2/22/17.
 */
public class BuiltInTypeSymbol extends Symbol implements Type {
    public BuiltInTypeSymbol(String name) {
        super(name);
    }

    public BuiltInTypeSymbol(String name, Type type) {
        super(name, type);
    }

    @Override
    public String getTypeName() {
        return name;
    }
}
