// Generated from /home/daneshvar/Desktop/PLC/Project/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JepetoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, Main=22, If=23, Else=24, Return=25, 
		OPERATOR=26, Print=27, Identifier=28, Int=29, Bool=30, String=31, Whitespace=32, 
		Newline=33, LineComment=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "Main", "If", "Else", "Return", "OPERATOR", 
			"Print", "Identifier", "Int", "Bool", "String", "NonDigit", "Digit", 
			"Whitespace", "Newline", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'('", "','", "')'", "'='", "'func'", "'{'", "'}'", 
			"'void'", "'or'", "'and'", "'is'", "'not'", "'<'", "'>'", "'+'", "'-'", 
			"'*'", "'/'", "'~'", "'main'", "'if'", "'else'", "'return'", null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Main", "If", 
			"Else", "Return", "OPERATOR", "Print", "Identifier", "Int", "Bool", "String", 
			"Whitespace", "Newline", "LineComment"
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


	public JepetoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jepeto.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 22:
			If_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			Else_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			Return_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			Print_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void If_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Conditional : if"); 
			break;
		}
	}
	private void Else_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 System.out.println("Conditional : else"); 
			break;
		}
	}
	private void Return_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 System.out.println("Return"); 
			break;
		}
	}
	private void Print_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 System.out.println("Built-in : print"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00a8\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u00b5\n\35\f\35\16"+
		"\35\u00b8\13\35\3\36\3\36\7\36\u00bc\n\36\f\36\16\36\u00bf\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00ca\n\37\3 \3 \7 \u00ce"+
		"\n \f \16 \u00d1\13 \3 \3 \3!\3!\3\"\3\"\3#\6#\u00da\n#\r#\16#\u00db\3"+
		"#\3#\3$\3$\5$\u00e2\n$\3$\5$\u00e5\n$\3$\3$\3%\3%\7%\u00eb\n%\f%\16%\u00ee"+
		"\13%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\2C\2E\"G#I$\3\2\n\5\2,-//\61\61\4\2>>@@\3\2\63"+
		";\3\2\62;\3\2$$\5\2C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00fc\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3"+
		"\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21\\\3"+
		"\2\2\2\23^\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31h\3\2\2\2\33l\3\2\2\2\35"+
		"o\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2"+
		"\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0086\3\2\2\2\61\u008b\3\2\2\2\63\u0092"+
		"\3\2\2\2\65\u00a7\3\2\2\2\67\u00a9\3\2\2\29\u00b1\3\2\2\2;\u00b9\3\2\2"+
		"\2=\u00c9\3\2\2\2?\u00cb\3\2\2\2A\u00d4\3\2\2\2C\u00d6\3\2\2\2E\u00d9"+
		"\3\2\2\2G\u00e4\3\2\2\2I\u00e8\3\2\2\2KL\7<\2\2L\4\3\2\2\2MN\7=\2\2N\6"+
		"\3\2\2\2OP\7*\2\2P\b\3\2\2\2QR\7.\2\2R\n\3\2\2\2ST\7+\2\2T\f\3\2\2\2U"+
		"V\7?\2\2V\16\3\2\2\2WX\7h\2\2XY\7w\2\2YZ\7p\2\2Z[\7e\2\2[\20\3\2\2\2\\"+
		"]\7}\2\2]\22\3\2\2\2^_\7\177\2\2_\24\3\2\2\2`a\7x\2\2ab\7q\2\2bc\7k\2"+
		"\2cd\7f\2\2d\26\3\2\2\2ef\7q\2\2fg\7t\2\2g\30\3\2\2\2hi\7c\2\2ij\7p\2"+
		"\2jk\7f\2\2k\32\3\2\2\2lm\7k\2\2mn\7u\2\2n\34\3\2\2\2op\7p\2\2pq\7q\2"+
		"\2qr\7v\2\2r\36\3\2\2\2st\7>\2\2t \3\2\2\2uv\7@\2\2v\"\3\2\2\2wx\7-\2"+
		"\2x$\3\2\2\2yz\7/\2\2z&\3\2\2\2{|\7,\2\2|(\3\2\2\2}~\7\61\2\2~*\3\2\2"+
		"\2\177\u0080\7\u0080\2\2\u0080,\3\2\2\2\u0081\u0082\7o\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085.\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7h\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\30\2\2\u008a"+
		"\60\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7n\2\2\u008d\u008e\7u\2\2\u008e"+
		"\u008f\7g\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\31\3\2\u0091\62\3\2\2"+
		"\2\u0092\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7v\2\2\u0095\u0096"+
		"\7w\2\2\u0096\u0097\7t\2\2\u0097\u0098\7p\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\b\32\4\2\u009a\64\3\2\2\2\u009b\u00a8\t\2\2\2\u009c\u009d\7c\2"+
		"\2\u009d\u009e\7p\2\2\u009e\u00a8\7f\2\2\u009f\u00a0\7q\2\2\u00a0\u00a8"+
		"\7t\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a8\7u\2\2\u00a3\u00a4\7p\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a8\7v\2\2\u00a6\u00a8\t\3\2\2\u00a7\u009b\3\2\2"+
		"\2\u00a7\u009c\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a3"+
		"\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\b\34\5\2\u00b08\3\2\2\2\u00b1\u00b6\5"+
		"A!\2\u00b2\u00b5\5A!\2\u00b3\u00b5\5C\"\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		":\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bd\t\4\2\2\u00ba\u00bc\t\5\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be<\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2"+
		"\7t\2\2\u00c2\u00c3\7w\2\2\u00c3\u00ca\7g\2\2\u00c4\u00c5\7h\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00ca\7g\2\2"+
		"\u00c9\u00c0\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca>\3\2\2\2\u00cb\u00cf\7"+
		"$\2\2\u00cc\u00ce\n\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d2\u00d3\7$\2\2\u00d3@\3\2\2\2\u00d4\u00d5\t\7\2\2\u00d5B\3\2"+
		"\2\2\u00d6\u00d7\t\5\2\2\u00d7D\3\2\2\2\u00d8\u00da\t\b\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\b#\6\2\u00deF\3\2\2\2\u00df\u00e1\7\17\2\2"+
		"\u00e0\u00e2\7\f\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5"+
		"\3\2\2\2\u00e3\u00e5\7\f\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b$\6\2\u00e7H\3\2\2\2\u00e8\u00ec\7%\2\2\u00e9"+
		"\u00eb\n\t\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f0\b%\6\2\u00f0J\3\2\2\2\r\2\u00a7\u00b4\u00b6\u00bd\u00c9\u00cf\u00db"+
		"\u00e1\u00e4\u00ec\7\3\30\2\3\31\3\3\32\4\3\34\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}