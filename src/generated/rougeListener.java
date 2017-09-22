package generated;

// Generated from rouge.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rougeParser}.
 */
public interface rougeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull rougeParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull rougeParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull rougeParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull rougeParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expression(@NotNull rougeParser.Switch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expression(@NotNull rougeParser.Switch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull rougeParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull rougeParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull rougeParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull rougeParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull rougeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull rougeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull rougeParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull rougeParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull rougeParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull rougeParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull rougeParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull rougeParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull rougeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull rougeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull rougeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull rougeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull rougeParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull rougeParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#print_exp}.
	 * @param ctx the parse tree
	 */
	void enterPrint_exp(@NotNull rougeParser.Print_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#print_exp}.
	 * @param ctx the parse tree
	 */
	void exitPrint_exp(@NotNull rougeParser.Print_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull rougeParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull rougeParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull rougeParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull rougeParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull rougeParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull rougeParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNullAtom(@NotNull rougeParser.NullAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNullAtom(@NotNull rougeParser.NullAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull rougeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull rougeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull rougeParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull rougeParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull rougeParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull rougeParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull rougeParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link rougeParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull rougeParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull rougeParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull rougeParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull rougeParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull rougeParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull rougeParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull rougeParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull rougeParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull rougeParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link rougeParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull rougeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link rougeParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull rougeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull rougeParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link rougeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull rougeParser.AndExprContext ctx);
}