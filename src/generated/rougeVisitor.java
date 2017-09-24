package generated;

// Generated from rouge.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rougeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rougeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull rougeParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull rougeParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#switch_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_expression(@NotNull rougeParser.Switch_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull rougeParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull rougeParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull rougeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(@NotNull rougeParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull rougeParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull rougeParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull rougeParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull rougeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull rougeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull rougeParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(@NotNull rougeParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#print_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_exp(@NotNull rougeParser.Print_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull rougeParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull rougeParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull rougeParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullAtom(@NotNull rougeParser.NullAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull rougeParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull rougeParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull rougeParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull rougeParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull rougeParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull rougeParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull rougeParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull rougeParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull rougeParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link rougeParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull rougeParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull rougeParser.AndExprContext ctx);
}