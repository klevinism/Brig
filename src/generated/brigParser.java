package generated;

// Generated from brig.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class brigParser extends Parser {
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
		"<INVALID>", "'default'", "'case'", "':'", "'while'", "'for'", "'be'", 
		"'let'", "'function'", "'do'", "'switch'", "','", "'import'", "'include'", 
		"'or'", "'and'", "'is'", "'is not'", "'greater'", "'lower'", "'is greater'", 
		"'is lower'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'not'", 
		"'print'", "'println'", "'='", "'('", "')'", "'{'", "'}'", "'true'", "'false'", 
		"'null'", "'if'", "'else'", "WS", "ID", "NUMBER", "FLOAT", "STRING", "COMMENT", 
		"LINE_COMMENT", "OTHER"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_assign = 3, 
		RULE_print = 4, RULE_print_exp = 5, RULE_if_statement = 6, RULE_while_statement = 7, 
		RULE_for_statement = 8, RULE_switch_statement = 9, RULE_function = 10, 
		RULE_function_declaration = 11, RULE_arguments = 12, RULE_switch_expression = 13, 
		RULE_condition_block = 14, RULE_stat_block = 15, RULE_expression = 16, 
		RULE_atom = 17;
	public static final String[] ruleNames = {
		"program", "block", "statement", "assign", "print", "print_exp", "if_statement", 
		"while_statement", "for_statement", "switch_statement", "function", "function_declaration", 
		"arguments", "switch_expression", "condition_block", "stat_block", "expression", 
		"atom"
	};

	@Override
	public String getGrammarFileName() { return "brig.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public brigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(brigParser.EOF, 0); }
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36); block();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__6) | (1L << T__4) | (1L << T__3) | (1L << T__1) | (1L << PRINT) | (1L << PRINTLN) | (1L << IF) | (1L << ID) | (1L << OTHER))) != 0) );
			setState(41); match(EOF);
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(44); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(43); statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(46); 
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
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(brigParser.OTHER, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); print();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52); for_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53); switch_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54); function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(55); function_declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(56); ((StatementContext)_localctx).OTHER = match(OTHER);
				System.err.println("unknown text: " + (((StatementContext)_localctx).OTHER!=null?((StatementContext)_localctx).OTHER.getText():null));
				}
				break;
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
		public TerminalNode ID() { return getToken(brigParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		int _la;
		try {
			setState(75);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(60); match(T__4);
				setState(61); match(ID);
				setState(63);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(62); match(T__5);
					}
				}

				setState(66);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(65); expression(0);
					}
					break;
				}
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(68); match(ID);
				setState(70);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(69); match(T__8);
					}
				}

				setState(73);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(72); expression(0);
					}
					break;
				}
				}
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); print_exp();
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(78); atom();
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

	public static class Print_expContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(brigParser.PRINT, 0); }
		public TerminalNode PRINTLN() { return getToken(brigParser.PRINTLN, 0); }
		public Print_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterPrint_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitPrint_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitPrint_exp(this);
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
			setState(81);
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
		public List<TerminalNode> ELSE() { return getTokens(brigParser.ELSE); }
		public List<TerminalNode> IF() { return getTokens(brigParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(brigParser.IF, i);
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
			return getToken(brigParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitIf_statement(this);
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
			setState(83); match(IF);
			setState(84); condition_block();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85); match(ELSE);
					setState(86); match(IF);
					setState(87); condition_block();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(93); match(ELSE);
				setState(94); stat_block();
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
		public TerminalNode CPAR() { return getToken(brigParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OPAR() { return getToken(brigParser.OPAR, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitWhile_statement(this);
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
			setState(97); match(T__7);
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(98); match(OPAR);
				}
				break;
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(101); expression(0);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			_la = _input.LA(1);
			if (_la==CPAR) {
				{
				setState(107); match(CPAR);
				}
			}

			setState(110); match(T__2);
			setState(111); stat_block();
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
		public List<TerminalNode> SCOL() { return getTokens(brigParser.SCOL); }
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(brigParser.CPAR, 0); }
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
			return getToken(brigParser.SCOL, i);
		}
		public TerminalNode OPAR() { return getToken(brigParser.OPAR, 0); }
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitFor_statement(this);
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
			setState(113); match(T__6);
			setState(115);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(114); match(OPAR);
				}
			}

			setState(117); assign();
			setState(118); match(SCOL);
			setState(119); expression(0);
			setState(120); match(SCOL);
			setState(121); stat_block();
			setState(123);
			_la = _input.LA(1);
			if (_la==CPAR) {
				{
				setState(122); match(CPAR);
				}
			}

			setState(125); match(T__2);
			setState(126); stat_block();
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
		public TerminalNode OBRACE() { return getToken(brigParser.OBRACE, 0); }
		public Switch_expressionContext switch_expression(int i) {
			return getRuleContext(Switch_expressionContext.class,i);
		}
		public TerminalNode CBRACE() { return getToken(brigParser.CBRACE, 0); }
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitSwitch_statement(this);
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
			setState(128); match(T__1);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(129); expression(0);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(T__2);
			setState(136); match(OBRACE);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137); switch_expression();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 || _la==T__9 );
			setState(142); match(CBRACE);
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

	public static class FunctionContext extends ParserRuleContext {
		public Token funName;
		public TerminalNode ID() { return getToken(brigParser.ID, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(T__3);
			setState(145); ((FunctionContext)_localctx).funName = match(ID);
			setState(146); match(OPAR);
			setState(148);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(147); arguments();
				}
			}

			setState(150); match(CPAR);
			setState(151); stat_block();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Token funName;
		public TerminalNode ID() { return getToken(brigParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); ((Function_declarationContext)_localctx).funName = match(ID);
			setState(154); match(OPAR);
			setState(156);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << NOT) | (1L << OPAR) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << NUMBER) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(155); arguments();
				}
			}

			setState(158); match(CPAR);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(160); expression(0);
				}
				break;
			case 2:
				{
				setState(161); assign();
				}
				break;
			}
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(164); match(T__0);
					setState(165); expression(0);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(171); match(T__0);
					setState(172); assign();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterSwitch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitSwitch_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitSwitch_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_expressionContext switch_expression() throws RecognitionException {
		Switch_expressionContext _localctx = new Switch_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switch_expression);
		try {
			setState(188);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); match(T__9);
				setState(181); expression(0);
				setState(182); match(T__8);
				setState(183); stat_block();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(T__10);
				setState(186); match(T__8);
				setState(187); statement();
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); expression(0);
			setState(191); stat_block();
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
		public TerminalNode OBRACE() { return getToken(brigParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(brigParser.CBRACE, 0); }
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stat_block);
		try {
			setState(201);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(193); match(OBRACE);
				setState(196);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(194); block();
					}
					break;
				case 2:
					{
					setState(195); expression(0);
					}
					break;
				}
				setState(198); match(CBRACE);
				}
				break;
			case T__7:
			case T__6:
			case T__4:
			case T__3:
			case T__1:
			case PRINT:
			case PRINTLN:
			case IF:
			case ID:
			case OTHER:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); statement();
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
		public TerminalNode NOT() { return getToken(brigParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode MULT() { return getToken(brigParser.MULT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(brigParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(brigParser.DIV, 0); }
		public MultiplicationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitMultiplicationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitMultiplicationExpr(this);
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
			if ( listener instanceof brigListener ) ((brigListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(brigParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(brigParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(brigParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AdditiveExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode LTEQ() { return getToken(brigParser.LTEQ, 0); }
		public TerminalNode LT() { return getToken(brigParser.LT, 0); }
		public TerminalNode GT() { return getToken(brigParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GTEQ() { return getToken(brigParser.GTEQ, 0); }
		public RelationalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(brigParser.NEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(brigParser.EQ, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(brigParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitAndExpr(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(204); match(NOT);
				setState(205); expression(8);
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
				setState(206); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(209);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(210);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(211); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(212);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(213);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(214); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(216);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(217); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(219);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(220); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(222); match(AND);
						setState(223); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225); match(OR);
						setState(226); expression(3);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public TerminalNode CPAR() { return getToken(brigParser.CPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(brigParser.OPAR, 0); }
		public ParExprContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitParExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(brigParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(brigParser.TRUE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends AtomContext {
		public TerminalNode ID() { return getToken(brigParser.ID, 0); }
		public IdAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterIdAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitIdAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(brigParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(brigParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(brigParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullAtomContext extends AtomContext {
		public TerminalNode NULL() { return getToken(brigParser.NULL, 0); }
		public NullAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).enterNullAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brigListener ) ((brigListener)listener).exitNullAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brigVisitor ) return ((brigVisitor<? extends T>)visitor).visitNullAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom);
		int _la;
		try {
			setState(241);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(OPAR);
				setState(233); expression(0);
				setState(234); match(CPAR);
				}
				break;
			case NUMBER:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
				setState(237);
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
				setState(238); match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(239); match(STRING);
				}
				break;
			case NULL:
				_localctx = new NullAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(240); match(NULL);
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
		case 16: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u00f6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\6\3/\n\3\r\3\16\3\60\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\5\5B\n\5\3\5"+
		"\5\5E\n\5\3\5\3\5\5\5I\n\5\3\5\5\5L\n\5\5\5N\n\5\3\6\3\6\5\6R\n\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\5\bb\n\b\3\t"+
		"\3\t\5\tf\n\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\5\to\n\t\3\t\3\t\3\t\3\n"+
		"\3\n\5\nv\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\n\3\13\3\13\7"+
		"\13\u0085\n\13\f\13\16\13\u0088\13\13\3\13\3\13\3\13\6\13\u008d\n\13\r"+
		"\13\16\13\u008e\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\5\r\u009f\n\r\3\r\3\r\3\16\3\16\5\16\u00a5\n\16\3\16\3\16\7"+
		"\16\u00a9\n\16\f\16\16\16\u00ac\13\16\3\16\3\16\7\16\u00b0\n\16\f\16\16"+
		"\16\u00b3\13\16\5\16\u00b5\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00bf\n\17\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00c7\n\21\3\21\3"+
		"\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22\3\22\5\22\u00d2\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00e6\n\22\f\22\16\22\u00e9\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00f4\n\23\3\23\2\3\"\24\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$\2\t\3\2 !\3\2\33\35\3\2\31\32\3\2\24\27\3"+
		"\2\22\23\3\2./\3\2\'(\u0111\2\'\3\2\2\2\4.\3\2\2\2\6<\3\2\2\2\bM\3\2\2"+
		"\2\nO\3\2\2\2\fS\3\2\2\2\16U\3\2\2\2\20c\3\2\2\2\22s\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u0092\3\2\2\2\30\u009b\3\2\2\2\32\u00a4\3\2\2\2\34\u00be\3"+
		"\2\2\2\36\u00c0\3\2\2\2 \u00cb\3\2\2\2\"\u00d1\3\2\2\2$\u00f3\3\2\2\2"+
		"&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2"+
		"\3,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2"+
		"\2\61\5\3\2\2\2\62=\5\b\5\2\63=\5\n\6\2\64=\5\16\b\2\65=\5\20\t\2\66="+
		"\5\22\n\2\67=\5\24\13\28=\5\26\f\29=\5\30\r\2:;\7\63\2\2;=\b\4\1\2<\62"+
		"\3\2\2\2<\63\3\2\2\2<\64\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<"+
		"8\3\2\2\2<9\3\2\2\2<:\3\2\2\2=\7\3\2\2\2>?\7\t\2\2?A\7-\2\2@B\7\b\2\2"+
		"A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\"\22\2DC\3\2\2\2DE\3\2\2\2EN\3\2\2"+
		"\2FH\7-\2\2GI\7\5\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\"\22\2KJ\3\2\2"+
		"\2KL\3\2\2\2LN\3\2\2\2M>\3\2\2\2MF\3\2\2\2N\t\3\2\2\2OQ\5\f\7\2PR\5$\23"+
		"\2QP\3\2\2\2QR\3\2\2\2R\13\3\2\2\2ST\t\2\2\2T\r\3\2\2\2UV\7*\2\2V\\\5"+
		"\36\20\2WX\7+\2\2XY\7*\2\2Y[\5\36\20\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_`\7+\2\2`b\5 \21\2a_\3\2\2\2ab\3\2\2"+
		"\2b\17\3\2\2\2ce\7\6\2\2df\7#\2\2ed\3\2\2\2ef\3\2\2\2fj\3\2\2\2gi\5\""+
		"\22\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mo\7"+
		"$\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\13\2\2qr\5 \21\2r\21\3\2\2\2s"+
		"u\7\7\2\2tv\7#\2\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\5\b\5\2xy\7\30\2\2"+
		"yz\5\"\22\2z{\7\30\2\2{}\5 \21\2|~\7$\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2\177\u0080\7\13\2\2\u0080\u0081\5 \21\2\u0081\23\3\2\2\2\u0082\u0086"+
		"\7\f\2\2\u0083\u0085\5\"\22\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008c\7%\2\2\u008b\u008d\5\34\17\2"+
		"\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7&\2\2\u0091\25\3\2\2\2\u0092"+
		"\u0093\7\n\2\2\u0093\u0094\7-\2\2\u0094\u0096\7#\2\2\u0095\u0097\5\32"+
		"\16\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7$\2\2\u0099\u009a\5 \21\2\u009a\27\3\2\2\2\u009b\u009c\7-\2\2"+
		"\u009c\u009e\7#\2\2\u009d\u009f\5\32\16\2\u009e\u009d\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1\31\3\2\2\2\u00a2"+
		"\u00a5\5\"\22\2\u00a3\u00a5\5\b\5\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3"+
		"\2\2\2\u00a5\u00b4\3\2\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a9\5\"\22\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00b5\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\r\2\2\u00ae"+
		"\u00b0\5\b\5\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00aa\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\4\2"+
		"\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9\7\5\2\2\u00b9\u00ba\5 \21\2\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd\7\5\2\2\u00bd\u00bf\5\6"+
		"\4\2\u00be\u00b6\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\35\3\2\2\2\u00c0\u00c1"+
		"\5\"\22\2\u00c1\u00c2\5 \21\2\u00c2\37\3\2\2\2\u00c3\u00c6\7%\2\2\u00c4"+
		"\u00c7\5\4\3\2\u00c5\u00c7\5\"\22\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7&\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00cc\5\6\4\2\u00cb\u00c3\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc!\3\2\2\2"+
		"\u00cd\u00ce\b\22\1\2\u00ce\u00cf\7\37\2\2\u00cf\u00d2\5\"\22\n\u00d0"+
		"\u00d2\5$\23\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00e7\3\2"+
		"\2\2\u00d3\u00d4\f\t\2\2\u00d4\u00d5\t\3\2\2\u00d5\u00e6\5\"\22\n\u00d6"+
		"\u00d7\f\b\2\2\u00d7\u00d8\t\4\2\2\u00d8\u00e6\5\"\22\t\u00d9\u00da\f"+
		"\7\2\2\u00da\u00db\t\5\2\2\u00db\u00e6\5\"\22\b\u00dc\u00dd\f\6\2\2\u00dd"+
		"\u00de\t\6\2\2\u00de\u00e6\5\"\22\7\u00df\u00e0\f\5\2\2\u00e0\u00e1\7"+
		"\21\2\2\u00e1\u00e6\5\"\22\6\u00e2\u00e3\f\4\2\2\u00e3\u00e4\7\20\2\2"+
		"\u00e4\u00e6\5\"\22\5\u00e5\u00d3\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00d9"+
		"\3\2\2\2\u00e5\u00dc\3\2\2\2\u00e5\u00df\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8#\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\5\"\22\2\u00ec\u00ed"+
		"\7$\2\2\u00ed\u00f4\3\2\2\2\u00ee\u00f4\t\7\2\2\u00ef\u00f4\t\b\2\2\u00f0"+
		"\u00f4\7-\2\2\u00f1\u00f4\7\60\2\2\u00f2\u00f4\7)\2\2\u00f3\u00ea\3\2"+
		"\2\2\u00f3\u00ee\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4%\3\2\2\2!)\60<ADHKMQ\\aejnu}"+
		"\u0086\u008e\u0096\u009e\u00a4\u00aa\u00b1\u00b4\u00be\u00c6\u00cb\u00d1"+
		"\u00e5\u00e7\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}