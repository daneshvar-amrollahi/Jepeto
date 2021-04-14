// Generated from /home/mahyar/CAs/Jepeto/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JepetoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, Main=26, If=27, Else=28, Return=29, OPERATOR=30, Print=31, Identifier=32, 
		Int=33, Bool=34, String=35, Whitespace=36, Newline=37, LineComment=38;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_funcCallStmt = 2, RULE_printStmt = 3, 
		RULE_functionCall = 4, RULE_argList = 5, RULE_function = 6, RULE_body = 7, 
		RULE_funcDec = 8, RULE_argDec = 9, RULE_arg = 10, RULE_if_ = 11, RULE_else_ = 12, 
		RULE_returnStatement = 13, RULE_return_ = 14, RULE_statement = 15, RULE_expression = 16, 
		RULE_orExpression = 17, RULE_andExpression = 18, RULE_isNotExpression = 19, 
		RULE_ltgtExpression = 20, RULE_addSubExpression = 21, RULE_mulDivExpression = 22, 
		RULE_tildaNegOperator = 23, RULE_concatExpression = 24, RULE_subscriptExpression = 25, 
		RULE_factor_ = 26, RULE_print = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "funcCallStmt", "printStmt", "functionCall", "argList", 
			"function", "body", "funcDec", "argDec", "arg", "if_", "else_", "returnStatement", 
			"return_", "statement", "expression", "orExpression", "andExpression", 
			"isNotExpression", "ltgtExpression", "addSubExpression", "mulDivExpression", 
			"tildaNegOperator", "concatExpression", "subscriptExpression", "factor_", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'('", "','", "')'", "'='", "'func'", "'{'", "'}'", 
			"'void'", "'or'", "'and'", "'is'", "'not'", "'<'", "'>'", "'+'", "'-'", 
			"'*'", "'/'", "'~'", "'::'", "'.size'", "'['", "']'", "'main'", "'if'", 
			"'else'", "'return'", null, "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Main", "If", "Else", "Return", "OPERATOR", "Print", "Identifier", 
			"Int", "Bool", "String", "Whitespace", "Newline", "LineComment"
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

	@Override
	public String getGrammarFileName() { return "Jepeto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JepetoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JepetoParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(56);
				function();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			main();
			 System.out.println("Main"); 
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(64);
				function();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(JepetoParser.Main, 0); }
		public FuncCallStmtContext funcCallStmt() {
			return getRuleContext(FuncCallStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(Main);
			setState(73);
			match(T__0);
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(74);
				funcCallStmt();
				}
				break;
			case Print:
				{
				setState(75);
				printStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FuncCallStmtContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FuncCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFuncCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFuncCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFuncCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallStmtContext funcCallStmt() throws RecognitionException {
		FuncCallStmtContext _localctx = new FuncCallStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcCallStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			functionCall();
			setState(79);
			match(T__1);
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

	public static class PrintStmtContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			print();
			setState(82);
			match(T__1);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JepetoParser.Identifier, 0); }
		public List<ArgListContext> argList() {
			return getRuleContexts(ArgListContext.class);
		}
		public ArgListContext argList(int i) {
			return getRuleContext(ArgListContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(Identifier);
			setState(86); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(85);
					argList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JepetoParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JepetoParser.Identifier, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argList);
		try {
			int _alt;
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				 System.out.println("FunctionCall"); 
				setState(91);
				match(T__2);
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						expression(0);
						setState(93);
						match(T__3);
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(100);
				expression(0);
				setState(101);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__2);
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(104);
						match(Identifier);
						setState(105);
						match(T__5);
						setState(106);
						expression(0);
						setState(107);
						match(T__3);
						}
						} 
					}
					setState(113);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				{
				setState(114);
				match(Identifier);
				setState(115);
				match(T__5);
				setState(116);
				expression(0);
				}
				setState(118);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__2);
				setState(121);
				match(T__4);
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

	public static class FunctionContext extends ParserRuleContext {
		public FuncDecContext funcDec() {
			return getRuleContext(FuncDecContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__6);
				setState(125);
				funcDec();
				setState(126);
				match(T__0);
				setState(129);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case If:
					{
					setState(127);
					if_();
					}
					break;
				case Return:
					{
					setState(128);
					returnStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__6);
				setState(132);
				funcDec();
				setState(133);
				match(T__0);
				setState(134);
				match(T__7);
				setState(135);
				body();
				setState(136);
				match(T__8);
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

	public static class BodyContext extends ParserRuleContext {
		public List<If_Context> if_() {
			return getRuleContexts(If_Context.class);
		}
		public If_Context if_(int i) {
			return getRuleContext(If_Context.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Return) | (1L << Print) | (1L << Identifier))) != 0)) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case If:
					{
					setState(140);
					if_();
					}
					break;
				case Return:
				case Print:
				case Identifier:
					{
					setState(141);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FuncDecContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(JepetoParser.Identifier, 0); }
		public ArgDecContext argDec() {
			return getRuleContext(ArgDecContext.class,0);
		}
		public FuncDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFuncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDecContext funcDec() throws RecognitionException {
		FuncDecContext _localctx = new FuncDecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((FuncDecContext)_localctx).Identifier = match(Identifier);
			 System.out.println("FunctionDec : " + ((FuncDecContext)_localctx).Identifier.getText()); 
			setState(149);
			argDec();
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

	public static class ArgDecContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterArgDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitArgDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitArgDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgDecContext argDec() throws RecognitionException {
		ArgDecContext _localctx = new ArgDecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argDec);
		try {
			int _alt;
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__2);
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						arg();
						setState(153);
						match(T__3);
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(160);
				arg();
				setState(161);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__2);
				setState(164);
				match(T__4);
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

	public static class ArgContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(JepetoParser.Identifier, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((ArgContext)_localctx).Identifier = match(Identifier);
			 System.out.println("ArgDec : " + ((ArgContext)_localctx).Identifier.getText()); 
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode If() { return getToken(JepetoParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(If);
				setState(171);
				expression(0);
				setState(172);
				match(T__0);
				setState(173);
				match(T__7);
				setState(174);
				body();
				setState(175);
				match(T__8);
				setState(176);
				else_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(If);
				setState(179);
				expression(0);
				setState(180);
				match(T__0);
				setState(181);
				match(T__7);
				setState(182);
				body();
				setState(183);
				match(T__8);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(If);
				setState(186);
				expression(0);
				setState(187);
				match(T__0);
				setState(188);
				returnStatement();
				setState(189);
				else_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				match(If);
				setState(192);
				expression(0);
				setState(193);
				match(T__0);
				setState(194);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(If);
				setState(197);
				expression(0);
				setState(198);
				match(T__0);
				setState(199);
				if_();
				setState(200);
				else_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(If);
				setState(203);
				expression(0);
				setState(204);
				match(T__0);
				setState(205);
				if_();
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

	public static class Else_Context extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JepetoParser.Else, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterElse_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitElse_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitElse_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Else);
				setState(210);
				match(T__0);
				setState(211);
				match(T__7);
				setState(212);
				body();
				setState(213);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(Else);
				setState(216);
				match(T__0);
				setState(217);
				returnStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(Else);
				setState(219);
				match(T__0);
				setState(220);
				if_();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			return_();
			setState(224);
			match(T__1);
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

	public static class Return_Context extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JepetoParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitReturn_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(Return);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__17:
			case T__20:
			case Identifier:
			case Int:
			case Bool:
			case String:
				{
				setState(227);
				expression(0);
				}
				break;
			case T__9:
				{
				setState(228);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Print:
				{
				setState(231);
				print();
				}
				break;
			case Identifier:
				{
				setState(232);
				functionCall();
				}
				break;
			case Return:
				{
				setState(233);
				return_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(236);
			match(T__1);
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
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitExpression(this);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(239);
			orExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(241);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(242);
					match(T__10);
					setState(243);
					orExpression(0);
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class OrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		return orExpression(0);
	}

	private OrExpressionContext orExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, _parentState);
		OrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_orExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_orExpression);
					setState(252);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(253);
					match(T__11);
					setState(254);
					andExpression(0);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public IsNotExpressionContext isNotExpression() {
			return getRuleContext(IsNotExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261);
			isNotExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
						setState(263);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(264);
						match(T__12);
						setState(265);
						isNotExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AndExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(267);
						match(T__13);
						setState(268);
						isNotExpression(0);
						}
						break;
					}
					} 
				}
				setState(273);
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

	public static class IsNotExpressionContext extends ParserRuleContext {
		public LtgtExpressionContext ltgtExpression() {
			return getRuleContext(LtgtExpressionContext.class,0);
		}
		public IsNotExpressionContext isNotExpression() {
			return getRuleContext(IsNotExpressionContext.class,0);
		}
		public IsNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isNotExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIsNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIsNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIsNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsNotExpressionContext isNotExpression() throws RecognitionException {
		return isNotExpression(0);
	}

	private IsNotExpressionContext isNotExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IsNotExpressionContext _localctx = new IsNotExpressionContext(_ctx, _parentState);
		IsNotExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_isNotExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(275);
			ltgtExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(277);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(278);
						match(T__14);
						setState(279);
						ltgtExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new IsNotExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_isNotExpression);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(281);
						match(T__15);
						setState(282);
						ltgtExpression(0);
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class LtgtExpressionContext extends ParserRuleContext {
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public LtgtExpressionContext ltgtExpression() {
			return getRuleContext(LtgtExpressionContext.class,0);
		}
		public LtgtExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltgtExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterLtgtExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitLtgtExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitLtgtExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtgtExpressionContext ltgtExpression() throws RecognitionException {
		return ltgtExpression(0);
	}

	private LtgtExpressionContext ltgtExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LtgtExpressionContext _localctx = new LtgtExpressionContext(_ctx, _parentState);
		LtgtExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_ltgtExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(289);
			addSubExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new LtgtExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltgtExpression);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(292);
						match(T__16);
						setState(293);
						addSubExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new LtgtExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_ltgtExpression);
						setState(294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(295);
						match(T__17);
						setState(296);
						addSubExpression(0);
						}
						break;
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class AddSubExpressionContext extends ParserRuleContext {
		public MulDivExpressionContext mulDivExpression() {
			return getRuleContext(MulDivExpressionContext.class,0);
		}
		public AddSubExpressionContext addSubExpression() {
			return getRuleContext(AddSubExpressionContext.class,0);
		}
		public AddSubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubExpressionContext addSubExpression() throws RecognitionException {
		return addSubExpression(0);
	}

	private AddSubExpressionContext addSubExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubExpressionContext _localctx = new AddSubExpressionContext(_ctx, _parentState);
		AddSubExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_addSubExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(303);
			mulDivExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(305);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(306);
						match(T__18);
						setState(307);
						mulDivExpression();
						}
						break;
					case 2:
						{
						_localctx = new AddSubExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_addSubExpression);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						match(T__19);
						setState(310);
						mulDivExpression();
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class MulDivExpressionContext extends ParserRuleContext {
		public TildaNegOperatorContext tildaNegOperator() {
			return getRuleContext(TildaNegOperatorContext.class,0);
		}
		public MulDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterMulDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitMulDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitMulDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivExpressionContext mulDivExpression() throws RecognitionException {
		MulDivExpressionContext _localctx = new MulDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mulDivExpression);
		int _la;
		try {
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__20) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(317);
				tildaNegOperator(0);
				}
				break;
			case T__2:
			case Identifier:
			case Int:
			case Bool:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				tildaNegOperator(0);
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

	public static class TildaNegOperatorContext extends ParserRuleContext {
		public ConcatExpressionContext concatExpression() {
			return getRuleContext(ConcatExpressionContext.class,0);
		}
		public TildaNegOperatorContext tildaNegOperator() {
			return getRuleContext(TildaNegOperatorContext.class,0);
		}
		public TildaNegOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tildaNegOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterTildaNegOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitTildaNegOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitTildaNegOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TildaNegOperatorContext tildaNegOperator() throws RecognitionException {
		return tildaNegOperator(0);
	}

	private TildaNegOperatorContext tildaNegOperator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TildaNegOperatorContext _localctx = new TildaNegOperatorContext(_ctx, _parentState);
		TildaNegOperatorContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_tildaNegOperator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(322);
			concatExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TildaNegOperatorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tildaNegOperator);
					setState(324);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(325);
					match(T__21);
					setState(326);
					concatExpression();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class ConcatExpressionContext extends ParserRuleContext {
		public SubscriptExpressionContext subscriptExpression() {
			return getRuleContext(SubscriptExpressionContext.class,0);
		}
		public ConcatExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterConcatExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitConcatExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitConcatExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatExpressionContext concatExpression() throws RecognitionException {
		ConcatExpressionContext _localctx = new ConcatExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_concatExpression);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				subscriptExpression(0);
				setState(333);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				subscriptExpression(0);
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

	public static class SubscriptExpressionContext extends ParserRuleContext {
		public Factor_Context factor_() {
			return getRuleContext(Factor_Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubscriptExpressionContext subscriptExpression() {
			return getRuleContext(SubscriptExpressionContext.class,0);
		}
		public SubscriptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSubscriptExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSubscriptExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptExpressionContext subscriptExpression() throws RecognitionException {
		return subscriptExpression(0);
	}

	private SubscriptExpressionContext subscriptExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubscriptExpressionContext _localctx = new SubscriptExpressionContext(_ctx, _parentState);
		SubscriptExpressionContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_subscriptExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(339);
				factor_();
				setState(340);
				match(T__23);
				setState(341);
				expression(0);
				setState(342);
				match(T__24);
				}
				break;
			case 2:
				{
				setState(344);
				factor_();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubscriptExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subscriptExpression);
					setState(347);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(348);
					match(T__23);
					setState(349);
					expression(0);
					setState(350);
					match(T__24);
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Factor_Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Int() { return getToken(JepetoParser.Int, 0); }
		public TerminalNode Bool() { return getToken(JepetoParser.Bool, 0); }
		public TerminalNode String() { return getToken(JepetoParser.String, 0); }
		public TerminalNode Identifier() { return getToken(JepetoParser.Identifier, 0); }
		public Factor_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFactor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFactor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFactor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_Context factor_() throws RecognitionException {
		Factor_Context _localctx = new Factor_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor_);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				match(T__2);
				setState(358);
				expression(0);
				setState(359);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(Int);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(Bool);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				match(String);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				match(Identifier);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(JepetoParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Print);
			setState(369);
			match(T__2);
			setState(370);
			expression(0);
			setState(371);
			match(T__4);
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
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 17:
			return orExpression_sempred((OrExpressionContext)_localctx, predIndex);
		case 18:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 19:
			return isNotExpression_sempred((IsNotExpressionContext)_localctx, predIndex);
		case 20:
			return ltgtExpression_sempred((LtgtExpressionContext)_localctx, predIndex);
		case 21:
			return addSubExpression_sempred((AddSubExpressionContext)_localctx, predIndex);
		case 23:
			return tildaNegOperator_sempred((TildaNegOperatorContext)_localctx, predIndex);
		case 25:
			return subscriptExpression_sempred((SubscriptExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean orExpression_sempred(OrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean isNotExpression_sempred(IsNotExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean ltgtExpression_sempred(LtgtExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean addSubExpression_sempred(AddSubExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tildaNegOperator_sempred(TildaNegOperatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subscriptExpression_sempred(SubscriptExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0178\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3"+
		"\2\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3O\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\6\6Y\n\6\r\6\16\6Z\3\7\3\7\3\7\3\7\3\7"+
		"\7\7b\n\7\f\7\16\7e\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7p\n\7"+
		"\f\7\16\7s\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0084\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t"+
		"\7\t\u0091\n\t\f\t\16\t\u0094\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00a8\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e0\n\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u00e8\n\20\3\21\3\21\3\21\5\21\u00ed\n\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f7\n\22\f\22\16\22\u00fa\13\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\7\23\u0102\n\23\f\23\16\23\u0105\13\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0110\n\24\f\24\16\24"+
		"\u0113\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u011e\n"+
		"\25\f\25\16\25\u0121\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u012c\n\26\f\26\16\26\u012f\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u013a\n\27\f\27\16\27\u013d\13\27\3\30\3\30\3\30"+
		"\5\30\u0142\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u014a\n\31\f\31\16"+
		"\31\u014d\13\31\3\32\3\32\3\32\3\32\5\32\u0153\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u015c\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u0163\n"+
		"\33\f\33\16\33\u0166\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0171\n\34\3\35\3\35\3\35\3\35\3\35\3\35\2\n\"$&(*,\60\64\36\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\3\4\2\24\24"+
		"\27\27\2\u0187\2=\3\2\2\2\4J\3\2\2\2\6P\3\2\2\2\bS\3\2\2\2\nV\3\2\2\2"+
		"\f|\3\2\2\2\16\u008c\3\2\2\2\20\u0092\3\2\2\2\22\u0095\3\2\2\2\24\u00a7"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00d1\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3"+
		"\2\2\2\36\u00e4\3\2\2\2 \u00ec\3\2\2\2\"\u00f0\3\2\2\2$\u00fb\3\2\2\2"+
		"&\u0106\3\2\2\2(\u0114\3\2\2\2*\u0122\3\2\2\2,\u0130\3\2\2\2.\u0141\3"+
		"\2\2\2\60\u0143\3\2\2\2\62\u0152\3\2\2\2\64\u015b\3\2\2\2\66\u0170\3\2"+
		"\2\28\u0172\3\2\2\2:<\5\16\b\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">@\3\2\2\2?=\3\2\2\2@A\5\4\3\2AE\b\2\1\2BD\5\16\b\2CB\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JK\7\34"+
		"\2\2KN\7\3\2\2LO\5\6\4\2MO\5\b\5\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\5"+
		"\n\6\2QR\7\4\2\2R\7\3\2\2\2ST\58\35\2TU\7\4\2\2U\t\3\2\2\2VX\7\"\2\2W"+
		"Y\5\f\7\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\]\b\7\1"+
		"\2]c\7\5\2\2^_\5\"\22\2_`\7\6\2\2`b\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2"+
		"\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\5\"\22\2gh\7\7\2\2h}\3\2\2\2iq\7"+
		"\5\2\2jk\7\"\2\2kl\7\b\2\2lm\5\"\22\2mn\7\6\2\2np\3\2\2\2oj\3\2\2\2ps"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\"\2\2uv\7\b\2\2v"+
		"w\5\"\22\2wx\3\2\2\2xy\7\7\2\2y}\3\2\2\2z{\7\5\2\2{}\7\7\2\2|\\\3\2\2"+
		"\2|i\3\2\2\2|z\3\2\2\2}\r\3\2\2\2~\177\7\t\2\2\177\u0080\5\22\n\2\u0080"+
		"\u0083\7\3\2\2\u0081\u0084\5\30\r\2\u0082\u0084\5\34\17\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u008d\3\2\2\2\u0085\u0086\7\t\2\2\u0086"+
		"\u0087\5\22\n\2\u0087\u0088\7\3\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5"+
		"\20\t\2\u008a\u008b\7\13\2\2\u008b\u008d\3\2\2\2\u008c~\3\2\2\2\u008c"+
		"\u0085\3\2\2\2\u008d\17\3\2\2\2\u008e\u0091\5\30\r\2\u008f\u0091\5 \21"+
		"\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\21\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\7\"\2\2\u0096\u0097\b\n\1\2\u0097\u0098\5\24\13\2\u0098\23\3\2"+
		"\2\2\u0099\u009f\7\5\2\2\u009a\u009b\5\26\f\2\u009b\u009c\7\6\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\5\26\f\2\u00a3\u00a4\7\7\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a6\7"+
		"\5\2\2\u00a6\u00a8\7\7\2\2\u00a7\u0099\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\25\3\2\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\b\f\1\2\u00ab\27\3\2\2\2\u00ac"+
		"\u00ad\7\35\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\7\3\2\2\u00af\u00b0\7"+
		"\n\2\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7\13\2\2\u00b2\u00b3\5\32\16\2"+
		"\u00b3\u00d2\3\2\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7"+
		"\7\3\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\5\20\t\2\u00b9\u00ba\7\13\2\2"+
		"\u00ba\u00d2\3\2\2\2\u00bb\u00bc\7\35\2\2\u00bc\u00bd\5\"\22\2\u00bd\u00be"+
		"\7\3\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\5\32\16\2\u00c0\u00d2\3\2\2"+
		"\2\u00c1\u00c2\7\35\2\2\u00c2\u00c3\5\"\22\2\u00c3\u00c4\7\3\2\2\u00c4"+
		"\u00c5\5\34\17\2\u00c5\u00d2\3\2\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00c8"+
		"\5\"\22\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\5\32\16"+
		"\2\u00cb\u00d2\3\2\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\5\"\22\2\u00ce"+
		"\u00cf\7\3\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d2\3\2\2\2\u00d1\u00ac\3"+
		"\2\2\2\u00d1\u00b4\3\2\2\2\u00d1\u00bb\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1"+
		"\u00c6\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d4\7\36\2"+
		"\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\5\20\t\2\u00d7"+
		"\u00d8\7\13\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00da\7\36\2\2\u00da\u00db\7"+
		"\3\2\2\u00db\u00e0\5\34\17\2\u00dc\u00dd\7\36\2\2\u00dd\u00de\7\3\2\2"+
		"\u00de\u00e0\5\30\r\2\u00df\u00d3\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc"+
		"\3\2\2\2\u00e0\33\3\2\2\2\u00e1\u00e2\5\36\20\2\u00e2\u00e3\7\4\2\2\u00e3"+
		"\35\3\2\2\2\u00e4\u00e7\7\37\2\2\u00e5\u00e8\5\"\22\2\u00e6\u00e8\7\f"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\37\3\2\2\2\u00e9\u00ed"+
		"\58\35\2\u00ea\u00ed\5\n\6\2\u00eb\u00ed\5\36\20\2\u00ec\u00e9\3\2\2\2"+
		"\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7\4\2\2\u00ef!\3\2\2\2\u00f0\u00f1\b\22\1\2\u00f1\u00f2\5$\23\2\u00f2"+
		"\u00f8\3\2\2\2\u00f3\u00f4\f\4\2\2\u00f4\u00f5\7\r\2\2\u00f5\u00f7\5$"+
		"\23\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9#\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\b\23\1\2"+
		"\u00fc\u00fd\5&\24\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0100"+
		"\7\16\2\2\u0100\u0102\5&\24\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104%\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0106\u0107\b\24\1\2\u0107\u0108\5(\25\2\u0108\u0111\3\2\2\2\u0109"+
		"\u010a\f\5\2\2\u010a\u010b\7\17\2\2\u010b\u0110\5(\25\2\u010c\u010d\f"+
		"\4\2\2\u010d\u010e\7\20\2\2\u010e\u0110\5(\25\2\u010f\u0109\3\2\2\2\u010f"+
		"\u010c\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\'\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\b\25\1\2\u0115\u0116"+
		"\5*\26\2\u0116\u011f\3\2\2\2\u0117\u0118\f\5\2\2\u0118\u0119\7\21\2\2"+
		"\u0119\u011e\5*\26\2\u011a\u011b\f\4\2\2\u011b\u011c\7\22\2\2\u011c\u011e"+
		"\5*\26\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120)\3\2\2\2\u0121\u011f\3\2\2\2"+
		"\u0122\u0123\b\26\1\2\u0123\u0124\5,\27\2\u0124\u012d\3\2\2\2\u0125\u0126"+
		"\f\5\2\2\u0126\u0127\7\23\2\2\u0127\u012c\5,\27\2\u0128\u0129\f\4\2\2"+
		"\u0129\u012a\7\24\2\2\u012a\u012c\5,\27\2\u012b\u0125\3\2\2\2\u012b\u0128"+
		"\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"+\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\b\27\1\2\u0131\u0132\5.\30\2"+
		"\u0132\u013b\3\2\2\2\u0133\u0134\f\5\2\2\u0134\u0135\7\25\2\2\u0135\u013a"+
		"\5.\30\2\u0136\u0137\f\4\2\2\u0137\u0138\7\26\2\2\u0138\u013a\5.\30\2"+
		"\u0139\u0133\3\2\2\2\u0139\u0136\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c-\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\t\2\2\2\u013f\u0142\5\60\31\2\u0140\u0142\5\60\31\2\u0141\u013e"+
		"\3\2\2\2\u0141\u0140\3\2\2\2\u0142/\3\2\2\2\u0143\u0144\b\31\1\2\u0144"+
		"\u0145\5\62\32\2\u0145\u014b\3\2\2\2\u0146\u0147\f\4\2\2\u0147\u0148\7"+
		"\30\2\2\u0148\u014a\5\62\32\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\61\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014e\u014f\5\64\33\2\u014f\u0150\7\31\2\2\u0150\u0153\3\2\2"+
		"\2\u0151\u0153\5\64\33\2\u0152\u014e\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\63\3\2\2\2\u0154\u0155\b\33\1\2\u0155\u0156\5\66\34\2\u0156\u0157\7\32"+
		"\2\2\u0157\u0158\5\"\22\2\u0158\u0159\7\33\2\2\u0159\u015c\3\2\2\2\u015a"+
		"\u015c\5\66\34\2\u015b\u0154\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u0164\3"+
		"\2\2\2\u015d\u015e\f\5\2\2\u015e\u015f\7\32\2\2\u015f\u0160\5\"\22\2\u0160"+
		"\u0161\7\33\2\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0163\u0166\3"+
		"\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\65\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\u0168\7\5\2\2\u0168\u0169\5\"\22\2\u0169\u016a\7"+
		"\7\2\2\u016a\u0171\3\2\2\2\u016b\u0171\5\n\6\2\u016c\u0171\7#\2\2\u016d"+
		"\u0171\7$\2\2\u016e\u0171\7%\2\2\u016f\u0171\7\"\2\2\u0170\u0167\3\2\2"+
		"\2\u0170\u016b\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u016f\3\2\2\2\u0171\67\3\2\2\2\u0172\u0173\7!\2\2\u0173"+
		"\u0174\7\5\2\2\u0174\u0175\5\"\22\2\u0175\u0176\7\7\2\2\u01769\3\2\2\2"+
		"#=ENZcq|\u0083\u008c\u0090\u0092\u009f\u00a7\u00d1\u00df\u00e7\u00ec\u00f8"+
		"\u0103\u010f\u0111\u011d\u011f\u012b\u012d\u0139\u013b\u0141\u014b\u0152"+
		"\u015b\u0164\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}