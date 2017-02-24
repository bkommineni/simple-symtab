// Generated from /Users/bharu/CS652/simple-symtab/grammars/lala.g4 by ANTLR 4.6

import symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lalaParser}.
 */
public interface lalaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lalaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(lalaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link lalaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(lalaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link lalaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(lalaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lalaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(lalaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lalaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lalaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lalaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lalaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lalaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(lalaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link lalaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(lalaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link lalaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lalaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lalaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lalaParser.ExprContext ctx);
}