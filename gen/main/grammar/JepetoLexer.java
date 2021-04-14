// Generated from /home/mahyar/CAs/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, Main=27, If=28, Else=29, Return=30, OPERATOR=31, Print=32, 
		Identifier=33, Int=34, Bool=35, String=36, Whitespace=37, Newline=38, 
		LineComment=39;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "Main", "If", "Else", "Return", "OPERATOR", "Print", "Identifier", 
			"Int", "Bool", "String", "NonDigit", "Digit", "Whitespace", "Newline", 
			"LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'('", "','", "')'", "'='", "'func'", "'{'", "'}'", 
			"'->'", "'void'", "'or'", "'and'", "'is'", "'not'", "'<'", "'>'", "'+'", 
			"'-'", "'*'", "'/'", "'~'", "'::'", "'.size'", "'['", "']'", "'main'", 
			"'if'", "'else'", "'return'", null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "Main", "If", "Else", "Return", "OPERATOR", "Print", 
			"Identifier", "Int", "Bool", "String", "Whitespace", "Newline", "LineComment"
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
		case 27:
			If_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			Else_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			Return_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00c2\n"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\7\"\u00cf\n\"\f\"\16\"\u00d2\13"+
		"\"\3#\3#\7#\u00d6\n#\f#\16#\u00d9\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00e4"+
		"\n$\3%\3%\7%\u00e8\n%\f%\16%\u00eb\13%\3%\3%\3&\3&\3\'\3\'\3(\6(\u00f4"+
		"\n(\r(\16(\u00f5\3(\3(\3)\3)\5)\u00fc\n)\3)\5)\u00ff\n)\3)\3)\3*\3*\7"+
		"*\u0105\n*\f*\16*\u0108\13*\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\'Q(S)\3\2\n"+
		"\5\2,-//\61\61\4\2>>@@\3\2\63;\3\2\62;\3\2$$\5\2C\\aac|\4\2\13\13\"\""+
		"\4\2\f\f\17\17\2\u0116\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a"+
		"\3\2\2\2\21f\3\2\2\2\23h\3\2\2\2\25j\3\2\2\2\27m\3\2\2\2\31r\3\2\2\2\33"+
		"u\3\2\2\2\35y\3\2\2\2\37|\3\2\2\2!\u0080\3\2\2\2#\u0082\3\2\2\2%\u0084"+
		"\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2-\u008c\3\2\2\2"+
		"/\u008e\3\2\2\2\61\u0091\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67"+
		"\u009b\3\2\2\29\u00a0\3\2\2\2;\u00a5\3\2\2\2=\u00ac\3\2\2\2?\u00c1\3\2"+
		"\2\2A\u00c3\3\2\2\2C\u00cb\3\2\2\2E\u00d3\3\2\2\2G\u00e3\3\2\2\2I\u00e5"+
		"\3\2\2\2K\u00ee\3\2\2\2M\u00f0\3\2\2\2O\u00f3\3\2\2\2Q\u00fe\3\2\2\2S"+
		"\u0102\3\2\2\2UV\7<\2\2V\4\3\2\2\2WX\7=\2\2X\6\3\2\2\2YZ\7*\2\2Z\b\3\2"+
		"\2\2[\\\7.\2\2\\\n\3\2\2\2]^\7+\2\2^\f\3\2\2\2_`\7?\2\2`\16\3\2\2\2ab"+
		"\7h\2\2bc\7w\2\2cd\7p\2\2de\7e\2\2e\20\3\2\2\2fg\7}\2\2g\22\3\2\2\2hi"+
		"\7\177\2\2i\24\3\2\2\2jk\7/\2\2kl\7@\2\2l\26\3\2\2\2mn\7x\2\2no\7q\2\2"+
		"op\7k\2\2pq\7f\2\2q\30\3\2\2\2rs\7q\2\2st\7t\2\2t\32\3\2\2\2uv\7c\2\2"+
		"vw\7p\2\2wx\7f\2\2x\34\3\2\2\2yz\7k\2\2z{\7u\2\2{\36\3\2\2\2|}\7p\2\2"+
		"}~\7q\2\2~\177\7v\2\2\177 \3\2\2\2\u0080\u0081\7>\2\2\u0081\"\3\2\2\2"+
		"\u0082\u0083\7@\2\2\u0083$\3\2\2\2\u0084\u0085\7-\2\2\u0085&\3\2\2\2\u0086"+
		"\u0087\7/\2\2\u0087(\3\2\2\2\u0088\u0089\7,\2\2\u0089*\3\2\2\2\u008a\u008b"+
		"\7\61\2\2\u008b,\3\2\2\2\u008c\u008d\7\u0080\2\2\u008d.\3\2\2\2\u008e"+
		"\u008f\7<\2\2\u008f\u0090\7<\2\2\u0090\60\3\2\2\2\u0091\u0092\7\60\2\2"+
		"\u0092\u0093\7u\2\2\u0093\u0094\7k\2\2\u0094\u0095\7|\2\2\u0095\u0096"+
		"\7g\2\2\u0096\62\3\2\2\2\u0097\u0098\7]\2\2\u0098\64\3\2\2\2\u0099\u009a"+
		"\7_\2\2\u009a\66\3\2\2\2\u009b\u009c\7o\2\2\u009c\u009d\7c\2\2\u009d\u009e"+
		"\7k\2\2\u009e\u009f\7p\2\2\u009f8\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\35\2\2\u00a4:\3\2\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\36\3\2\u00ab<\3\2\2\2\u00ac\u00ad\7"+
		"t\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\37\4\2\u00b4"+
		">\3\2\2\2\u00b5\u00c2\t\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00c2\7f\2\2\u00b9\u00ba\7q\2\2\u00ba\u00c2\7t\2\2\u00bb\u00bc\7k\2\2"+
		"\u00bc\u00c2\7u\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7q\2\2\u00bf\u00c2"+
		"\7v\2\2\u00c0\u00c2\t\3\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c1"+
		"\u00b9\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6"+
		"\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\b!\5\2\u00caB\3\2\2\2\u00cb\u00d0\5K&\2\u00cc\u00cf\5K&\2\u00cd"+
		"\u00cf\5M\'\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1D\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d7\t\4\2\2\u00d4\u00d6\t\5\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8F\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd"+
		"\7w\2\2\u00dd\u00e4\7g\2\2\u00de\u00df\7h\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e4\7g\2\2\u00e3\u00da\3\2\2"+
		"\2\u00e3\u00de\3\2\2\2\u00e4H\3\2\2\2\u00e5\u00e9\7$\2\2\u00e6\u00e8\n"+
		"\6\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7$"+
		"\2\2\u00edJ\3\2\2\2\u00ee\u00ef\t\7\2\2\u00efL\3\2\2\2\u00f0\u00f1\t\5"+
		"\2\2\u00f1N\3\2\2\2\u00f2\u00f4\t\b\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\b(\6\2\u00f8P\3\2\2\2\u00f9\u00fb\7\17\2\2\u00fa\u00fc\7\f\2\2"+
		"\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff"+
		"\7\f\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b)\6\2\u0101R\3\2\2\2\u0102\u0106\7%\2\2\u0103\u0105\n\t\2\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\b*\6\2\u010a"+
		"T\3\2\2\2\r\2\u00c1\u00ce\u00d0\u00d7\u00e3\u00e9\u00f5\u00fb\u00fe\u0106"+
		"\7\3\35\2\3\36\3\3\37\4\3!\5\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}