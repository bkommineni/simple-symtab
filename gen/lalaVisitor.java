// Generated from /Users/bharu/CS652/simple-symtab/grammars/lala.g4 by ANTLR 4.6

import symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lalaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lalaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lalaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(lalaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link lalaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(lalaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link lalaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(lalaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lalaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(lalaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link lalaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(lalaParser.ExprContext ctx);
}