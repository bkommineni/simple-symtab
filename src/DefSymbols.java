import symtab.*;

/**
 * Created by bharu on 2/22/17.
 */
public class DefSymbols extends lalaBaseListener {
    //public BasicScope globals;
    public Scope currentScope = null;

    public DefSymbols() {
        currentScope = new BasicScope(currentScope);
        //globals = new BasicScope();
        currentScope.define(new BuiltInTypeSymbol("int"));
        currentScope.define(new BuiltInTypeSymbol("float"));
        //globals.define(new BuiltInTypeSymbol("int"));
        //globals.define(new BuiltInTypeSymbol("float"));
    }

    @Override
    public void enterProg(lalaParser.ProgContext ctx) {
        //currentScope = globals;
        //ctx.globals = globals;
        ctx.globals = currentScope;//annotating parse tree
    }

    @Override
    public void exitProg(lalaParser.ProgContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterVar(lalaParser.VarContext ctx) {
        String varName = ctx.ID().getText();
        Type type = (Type) currentScope.resolve(ctx.type().getText());
        VariableSymbol variableSymbol = new VariableSymbol(varName,type);
        currentScope.define(variableSymbol);
    }

    @Override
    public void enterStat(lalaParser.StatContext ctx) {
        String varName = ctx.ID().getText();
        Symbol sm = currentScope.resolve(varName);

        if(sm == null)
        {
            System.err.println("No such var: " + varName);
        }
    }

    @Override
    public void enterExpr(lalaParser.ExprContext ctx) {
        if(ctx.ID() != null)
        {
            String varName = ctx.ID().getText();
            Symbol sm = currentScope.resolve(varName);
            if(sm == null)
            {
                System.err.println("No such var: " + varName);
            }
        }
    }


}
