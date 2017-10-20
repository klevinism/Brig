package generated;

// Generated from brig.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link brigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface brigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(@NotNull brigParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull brigParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#switch_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_expression(@NotNull brigParser.Switch_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(@NotNull brigParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(@NotNull brigParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull brigParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#switch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(@NotNull brigParser.Switch_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(@NotNull brigParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull brigParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull brigParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull brigParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull brigParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(@NotNull brigParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(@NotNull brigParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(@NotNull brigParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#importBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportBlocks(@NotNull brigParser.ImportBlocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#print_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_exp(@NotNull brigParser.Print_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull brigParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(@NotNull brigParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull brigParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullAtom(@NotNull brigParser.NullAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull brigParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(@NotNull brigParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(@NotNull brigParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull brigParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(@NotNull brigParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(@NotNull brigParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(@NotNull brigParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(@NotNull brigParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(@NotNull brigParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link brigParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull brigParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull brigParser.AndExprContext ctx);
}