package generated;

// Generated from GYOO.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GYOOParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GYOOVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull GYOOParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull GYOOParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#switch_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_expression(@NotNull GYOOParser.Switch_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull GYOOParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull GYOOParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull GYOOParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(@NotNull GYOOParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull GYOOParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull GYOOParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull GYOOParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull GYOOParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull GYOOParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#print_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_exp(@NotNull GYOOParser.Print_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull GYOOParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull GYOOParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull GYOOParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullAtom(@NotNull GYOOParser.NullAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull GYOOParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull GYOOParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull GYOOParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull GYOOParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull GYOOParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull GYOOParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull GYOOParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull GYOOParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GYOOParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull GYOOParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull GYOOParser.AndExprContext ctx);
}