// Generated from brig.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link brigParser}.
 */
public interface brigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull brigParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull brigParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull brigParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull brigParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_expression(@NotNull brigParser.Switch_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#switch_expression}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_expression(@NotNull brigParser.Switch_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull brigParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull brigParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull brigParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull brigParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull brigParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull brigParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(@NotNull brigParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(@NotNull brigParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull brigParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull brigParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull brigParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull brigParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull brigParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull brigParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull brigParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull brigParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull brigParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull brigParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(@NotNull brigParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(@NotNull brigParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(@NotNull brigParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(@NotNull brigParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(@NotNull brigParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(@NotNull brigParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#importBlocks}.
	 * @param ctx the parse tree
	 */
	void enterImportBlocks(@NotNull brigParser.ImportBlocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#importBlocks}.
	 * @param ctx the parse tree
	 */
	void exitImportBlocks(@NotNull brigParser.ImportBlocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#print_exp}.
	 * @param ctx the parse tree
	 */
	void enterPrint_exp(@NotNull brigParser.Print_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#print_exp}.
	 * @param ctx the parse tree
	 */
	void exitPrint_exp(@NotNull brigParser.Print_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull brigParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull brigParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull brigParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull brigParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull brigParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull brigParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNullAtom(@NotNull brigParser.NullAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNullAtom(@NotNull brigParser.NullAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull brigParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull brigParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(@NotNull brigParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(@NotNull brigParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull brigParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull brigParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull brigParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link brigParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull brigParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull brigParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull brigParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull brigParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull brigParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(@NotNull brigParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(@NotNull brigParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull brigParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull brigParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull brigParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull brigParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link brigParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull brigParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link brigParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull brigParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull brigParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link brigParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull brigParser.AndExprContext ctx);
}