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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, MAIN=17, 
		OPERATOR=18, Identifier=19, Int=20, Bool=21, String=22, Whitespace=23, 
		Newline=24, LineComment=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "MAIN", 
			"OPERATOR", "Identifier", "Int", "Bool", "String", "NonDigit", "Digit", 
			"Whitespace", "Newline", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "','", "')'", "'='", "'func'", "'if'", "'else'", 
			"'return'", "'void'", "'{'", "'}'", "';'", "'~'", "'-'", "'print'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "MAIN", "OPERATOR", "Identifier", "Int", 
			"Bool", "String", "Whitespace", "Newline", "LineComment"
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
		case 18:
			Identifier_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Identifier_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Identifier"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u0084\n\23\3\24\3\24\3\24\7\24\u0089\n\24"+
		"\f\24\16\24\u008c\13\24\3\24\3\24\3\25\3\25\7\25\u0092\n\25\f\25\16\25"+
		"\u0095\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a0\n"+
		"\26\3\27\3\27\7\27\u00a4\n\27\f\27\16\27\u00a7\13\27\3\30\3\30\3\31\3"+
		"\31\3\32\6\32\u00ae\n\32\r\32\16\32\u00af\3\32\3\32\3\33\3\33\5\33\u00b6"+
		"\n\33\3\33\5\33\u00b9\n\33\3\33\3\33\3\34\3\34\7\34\u00bf\n\34\f\34\16"+
		"\34\u00c2\13\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2"+
		"\61\2\63\31\65\32\67\33\3\2\t\4\2,-\61\61\3\2\63;\3\2\62;\3\2$$\5\2C\\"+
		"aac|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17"+
		"H\3\2\2\2\21K\3\2\2\2\23P\3\2\2\2\25W\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2"+
		"\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#l\3\2\2\2%\u0083\3\2\2"+
		"\2\'\u0085\3\2\2\2)\u008f\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a8"+
		"\3\2\2\2\61\u00aa\3\2\2\2\63\u00ad\3\2\2\2\65\u00b8\3\2\2\2\67\u00bc\3"+
		"\2\2\29:\7<\2\2:\4\3\2\2\2;<\7*\2\2<\6\3\2\2\2=>\7.\2\2>\b\3\2\2\2?@\7"+
		"+\2\2@\n\3\2\2\2AB\7?\2\2B\f\3\2\2\2CD\7h\2\2DE\7w\2\2EF\7p\2\2FG\7e\2"+
		"\2G\16\3\2\2\2HI\7k\2\2IJ\7h\2\2J\20\3\2\2\2KL\7g\2\2LM\7n\2\2MN\7u\2"+
		"\2NO\7g\2\2O\22\3\2\2\2PQ\7t\2\2QR\7g\2\2RS\7v\2\2ST\7w\2\2TU\7t\2\2U"+
		"V\7p\2\2V\24\3\2\2\2WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z[\7f\2\2[\26\3\2\2\2\\"+
		"]\7}\2\2]\30\3\2\2\2^_\7\177\2\2_\32\3\2\2\2`a\7=\2\2a\34\3\2\2\2bc\7"+
		"\u0080\2\2c\36\3\2\2\2de\7/\2\2e \3\2\2\2fg\7r\2\2gh\7t\2\2hi\7k\2\2i"+
		"j\7p\2\2jk\7v\2\2k\"\3\2\2\2lm\7o\2\2mn\7c\2\2no\7k\2\2op\7p\2\2p$\3\2"+
		"\2\2q\u0084\t\2\2\2rs\7/\2\2st\7c\2\2tu\7p\2\2uv\7f\2\2vw\3\2\2\2wx\7"+
		"q\2\2xy\7t\2\2yz\3\2\2\2z{\7k\2\2{|\7u\2\2|}\3\2\2\2}~\7p\2\2~\177\7q"+
		"\2\2\177\u0080\7v\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7>\2\2\u0082\u0084"+
		"\7@\2\2\u0083q\3\2\2\2\u0083r\3\2\2\2\u0084&\3\2\2\2\u0085\u008a\5/\30"+
		"\2\u0086\u0089\5/\30\2\u0087\u0089\5\61\31\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\24\2\2\u008e"+
		"(\3\2\2\2\u008f\u0093\t\3\2\2\u0090\u0092\t\4\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094*\3"+
		"\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7w\2\2\u0099\u00a0\7g\2\2\u009a\u009b\7h\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7n\2\2\u009d\u009e\7u\2\2\u009e\u00a0\7g\2\2\u009f\u0096"+
		"\3\2\2\2\u009f\u009a\3\2\2\2\u00a0,\3\2\2\2\u00a1\u00a5\7$\2\2\u00a2\u00a4"+
		"\n\5\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6.\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\t\6\2\2"+
		"\u00a9\60\3\2\2\2\u00aa\u00ab\t\4\2\2\u00ab\62\3\2\2\2\u00ac\u00ae\t\7"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\32\3\2\u00b2\64\3\2\2"+
		"\2\u00b3\u00b5\7\17\2\2\u00b4\u00b6\7\f\2\2\u00b5\u00b4\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\7\f\2\2\u00b8\u00b3\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\33\3\2\u00bb"+
		"\66\3\2\2\2\u00bc\u00c0\7%\2\2\u00bd\u00bf\n\b\2\2\u00be\u00bd\3\2\2\2"+
		"\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\34\3\2\u00c48\3\2\2\2\r\2\u0083"+
		"\u0088\u008a\u0093\u009f\u00a5\u00af\u00b5\u00b8\u00c0\4\3\24\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}