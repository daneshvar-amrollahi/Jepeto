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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, MAIN=6, Identifier=7, Whitespace=8, 
		Newline=9, LineComment=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "MAIN", "Identifier", "NonDigit", 
			"Digit", "Whitespace", "Newline", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "'='", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "MAIN", "Identifier", "Whitespace", 
			"Newline", "LineComment"
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
		case 6:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\7\b.\n\b\f\b\16\b\61\13\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\6\13:\n\13\r\13\16\13;\3\13\3\13\3\f\3\f\5\fB\n\f\3\f\5\fE\n\f"+
		"\3\f\3\f\3\r\3\r\7\rK\n\r\f\r\16\rN\13\r\3\r\3\r\2\2\16\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\2\23\2\25\n\27\13\31\f\3\2\6\5\2C\\aac|\3\2\62;\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\2T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#"+
		"\3\2\2\2\r%\3\2\2\2\17*\3\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\259\3\2\2"+
		"\2\27D\3\2\2\2\31H\3\2\2\2\33\34\7<\2\2\34\4\3\2\2\2\35\36\7*\2\2\36\6"+
		"\3\2\2\2\37 \7+\2\2 \b\3\2\2\2!\"\7.\2\2\"\n\3\2\2\2#$\7?\2\2$\f\3\2\2"+
		"\2%&\7o\2\2&\'\7c\2\2\'(\7k\2\2()\7p\2\2)\16\3\2\2\2*/\5\21\t\2+.\5\21"+
		"\t\2,.\5\23\n\2-+\3\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2"+
		"\60\62\3\2\2\2\61/\3\2\2\2\62\63\b\b\2\2\63\20\3\2\2\2\64\65\t\2\2\2\65"+
		"\22\3\2\2\2\66\67\t\3\2\2\67\24\3\2\2\28:\t\4\2\298\3\2\2\2:;\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\13\3\2>\26\3\2\2\2?A\7\17\2\2@B\7\f"+
		"\2\2A@\3\2\2\2AB\3\2\2\2BE\3\2\2\2CE\7\f\2\2D?\3\2\2\2DC\3\2\2\2EF\3\2"+
		"\2\2FG\b\f\3\2G\30\3\2\2\2HL\7%\2\2IK\n\5\2\2JI\3\2\2\2KN\3\2\2\2LJ\3"+
		"\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\b\r\3\2P\32\3\2\2\2\t\2-/;ADL\4"+
		"\3\b\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}