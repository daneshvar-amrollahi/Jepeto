// Generated from /home/mahyar/CAs/Jepeto/Phase2/src/main/grammar/Jepeto.g4 by ANTLR 4.9.1
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.ast.nodes.expression.values.*;
    import main.ast.nodes.expression.values.primitive.*;
    import main.ast.nodes.statement.*;
    import java.util.*;

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
		FUNC=1, MAIN=2, SIZE=3, PRINT=4, RETURN=5, VOID=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, NOT_EQUAL=14, GREATER_THAN=15, 
		LESS_THAN=16, AND=17, OR=18, NOT=19, APPEND=20, TRUE=21, FALSE=22, ARROW=23, 
		ASSIGN=24, LPAR=25, RPAR=26, LBRACK=27, RBRACK=28, LBRACE=29, RBRACE=30, 
		COMMA=31, DOT=32, COLON=33, SEMICOLLON=34, INT_VALUE=35, IDENTIFIER=36, 
		STRING_VALUE=37, COMMENT=38, WS=39;
	public static final int
		RULE_jepeto = 0, RULE_program = 1, RULE_functionDeclaration = 2, RULE_functionArgumentsDeclaration = 3, 
		RULE_body = 4, RULE_main = 5, RULE_functionCall = 6, RULE_functionArguments = 7, 
		RULE_splitedExpressionsWithComma = 8, RULE_splitedExpressionsWithCommaAndKey = 9, 
		RULE_functionCallStatement = 10, RULE_returnStatement = 11, RULE_ifStatement = 12, 
		RULE_ifStatementWithReturn = 13, RULE_printStatement = 14, RULE_statement = 15, 
		RULE_singleStatement = 16, RULE_block = 17, RULE_conditionBody = 18, RULE_expression = 19, 
		RULE_andExpression = 20, RULE_equalityExpression = 21, RULE_relationalExpression = 22, 
		RULE_additiveExpression = 23, RULE_multiplicativeExpression = 24, RULE_preUnaryExpression = 25, 
		RULE_appendExpression = 26, RULE_accessExpression = 27, RULE_otherExpression = 28, 
		RULE_anonymousFunction = 29, RULE_sizeExpression = 30, RULE_values = 31, 
		RULE_listValue = 32, RULE_boolValue = 33, RULE_voidValue = 34, RULE_identifier = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"jepeto", "program", "functionDeclaration", "functionArgumentsDeclaration", 
			"body", "main", "functionCall", "functionArguments", "splitedExpressionsWithComma", 
			"splitedExpressionsWithCommaAndKey", "functionCallStatement", "returnStatement", 
			"ifStatement", "ifStatementWithReturn", "printStatement", "statement", 
			"singleStatement", "block", "conditionBody", "expression", "andExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"preUnaryExpression", "appendExpression", "accessExpression", "otherExpression", 
			"anonymousFunction", "sizeExpression", "values", "listValue", "boolValue", 
			"voidValue", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'main'", "'size'", "'print'", "'return'", "'void'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'is'", "'not'", "'>'", 
			"'<'", "'and'", "'or'", "'~'", "'::'", "'true'", "'false'", "'->'", "'='", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNC", "MAIN", "SIZE", "PRINT", "RETURN", "VOID", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "NOT_EQUAL", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "APPEND", "TRUE", "FALSE", "ARROW", 
			"ASSIGN", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", 
			"DOT", "COLON", "SEMICOLLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", 
			"COMMENT", "WS"
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

	public static class JepetoContext extends ParserRuleContext {
		public Program jepetoProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(JepetoParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public JepetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jepeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterJepeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitJepeto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitJepeto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JepetoContext jepeto() throws RecognitionException {
		JepetoContext _localctx = new JepetoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jepeto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((JepetoContext)_localctx).p = program();

			            ((JepetoContext)_localctx).jepetoProgram =  ((JepetoContext)_localctx).p.programRet;
			            _localctx.jepetoProgram.setLine(1);
			        
			setState(74);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public FunctionDeclarationContext fd;
		public MainContext m;
		public FunctionDeclarationContext fd2;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
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
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            ((ProgramContext)_localctx).programRet =  new Program();
			            _localctx.programRet.setLine(1);
			            //System.out.println("New Program");
			        
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(77);
				((ProgramContext)_localctx).fd = functionDeclaration();

				                _localctx.programRet.addFunction(((ProgramContext)_localctx).fd.funcDecRet);
				            
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			((ProgramContext)_localctx).m = main();

			            _localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet);
			            //System.out.println("programRet.setMain() called");
			        
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(87);
				((ProgramContext)_localctx).fd2 = functionDeclaration();

				                _localctx.programRet.addFunction(((ProgramContext)_localctx).fd2.funcDecRet);
				                //System.out.println("programRet.addFunction() called");
				            
				}
				}
				setState(94);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public Token FUNC;
		public IdentifierContext id;
		public FunctionArgumentsDeclarationContext fad;
		public BodyContext b;
		public TerminalNode FUNC() { return getToken(JepetoParser.FUNC, 0); }
		public TerminalNode COLON() { return getToken(JepetoParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgumentsDeclarationContext functionArgumentsDeclaration() {
			return getRuleContext(FunctionArgumentsDeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(96);
			((FunctionDeclarationContext)_localctx).FUNC = match(FUNC);
			_localctx.funcDecRet.setLine(((FunctionDeclarationContext)_localctx).FUNC.getLine());
			setState(98);
			((FunctionDeclarationContext)_localctx).id = identifier();
			 _localctx.funcDecRet.setFunctionName(((FunctionDeclarationContext)_localctx).id.IdRet); 
			setState(100);
			((FunctionDeclarationContext)_localctx).fad = functionArgumentsDeclaration();
			 _localctx.funcDecRet.setArgs(((FunctionDeclarationContext)_localctx).fad.IdArrRet); 
			setState(102);
			match(COLON);
			setState(103);
			((FunctionDeclarationContext)_localctx).b = body();
			 _localctx.funcDecRet.setBody(((FunctionDeclarationContext)_localctx).b.bodyRet); 
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

	public static class FunctionArgumentsDeclarationContext extends ParserRuleContext {
		public ArrayList<Identifier> IdArrRet;
		public int line;
		public Token LPAR;
		public IdentifierContext id;
		public IdentifierContext id2;
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public FunctionArgumentsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgumentsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionArgumentsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionArgumentsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionArgumentsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsDeclarationContext functionArgumentsDeclaration() throws RecognitionException {
		FunctionArgumentsDeclarationContext _localctx = new FunctionArgumentsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionArgumentsDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionArgumentsDeclarationContext)_localctx).IdArrRet =  new ArrayList<Identifier>(); 
			setState(107);
			((FunctionArgumentsDeclarationContext)_localctx).LPAR = match(LPAR);
			((FunctionArgumentsDeclarationContext)_localctx).line =  ((FunctionArgumentsDeclarationContext)_localctx).LPAR.getLine();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(109);
				((FunctionArgumentsDeclarationContext)_localctx).id = identifier();
				 _localctx.IdArrRet.add(((FunctionArgumentsDeclarationContext)_localctx).id.IdRet); 
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(111);
					match(COMMA);
					setState(112);
					((FunctionArgumentsDeclarationContext)_localctx).id2 = identifier();
					 _localctx.IdArrRet.add(((FunctionArgumentsDeclarationContext)_localctx).id2.IdRet); 
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(122);
			match(RPAR);
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
		public Statement bodyRet;
		public SingleStatementContext ss;
		public BlockContext b;
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 8, RULE_body);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((BodyContext)_localctx).ss = singleStatement();
				 ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).ss.singleStmtRet; 
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((BodyContext)_localctx).b = block();
				 ((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).b.blockRet; 
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

	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public Token MAIN;
		public FunctionCallStatementContext fcs;
		public PrintStatementContext ps;
		public TerminalNode MAIN() { return getToken(JepetoParser.MAIN, 0); }
		public TerminalNode COLON() { return getToken(JepetoParser.COLON, 0); }
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
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
		enterRule(_localctx, 10, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MainContext)_localctx).mainRet =  new MainDeclaration(); 
			setState(133);
			((MainContext)_localctx).MAIN = match(MAIN);
			setState(134);
			match(COLON);
			_localctx.mainRet.setLine(((MainContext)_localctx).MAIN.getLine());
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(136);
				((MainContext)_localctx).fcs = functionCallStatement();

				                _localctx.mainRet.setBody(((MainContext)_localctx).fcs.funcCallStmtRet);
				                //System.out.println("MAIN: body set to " + ((MainContext)_localctx).fcs.funcCallStmtRet.toString());
				            
				}
				break;
			case PRINT:
				{
				setState(139);
				((MainContext)_localctx).ps = printStatement();

				                    _localctx.mainRet.setBody(((MainContext)_localctx).ps.prstmtRet);
				                    //System.out.println("MAIN: body set to " + ((MainContext)_localctx).ps.prstmtRet.toString());
				                
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall funcCallRet;
		public int line;
		public IdentifierContext id;
		public Token LPAR;
		public FunctionArgumentsContext fa;
		public FunctionArgumentsContext fa2;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(JepetoParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(JepetoParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(JepetoParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(JepetoParser.RPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
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
		enterRule(_localctx, 12, RULE_functionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 int callCount = 0;
			        System.out.println("callCount: " + callCount);
			        
			setState(145);
			((FunctionCallContext)_localctx).id = identifier();
			Identifier inst = ((FunctionCallContext)_localctx).id.IdRet;
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					((FunctionCallContext)_localctx).LPAR = match(LPAR);
					((FunctionCallContext)_localctx).line =  ((FunctionCallContext)_localctx).LPAR.getLine();
					setState(149);
					((FunctionCallContext)_localctx).fa = functionArguments();
					setState(150);
					match(RPAR);

					                System.out.println("callCount: " + callCount);
					                if (callCount == 0)
					                    ((FunctionCallContext)_localctx).funcCallRet =  new FunctionCall(inst, ((FunctionCallContext)_localctx).fa.sewcRet, ((FunctionCallContext)_localctx).fa.sewcakRet);
					                else if (callCount > 0)
					                    ((FunctionCallContext)_localctx).funcCallRet =  new FunctionCall(_localctx.funcCallRet.getInstance(), ((FunctionCallContext)_localctx).fa.sewcRet, ((FunctionCallContext)_localctx).fa.sewcakRet);
					                _localctx.funcCallRet.setLine(_localctx.line);
					                callCount += 1;
					            
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			{
			setState(158);
			((FunctionCallContext)_localctx).LPAR = match(LPAR);
			((FunctionCallContext)_localctx).line =  ((FunctionCallContext)_localctx).LPAR.getLine(); 
			setState(160);
			((FunctionCallContext)_localctx).fa2 = functionArguments();
			setState(161);
			match(RPAR);

			            System.out.println("callCount: " + callCount);
			            if (callCount == 0)
			                ((FunctionCallContext)_localctx).funcCallRet =  new FunctionCall(inst, ((FunctionCallContext)_localctx).fa2.sewcRet, ((FunctionCallContext)_localctx).fa2.sewcakRet);
			            else if (callCount > 0)
			                ((FunctionCallContext)_localctx).funcCallRet =  new FunctionCall(_localctx.funcCallRet.getInstance(), ((FunctionCallContext)_localctx).fa2.sewcRet, ((FunctionCallContext)_localctx).fa2.sewcakRet);
			            _localctx.funcCallRet.setLine(_localctx.line);
			            callCount += 1;
			        
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public ArrayList<Expression> sewcRet;
		public Map<Identifier, Expression> sewcakRet;
		public SplitedExpressionsWithCommaContext sewc;
		public SplitedExpressionsWithCommaAndKeyContext sewcak;
		public SplitedExpressionsWithCommaContext splitedExpressionsWithComma() {
			return getRuleContext(SplitedExpressionsWithCommaContext.class,0);
		}
		public SplitedExpressionsWithCommaAndKeyContext splitedExpressionsWithCommaAndKey() {
			return getRuleContext(SplitedExpressionsWithCommaAndKeyContext.class,0);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionArguments);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				((FunctionArgumentsContext)_localctx).sewc = splitedExpressionsWithComma();
				((FunctionArgumentsContext)_localctx).sewcRet =  ((FunctionArgumentsContext)_localctx).sewc.sewcRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				((FunctionArgumentsContext)_localctx).sewcak = splitedExpressionsWithCommaAndKey();
				((FunctionArgumentsContext)_localctx).sewcakRet =  ((FunctionArgumentsContext)_localctx).sewcak.sewcakRet;
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

	public static class SplitedExpressionsWithCommaContext extends ParserRuleContext {
		public ArrayList<Expression> sewcRet;
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public SplitedExpressionsWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitedExpressionsWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSplitedExpressionsWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSplitedExpressionsWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSplitedExpressionsWithComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplitedExpressionsWithCommaContext splitedExpressionsWithComma() throws RecognitionException {
		SplitedExpressionsWithCommaContext _localctx = new SplitedExpressionsWithCommaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_splitedExpressionsWithComma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SplitedExpressionsWithCommaContext)_localctx).sewcRet =  new ArrayList<Expression>();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << LBRACK) | (1L << INT_VALUE) | (1L << IDENTIFIER) | (1L << STRING_VALUE))) != 0)) {
				{
				setState(173);
				((SplitedExpressionsWithCommaContext)_localctx).exp1 = expression();
				_localctx.sewcRet.add(((SplitedExpressionsWithCommaContext)_localctx).exp1.expRet);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(175);
					match(COMMA);
					setState(176);
					((SplitedExpressionsWithCommaContext)_localctx).exp2 = expression();
					_localctx.sewcRet.add(((SplitedExpressionsWithCommaContext)_localctx).exp2.expRet);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SplitedExpressionsWithCommaAndKeyContext extends ParserRuleContext {
		public Map<Identifier, Expression> sewcakRet;
		public IdentifierContext id1;
		public ExpressionContext e1;
		public IdentifierContext id2;
		public ExpressionContext e2;
		public List<TerminalNode> ASSIGN() { return getTokens(JepetoParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(JepetoParser.ASSIGN, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JepetoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JepetoParser.COMMA, i);
		}
		public SplitedExpressionsWithCommaAndKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splitedExpressionsWithCommaAndKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSplitedExpressionsWithCommaAndKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSplitedExpressionsWithCommaAndKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSplitedExpressionsWithCommaAndKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SplitedExpressionsWithCommaAndKeyContext splitedExpressionsWithCommaAndKey() throws RecognitionException {
		SplitedExpressionsWithCommaAndKeyContext _localctx = new SplitedExpressionsWithCommaAndKeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_splitedExpressionsWithCommaAndKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SplitedExpressionsWithCommaAndKeyContext)_localctx).sewcakRet =  new LinkedHashMap<Identifier, Expression>();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(187);
				((SplitedExpressionsWithCommaAndKeyContext)_localctx).id1 = identifier();
				setState(188);
				match(ASSIGN);
				setState(189);
				((SplitedExpressionsWithCommaAndKeyContext)_localctx).e1 = expression();
				_localctx.sewcakRet.put(((SplitedExpressionsWithCommaAndKeyContext)_localctx).id1.IdRet, ((SplitedExpressionsWithCommaAndKeyContext)_localctx).e1.expRet);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(192);
					((SplitedExpressionsWithCommaAndKeyContext)_localctx).id2 = identifier();
					setState(193);
					match(ASSIGN);
					setState(194);
					((SplitedExpressionsWithCommaAndKeyContext)_localctx).e2 = expression();
					_localctx.sewcakRet.put(((SplitedExpressionsWithCommaAndKeyContext)_localctx).id2.IdRet, ((SplitedExpressionsWithCommaAndKeyContext)_localctx).e2.expRet);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallStmt funcCallStmtRet;
		public FunctionCallContext fc;
		public TerminalNode SEMICOLLON() { return getToken(JepetoParser.SEMICOLLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((FunctionCallStatementContext)_localctx).fc = functionCall();
			((FunctionCallStatementContext)_localctx).funcCallStmtRet =  new FunctionCallStmt(((FunctionCallStatementContext)_localctx).fc.funcCallRet); _localctx.funcCallStmtRet.setLine(((FunctionCallStatementContext)_localctx).fc.line); 
			setState(206);
			match(SEMICOLLON);
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
		public ReturnStmt returnRet;
		public Token RETURN;
		public ExpressionContext e;
		public VoidValueContext vv;
		public TerminalNode RETURN() { return getToken(JepetoParser.RETURN, 0); }
		public TerminalNode SEMICOLLON() { return getToken(JepetoParser.SEMICOLLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VoidValueContext voidValue() {
			return getRuleContext(VoidValueContext.class,0);
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
		enterRule(_localctx, 22, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ReturnStatementContext)_localctx).returnRet =  new ReturnStmt(); 
			setState(209);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case TRUE:
			case FALSE:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				{
				setState(210);
				((ReturnStatementContext)_localctx).e = expression();
				_localctx.returnRet.setReturnedExpr(((ReturnStatementContext)_localctx).e.expRet);
				}
				break;
			case VOID:
				{
				setState(213);
				((ReturnStatementContext)_localctx).vv = voidValue();
				_localctx.returnRet.setReturnedExpr(((ReturnStatementContext)_localctx).vv.voidRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.returnRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			setState(219);
			match(SEMICOLLON);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionalStmt ifStmtRet;
		public Token IF;
		public ExpressionContext e;
		public ConditionBodyContext cb;
		public ConditionBodyContext ecb;
		public TerminalNode IF() { return getToken(JepetoParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(JepetoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JepetoParser.COLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ConditionBodyContext> conditionBody() {
			return getRuleContexts(ConditionBodyContext.class);
		}
		public ConditionBodyContext conditionBody(int i) {
			return getRuleContext(ConditionBodyContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JepetoParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(222);
			((IfStatementContext)_localctx).e = expression();
			setState(223);
			match(COLON);
			setState(224);
			((IfStatementContext)_localctx).cb = conditionBody();
			((IfStatementContext)_localctx).ifStmtRet =  new ConditionalStmt(((IfStatementContext)_localctx).e.expRet, ((IfStatementContext)_localctx).cb.condBodyRet); _localctx.ifStmtRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(226);
				match(ELSE);
				setState(227);
				match(COLON);
				setState(228);
				((IfStatementContext)_localctx).ecb = conditionBody();
				_localctx.ifStmtRet.setElseBody(((IfStatementContext)_localctx).ecb.condBodyRet);
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

	public static class IfStatementWithReturnContext extends ParserRuleContext {
		public ConditionalStmt ifStmtWRetRet;
		public Token IF;
		public ExpressionContext e;
		public BodyContext thenb;
		public BodyContext elseb;
		public TerminalNode IF() { return getToken(JepetoParser.IF, 0); }
		public List<TerminalNode> COLON() { return getTokens(JepetoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(JepetoParser.COLON, i);
		}
		public TerminalNode ELSE() { return getToken(JepetoParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public IfStatementWithReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementWithReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIfStatementWithReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIfStatementWithReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIfStatementWithReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementWithReturnContext ifStatementWithReturn() throws RecognitionException {
		IfStatementWithReturnContext _localctx = new IfStatementWithReturnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatementWithReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((IfStatementWithReturnContext)_localctx).IF = match(IF);
			setState(234);
			((IfStatementWithReturnContext)_localctx).e = expression();
			setState(235);
			match(COLON);
			setState(236);
			((IfStatementWithReturnContext)_localctx).thenb = body();
			((IfStatementWithReturnContext)_localctx).ifStmtWRetRet =  new ConditionalStmt(((IfStatementWithReturnContext)_localctx).e.expRet, ((IfStatementWithReturnContext)_localctx).thenb.bodyRet); _localctx.ifStmtWRetRet.setLine(((IfStatementWithReturnContext)_localctx).IF.getLine());
			setState(238);
			match(ELSE);
			setState(239);
			match(COLON);
			setState(240);
			((IfStatementWithReturnContext)_localctx).elseb = body();
			_localctx.ifStmtWRetRet.setElseBody(((IfStatementWithReturnContext)_localctx).elseb.bodyRet);
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt prstmtRet;
		public Token PRINT;
		public ExpressionContext e;
		public TerminalNode PRINT() { return getToken(JepetoParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public TerminalNode SEMICOLLON() { return getToken(JepetoParser.SEMICOLLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((PrintStatementContext)_localctx).PRINT = match(PRINT);
			setState(244);
			match(LPAR);
			setState(245);
			((PrintStatementContext)_localctx).e = expression();

			            ((PrintStatementContext)_localctx).prstmtRet =  new PrintStmt(((PrintStatementContext)_localctx).e.expRet);
			            _localctx.prstmtRet.setLine(((PrintStatementContext)_localctx).PRINT.getLine());
			        
			setState(247);
			match(RPAR);
			setState(248);
			match(SEMICOLLON);
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
		public Statement stmtRet;
		public IfStatementContext ifst;
		public PrintStatementContext pst;
		public FunctionCallStatementContext fcs;
		public ReturnStatementContext rs;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((StatementContext)_localctx).ifst = ifStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).ifst.ifStmtRet;
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((StatementContext)_localctx).pst = printStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).pst.prstmtRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				((StatementContext)_localctx).fcs = functionCallStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).fcs.funcCallStmtRet;
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				((StatementContext)_localctx).rs = returnStatement();
				((StatementContext)_localctx).stmtRet =  ((StatementContext)_localctx).rs.returnRet;
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

	public static class SingleStatementContext extends ParserRuleContext {
		public Statement singleStmtRet;
		public ReturnStatementContext rs;
		public IfStatementWithReturnContext iswr;
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementWithReturnContext ifStatementWithReturn() {
			return getRuleContext(IfStatementWithReturnContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_singleStatement);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				((SingleStatementContext)_localctx).rs = returnStatement();
				 ((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).rs.returnRet; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((SingleStatementContext)_localctx).iswr = ifStatementWithReturn();
				 ((SingleStatementContext)_localctx).singleStmtRet =  ((SingleStatementContext)_localctx).iswr.ifStmtWRetRet; 
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

	public static class BlockContext extends ParserRuleContext {
		public BlockStmt blockRet;
		public Token LBRACE;
		public StatementContext st;
		public ReturnStatementContext rs;
		public IfStatementWithReturnContext iswr;
		public StatementContext st2;
		public TerminalNode LBRACE() { return getToken(JepetoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JepetoParser.RBRACE, 0); }
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementWithReturnContext ifStatementWithReturn() {
			return getRuleContext(IfStatementWithReturnContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((BlockContext)_localctx).blockRet =  new BlockStmt(); 
			setState(273);
			((BlockContext)_localctx).LBRACE = match(LBRACE);
			{
			_localctx.blockRet.setLine(((BlockContext)_localctx).LBRACE.getLine());
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					((BlockContext)_localctx).st = statement();
					_localctx.blockRet.addStatement(((BlockContext)_localctx).st.stmtRet); 
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				{
				setState(283);
				((BlockContext)_localctx).rs = returnStatement();
				_localctx.blockRet.addStatement(((BlockContext)_localctx).rs.returnRet);
				}
				break;
			case IF:
				{
				setState(286);
				((BlockContext)_localctx).iswr = ifStatementWithReturn();
				_localctx.blockRet.addStatement(((BlockContext)_localctx).iswr.ifStmtWRetRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(291);
				((BlockContext)_localctx).st2 = statement();
				_localctx.blockRet.addStatement(((BlockContext)_localctx).st2.stmtRet); 
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(299);
			match(RBRACE);
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

	public static class ConditionBodyContext extends ParserRuleContext {
		public Statement condBodyRet;
		public BlockStmt tempBlock;
		public StatementContext st1;
		public StatementContext st2;
		public TerminalNode LBRACE() { return getToken(JepetoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JepetoParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterConditionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitConditionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitConditionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionBodyContext conditionBody() throws RecognitionException {
		ConditionBodyContext _localctx = new ConditionBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditionBody);
		int _la;
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(LBRACE);
				((ConditionBodyContext)_localctx).tempBlock =  new BlockStmt();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << RETURN) | (1L << IF) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(303);
					((ConditionBodyContext)_localctx).st1 = statement();
					_localctx.tempBlock.addStatement(((ConditionBodyContext)_localctx).st1.stmtRet);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(RBRACE);
				((ConditionBodyContext)_localctx).condBodyRet =  _localctx.tempBlock;
				}
				break;
			case PRINT:
			case RETURN:
			case IF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				((ConditionBodyContext)_localctx).st2 = statement();
				((ConditionBodyContext)_localctx).condBodyRet =  ((ConditionBodyContext)_localctx).st2.stmtRet;
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
		public Expression expRet;
		public AndExpressionContext fo;
		public Token OR;
		public AndExpressionContext so;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JepetoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JepetoParser.OR, i);
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
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((ExpressionContext)_localctx).fo = andExpression();
			((ExpressionContext)_localctx).expRet =  ((ExpressionContext)_localctx).fo.andExpRet; _localctx.expRet.setLine(((ExpressionContext)_localctx).fo.andExpRet.getLine());
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(320);
				((ExpressionContext)_localctx).OR = match(OR);
				setState(321);
				((ExpressionContext)_localctx).so = andExpression();

				                ((ExpressionContext)_localctx).expRet =  new BinaryExpression(_localctx.expRet, ((ExpressionContext)_localctx).so.andExpRet, BinaryOperator.or);
				                _localctx.expRet.setLine(((ExpressionContext)_localctx).OR.getLine());
				            
				}
				}
				setState(328);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Expression andExpRet;
		public EqualityExpressionContext fo;
		public Token AND;
		public EqualityExpressionContext so;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JepetoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JepetoParser.AND, i);
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
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((AndExpressionContext)_localctx).fo = equalityExpression();
			((AndExpressionContext)_localctx).andExpRet =  ((AndExpressionContext)_localctx).fo.eqExpRet; _localctx.andExpRet.setLine(((AndExpressionContext)_localctx).fo.eqExpRet.getLine());
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(331);
				((AndExpressionContext)_localctx).AND = match(AND);
				setState(332);
				((AndExpressionContext)_localctx).so = equalityExpression();

				                ((AndExpressionContext)_localctx).andExpRet =  new BinaryExpression(_localctx.andExpRet, ((AndExpressionContext)_localctx).so.eqExpRet, BinaryOperator.and);
				                _localctx.andExpRet.setLine(((AndExpressionContext)_localctx).AND.getLine());
				            
				}
				}
				setState(339);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Expression eqExpRet;
		public RelationalExpressionContext fo;
		public Token EQUAL;
		public Token NOT_EQUAL;
		public RelationalExpressionContext so;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(JepetoParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(JepetoParser.EQUAL, i);
		}
		public List<TerminalNode> NOT_EQUAL() { return getTokens(JepetoParser.NOT_EQUAL); }
		public TerminalNode NOT_EQUAL(int i) {
			return getToken(JepetoParser.NOT_EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			((EqualityExpressionContext)_localctx).fo = relationalExpression();
			((EqualityExpressionContext)_localctx).eqExpRet =  ((EqualityExpressionContext)_localctx).fo.relExpRet; BinaryOperator eqop;
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOT_EQUAL) {
				{
				{
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUAL:
					{
					setState(342);
					((EqualityExpressionContext)_localctx).EQUAL = match(EQUAL);
					eqop = BinaryOperator.eq; 
					}
					break;
				case NOT_EQUAL:
					{
					setState(344);
					((EqualityExpressionContext)_localctx).NOT_EQUAL = match(NOT_EQUAL);
					eqop = BinaryOperator.neq; _localctx.eqExpRet.setLine(((EqualityExpressionContext)_localctx).NOT_EQUAL.getLine());
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348);
				((EqualityExpressionContext)_localctx).so = relationalExpression();

				                    ((EqualityExpressionContext)_localctx).eqExpRet =  new BinaryExpression(_localctx.eqExpRet, ((EqualityExpressionContext)_localctx).so.relExpRet, eqop);
				                    if (eqop == BinaryOperator.eq)
				                        _localctx.eqExpRet.setLine(((EqualityExpressionContext)_localctx).EQUAL.getLine());
				                    else
				                        _localctx.eqExpRet.setLine(((EqualityExpressionContext)_localctx).NOT_EQUAL.getLine());
				                
				}
				}
				setState(355);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Expression relExpRet;
		public AdditiveExpressionContext fo;
		public Token GREATER_THAN;
		public Token LESS_THAN;
		public AdditiveExpressionContext so;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(JepetoParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(JepetoParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(JepetoParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(JepetoParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			((RelationalExpressionContext)_localctx).fo = additiveExpression();
			((RelationalExpressionContext)_localctx).relExpRet =  ((RelationalExpressionContext)_localctx).fo.addExpRet; BinaryOperator addop;
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(358);
					((RelationalExpressionContext)_localctx).GREATER_THAN = match(GREATER_THAN);
					addop = BinaryOperator.gt;
					}
					break;
				case LESS_THAN:
					{
					setState(360);
					((RelationalExpressionContext)_localctx).LESS_THAN = match(LESS_THAN);
					addop = BinaryOperator.lt;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(364);
				((RelationalExpressionContext)_localctx).so = additiveExpression();

				                ((RelationalExpressionContext)_localctx).relExpRet =  new BinaryExpression(_localctx.relExpRet, ((RelationalExpressionContext)_localctx).so.addExpRet, addop);
				                if (addop == BinaryOperator.gt)
				                    _localctx.relExpRet.setLine(((RelationalExpressionContext)_localctx).GREATER_THAN.getLine());
				                else
				                    _localctx.relExpRet.setLine(((RelationalExpressionContext)_localctx).LESS_THAN.getLine());
				            
				}
				}
				setState(371);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Expression addExpRet;
		public MultiplicativeExpressionContext fo;
		public Token PLUS;
		public Token MINUS;
		public MultiplicativeExpressionContext so;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(JepetoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(JepetoParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(JepetoParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(JepetoParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			((AdditiveExpressionContext)_localctx).fo = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).addExpRet =  ((AdditiveExpressionContext)_localctx).fo.mulExpRet; BinaryOperator mulop;
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(378);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(374);
					((AdditiveExpressionContext)_localctx).PLUS = match(PLUS);
					mulop = BinaryOperator.add;
					}
					break;
				case MINUS:
					{
					setState(376);
					((AdditiveExpressionContext)_localctx).MINUS = match(MINUS);
					mulop = BinaryOperator.sub;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(380);
				((AdditiveExpressionContext)_localctx).so = multiplicativeExpression();

				                    ((AdditiveExpressionContext)_localctx).addExpRet =  new BinaryExpression(_localctx.addExpRet, ((AdditiveExpressionContext)_localctx).so.mulExpRet, mulop);
				                    if (mulop == BinaryOperator.add)
				                        _localctx.addExpRet.setLine(((AdditiveExpressionContext)_localctx).PLUS.getLine());
				                    else
				                        _localctx.addExpRet.setLine(((AdditiveExpressionContext)_localctx).MINUS.getLine());
				                 
				}
				}
				setState(387);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Expression mulExpRet;
		public PreUnaryExpressionContext fo;
		public Token MULT;
		public Token DIVIDE;
		public PreUnaryExpressionContext so;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(JepetoParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(JepetoParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(JepetoParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(JepetoParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((MultiplicativeExpressionContext)_localctx).fo = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).mulExpRet =  ((MultiplicativeExpressionContext)_localctx).fo.puExpRet; BinaryOperator puop;
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(390);
					((MultiplicativeExpressionContext)_localctx).MULT = match(MULT);
					puop = BinaryOperator.mult;
					}
					break;
				case DIVIDE:
					{
					setState(392);
					((MultiplicativeExpressionContext)_localctx).DIVIDE = match(DIVIDE);
					puop = BinaryOperator.div;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(396);
				((MultiplicativeExpressionContext)_localctx).so = preUnaryExpression();

				                    ((MultiplicativeExpressionContext)_localctx).mulExpRet =  new BinaryExpression(_localctx.mulExpRet, ((MultiplicativeExpressionContext)_localctx).so.puExpRet, puop);
				                    if (puop == BinaryOperator.mult)
				                        _localctx.mulExpRet.setLine(((MultiplicativeExpressionContext)_localctx).MULT.getLine());
				                     else
				                        _localctx.mulExpRet.setLine(((MultiplicativeExpressionContext)_localctx).DIVIDE.getLine());
				                
				}
				}
				setState(403);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Expression puExpRet;
		public Token NOT;
		public Token MINUS;
		public PreUnaryExpressionContext ue;
		public AppendExpressionContext ape;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JepetoParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(JepetoParser.MINUS, 0); }
		public AppendExpressionContext appendExpression() {
			return getRuleContext(AppendExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_preUnaryExpression);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				UnaryOperator uop;
				{
				setState(409);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(405);
					((PreUnaryExpressionContext)_localctx).NOT = match(NOT);
					uop = UnaryOperator.not;
					}
					break;
				case MINUS:
					{
					setState(407);
					((PreUnaryExpressionContext)_localctx).MINUS = match(MINUS);
					uop = UnaryOperator.minus;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(411);
				((PreUnaryExpressionContext)_localctx).ue = preUnaryExpression();

				                    ((PreUnaryExpressionContext)_localctx).puExpRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).ue.puExpRet, uop);
				                    if (uop == UnaryOperator.not)
				                        _localctx.puExpRet.setLine(((PreUnaryExpressionContext)_localctx).NOT.getLine());
				                    else
				                        _localctx.puExpRet.setLine(((PreUnaryExpressionContext)_localctx).MINUS.getLine());
				                
				}
				}
				break;
			case TRUE:
			case FALSE:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				((PreUnaryExpressionContext)_localctx).ape = appendExpression();
				((PreUnaryExpressionContext)_localctx).puExpRet =  ((PreUnaryExpressionContext)_localctx).ape.apExpRet;
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

	public static class AppendExpressionContext extends ParserRuleContext {
		public Expression apExpRet;
		public AccessExpressionContext fo;
		public Token APPEND;
		public AccessExpressionContext so;
		public List<AccessExpressionContext> accessExpression() {
			return getRuleContexts(AccessExpressionContext.class);
		}
		public AccessExpressionContext accessExpression(int i) {
			return getRuleContext(AccessExpressionContext.class,i);
		}
		public List<TerminalNode> APPEND() { return getTokens(JepetoParser.APPEND); }
		public TerminalNode APPEND(int i) {
			return getToken(JepetoParser.APPEND, i);
		}
		public AppendExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAppendExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAppendExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAppendExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendExpressionContext appendExpression() throws RecognitionException {
		AppendExpressionContext _localctx = new AppendExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_appendExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((AppendExpressionContext)_localctx).fo = accessExpression();
			((AppendExpressionContext)_localctx).apExpRet =  ((AppendExpressionContext)_localctx).fo.acsExpRet;
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==APPEND) {
				{
				{
				setState(421);
				((AppendExpressionContext)_localctx).APPEND = match(APPEND);
				setState(422);
				((AppendExpressionContext)_localctx).so = accessExpression();

				                ((AppendExpressionContext)_localctx).apExpRet =  new BinaryExpression(_localctx.apExpRet, ((AppendExpressionContext)_localctx).so.acsExpRet, BinaryOperator.append);
				                _localctx.apExpRet.setLine(((AppendExpressionContext)_localctx).APPEND.getLine());
				            
				}
				}
				setState(429);
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public Expression acsExpRet;
		public OtherExpressionContext oe;
		public Token LPAR;
		public FunctionArgumentsContext fa;
		public Token LBRACK;
		public ExpressionContext idx;
		public SizeExpressionContext se;
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(JepetoParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(JepetoParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(JepetoParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(JepetoParser.RPAR, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JepetoParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JepetoParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JepetoParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JepetoParser.RBRACK, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<SizeExpressionContext> sizeExpression() {
			return getRuleContexts(SizeExpressionContext.class);
		}
		public SizeExpressionContext sizeExpression(int i) {
			return getRuleContext(SizeExpressionContext.class,i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_accessExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			((AccessExpressionContext)_localctx).oe = otherExpression();
			((AccessExpressionContext)_localctx).acsExpRet =  ((AccessExpressionContext)_localctx).oe.otherExpRet;
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAR) {
				{
				{
				setState(432);
				((AccessExpressionContext)_localctx).LPAR = match(LPAR);
				setState(433);
				((AccessExpressionContext)_localctx).fa = functionArguments();
				setState(434);
				match(RPAR);

				            ((AccessExpressionContext)_localctx).acsExpRet =  new FunctionCall(((AccessExpressionContext)_localctx).oe.otherExpRet, ((AccessExpressionContext)_localctx).fa.sewcRet, ((AccessExpressionContext)_localctx).fa.sewcakRet);
				            _localctx.acsExpRet.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
				        
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(442);
				((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
				setState(443);
				((AccessExpressionContext)_localctx).idx = expression();
				((AccessExpressionContext)_localctx).acsExpRet =  new ListAccessByIndex(_localctx.acsExpRet, ((AccessExpressionContext)_localctx).idx.expRet); _localctx.acsExpRet.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
				setState(445);
				match(RBRACK);
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(452);
				((AccessExpressionContext)_localctx).se = sizeExpression();
				((AccessExpressionContext)_localctx).acsExpRet =  new ListSize(_localctx.acsExpRet); _localctx.acsExpRet.setLine(((AccessExpressionContext)_localctx).se.line);
				}
				}
				setState(459);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public Expression otherExpRet;
		public ValuesContext v;
		public IdentifierContext id;
		public AnonymousFunctionContext anon;
		public ExpressionContext e;
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(JepetoParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JepetoParser.RPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_otherExpression);
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((OtherExpressionContext)_localctx).v = values();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).v.valRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				((OtherExpressionContext)_localctx).id = identifier();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).id.IdRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				((OtherExpressionContext)_localctx).anon = anonymousFunction();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).anon.anonRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(LPAR);
				{
				setState(470);
				((OtherExpressionContext)_localctx).e = expression();
				((OtherExpressionContext)_localctx).otherExpRet =  ((OtherExpressionContext)_localctx).e.expRet;
				}
				setState(473);
				match(RPAR);
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

	public static class AnonymousFunctionContext extends ParserRuleContext {
		public AnonymousFunction anonRet;
		public FunctionArgumentsDeclarationContext fa;
		public BlockContext b;
		public TerminalNode ARROW() { return getToken(JepetoParser.ARROW, 0); }
		public FunctionArgumentsDeclarationContext functionArgumentsDeclaration() {
			return getRuleContext(FunctionArgumentsDeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_anonymousFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((AnonymousFunctionContext)_localctx).fa = functionArgumentsDeclaration();
			((AnonymousFunctionContext)_localctx).anonRet =  new AnonymousFunction(((AnonymousFunctionContext)_localctx).fa.IdArrRet); _localctx.anonRet.setLine(((AnonymousFunctionContext)_localctx).fa.line);
			setState(479);
			match(ARROW);
			setState(480);
			((AnonymousFunctionContext)_localctx).b = block();
			_localctx.anonRet.setBody(((AnonymousFunctionContext)_localctx).b.blockRet);
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

	public static class SizeExpressionContext extends ParserRuleContext {
		public int line;
		public Token DOT;
		public TerminalNode DOT() { return getToken(JepetoParser.DOT, 0); }
		public TerminalNode SIZE() { return getToken(JepetoParser.SIZE, 0); }
		public SizeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterSizeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitSizeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitSizeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeExpressionContext sizeExpression() throws RecognitionException {
		SizeExpressionContext _localctx = new SizeExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sizeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			((SizeExpressionContext)_localctx).DOT = match(DOT);
			((SizeExpressionContext)_localctx).line =  ((SizeExpressionContext)_localctx).DOT.getLine();
			setState(485);
			match(SIZE);
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

	public static class ValuesContext extends ParserRuleContext {
		public Value valRet;
		public BoolValueContext bv;
		public Token STRING_VALUE;
		public Token INT_VALUE;
		public ListValueContext lv;
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode STRING_VALUE() { return getToken(JepetoParser.STRING_VALUE, 0); }
		public TerminalNode INT_VALUE() { return getToken(JepetoParser.INT_VALUE, 0); }
		public ListValueContext listValue() {
			return getRuleContext(ListValueContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_values);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				((ValuesContext)_localctx).bv = boolValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).bv.bvRet;
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				((ValuesContext)_localctx).STRING_VALUE = match(STRING_VALUE);
				 String str = ((ValuesContext)_localctx).STRING_VALUE.getText(); ((ValuesContext)_localctx).valRet =  new StringValue(str.substring(1, str.length() - 1)); _localctx.valRet.setLine(((ValuesContext)_localctx).STRING_VALUE.getLine()); 
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				((ValuesContext)_localctx).INT_VALUE = match(INT_VALUE);
				((ValuesContext)_localctx).valRet =  new IntValue(Integer.parseInt(((ValuesContext)_localctx).INT_VALUE.getText())); _localctx.valRet.setLine(((ValuesContext)_localctx).INT_VALUE.getLine());
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				((ValuesContext)_localctx).lv = listValue();
				((ValuesContext)_localctx).valRet =  ((ValuesContext)_localctx).lv.lvRet;
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

	public static class ListValueContext extends ParserRuleContext {
		public ListValue lvRet;
		public Token LBRACK;
		public SplitedExpressionsWithCommaContext se;
		public TerminalNode LBRACK() { return getToken(JepetoParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JepetoParser.RBRACK, 0); }
		public SplitedExpressionsWithCommaContext splitedExpressionsWithComma() {
			return getRuleContext(SplitedExpressionsWithCommaContext.class,0);
		}
		public ListValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterListValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitListValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValueContext listValue() throws RecognitionException {
		ListValueContext _localctx = new ListValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ListValueContext)_localctx).lvRet =  new ListValue(); _localctx.lvRet.setLine(((ListValueContext)_localctx).LBRACK.getLine());
			setState(500);
			((ListValueContext)_localctx).LBRACK = match(LBRACK);
			setState(501);
			((ListValueContext)_localctx).se = splitedExpressionsWithComma();
			_localctx.lvRet.setElements(((ListValueContext)_localctx).se.sewcRet);
			setState(503);
			match(RBRACK);
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue bvRet;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(JepetoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JepetoParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolValue);
		try {
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).bvRet =  new BoolValue(true); _localctx.bvRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				((BoolValueContext)_localctx).FALSE = match(FALSE);
				((BoolValueContext)_localctx).bvRet =  new BoolValue(false); _localctx.bvRet.setLine(((BoolValueContext)_localctx).FALSE.getLine());
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

	public static class VoidValueContext extends ParserRuleContext {
		public VoidValue voidRet;
		public Token VOID;
		public TerminalNode VOID() { return getToken(JepetoParser.VOID, 0); }
		public VoidValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterVoidValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitVoidValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitVoidValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidValueContext voidValue() throws RecognitionException {
		VoidValueContext _localctx = new VoidValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_voidValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			((VoidValueContext)_localctx).VOID = match(VOID);
			((VoidValueContext)_localctx).voidRet =  new VoidValue(); _localctx.voidRet.setLine(((VoidValueContext)_localctx).VOID.getLine());
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier IdRet;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(JepetoParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JepetoListener ) ((JepetoListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JepetoVisitor ) return ((JepetoVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			((IdentifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			 ((IdentifierContext)_localctx).IdRet =  new Identifier(((IdentifierContext)_localctx).IDENTIFIER.getText()); _localctx.IdRet.setLine(((IdentifierContext)_localctx).IDENTIFIER.getLine());
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0208\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3S\n\3"+
		"\f\3\16\3V\13\3\3\3\3\3\3\3\3\3\3\3\7\3]\n\3\f\3\16\3`\13\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5v\n\5\f\5\16\5y\13\5\5\5{\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0085\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n\5\n\u00bb\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c8\n\13\f\13"+
		"\16\13\u00cb\13\13\5\13\u00cd\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00db\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0109\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0111\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0119"+
		"\n\23\f\23\16\23\u011c\13\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0124"+
		"\n\23\3\23\3\23\3\23\7\23\u0129\n\23\f\23\16\23\u012c\13\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0135\n\24\f\24\16\24\u0138\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u013f\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u0147\n\25\f\25\16\25\u014a\13\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26"+
		"\u0152\n\26\f\26\16\26\u0155\13\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u015d\n\27\3\27\3\27\3\27\7\27\u0162\n\27\f\27\16\27\u0165\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u016d\n\30\3\30\3\30\3\30\7\30\u0172\n"+
		"\30\f\30\16\30\u0175\13\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u017d\n"+
		"\31\3\31\3\31\3\31\7\31\u0182\n\31\f\31\16\31\u0185\13\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u018d\n\32\3\32\3\32\3\32\7\32\u0192\n\32\f\32"+
		"\16\32\u0195\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u019c\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01a4\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u01ac\n\34\f\34\16\34\u01af\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u01b8\n\35\f\35\16\35\u01bb\13\35\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u01c2\n\35\f\35\16\35\u01c5\13\35\3\35\3\35\3\35\7\35\u01ca\n\35\f\35"+
		"\16\35\u01cd\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\5\36\u01de\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u01f4\n!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\5#\u0200\n#\3$\3$\3$\3%\3%\3%\3%\2\2&\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\2\2\u0211"+
		"\2J\3\2\2\2\4N\3\2\2\2\6a\3\2\2\2\bl\3\2\2\2\n\u0084\3\2\2\2\f\u0086\3"+
		"\2\2\2\16\u0092\3\2\2\2\20\u00ac\3\2\2\2\22\u00ae\3\2\2\2\24\u00bc\3\2"+
		"\2\2\26\u00ce\3\2\2\2\30\u00d2\3\2\2\2\32\u00df\3\2\2\2\34\u00eb\3\2\2"+
		"\2\36\u00f5\3\2\2\2 \u0108\3\2\2\2\"\u0110\3\2\2\2$\u0112\3\2\2\2&\u013e"+
		"\3\2\2\2(\u0140\3\2\2\2*\u014b\3\2\2\2,\u0156\3\2\2\2.\u0166\3\2\2\2\60"+
		"\u0176\3\2\2\2\62\u0186\3\2\2\2\64\u01a3\3\2\2\2\66\u01a5\3\2\2\28\u01b0"+
		"\3\2\2\2:\u01dd\3\2\2\2<\u01df\3\2\2\2>\u01e5\3\2\2\2@\u01f3\3\2\2\2B"+
		"\u01f5\3\2\2\2D\u01ff\3\2\2\2F\u0201\3\2\2\2H\u0204\3\2\2\2JK\5\4\3\2"+
		"KL\b\2\1\2LM\7\2\2\3M\3\3\2\2\2NT\b\3\1\2OP\5\6\4\2PQ\b\3\1\2QS\3\2\2"+
		"\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\5\f\7"+
		"\2X^\b\3\1\2YZ\5\6\4\2Z[\b\3\1\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_\5\3\2\2\2`^\3\2\2\2ab\b\4\1\2bc\7\3\2\2cd\b\4\1\2de\5"+
		"H%\2ef\b\4\1\2fg\5\b\5\2gh\b\4\1\2hi\7#\2\2ij\5\n\6\2jk\b\4\1\2k\7\3\2"+
		"\2\2lm\b\5\1\2mn\7\33\2\2nz\b\5\1\2op\5H%\2pw\b\5\1\2qr\7!\2\2rs\5H%\2"+
		"st\b\5\1\2tv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2zo\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\34\2\2}\t\3\2\2\2~\177\5"+
		"\"\22\2\177\u0080\b\6\1\2\u0080\u0085\3\2\2\2\u0081\u0082\5$\23\2\u0082"+
		"\u0083\b\6\1\2\u0083\u0085\3\2\2\2\u0084~\3\2\2\2\u0084\u0081\3\2\2\2"+
		"\u0085\13\3\2\2\2\u0086\u0087\b\7\1\2\u0087\u0088\7\4\2\2\u0088\u0089"+
		"\7#\2\2\u0089\u0090\b\7\1\2\u008a\u008b\5\26\f\2\u008b\u008c\b\7\1\2\u008c"+
		"\u0091\3\2\2\2\u008d\u008e\5\36\20\2\u008e\u008f\b\7\1\2\u008f\u0091\3"+
		"\2\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\r\3\2\2\2\u0092\u0093"+
		"\b\b\1\2\u0093\u0094\5H%\2\u0094\u009d\b\b\1\2\u0095\u0096\7\33\2\2\u0096"+
		"\u0097\b\b\1\2\u0097\u0098\5\20\t\2\u0098\u0099\7\34\2\2\u0099\u009a\b"+
		"\b\1\2\u009a\u009c\3\2\2\2\u009b\u0095\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\7\33\2\2\u00a1\u00a2\b\b\1\2\u00a2\u00a3\5\20\t\2\u00a3"+
		"\u00a4\7\34\2\2\u00a4\u00a5\b\b\1\2\u00a5\17\3\2\2\2\u00a6\u00a7\5\22"+
		"\n\2\u00a7\u00a8\b\t\1\2\u00a8\u00ad\3\2\2\2\u00a9\u00aa\5\24\13\2\u00aa"+
		"\u00ab\b\t\1\2\u00ab\u00ad\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3\2"+
		"\2\2\u00ad\21\3\2\2\2\u00ae\u00ba\b\n\1\2\u00af\u00b0\5(\25\2\u00b0\u00b7"+
		"\b\n\1\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\b\n\1\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00af\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00cc\b\13\1"+
		"\2\u00bd\u00be\5H%\2\u00be\u00bf\7\32\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c9"+
		"\b\13\1\2\u00c1\u00c2\7!\2\2\u00c2\u00c3\5H%\2\u00c3\u00c4\7\32\2\2\u00c4"+
		"\u00c5\5(\25\2\u00c5\u00c6\b\13\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c1\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\5\16\b\2\u00cf\u00d0\b\f\1\2\u00d0\u00d1"+
		"\7$\2\2\u00d1\27\3\2\2\2\u00d2\u00d3\b\r\1\2\u00d3\u00da\7\7\2\2\u00d4"+
		"\u00d5\5(\25\2\u00d5\u00d6\b\r\1\2\u00d6\u00db\3\2\2\2\u00d7\u00d8\5F"+
		"$\2\u00d8\u00d9\b\r\1\2\u00d9\u00db\3\2\2\2\u00da\u00d4\3\2\2\2\u00da"+
		"\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\r\1\2\u00dd\u00de\7$"+
		"\2\2\u00de\31\3\2\2\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2"+
		"\7#\2\2\u00e2\u00e3\5&\24\2\u00e3\u00e9\b\16\1\2\u00e4\u00e5\7\n\2\2\u00e5"+
		"\u00e6\7#\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8\b\16\1\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e4\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\33\3\2\2\2\u00eb\u00ec"+
		"\7\t\2\2\u00ec\u00ed\5(\25\2\u00ed\u00ee\7#\2\2\u00ee\u00ef\5\n\6\2\u00ef"+
		"\u00f0\b\17\1\2\u00f0\u00f1\7\n\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3\5\n"+
		"\6\2\u00f3\u00f4\b\17\1\2\u00f4\35\3\2\2\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7"+
		"\7\33\2\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\b\20\1\2\u00f9\u00fa\7\34\2"+
		"\2\u00fa\u00fb\7$\2\2\u00fb\37\3\2\2\2\u00fc\u00fd\5\32\16\2\u00fd\u00fe"+
		"\b\21\1\2\u00fe\u0109\3\2\2\2\u00ff\u0100\5\36\20\2\u0100\u0101\b\21\1"+
		"\2\u0101\u0109\3\2\2\2\u0102\u0103\5\26\f\2\u0103\u0104\b\21\1\2\u0104"+
		"\u0109\3\2\2\2\u0105\u0106\5\30\r\2\u0106\u0107\b\21\1\2\u0107\u0109\3"+
		"\2\2\2\u0108\u00fc\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0105\3\2\2\2\u0109!\3\2\2\2\u010a\u010b\5\30\r\2\u010b\u010c\b\22\1"+
		"\2\u010c\u0111\3\2\2\2\u010d\u010e\5\34\17\2\u010e\u010f\b\22\1\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010d\3\2\2\2\u0111#\3\2\2\2"+
		"\u0112\u0113\b\23\1\2\u0113\u0114\7\37\2\2\u0114\u011a\b\23\1\2\u0115"+
		"\u0116\5 \21\2\u0116\u0117\b\23\1\2\u0117\u0119\3\2\2\2\u0118\u0115\3"+
		"\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u0123\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\5\30\r\2\u011e\u011f\b"+
		"\23\1\2\u011f\u0124\3\2\2\2\u0120\u0121\5\34\17\2\u0121\u0122\b\23\1\2"+
		"\u0122\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u012a"+
		"\3\2\2\2\u0125\u0126\5 \21\2\u0126\u0127\b\23\1\2\u0127\u0129\3\2\2\2"+
		"\u0128\u0125\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7 \2\2\u012e"+
		"%\3\2\2\2\u012f\u0130\7\37\2\2\u0130\u0136\b\24\1\2\u0131\u0132\5 \21"+
		"\2\u0132\u0133\b\24\1\2\u0133\u0135\3\2\2\2\u0134\u0131\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7 \2\2\u013a\u013f\b\24\1\2\u013b"+
		"\u013c\5 \21\2\u013c\u013d\b\24\1\2\u013d\u013f\3\2\2\2\u013e\u012f\3"+
		"\2\2\2\u013e\u013b\3\2\2\2\u013f\'\3\2\2\2\u0140\u0141\5*\26\2\u0141\u0148"+
		"\b\25\1\2\u0142\u0143\7\24\2\2\u0143\u0144\5*\26\2\u0144\u0145\b\25\1"+
		"\2\u0145\u0147\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149)\3\2\2\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014c\5,\27\2\u014c\u0153\b\26\1\2\u014d\u014e\7\23\2\2\u014e\u014f\5"+
		",\27\2\u014f\u0150\b\26\1\2\u0150\u0152\3\2\2\2\u0151\u014d\3\2\2\2\u0152"+
		"\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154+\3\2\2\2"+
		"\u0155\u0153\3\2\2\2\u0156\u0157\5.\30\2\u0157\u0163\b\27\1\2\u0158\u0159"+
		"\7\17\2\2\u0159\u015d\b\27\1\2\u015a\u015b\7\20\2\2\u015b\u015d\b\27\1"+
		"\2\u015c\u0158\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\5.\30\2\u015f\u0160\b\27\1\2\u0160\u0162\3\2\2\2\u0161\u015c\3\2\2\2"+
		"\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164-\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\5\60\31\2\u0167\u0173\b\30\1\2"+
		"\u0168\u0169\7\21\2\2\u0169\u016d\b\30\1\2\u016a\u016b\7\22\2\2\u016b"+
		"\u016d\b\30\1\2\u016c\u0168\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016f\5\60\31\2\u016f\u0170\b\30\1\2\u0170\u0172\3\2\2\2"+
		"\u0171\u016c\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174/\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\5\62\32\2\u0177"+
		"\u0183\b\31\1\2\u0178\u0179\7\13\2\2\u0179\u017d\b\31\1\2\u017a\u017b"+
		"\7\f\2\2\u017b\u017d\b\31\1\2\u017c\u0178\3\2\2\2\u017c\u017a\3\2\2\2"+
		"\u017d\u017e\3\2\2\2\u017e\u017f\5\62\32\2\u017f\u0180\b\31\1\2\u0180"+
		"\u0182\3\2\2\2\u0181\u017c\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\61\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187"+
		"\5\64\33\2\u0187\u0193\b\32\1\2\u0188\u0189\7\r\2\2\u0189\u018d\b\32\1"+
		"\2\u018a\u018b\7\16\2\2\u018b\u018d\b\32\1\2\u018c\u0188\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5\64\33\2\u018f\u0190\b"+
		"\32\1\2\u0190\u0192\3\2\2\2\u0191\u018c\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\63\3\2\2\2\u0195\u0193\3\2\2"+
		"\2\u0196\u019b\b\33\1\2\u0197\u0198\7\25\2\2\u0198\u019c\b\33\1\2\u0199"+
		"\u019a\7\f\2\2\u019a\u019c\b\33\1\2\u019b\u0197\3\2\2\2\u019b\u0199\3"+
		"\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\64\33\2\u019e\u019f\b\33\1\2"+
		"\u019f\u01a4\3\2\2\2\u01a0\u01a1\5\66\34\2\u01a1\u01a2\b\33\1\2\u01a2"+
		"\u01a4\3\2\2\2\u01a3\u0196\3\2\2\2\u01a3\u01a0\3\2\2\2\u01a4\65\3\2\2"+
		"\2\u01a5\u01a6\58\35\2\u01a6\u01ad\b\34\1\2\u01a7\u01a8\7\26\2\2\u01a8"+
		"\u01a9\58\35\2\u01a9\u01aa\b\34\1\2\u01aa\u01ac\3\2\2\2\u01ab\u01a7\3"+
		"\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\67\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\5:\36\2\u01b1\u01b9\b\35\1"+
		"\2\u01b2\u01b3\7\33\2\2\u01b3\u01b4\5\20\t\2\u01b4\u01b5\7\34\2\2\u01b5"+
		"\u01b6\b\35\1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b8\u01bb\3"+
		"\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01c3\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bc\u01bd\7\35\2\2\u01bd\u01be\5(\25\2\u01be\u01bf\b"+
		"\35\1\2\u01bf\u01c0\7\36\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bc\3\2\2\2\u01c2"+
		"\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01cb\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\5> \2\u01c7\u01c8\b\35\1\2\u01c8"+
		"\u01ca\3\2\2\2\u01c9\u01c6\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2"+
		"\2\2\u01cb\u01cc\3\2\2\2\u01cc9\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf"+
		"\5@!\2\u01cf\u01d0\b\36\1\2\u01d0\u01de\3\2\2\2\u01d1\u01d2\5H%\2\u01d2"+
		"\u01d3\b\36\1\2\u01d3\u01de\3\2\2\2\u01d4\u01d5\5<\37\2\u01d5\u01d6\b"+
		"\36\1\2\u01d6\u01de\3\2\2\2\u01d7\u01d8\7\33\2\2\u01d8\u01d9\5(\25\2\u01d9"+
		"\u01da\b\36\1\2\u01da\u01db\3\2\2\2\u01db\u01dc\7\34\2\2\u01dc\u01de\3"+
		"\2\2\2\u01dd\u01ce\3\2\2\2\u01dd\u01d1\3\2\2\2\u01dd\u01d4\3\2\2\2\u01dd"+
		"\u01d7\3\2\2\2\u01de;\3\2\2\2\u01df\u01e0\5\b\5\2\u01e0\u01e1\b\37\1\2"+
		"\u01e1\u01e2\7\31\2\2\u01e2\u01e3\5$\23\2\u01e3\u01e4\b\37\1\2\u01e4="+
		"\3\2\2\2\u01e5\u01e6\7\"\2\2\u01e6\u01e7\b \1\2\u01e7\u01e8\7\5\2\2\u01e8"+
		"?\3\2\2\2\u01e9\u01ea\5D#\2\u01ea\u01eb\b!\1\2\u01eb\u01f4\3\2\2\2\u01ec"+
		"\u01ed\7\'\2\2\u01ed\u01f4\b!\1\2\u01ee\u01ef\7%\2\2\u01ef\u01f4\b!\1"+
		"\2\u01f0\u01f1\5B\"\2\u01f1\u01f2\b!\1\2\u01f2\u01f4\3\2\2\2\u01f3\u01e9"+
		"\3\2\2\2\u01f3\u01ec\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f4"+
		"A\3\2\2\2\u01f5\u01f6\b\"\1\2\u01f6\u01f7\7\35\2\2\u01f7\u01f8\5\22\n"+
		"\2\u01f8\u01f9\b\"\1\2\u01f9\u01fa\7\36\2\2\u01faC\3\2\2\2\u01fb\u01fc"+
		"\7\27\2\2\u01fc\u0200\b#\1\2\u01fd\u01fe\7\30\2\2\u01fe\u0200\b#\1\2\u01ff"+
		"\u01fb\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200E\3\2\2\2\u0201\u0202\7\b\2\2"+
		"\u0202\u0203\b$\1\2\u0203G\3\2\2\2\u0204\u0205\7&\2\2\u0205\u0206\b%\1"+
		"\2\u0206I\3\2\2\2*T^wz\u0084\u0090\u009d\u00ac\u00b7\u00ba\u00c9\u00cc"+
		"\u00da\u00e9\u0108\u0110\u011a\u0123\u012a\u0136\u013e\u0148\u0153\u015c"+
		"\u0163\u016c\u0173\u017c\u0183\u018c\u0193\u019b\u01a3\u01ad\u01b9\u01c3"+
		"\u01cb\u01dd\u01f3\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}