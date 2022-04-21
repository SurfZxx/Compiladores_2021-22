// Generated from C:/Users/rafad/OneDrive/Documentos/3ano_2semestre/Compiladores/a22/src\a22.g4 by ANTLR 4.9.2
package a22;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a22Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORDS=1, TYPE_STRUCT=2, IF=3, THEN=4, ELSE=5, WHILE=6, FOR=7, FOR_TO=8, 
		FOR_DOWNTO=9, FOR_STEP=10, RETURN=11, REFERENCED=12, TYPES=13, STRUCT_DOT=14, 
		LBRACKET=15, RBRACKET=16, LARRAY=17, RARRAY=18, LPARENTH=19, RPARENTH=20, 
		PLUS=21, MINUS=22, DIVIDER=23, MULTIPLIER=24, MODULO=25, GREATER=26, LESS=27, 
		EQUAL=28, IS_EQUAL_TO=29, DIFFERENT=30, GREATER_THAN=31, LESS_THAN=32, 
		AND=33, OR=34, NOT=35, COMMA=36, SEMICOLON=37, BOOL=38, REAL=39, INT=40, 
		STRING=41, ID=42, SPACE=43, SL_COMMENT=44, ML_COMMENT=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORDS", "TYPE_STRUCT", "IF", "THEN", "ELSE", "WHILE", "FOR", "FOR_TO", 
			"FOR_DOWNTO", "FOR_STEP", "RETURN", "REFERENCED", "TYPES", "DIGIT", "CHARACTER", 
			"ESC", "STRUCT_DOT", "LBRACKET", "RBRACKET", "LARRAY", "RARRAY", "LPARENTH", 
			"RPARENTH", "PLUS", "MINUS", "DIVIDER", "MULTIPLIER", "MODULO", "GREATER", 
			"LESS", "EQUAL", "IS_EQUAL_TO", "DIFFERENT", "GREATER_THAN", "LESS_THAN", 
			"AND", "OR", "NOT", "COMMA", "SEMICOLON", "BOOL", "REAL", "INT", "STRING", 
			"ID", "SPACE", "SL_COMMENT", "ML_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'type'", "'if'", "'then'", "'else'", "'while'", "'for'", 
			"'to'", "'downto'", "'step'", "'return'", "'^'", null, "'.'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "'+'", "'-'", "'/'", "'*'", "'%'", 
			"'>'", "'<'", "'='", null, null, null, null, "'and'", "'or'", "'not'", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORDS", "TYPE_STRUCT", "IF", "THEN", "ELSE", "WHILE", "FOR", 
			"FOR_TO", "FOR_DOWNTO", "FOR_STEP", "RETURN", "REFERENCED", "TYPES", 
			"STRUCT_DOT", "LBRACKET", "RBRACKET", "LARRAY", "RARRAY", "LPARENTH", 
			"RPARENTH", "PLUS", "MINUS", "DIVIDER", "MULTIPLIER", "MODULO", "GREATER", 
			"LESS", "EQUAL", "IS_EQUAL_TO", "DIFFERENT", "GREATER_THAN", "LESS_THAN", 
			"AND", "OR", "NOT", "COMMA", "SEMICOLON", "BOOL", "REAL", "INT", "STRING", 
			"ID", "SPACE", "SL_COMMENT", "ML_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public a22Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "a22.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0150\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2t\n\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00bf\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u010a\n*\3+\6+\u010d"+
		"\n+\r+\16+\u010e\3+\3+\6+\u0113\n+\r+\16+\u0114\3,\6,\u0118\n,\r,\16,"+
		"\u0119\3-\3-\3-\7-\u011f\n-\f-\16-\u0122\13-\3-\3-\3.\3.\5.\u0128\n.\3"+
		".\3.\3.\7.\u012d\n.\f.\16.\u0130\13.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7"+
		"\60\u013a\n\60\f\60\16\60\u013d\13\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\7\61\u0147\n\61\f\61\16\61\u014a\13\61\3\61\3\61\3\61\3\61\3"+
		"\61\5\u0120\u013b\u0148\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\2\37\2!\2#\20%\21\'\22)\23+\24-\25/\26\61\27"+
		"\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_"+
		".a/\3\2\6\3\2\62;\4\2C\\c|\7\2$$^^ppttvv\4\2\13\f\"\"\2\u015e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7z\3\2\2\2\t}\3\2"+
		"\2\2\13\u0082\3\2\2\2\r\u0087\3\2\2\2\17\u008d\3\2\2\2\21\u0091\3\2\2"+
		"\2\23\u0094\3\2\2\2\25\u009b\3\2\2\2\27\u00a0\3\2\2\2\31\u00a7\3\2\2\2"+
		"\33\u00be\3\2\2\2\35\u00c0\3\2\2\2\37\u00c2\3\2\2\2!\u00c4\3\2\2\2#\u00c7"+
		"\3\2\2\2%\u00c9\3\2\2\2\'\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2"+
		"-\u00d1\3\2\2\2/\u00d3\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9"+
		"\3\2\2\2\67\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e1\3\2\2\2"+
		"?\u00e3\3\2\2\2A\u00e5\3\2\2\2C\u00e8\3\2\2\2E\u00eb\3\2\2\2G\u00ee\3"+
		"\2\2\2I\u00f1\3\2\2\2K\u00f5\3\2\2\2M\u00f8\3\2\2\2O\u00fc\3\2\2\2Q\u00fe"+
		"\3\2\2\2S\u0109\3\2\2\2U\u010c\3\2\2\2W\u0117\3\2\2\2Y\u011b\3\2\2\2["+
		"\u0127\3\2\2\2]\u0131\3\2\2\2_\u0135\3\2\2\2a\u0142\3\2\2\2cd\7y\2\2d"+
		"e\7t\2\2ef\7k\2\2fg\7v\2\2gt\7g\2\2hi\7y\2\2ij\7t\2\2jk\7k\2\2kl\7v\2"+
		"\2lm\7g\2\2mn\7n\2\2nt\7p\2\2op\7t\2\2pq\7g\2\2qr\7c\2\2rt\7f\2\2sc\3"+
		"\2\2\2sh\3\2\2\2so\3\2\2\2t\4\3\2\2\2uv\7v\2\2vw\7{\2\2wx\7r\2\2xy\7g"+
		"\2\2y\6\3\2\2\2z{\7k\2\2{|\7h\2\2|\b\3\2\2\2}~\7v\2\2~\177\7j\2\2\177"+
		"\u0080\7g\2\2\u0080\u0081\7p\2\2\u0081\n\3\2\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0086\7g\2\2\u0086\f\3\2\2\2\u0087"+
		"\u0088\7y\2\2\u0088\u0089\7j\2\2\u0089\u008a\7k\2\2\u008a\u008b\7n\2\2"+
		"\u008b\u008c\7g\2\2\u008c\16\3\2\2\2\u008d\u008e\7h\2\2\u008e\u008f\7"+
		"q\2\2\u008f\u0090\7t\2\2\u0090\20\3\2\2\2\u0091\u0092\7v\2\2\u0092\u0093"+
		"\7q\2\2\u0093\22\3\2\2\2\u0094\u0095\7f\2\2\u0095\u0096\7q\2\2\u0096\u0097"+
		"\7y\2\2\u0097\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\u009a\7q\2\2\u009a"+
		"\24\3\2\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e"+
		"\u009f\7r\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7p\2\2"+
		"\u00a6\30\3\2\2\2\u00a7\u00a8\7`\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7x\2"+
		"\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7k\2\2\u00ac\u00bf\7f\2\2\u00ad\u00ae"+
		"\7d\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7q\2\2\u00b0\u00bf\7n\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00bf\7v\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00bf\7n\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7p\2\2\u00bd\u00bf\7i\2\2\u00be\u00a9\3\2\2\2\u00be\u00ad\3\2\2"+
		"\2\u00be\u00b1\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00b8\3\2\2\2\u00bf\34"+
		"\3\2\2\2\u00c0\u00c1\t\2\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\t\3\2\2\u00c3"+
		" \3\2\2\2\u00c4\u00c5\7^\2\2\u00c5\u00c6\t\4\2\2\u00c6\"\3\2\2\2\u00c7"+
		"\u00c8\7\60\2\2\u00c8$\3\2\2\2\u00c9\u00ca\7}\2\2\u00ca&\3\2\2\2\u00cb"+
		"\u00cc\7\177\2\2\u00cc(\3\2\2\2\u00cd\u00ce\7]\2\2\u00ce*\3\2\2\2\u00cf"+
		"\u00d0\7_\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7*\2\2\u00d2.\3\2\2\2\u00d3\u00d4"+
		"\7+\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7-\2\2\u00d6\62\3\2\2\2\u00d7\u00d8"+
		"\7/\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\66\3\2\2\2\u00db\u00dc"+
		"\7,\2\2\u00dc8\3\2\2\2\u00dd\u00de\7\'\2\2\u00de:\3\2\2\2\u00df\u00e0"+
		"\7@\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2>\3\2\2\2\u00e3\u00e4\7"+
		"?\2\2\u00e4@\3\2\2\2\u00e5\u00e6\5? \2\u00e6\u00e7\5? \2\u00e7B\3\2\2"+
		"\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\5? \2\u00eaD\3\2\2\2\u00eb\u00ec\5;"+
		"\36\2\u00ec\u00ed\5? \2\u00edF\3\2\2\2\u00ee\u00ef\5=\37\2\u00ef\u00f0"+
		"\5? \2\u00f0H\3\2\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7f\2\2\u00f4J\3\2\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7t\2\2\u00f7L\3"+
		"\2\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"N\3\2\2\2\u00fc\u00fd\7.\2\2\u00fdP\3\2\2\2\u00fe\u00ff\7=\2\2\u00ffR"+
		"\3\2\2\2\u0100\u0101\7v\2\2\u0101\u0102\7t\2\2\u0102\u0103\7w\2\2\u0103"+
		"\u010a\7g\2\2\u0104\u0105\7h\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2"+
		"\u0107\u0108\7u\2\2\u0108\u010a\7g\2\2\u0109\u0100\3\2\2\2\u0109\u0104"+
		"\3\2\2\2\u010aT\3\2\2\2\u010b\u010d\5\35\17\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0112\7\60\2\2\u0111\u0113\5\35\17\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115V\3\2\2\2"+
		"\u0116\u0118\5\35\17\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011aX\3\2\2\2\u011b\u0120\7$\2\2\u011c\u011f"+
		"\5!\21\2\u011d\u011f\13\2\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2"+
		"\u011f\u0122\3\2\2\2\u0120\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7$\2\2\u0124Z\3\2\2\2\u0125\u0128"+
		"\7a\2\2\u0126\u0128\5\37\20\2\u0127\u0125\3\2\2\2\u0127\u0126\3\2\2\2"+
		"\u0128\u012e\3\2\2\2\u0129\u012d\5\35\17\2\u012a\u012d\5\37\20\2\u012b"+
		"\u012d\7a\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\\\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\t\5\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0134\b/\2\2\u0134^\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7"+
		"\61\2\2\u0137\u013b\3\2\2\2\u0138\u013a\13\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7\f\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b\60\2\2\u0141`\3\2\2\2\u0142\u0143\7\61\2\2\u0143\u0144\7,\2\2"+
		"\u0144\u0148\3\2\2\2\u0145\u0147\13\2\2\2\u0146\u0145\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u014c\7,\2\2\u014c\u014d\7\61\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\b\61\2\2\u014fb\3\2\2\2\20\2s\u00be\u0109\u010e\u0114"+
		"\u0119\u011e\u0120\u0127\u012c\u012e\u013b\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}