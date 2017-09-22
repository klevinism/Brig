package generated;

// Generated from GYOO.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GYOOParser}.
 */
public interface GYOOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull GYOOParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull GYOOParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull GYOOParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull GYOOParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expression(@NotNull GYOOParser.Switch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expression(@NotNull GYOOParser.Switch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull GYOOParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull GYOOParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull GYOOParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull GYOOParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull GYOOParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull GYOOParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull GYOOParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull GYOOParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull GYOOParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull GYOOParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull GYOOParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull GYOOParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull GYOOParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull GYOOParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull GYOOParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull GYOOParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull GYOOParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull GYOOParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#print_exp}.
	 * @param ctx the parse tree
	 */
	void enterPrint_exp(@NotNull GYOOParser.Print_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#print_exp}.
	 * @param ctx the parse tree
	 */
	void exitPrint_exp(@NotNull GYOOParser.Print_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull GYOOParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull GYOOParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull GYOOParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull GYOOParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull GYOOParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull GYOOParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNullAtom(@NotNull GYOOParser.NullAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNullAtom(@NotNull GYOOParser.NullAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull GYOOParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull GYOOParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull GYOOParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull GYOOParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull GYOOParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull GYOOParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull GYOOParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link GYOOParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull GYOOParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull GYOOParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull GYOOParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull GYOOParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull GYOOParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull GYOOParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull GYOOParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull GYOOParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull GYOOParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GYOOParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull GYOOParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GYOOParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull GYOOParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull GYOOParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link GYOOParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull GYOOParser.AndExprContext ctx);
}