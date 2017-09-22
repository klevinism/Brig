package generated;

// Generated from GYOO.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GYOOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, IMPORT=12, INCLUDE=13, OR=14, AND=15, EQ=16, NEQ=17, 
		GT=18, LT=19, GTEQ=20, LTEQ=21, SCOL=22, PLUS=23, MINUS=24, MULT=25, DIV=26, 
		MOD=27, POW=28, NOT=29, PRINT=30, PRINTLN=31, ASSIGN=32, OPAR=33, CPAR=34, 
		OBRACE=35, CBRACE=36, TRUE=37, FALSE=38, NULL=39, IF=40, ELSE=41, WS=42, 
		ID=43, NUMBER=44, FLOAT=45, STRING=46, COMMENT=47, LINE_COMMENT=48, OTHER=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'default'", "'be'", "'case'", "'let'", "'begin'", "'do'", 
		"'end'", "'switch'", "':'", "'while'", "'for'", "'import'", "'include'", 
		"'or'", "'and'", "'is'", "'is not'", "'greater'", "'lower'", "'is greater'", 
		"'is lower'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'not'", 
		"'print'", "'println'", "'='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", 
		"'null'", "'if'", "'else'", "WS", "ID", "NUMBER", "FLOAT", "STRING", "COMMENT", 
		"LINE_COMMENT", "OTHER"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_assign = 3, 
		RULE_print = 4, RULE_print_exp = 5, RULE_if_statement = 6, RULE_while_statement = 7, 
		RULE_for_statement = 8, RULE_switch_statement = 9, RULE_switch_expression = 10, 
		RULE_condition_block = 11, RULE_stat_block = 12, RULE_expression = 13, 
		RULE_atom = 14;
	public static final String[] ruleNames = {
		"program", "block", "statement", "assign", "print", "print_exp", "if_statement", 
		"while_statement", "for_statement", "switch_statement", "switch_expression", 
		"condition_block", "stat_block", "expression", "atom"
	};

	@Override
	public String getGrammarFileName() { return "GYOO.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GYOOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(T__6);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31); block();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__3) | (1L << T__1) | (1L << T__0) | (1L << PRINT) | (1L << PRINTLN) | (1L << IF) | (1L << OTHER))) != 0) );
			setState(36); match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Token OTHER;
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(GYOOParser.OTHER, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(51);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); assign();
				}
				break;
			case PRINT:
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); print();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); if_statement();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); while_statement();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(47); for_statement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(48); switch_statement();
				}
				break;
			case OTHER:
				enterOuterAlt(_localctx, 7);
				{
				setState(49); ((StatementContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown text: " + (((StatementContext)_localctx).OTHER!=null?((StatementContext)_localctx).OTHER.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GYOOParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(T__7);
			setState(54); match(ID);
			setState(56);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(55); match(T__9);
				}
			}

			setState(59);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(58); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public Print_expContext print_exp() {
			return getRuleContext(Print_expContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); print_exp();
			setState(63);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(62); atom();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_expContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GYOOParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(GYOOParser.PRINTLN, 0); }
		public Print_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterPrint_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitPrint_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitPrint_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_expContext print_exp() throws RecognitionException {
		Print_expContext _localctx = new Print_expContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==PRINTLN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public List<TerminalNode> ELSE() { return getTokens(GYOOParser.ELSE); }
		public List<TerminalNode> IF() { return getTokens(GYOOParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(GYOOParser.IF, i);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode ELSE(int i) {
			return getToken(GYOOParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(IF);
			setState(68); condition_block();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69); match(ELSE);
					setState(70); match(IF);
					setState(71); condition_block();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(77); match(ELSE);
				setState(78); stat_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(GYOOParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OPAR() { return getToken(GYOOParser.OPAR, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(T__1);
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(82); match(OPAR);
				}
				break;
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(85); expression(0);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_la = _input.LA(1);
			if (_la==CPAR) {
				{
				setState(91); match(CPAR);
				}
			}

			setState(94); match(T__5);
			setState(95); stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statementContext extends ParserRuleContext {
		public List<TerminalNode> SCOL() { return getTokens(GYOOParser.SCOL); }
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(GYOOParser.CPAR, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOL(int i) {
			return getToken(GYOOParser.SCOL, i);
		}
		public TerminalNode OPAR() { return getToken(GYOOParser.OPAR, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(T__0);
			setState(99);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(98); match(OPAR);
				}
			}

			setState(101); assign();
			setState(102); match(SCOL);
			setState(103); expression(0);
			setState(104); match(SCOL);
			setState(105); stat_block();
			setState(107);
			_la = _input.LA(1);
			if (_la==CPAR) {
				{
				setState(106); match(CPAR);
				}
			}

			setState(109); match(T__5);
			setState(110); stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(GYOOParser.OBRACE, 0); }
		public Switch_expressionContext switch_expression(int i) {
			return getRuleContext(Switch_expressionContext.class,i);
		}
		public TerminalNode CBRACE() { return getToken(GYOOParser.CBRACE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Switch_expressionContext> switch_expression() {
			return getRuleContexts(Switch_expressionContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switch_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(T__3);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(113); expression(0);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); match(T__5);
			setState(120); match(OBRACE);
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121); switch_expression();
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==T__8 );
			setState(126); match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_expressionContext extends ParserRuleContext {
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Switch_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterSwitch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitSwitch_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitSwitch_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_expressionContext switch_expression() throws RecognitionException {
		Switch_expressionContext _localctx = new Switch_expressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switch_expression);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(T__8);
				setState(129); expression(0);
				setState(130); match(T__2);
				setState(131); stat_block();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(T__10);
				setState(134); match(T__2);
				setState(135); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); expression(0);
			setState(139); stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(GYOOParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(GYOOParser.CBRACE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat_block);
		try {
			setState(149);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(OBRACE);
				setState(144);
				switch (_input.LA(1)) {
				case T__7:
				case T__3:
				case T__1:
				case T__0:
				case PRINT:
				case PRINTLN:
				case IF:
				case OTHER:
					{
					setState(142); block();
					}
					break;
				case NOT:
				case OPAR:
				case TRUE:
				case FALSE:
				case NULL:
				case ID:
				case NUMBER:
				case FLOAT:
				case STRING:
					{
					setState(143); expression(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); match(CBRACE);
				}
				break;
			case T__7:
			case T__3:
			case T__1:
			case T__0:
			case PRINT:
			case PRINTLN:
			case IF:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExprContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(GYOOParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode MULT() { return getToken(GYOOParser.MULT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(GYOOParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(GYOOParser.DIV, 0); }
		public MultiplicationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExprContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(GYOOParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GYOOParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GYOOParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode LTEQ() { return getToken(GYOOParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(GYOOParser.LT, 0); }
		public TerminalNode GT() { return getToken(GYOOParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GTEQ() { return getToken(GYOOParser.GTEQ, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(GYOOParser.NEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(GYOOParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(GYOOParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152); match(NOT);
				setState(153); expression(8);
				}
				break;
			case OPAR:
			case TRUE:
			case FALSE:
			case NULL:
			case ID:
			case NUMBER:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(158);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(159); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(161);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(162); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(164);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(165); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(168); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170); match(AND);
						setState(171); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(173); match(OR);
						setState(174); expression(3);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends AtomContext {
		public TerminalNode CPAR() { return getToken(GYOOParser.CPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(GYOOParser.OPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(GYOOParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(GYOOParser.TRUE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(GYOOParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(GYOOParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(GYOOParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(GYOOParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullAtomContext extends AtomContext {
		public TerminalNode NULL() { return getToken(GYOOParser.NULL, 0); }
		public NullAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).enterNullAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GYOOListener ) ((GYOOListener)listener).exitNullAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GYOOVisitor ) return ((GYOOVisitor<? extends T>)visitor).visitNullAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atom);
		int _la;
		try {
			setState(189);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180); match(OPAR);
				setState(181); expression(0);
				setState(182); match(CPAR);
				}
				break;
			case NUMBER:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(186); match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(187); match(STRING);
				}
				break;
			case NULL:
				_localctx = new NullAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(188); match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\5\5;\n\5\3\5\5\5>\n\5\3\6\3\6\5\6B\n\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\5\bR\n\b\3\t\3"+
		"\t\5\tV\n\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\t\5\t_\n\t\3\t\3\t\3\t\3\n"+
		"\3\n\5\nf\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\n\3\n\3\n\3\13\3\13\7"+
		"\13u\n\13\f\13\16\13x\13\13\3\13\3\13\3\13\6\13}\n\13\r\13\16\13~\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\5\16\u0093\n\16\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u009e\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c0\n\20\3"+
		"\20\2\3\34\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\t\3\2 !\3\2\33"+
		"\35\3\2\31\32\3\2\24\27\3\2\22\23\3\2./\3\2\'(\u00d5\2 \3\2\2\2\4)\3\2"+
		"\2\2\6\65\3\2\2\2\b\67\3\2\2\2\n?\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20S\3"+
		"\2\2\2\22c\3\2\2\2\24r\3\2\2\2\26\u008a\3\2\2\2\30\u008c\3\2\2\2\32\u0097"+
		"\3\2\2\2\34\u009d\3\2\2\2\36\u00bf\3\2\2\2 \"\7\7\2\2!#\5\4\3\2\"!\3\2"+
		"\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\7\t\2\2\'\3\3\2\2\2("+
		"*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-\66\5\b\5"+
		"\2.\66\5\n\6\2/\66\5\16\b\2\60\66\5\20\t\2\61\66\5\22\n\2\62\66\5\24\13"+
		"\2\63\64\7\63\2\2\64\66\b\4\1\2\65-\3\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65"+
		"\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\66\7\3\2\2\2\67"+
		"8\7\6\2\28:\7-\2\29;\7\4\2\2:9\3\2\2\2:;\3\2\2\2;=\3\2\2\2<>\5\34\17\2"+
		"=<\3\2\2\2=>\3\2\2\2>\t\3\2\2\2?A\5\f\7\2@B\5\36\20\2A@\3\2\2\2AB\3\2"+
		"\2\2B\13\3\2\2\2CD\t\2\2\2D\r\3\2\2\2EF\7*\2\2FL\5\30\r\2GH\7+\2\2HI\7"+
		"*\2\2IK\5\30\r\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MQ\3\2\2\2NL\3"+
		"\2\2\2OP\7+\2\2PR\5\32\16\2QO\3\2\2\2QR\3\2\2\2R\17\3\2\2\2SU\7\f\2\2"+
		"TV\7#\2\2UT\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WY\5\34\17\2XW\3\2\2\2Y\\\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2]_\7$\2\2^]\3\2\2\2^_\3\2\2"+
		"\2_`\3\2\2\2`a\7\b\2\2ab\5\32\16\2b\21\3\2\2\2ce\7\r\2\2df\7#\2\2ed\3"+
		"\2\2\2ef\3\2\2\2fg\3\2\2\2gh\5\b\5\2hi\7\30\2\2ij\5\34\17\2jk\7\30\2\2"+
		"km\5\32\16\2ln\7$\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\b\2\2pq\5\32\16"+
		"\2q\23\3\2\2\2rv\7\n\2\2su\5\34\17\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\b\2\2z|\7%\2\2{}\5\26\f\2|{\3\2\2\2}~\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7&\2\2\u0081"+
		"\25\3\2\2\2\u0082\u0083\7\5\2\2\u0083\u0084\5\34\17\2\u0084\u0085\7\13"+
		"\2\2\u0085\u0086\5\32\16\2\u0086\u008b\3\2\2\2\u0087\u0088\7\3\2\2\u0088"+
		"\u0089\7\13\2\2\u0089\u008b\5\6\4\2\u008a\u0082\3\2\2\2\u008a\u0087\3"+
		"\2\2\2\u008b\27\3\2\2\2\u008c\u008d\5\34\17\2\u008d\u008e\5\32\16\2\u008e"+
		"\31\3\2\2\2\u008f\u0092\7%\2\2\u0090\u0093\5\4\3\2\u0091\u0093\5\34\17"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\7&\2\2\u0095\u0098\3\2\2\2\u0096\u0098\5\6\4\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\b\17\1\2\u009a\u009b\7\37"+
		"\2\2\u009b\u009e\5\34\17\n\u009c\u009e\5\36\20\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u00b3\3\2\2\2\u009f\u00a0\f\t\2\2\u00a0\u00a1\t\3"+
		"\2\2\u00a1\u00b2\5\34\17\n\u00a2\u00a3\f\b\2\2\u00a3\u00a4\t\4\2\2\u00a4"+
		"\u00b2\5\34\17\t\u00a5\u00a6\f\7\2\2\u00a6\u00a7\t\5\2\2\u00a7\u00b2\5"+
		"\34\17\b\u00a8\u00a9\f\6\2\2\u00a9\u00aa\t\6\2\2\u00aa\u00b2\5\34\17\7"+
		"\u00ab\u00ac\f\5\2\2\u00ac\u00ad\7\21\2\2\u00ad\u00b2\5\34\17\6\u00ae"+
		"\u00af\f\4\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b2\5\34\17\5\u00b1\u009f"+
		"\3\2\2\2\u00b1\u00a2\3\2\2\2\u00b1\u00a5\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7"+
		"\7#\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\7$\2\2\u00b9\u00c0\3\2\2\2\u00ba"+
		"\u00c0\t\7\2\2\u00bb\u00c0\t\b\2\2\u00bc\u00c0\7-\2\2\u00bd\u00c0\7\60"+
		"\2\2\u00be\u00c0\7)\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf"+
		"\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\37\3\2\2\2\30$+\65:=ALQUZ^emv~\u008a\u0092\u0097\u009d\u00b1"+
		"\u00b3\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}