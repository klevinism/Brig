// Generated from brig.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class brigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, IMPORT=13, INCLUDE=14, OR=15, AND=16, EQ=17, 
		NEQ=18, GT=19, LT=20, GTEQ=21, LTEQ=22, SCOL=23, PLUS=24, MINUS=25, MULT=26, 
		DIV=27, MOD=28, POW=29, NOT=30, PRINT=31, PRINTLN=32, ASSIGN=33, OPAR=34, 
		CPAR=35, OBRACE=36, CBRACE=37, TRUE=38, FALSE=39, NULL=40, IF=41, ELSE=42, 
		WS=43, ID=44, NUMBER=45, FLOAT=46, STRING=47, COMMENT=48, LINE_COMMENT=49, 
		OTHER=50;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "IMPORT", "INCLUDE", "OR", "AND", "EQ", "NEQ", 
		"GT", "LT", "GTEQ", "LTEQ", "SCOL", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
		"POW", "NOT", "PRINT", "PRINTLN", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
		"CBRACE", "TRUE", "FALSE", "NULL", "IF", "ELSE", "WS", "ID", "NUMBER", 
		"FLOAT", "STRING", "COMMENT", "LINE_COMMENT", "OTHER"
	};


	public brigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "brig.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u0174\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\6,\u0129\n,\r,\16,\u012a"+
		"\3,\3,\3-\3-\7-\u0131\n-\f-\16-\u0134\13-\3.\6.\u0137\n.\r.\16.\u0138"+
		"\3/\6/\u013c\n/\r/\16/\u013d\3/\3/\7/\u0142\n/\f/\16/\u0145\13/\3/\3/"+
		"\6/\u0149\n/\r/\16/\u014a\5/\u014d\n/\3\60\3\60\3\60\3\60\7\60\u0153\n"+
		"\60\f\60\16\60\u0156\13\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u015e\n"+
		"\61\f\61\16\61\u0161\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\7\62\u016c\n\62\f\62\16\62\u016f\13\62\3\62\3\62\3\63\3\63\3\u015f\2"+
		"\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\b\5\2\13"+
		"\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f"+
		"\17\17\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5o\3\2\2\2\7t\3\2\2"+
		"\2\t{\3\2\2\2\13}\3\2\2\2\r\u0083\3\2\2\2\17\u0087\3\2\2\2\21\u008a\3"+
		"\2\2\2\23\u008e\3\2\2\2\25\u0097\3\2\2\2\27\u009a\3\2\2\2\31\u00a1\3\2"+
		"\2\2\33\u00a3\3\2\2\2\35\u00aa\3\2\2\2\37\u00b2\3\2\2\2!\u00b5\3\2\2\2"+
		"#\u00b9\3\2\2\2%\u00bc\3\2\2\2\'\u00c3\3\2\2\2)\u00cb\3\2\2\2+\u00d1\3"+
		"\2\2\2-\u00dc\3\2\2\2/\u00e5\3\2\2\2\61\u00e7\3\2\2\2\63\u00e9\3\2\2\2"+
		"\65\u00eb\3\2\2\2\67\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3"+
		"\3\2\2\2?\u00f7\3\2\2\2A\u00fd\3\2\2\2C\u0105\3\2\2\2E\u0107\3\2\2\2G"+
		"\u0109\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2\2\2M\u010f\3\2\2\2O\u0114\3\2"+
		"\2\2Q\u011a\3\2\2\2S\u011f\3\2\2\2U\u0122\3\2\2\2W\u0128\3\2\2\2Y\u012e"+
		"\3\2\2\2[\u0136\3\2\2\2]\u014c\3\2\2\2_\u014e\3\2\2\2a\u0159\3\2\2\2c"+
		"\u0167\3\2\2\2e\u0172\3\2\2\2gh\7f\2\2hi\7g\2\2ij\7h\2\2jk\7c\2\2kl\7"+
		"w\2\2lm\7n\2\2mn\7v\2\2n\4\3\2\2\2op\7e\2\2pq\7c\2\2qr\7u\2\2rs\7g\2\2"+
		"s\6\3\2\2\2tu\7t\2\2uv\7g\2\2vw\7v\2\2wx\7w\2\2xy\7t\2\2yz\7p\2\2z\b\3"+
		"\2\2\2{|\7<\2\2|\n\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\f\3\2\2\2\u0083\u0084\7h\2\2\u0084"+
		"\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\16\3\2\2\2\u0087\u0088\7d\2\2\u0088"+
		"\u0089\7g\2\2\u0089\20\3\2\2\2\u008a\u008b\7n\2\2\u008b\u008c\7g\2\2\u008c"+
		"\u008d\7v\2\2\u008d\22\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7w\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\24\3\2\2\2\u0097\u0098\7"+
		"f\2\2\u0098\u0099\7q\2\2\u0099\26\3\2\2\2\u009a\u009b\7u\2\2\u009b\u009c"+
		"\7y\2\2\u009c\u009d\7k\2\2\u009d\u009e\7v\2\2\u009e\u009f\7e\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7q\2\2"+
		"\u00a7\u00a8\7t\2\2\u00a8\u00a9\7v\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7"+
		"k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af"+
		"\7w\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7g\2\2\u00b1\36\3\2\2\2\u00b2\u00b3"+
		"\7q\2\2\u00b3\u00b4\7t\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7p\2\2\u00b7\u00b8\7f\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7u\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7\"\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"&\3\2\2\2\u00c3\u00c4\7i\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7t\2\2"+
		"\u00ca(\3\2\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7y\2"+
		"\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7t\2\2\u00d0*\3\2\2\2\u00d1\u00d2\7"+
		"k\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7i\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9\u00da\7g\2\2\u00da\u00db\7t\2\2\u00db,\3\2\2\2\u00dc\u00dd\7k\2"+
		"\2\u00dd\u00de\7u\2\2\u00de\u00df\7\"\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1"+
		"\7q\2\2\u00e1\u00e2\7y\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4"+
		".\3\2\2\2\u00e5\u00e6\7=\2\2\u00e6\60\3\2\2\2\u00e7\u00e8\7-\2\2\u00e8"+
		"\62\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\64\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec"+
		"\66\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee8\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0"+
		":\3\2\2\2\u00f1\u00f2\7`\2\2\u00f2<\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7q\2\2\u00f5\u00f6\7v\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9"+
		"\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"@\3\2\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7k\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7v\2\2\u0102\u0103\7n\2\2\u0103\u0104\7p\2\2"+
		"\u0104B\3\2\2\2\u0105\u0106\7?\2\2\u0106D\3\2\2\2\u0107\u0108\7*\2\2\u0108"+
		"F\3\2\2\2\u0109\u010a\7+\2\2\u010aH\3\2\2\2\u010b\u010c\7}\2\2\u010cJ"+
		"\3\2\2\2\u010d\u010e\7\177\2\2\u010eL\3\2\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7w\2\2\u0112\u0113\7g\2\2\u0113N\3\2\2\2\u0114"+
		"\u0115\7h\2\2\u0115\u0116\7c\2\2\u0116\u0117\7n\2\2\u0117\u0118\7u\2\2"+
		"\u0118\u0119\7g\2\2\u0119P\3\2\2\2\u011a\u011b\7p\2\2\u011b\u011c\7w\2"+
		"\2\u011c\u011d\7n\2\2\u011d\u011e\7n\2\2\u011eR\3\2\2\2\u011f\u0120\7"+
		"k\2\2\u0120\u0121\7h\2\2\u0121T\3\2\2\2\u0122\u0123\7g\2\2\u0123\u0124"+
		"\7n\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126V\3\2\2\2\u0127\u0129"+
		"\t\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\b,\2\2\u012dX\3\2\2\2\u012e"+
		"\u0132\t\3\2\2\u012f\u0131\t\4\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133Z\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0137\t\5\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\\\3\2\2\2\u013a\u013c\t\5\2\2"+
		"\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0143\7\60\2\2\u0140\u0142\t\5\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u014d\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\60\2\2"+
		"\u0147\u0149\t\5\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u013b\3\2\2\2\u014c"+
		"\u0146\3\2\2\2\u014d^\3\2\2\2\u014e\u0154\7$\2\2\u014f\u0153\n\6\2\2\u0150"+
		"\u0151\7$\2\2\u0151\u0153\7$\2\2\u0152\u014f\3\2\2\2\u0152\u0150\3\2\2"+
		"\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7$\2\2\u0158`\3\2\2\2\u0159\u015a"+
		"\7\61\2\2\u015a\u015b\7,\2\2\u015b\u015f\3\2\2\2\u015c\u015e\13\2\2\2"+
		"\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u0160\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\7,\2\2\u0163"+
		"\u0164\7\61\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b\61\3\2\u0166b\3\2\2"+
		"\2\u0167\u0168\7\61\2\2\u0168\u0169\7\61\2\2\u0169\u016d\3\2\2\2\u016a"+
		"\u016c\n\7\2\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0171\b\62\3\2\u0171d\3\2\2\2\u0172\u0173\13\2\2\2\u0173f\3\2\2\2\16"+
		"\2\u012a\u0132\u0138\u013d\u0143\u014a\u014c\u0152\u0154\u015f\u016d\4"+
		"\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}