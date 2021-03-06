// Generated from mel.g4 by ANTLR 4.5.1
package melParse;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class melLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, FN=2, END=3, IF=4, THEN=5, ELSE=6, TRUE=7, FALSE=8, STRING=9, 
		INTEGER=10, BOOLEAN=11, PRINT=12, LENGTH=13, RETURN=14, VAR=15, WHILE=16, 
		ARRAY=17, OF=18, BREAK=19, CONTINUE=20, LB=21, RB=22, LP=23, RP=24, LS=25, 
		RS=26, SEMI=27, COLON=28, COMMA=29, EQ=30, ASSIGN=31, NEQ=32, TIMES=33, 
		PLUS=34, MINUS=35, DOT=36, BANG=37, LT=38, LTE=39, GT=40, GTE=41, AND=42, 
		OR=43, INTLIT=44, ID=45, STRINGLIT=46, WS=47, CEOL=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MAIN", "FN", "END", "IF", "THEN", "ELSE", "TRUE", "FALSE", "STRING", 
		"INTEGER", "BOOLEAN", "PRINT", "LENGTH", "RETURN", "VAR", "WHILE", "ARRAY", 
		"OF", "BREAK", "CONTINUE", "LB", "RB", "LP", "RP", "LS", "RS", "SEMI", 
		"COLON", "COMMA", "EQ", "ASSIGN", "NEQ", "TIMES", "PLUS", "MINUS", "DOT", 
		"BANG", "LT", "LTE", "GT", "GTE", "AND", "OR", "INTLIT", "ID", "STRINGLIT", 
		"ESC", "WS", "CEOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'fn'", "'end'", "'if'", "'then'", "'else'", "'true'", 
		"'false'", "'string'", "'integer'", "'boolean'", "'print'", "'length'", 
		"'return'", "'var'", "'while'", "'array'", "'of'", "'break'", "'continue'", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "':'", "','", "'='", 
		"'<-'", "'!='", "'*'", "'+'", "'-'", "'.'", "'!'", "'<'", "'<='", "'>'", 
		"'>='", "'&&'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAIN", "FN", "END", "IF", "THEN", "ELSE", "TRUE", "FALSE", "STRING", 
		"INTEGER", "BOOLEAN", "PRINT", "LENGTH", "RETURN", "VAR", "WHILE", "ARRAY", 
		"OF", "BREAK", "CONTINUE", "LB", "RB", "LP", "RP", "LS", "RS", "SEMI", 
		"COLON", "COMMA", "EQ", "ASSIGN", "NEQ", "TIMES", "PLUS", "MINUS", "DOT", 
		"BANG", "LT", "LTE", "GT", "GTE", "AND", "OR", "INTLIT", "ID", "STRINGLIT", 
		"WS", "CEOL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public melLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u013d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-"+
		"\3-\3-\7-\u010e\n-\f-\16-\u0111\13-\5-\u0113\n-\3.\3.\7.\u0117\n.\f.\16"+
		".\u011a\13.\3/\3/\3/\7/\u011f\n/\f/\16/\u0122\13/\3/\3/\3\60\3\60\3\60"+
		"\3\60\5\60\u012a\n\60\3\61\3\61\3\61\3\61\3\62\3\62\7\62\u0132\n\62\f"+
		"\62\16\62\u0135\13\62\3\62\5\62\u0138\n\62\3\62\3\62\3\62\3\62\4\u0120"+
		"\u0133\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\61c\62\3\2\7\3\2"+
		"\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\u0143\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\3e\3\2\2\2\5j\3\2\2\2\7m\3\2\2\2\tq\3\2\2\2\13t\3\2\2\2\ry\3\2\2\2\17"+
		"~\3\2\2\2\21\u0083\3\2\2\2\23\u0089\3\2\2\2\25\u0090\3\2\2\2\27\u0098"+
		"\3\2\2\2\31\u00a0\3\2\2\2\33\u00a6\3\2\2\2\35\u00ad\3\2\2\2\37\u00b4\3"+
		"\2\2\2!\u00b8\3\2\2\2#\u00be\3\2\2\2%\u00c4\3\2\2\2\'\u00c7\3\2\2\2)\u00cd"+
		"\3\2\2\2+\u00d6\3\2\2\2-\u00d8\3\2\2\2/\u00da\3\2\2\2\61\u00dc\3\2\2\2"+
		"\63\u00de\3\2\2\2\65\u00e0\3\2\2\2\67\u00e2\3\2\2\29\u00e4\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00e8\3\2\2\2?\u00ea\3\2\2\2A\u00ed\3\2\2\2C\u00f0\3\2\2\2E"+
		"\u00f2\3\2\2\2G\u00f4\3\2\2\2I\u00f6\3\2\2\2K\u00f8\3\2\2\2M\u00fa\3\2"+
		"\2\2O\u00fc\3\2\2\2Q\u00ff\3\2\2\2S\u0101\3\2\2\2U\u0104\3\2\2\2W\u0107"+
		"\3\2\2\2Y\u0112\3\2\2\2[\u0114\3\2\2\2]\u011b\3\2\2\2_\u0129\3\2\2\2a"+
		"\u012b\3\2\2\2c\u012f\3\2\2\2ef\7o\2\2fg\7c\2\2gh\7k\2\2hi\7p\2\2i\4\3"+
		"\2\2\2jk\7h\2\2kl\7p\2\2l\6\3\2\2\2mn\7g\2\2no\7p\2\2op\7f\2\2p\b\3\2"+
		"\2\2qr\7k\2\2rs\7h\2\2s\n\3\2\2\2tu\7v\2\2uv\7j\2\2vw\7g\2\2wx\7p\2\2"+
		"x\f\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\16\3\2\2\2~\177\7v\2"+
		"\2\177\u0080\7t\2\2\u0080\u0081\7w\2\2\u0081\u0082\7g\2\2\u0082\20\3\2"+
		"\2\2\u0083\u0084\7h\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7g\2\2\u0088\22\3\2\2\2\u0089\u008a\7u\2\2\u008a\u008b"+
		"\7v\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e"+
		"\u008f\7i\2\2\u008f\24\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0094\7g\2\2\u0094\u0095\7i\2\2\u0095\u0096\7g\2\2"+
		"\u0096\u0097\7t\2\2\u0097\26\3\2\2\2\u0098\u0099\7d\2\2\u0099\u009a\7"+
		"q\2\2\u009a\u009b\7q\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7c\2\2\u009e\u009f\7p\2\2\u009f\30\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\32\3\2\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7i\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7j\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7w\2\2"+
		"\u00b1\u00b2\7t\2\2\u00b2\u00b3\7p\2\2\u00b3\36\3\2\2\2\u00b4\u00b5\7"+
		"x\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7t\2\2\u00b7 \3\2\2\2\u00b8\u00b9"+
		"\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7n\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7t\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7{\2\2\u00c3$\3\2\2\2\u00c4"+
		"\u00c5\7q\2\2\u00c5\u00c6\7h\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7d\2\2\u00c8"+
		"\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7m\2\2"+
		"\u00cc(\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2"+
		"\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4"+
		"\7w\2\2\u00d4\u00d5\7g\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7,\3"+
		"\2\2\2\u00d8\u00d9\7\177\2\2\u00d9.\3\2\2\2\u00da\u00db\7*\2\2\u00db\60"+
		"\3\2\2\2\u00dc\u00dd\7+\2\2\u00dd\62\3\2\2\2\u00de\u00df\7]\2\2\u00df"+
		"\64\3\2\2\2\u00e0\u00e1\7_\2\2\u00e1\66\3\2\2\2\u00e2\u00e3\7=\2\2\u00e3"+
		"8\3\2\2\2\u00e4\u00e5\7<\2\2\u00e5:\3\2\2\2\u00e6\u00e7\7.\2\2\u00e7<"+
		"\3\2\2\2\u00e8\u00e9\7?\2\2\u00e9>\3\2\2\2\u00ea\u00eb\7>\2\2\u00eb\u00ec"+
		"\7/\2\2\u00ec@\3\2\2\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\7?\2\2\u00efB\3"+
		"\2\2\2\u00f0\u00f1\7,\2\2\u00f1D\3\2\2\2\u00f2\u00f3\7-\2\2\u00f3F\3\2"+
		"\2\2\u00f4\u00f5\7/\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7J\3\2"+
		"\2\2\u00f8\u00f9\7#\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7>\2\2\u00fbN\3\2\2"+
		"\2\u00fc\u00fd\7>\2\2\u00fd\u00fe\7?\2\2\u00feP\3\2\2\2\u00ff\u0100\7"+
		"@\2\2\u0100R\3\2\2\2\u0101\u0102\7@\2\2\u0102\u0103\7?\2\2\u0103T\3\2"+
		"\2\2\u0104\u0105\7(\2\2\u0105\u0106\7(\2\2\u0106V\3\2\2\2\u0107\u0108"+
		"\7~\2\2\u0108\u0109\7~\2\2\u0109X\3\2\2\2\u010a\u0113\7\62\2\2\u010b\u010f"+
		"\t\2\2\2\u010c\u010e\t\3\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0112\u010a\3\2\2\2\u0112\u010b\3\2\2\2\u0113Z\3\2\2\2\u0114\u0118"+
		"\t\4\2\2\u0115\u0117\t\5\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\\\3\2\2\2\u011a\u0118\3\2\2\2"+
		"\u011b\u0120\7$\2\2\u011c\u011f\5_\60\2\u011d\u011f\13\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7$"+
		"\2\2\u0124^\3\2\2\2\u0125\u0126\7^\2\2\u0126\u012a\7$\2\2\u0127\u0128"+
		"\7^\2\2\u0128\u012a\7^\2\2\u0129\u0125\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"`\3\2\2\2\u012b\u012c\t\6\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\61\2\2"+
		"\u012eb\3\2\2\2\u012f\u0133\7%\2\2\u0130\u0132\13\2\2\2\u0131\u0130\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138\7\17\2\2\u0137\u0136\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\f\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\b\62\2\2\u013cd\3\2\2\2\13\2\u010f\u0112\u0118"+
		"\u011e\u0120\u0129\u0133\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}