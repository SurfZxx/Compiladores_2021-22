// Generated from C:/Users/rafad/OneDrive/Documentos/3ano_2semestre/Compiladores/a22/src\a22.g4 by ANTLR 4.9.2
package a22;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class a22Parser extends Parser {
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
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_declaring_data = 2, RULE_instruction = 3, 
		RULE_int_expression = 4, RULE_real_expression = 5, RULE_bool_expression = 6, 
		RULE_bool_comparators = 7, RULE_string_expression = 8, RULE_stored_values = 9, 
		RULE_stored_values1 = 10, RULE_declare_variables = 11, RULE_declare_types = 12, 
		RULE_attribution_instruction = 13, RULE_attribution_no_semicolon = 14, 
		RULE_if_instruction = 15, RULE_while_instruction = 16, RULE_for_instruction = 17, 
		RULE_return_instruction = 18, RULE_expression_instruction = 19, RULE_block_instruction = 20, 
		RULE_semicolon_instruction = 21, RULE_defining_functions = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expression", "declaring_data", "instruction", "int_expression", 
			"real_expression", "bool_expression", "bool_comparators", "string_expression", 
			"stored_values", "stored_values1", "declare_variables", "declare_types", 
			"attribution_instruction", "attribution_no_semicolon", "if_instruction", 
			"while_instruction", "for_instruction", "return_instruction", "expression_instruction", 
			"block_instruction", "semicolon_instruction", "defining_functions"
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

	@Override
	public String getGrammarFileName() { return "a22.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public a22Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(a22Parser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Declaring_dataContext> declaring_data() {
			return getRuleContexts(Declaring_dataContext.class);
		}
		public Declaring_dataContext declaring_data(int i) {
			return getRuleContext(Declaring_dataContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS) | (1L << TYPE_STRUCT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << TYPES) | (1L << LBRACKET) | (1L << LPARENTH) | (1L << MINUS) | (1L << NOT) | (1L << SEMICOLON) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(46);
					expression();
					}
					break;
				case 2:
					{
					setState(47);
					declaring_data();
					}
					break;
				case 3:
					{
					setState(48);
					instruction();
					}
					break;
				}
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Int_expressionContext int_expression() {
			return getRuleContext(Int_expressionContext.class,0);
		}
		public Real_expressionContext real_expression() {
			return getRuleContext(Real_expressionContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				int_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				real_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				string_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				bool_expression(0);
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

	public static class Declaring_dataContext extends ParserRuleContext {
		public Declare_variablesContext declare_variables() {
			return getRuleContext(Declare_variablesContext.class,0);
		}
		public Declare_typesContext declare_types() {
			return getRuleContext(Declare_typesContext.class,0);
		}
		public Declaring_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaring_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclaring_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclaring_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclaring_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaring_dataContext declaring_data() throws RecognitionException {
		Declaring_dataContext _localctx = new Declaring_dataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaring_data);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				declare_variables();
				}
				break;
			case TYPE_STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				declare_types();
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

	public static class InstructionContext extends ParserRuleContext {
		public Declare_variablesContext declare_variables() {
			return getRuleContext(Declare_variablesContext.class,0);
		}
		public Attribution_instructionContext attribution_instruction() {
			return getRuleContext(Attribution_instructionContext.class,0);
		}
		public If_instructionContext if_instruction() {
			return getRuleContext(If_instructionContext.class,0);
		}
		public While_instructionContext while_instruction() {
			return getRuleContext(While_instructionContext.class,0);
		}
		public For_instructionContext for_instruction() {
			return getRuleContext(For_instructionContext.class,0);
		}
		public Return_instructionContext return_instruction() {
			return getRuleContext(Return_instructionContext.class,0);
		}
		public Expression_instructionContext expression_instruction() {
			return getRuleContext(Expression_instructionContext.class,0);
		}
		public Block_instructionContext block_instruction() {
			return getRuleContext(Block_instructionContext.class,0);
		}
		public Semicolon_instructionContext semicolon_instruction() {
			return getRuleContext(Semicolon_instructionContext.class,0);
		}
		public Defining_functionsContext defining_functions() {
			return getRuleContext(Defining_functionsContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				declare_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				attribution_instruction(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				if_instruction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				while_instruction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				for_instruction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				return_instruction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				expression_instruction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				block_instruction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				semicolon_instruction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
				defining_functions();
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

	public static class Int_expressionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(a22Parser.INT, 0); }
		public Stored_valuesContext stored_values() {
			return getRuleContext(Stored_valuesContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(a22Parser.MINUS, 0); }
		public TerminalNode LPARENTH() { return getToken(a22Parser.LPARENTH, 0); }
		public List<Int_expressionContext> int_expression() {
			return getRuleContexts(Int_expressionContext.class);
		}
		public Int_expressionContext int_expression(int i) {
			return getRuleContext(Int_expressionContext.class,i);
		}
		public TerminalNode RPARENTH() { return getToken(a22Parser.RPARENTH, 0); }
		public TerminalNode DIVIDER() { return getToken(a22Parser.DIVIDER, 0); }
		public TerminalNode MULTIPLIER() { return getToken(a22Parser.MULTIPLIER, 0); }
		public TerminalNode MODULO() { return getToken(a22Parser.MODULO, 0); }
		public TerminalNode PLUS() { return getToken(a22Parser.PLUS, 0); }
		public Int_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterInt_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitInt_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitInt_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_expressionContext int_expression() throws RecognitionException {
		return int_expression(0);
	}

	private Int_expressionContext int_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Int_expressionContext _localctx = new Int_expressionContext(_ctx, _parentState);
		Int_expressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_int_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(81);
					match(MINUS);
					}
				}

				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(84);
					match(INT);
					}
					break;
				case KEYWORDS:
				case ID:
					{
					setState(85);
					stored_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(88);
				match(LPARENTH);
				setState(89);
				int_expression(0);
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDER) | (1L << MULTIPLIER) | (1L << MODULO))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
				int_expression(0);
				setState(92);
				match(RPARENTH);
				}
				break;
			case 3:
				{
				setState(94);
				match(LPARENTH);
				setState(95);
				int_expression(0);
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(97);
				int_expression(0);
				setState(98);
				match(RPARENTH);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Int_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_expression);
						setState(102);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(103);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIVIDER) | (1L << MULTIPLIER) | (1L << MODULO))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						int_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new Int_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_int_expression);
						setState(105);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						int_expression(2);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Real_expressionContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(a22Parser.REAL, 0); }
		public TerminalNode INT() { return getToken(a22Parser.INT, 0); }
		public Stored_valuesContext stored_values() {
			return getRuleContext(Stored_valuesContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(a22Parser.MINUS, 0); }
		public TerminalNode LPARENTH() { return getToken(a22Parser.LPARENTH, 0); }
		public List<Real_expressionContext> real_expression() {
			return getRuleContexts(Real_expressionContext.class);
		}
		public Real_expressionContext real_expression(int i) {
			return getRuleContext(Real_expressionContext.class,i);
		}
		public TerminalNode RPARENTH() { return getToken(a22Parser.RPARENTH, 0); }
		public TerminalNode DIVIDER() { return getToken(a22Parser.DIVIDER, 0); }
		public TerminalNode MULTIPLIER() { return getToken(a22Parser.MULTIPLIER, 0); }
		public TerminalNode PLUS() { return getToken(a22Parser.PLUS, 0); }
		public Real_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterReal_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitReal_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitReal_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_expressionContext real_expression() throws RecognitionException {
		return real_expression(0);
	}

	private Real_expressionContext real_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Real_expressionContext _localctx = new Real_expressionContext(_ctx, _parentState);
		Real_expressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_real_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(114);
					match(MINUS);
					}
				}

				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
					{
					setState(117);
					match(REAL);
					}
					break;
				case INT:
					{
					setState(118);
					match(INT);
					}
					break;
				case KEYWORDS:
				case ID:
					{
					setState(119);
					stored_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(122);
				match(LPARENTH);
				setState(123);
				real_expression(0);
				setState(124);
				_la = _input.LA(1);
				if ( !(_la==DIVIDER || _la==MULTIPLIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(125);
				real_expression(0);
				setState(126);
				match(RPARENTH);
				}
				break;
			case 3:
				{
				setState(128);
				match(LPARENTH);
				setState(129);
				real_expression(0);
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				real_expression(0);
				setState(132);
				match(RPARENTH);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new Real_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_real_expression);
						setState(136);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(137);
						_la = _input.LA(1);
						if ( !(_la==DIVIDER || _la==MULTIPLIER) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						real_expression(3);
						}
						break;
					case 2:
						{
						_localctx = new Real_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_real_expression);
						setState(139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(140);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						real_expression(2);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(a22Parser.BOOL, 0); }
		public Stored_valuesContext stored_values() {
			return getRuleContext(Stored_valuesContext.class,0);
		}
		public TerminalNode REAL() { return getToken(a22Parser.REAL, 0); }
		public TerminalNode INT() { return getToken(a22Parser.INT, 0); }
		public TerminalNode STRING() { return getToken(a22Parser.STRING, 0); }
		public TerminalNode MINUS() { return getToken(a22Parser.MINUS, 0); }
		public TerminalNode LPARENTH() { return getToken(a22Parser.LPARENTH, 0); }
		public TerminalNode NOT() { return getToken(a22Parser.NOT, 0); }
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode RPARENTH() { return getToken(a22Parser.RPARENTH, 0); }
		public Bool_comparatorsContext bool_comparators() {
			return getRuleContext(Bool_comparatorsContext.class,0);
		}
		public TerminalNode IS_EQUAL_TO() { return getToken(a22Parser.IS_EQUAL_TO, 0); }
		public TerminalNode DIFFERENT() { return getToken(a22Parser.DIFFERENT, 0); }
		public TerminalNode AND() { return getToken(a22Parser.AND, 0); }
		public TerminalNode OR() { return getToken(a22Parser.OR, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBool_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBool_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_bool_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOL:
					{
					setState(148);
					match(BOOL);
					}
					break;
				case KEYWORDS:
				case ID:
					{
					setState(149);
					stored_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(152);
					match(MINUS);
					}
				}

				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
					{
					setState(155);
					match(REAL);
					}
					break;
				case INT:
					{
					setState(156);
					match(INT);
					}
					break;
				case STRING:
					{
					setState(157);
					match(STRING);
					}
					break;
				case KEYWORDS:
				case ID:
					{
					setState(158);
					stored_values();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(161);
				match(LPARENTH);
				setState(162);
				match(NOT);
				setState(163);
				bool_expression(0);
				setState(164);
				match(RPARENTH);
				}
				break;
			case 4:
				{
				setState(166);
				match(NOT);
				setState(167);
				bool_expression(7);
				}
				break;
			case 5:
				{
				setState(168);
				match(LPARENTH);
				setState(169);
				bool_expression(0);
				setState(170);
				bool_comparators();
				setState(171);
				bool_expression(0);
				setState(172);
				match(RPARENTH);
				}
				break;
			case 6:
				{
				setState(174);
				match(LPARENTH);
				setState(175);
				bool_expression(0);
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==IS_EQUAL_TO || _la==DIFFERENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				bool_expression(0);
				setState(178);
				match(RPARENTH);
				}
				break;
			case 7:
				{
				setState(180);
				match(LPARENTH);
				setState(181);
				bool_expression(0);
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				bool_expression(0);
				setState(184);
				match(RPARENTH);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(198);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(189);
						bool_comparators();
						setState(190);
						bool_expression(4);
						}
						break;
					case 2:
						{
						_localctx = new Bool_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==IS_EQUAL_TO || _la==DIFFERENT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						bool_expression(3);
						}
						break;
					case 3:
						{
						_localctx = new Bool_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
						setState(195);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(196);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(197);
						bool_expression(2);
						}
						break;
					}
					} 
				}
				setState(202);
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

	public static class Bool_comparatorsContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(a22Parser.GREATER, 0); }
		public TerminalNode GREATER_THAN() { return getToken(a22Parser.GREATER_THAN, 0); }
		public TerminalNode LESS() { return getToken(a22Parser.LESS, 0); }
		public TerminalNode LESS_THAN() { return getToken(a22Parser.LESS_THAN, 0); }
		public Bool_comparatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_comparators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBool_comparators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBool_comparators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBool_comparators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_comparatorsContext bool_comparators() throws RecognitionException {
		Bool_comparatorsContext _localctx = new Bool_comparatorsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool_comparators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER) | (1L << LESS) | (1L << GREATER_THAN) | (1L << LESS_THAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class String_expressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(a22Parser.STRING, 0); }
		public Stored_valuesContext stored_values() {
			return getRuleContext(Stored_valuesContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(a22Parser.PLUS, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitString_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitString_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		return string_expression(0);
	}

	private String_expressionContext string_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_expressionContext _localctx = new String_expressionContext(_ctx, _parentState);
		String_expressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(206);
				match(STRING);
				}
				break;
			case KEYWORDS:
			case ID:
				{
				setState(207);
				stored_values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
					setState(210);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					{
					setState(211);
					match(PLUS);
					}
					setState(212);
					string_expression(2);
					}
					} 
				}
				setState(217);
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

	public static class Stored_valuesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(a22Parser.ID, 0); }
		public TerminalNode KEYWORDS() { return getToken(a22Parser.KEYWORDS, 0); }
		public Stored_values1Context stored_values1() {
			return getRuleContext(Stored_values1Context.class,0);
		}
		public Stored_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stored_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterStored_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitStored_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitStored_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stored_valuesContext stored_values() throws RecognitionException {
		Stored_valuesContext _localctx = new Stored_valuesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stored_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==KEYWORDS || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(219);
				stored_values1();
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

	public static class Stored_values1Context extends ParserRuleContext {
		public TerminalNode LARRAY() { return getToken(a22Parser.LARRAY, 0); }
		public TerminalNode INT() { return getToken(a22Parser.INT, 0); }
		public TerminalNode RARRAY() { return getToken(a22Parser.RARRAY, 0); }
		public TerminalNode STRUCT_DOT() { return getToken(a22Parser.STRUCT_DOT, 0); }
		public TerminalNode ID() { return getToken(a22Parser.ID, 0); }
		public TerminalNode LPARENTH() { return getToken(a22Parser.LPARENTH, 0); }
		public TerminalNode RPARENTH() { return getToken(a22Parser.RPARENTH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22Parser.COMMA, i);
		}
		public Stored_values1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stored_values1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterStored_values1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitStored_values1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitStored_values1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stored_values1Context stored_values1() throws RecognitionException {
		Stored_values1Context _localctx = new Stored_values1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_stored_values1);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(LARRAY);
				setState(223);
				match(INT);
				setState(224);
				match(RARRAY);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(225);
					match(STRUCT_DOT);
					setState(226);
					match(ID);
					}
					break;
				}
				}
				break;
			case LPARENTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(LPARENTH);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS) | (1L << LPARENTH) | (1L << MINUS) | (1L << NOT) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					{
					setState(230);
					expression();
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(231);
						match(COMMA);
						}
					}

					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(RPARENTH);
				}
				break;
			case STRUCT_DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(STRUCT_DOT);
				setState(241);
				match(ID);
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

	public static class Declare_variablesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(a22Parser.ID, 0); }
		public List<TerminalNode> LARRAY() { return getTokens(a22Parser.LARRAY); }
		public TerminalNode LARRAY(int i) {
			return getToken(a22Parser.LARRAY, i);
		}
		public List<TerminalNode> INT() { return getTokens(a22Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(a22Parser.INT, i);
		}
		public List<TerminalNode> RARRAY() { return getTokens(a22Parser.RARRAY); }
		public TerminalNode RARRAY(int i) {
			return getToken(a22Parser.RARRAY, i);
		}
		public TerminalNode TYPES() { return getToken(a22Parser.TYPES, 0); }
		public List<Declare_variablesContext> declare_variables() {
			return getRuleContexts(Declare_variablesContext.class);
		}
		public Declare_variablesContext declare_variables(int i) {
			return getRuleContext(Declare_variablesContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(a22Parser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(a22Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22Parser.COMMA, i);
		}
		public Declare_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclare_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclare_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclare_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_variablesContext declare_variables() throws RecognitionException {
		Declare_variablesContext _localctx = new Declare_variablesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declare_variables);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ID);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LARRAY) {
					{
					{
					setState(245);
					match(LARRAY);
					setState(246);
					match(INT);
					setState(247);
					match(RARRAY);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TYPES:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(TYPES);
				setState(254);
				declare_variables();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(255);
					match(COMMA);
					setState(256);
					declare_variables();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(SEMICOLON);
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

	public static class Declare_typesContext extends ParserRuleContext {
		public TerminalNode TYPE_STRUCT() { return getToken(a22Parser.TYPE_STRUCT, 0); }
		public TerminalNode ID() { return getToken(a22Parser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(a22Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(a22Parser.RBRACKET, 0); }
		public List<Declare_variablesContext> declare_variables() {
			return getRuleContexts(Declare_variablesContext.class);
		}
		public Declare_variablesContext declare_variables(int i) {
			return getRuleContext(Declare_variablesContext.class,i);
		}
		public Declare_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDeclare_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDeclare_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDeclare_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_typesContext declare_types() throws RecognitionException {
		Declare_typesContext _localctx = new Declare_typesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declare_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(TYPE_STRUCT);
			setState(267);
			match(ID);
			setState(268);
			match(LBRACKET);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				declare_variables();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPES || _la==ID );
			setState(274);
			match(RBRACKET);
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

	public static class Attribution_instructionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(a22Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(a22Parser.ID, i);
		}
		public List<TerminalNode> LARRAY() { return getTokens(a22Parser.LARRAY); }
		public TerminalNode LARRAY(int i) {
			return getToken(a22Parser.LARRAY, i);
		}
		public List<Int_expressionContext> int_expression() {
			return getRuleContexts(Int_expressionContext.class);
		}
		public Int_expressionContext int_expression(int i) {
			return getRuleContext(Int_expressionContext.class,i);
		}
		public List<TerminalNode> RARRAY() { return getTokens(a22Parser.RARRAY); }
		public TerminalNode RARRAY(int i) {
			return getToken(a22Parser.RARRAY, i);
		}
		public TerminalNode STRUCT_DOT() { return getToken(a22Parser.STRUCT_DOT, 0); }
		public Attribution_instructionContext attribution_instruction() {
			return getRuleContext(Attribution_instructionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(a22Parser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(a22Parser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Attribution_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterAttribution_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitAttribution_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitAttribution_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribution_instructionContext attribution_instruction() throws RecognitionException {
		return attribution_instruction(0);
	}

	private Attribution_instructionContext attribution_instruction(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Attribution_instructionContext _localctx = new Attribution_instructionContext(_ctx, _parentState);
		Attribution_instructionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_attribution_instruction, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277);
			match(ID);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278);
					match(LARRAY);
					setState(279);
					int_expression(0);
					setState(280);
					match(RARRAY);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(287);
				match(STRUCT_DOT);
				setState(288);
				match(ID);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Attribution_instructionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attribution_instruction);
					setState(291);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(292);
					match(EQUAL);
					setState(294); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(293);
						expression();
						}
						}
						setState(296); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS) | (1L << LPARENTH) | (1L << MINUS) | (1L << NOT) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0) );
					setState(298);
					match(SEMICOLON);
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class Attribution_no_semicolonContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(a22Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(a22Parser.ID, i);
		}
		public List<TerminalNode> LARRAY() { return getTokens(a22Parser.LARRAY); }
		public TerminalNode LARRAY(int i) {
			return getToken(a22Parser.LARRAY, i);
		}
		public List<Int_expressionContext> int_expression() {
			return getRuleContexts(Int_expressionContext.class);
		}
		public Int_expressionContext int_expression(int i) {
			return getRuleContext(Int_expressionContext.class,i);
		}
		public List<TerminalNode> RARRAY() { return getTokens(a22Parser.RARRAY); }
		public TerminalNode RARRAY(int i) {
			return getToken(a22Parser.RARRAY, i);
		}
		public TerminalNode STRUCT_DOT() { return getToken(a22Parser.STRUCT_DOT, 0); }
		public Attribution_no_semicolonContext attribution_no_semicolon() {
			return getRuleContext(Attribution_no_semicolonContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(a22Parser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Attribution_no_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribution_no_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterAttribution_no_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitAttribution_no_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitAttribution_no_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribution_no_semicolonContext attribution_no_semicolon() throws RecognitionException {
		return attribution_no_semicolon(0);
	}

	private Attribution_no_semicolonContext attribution_no_semicolon(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Attribution_no_semicolonContext _localctx = new Attribution_no_semicolonContext(_ctx, _parentState);
		Attribution_no_semicolonContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_attribution_no_semicolon, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(306);
			match(ID);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(LARRAY);
					setState(308);
					int_expression(0);
					setState(309);
					match(RARRAY);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(316);
				match(STRUCT_DOT);
				setState(317);
				match(ID);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Attribution_no_semicolonContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attribution_no_semicolon);
					setState(320);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(321);
					match(EQUAL);
					setState(322);
					expression();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class If_instructionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(a22Parser.IF, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(a22Parser.THEN, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(a22Parser.ELSE, 0); }
		public If_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterIf_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitIf_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitIf_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_instructionContext if_instruction() throws RecognitionException {
		If_instructionContext _localctx = new If_instructionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(IF);
			setState(329);
			bool_expression(0);
			setState(330);
			match(THEN);
			setState(331);
			instruction();
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(332);
				match(ELSE);
				setState(333);
				instruction();
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

	public static class While_instructionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(a22Parser.WHILE, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public While_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterWhile_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitWhile_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitWhile_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_instructionContext while_instruction() throws RecognitionException {
		While_instructionContext _localctx = new While_instructionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(WHILE);
			setState(337);
			bool_expression(0);
			setState(338);
			instruction();
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

	public static class For_instructionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(a22Parser.FOR, 0); }
		public Attribution_no_semicolonContext attribution_no_semicolon() {
			return getRuleContext(Attribution_no_semicolonContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(a22Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(a22Parser.INT, i);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode FOR_TO() { return getToken(a22Parser.FOR_TO, 0); }
		public TerminalNode FOR_DOWNTO() { return getToken(a22Parser.FOR_DOWNTO, 0); }
		public TerminalNode FOR_STEP() { return getToken(a22Parser.FOR_STEP, 0); }
		public For_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterFor_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitFor_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitFor_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_instructionContext for_instruction() throws RecognitionException {
		For_instructionContext _localctx = new For_instructionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(FOR);
			setState(341);
			attribution_no_semicolon(0);
			setState(342);
			_la = _input.LA(1);
			if ( !(_la==FOR_TO || _la==FOR_DOWNTO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(343);
			match(INT);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR_STEP) {
				{
				setState(344);
				match(FOR_STEP);
				setState(345);
				match(INT);
				}
			}

			setState(348);
			instruction();
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

	public static class Return_instructionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(a22Parser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(a22Parser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterReturn_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitReturn_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitReturn_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_instructionContext return_instruction() throws RecognitionException {
		Return_instructionContext _localctx = new Return_instructionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(RETURN);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS) | (1L << LPARENTH) | (1L << MINUS) | (1L << NOT) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(351);
				expression();
				}
			}

			setState(354);
			match(SEMICOLON);
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

	public static class Expression_instructionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(a22Parser.SEMICOLON, 0); }
		public Expression_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterExpression_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitExpression_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitExpression_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_instructionContext expression_instruction() throws RecognitionException {
		Expression_instructionContext _localctx = new Expression_instructionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			expression();
			setState(357);
			match(SEMICOLON);
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

	public static class Block_instructionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(a22Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(a22Parser.RBRACKET, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public Block_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterBlock_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitBlock_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitBlock_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_instructionContext block_instruction() throws RecognitionException {
		Block_instructionContext _localctx = new Block_instructionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(LBRACKET);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << TYPES) | (1L << LBRACKET) | (1L << LPARENTH) | (1L << MINUS) | (1L << NOT) | (1L << SEMICOLON) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(360);
				instruction();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(RBRACKET);
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

	public static class Semicolon_instructionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(a22Parser.SEMICOLON, 0); }
		public Semicolon_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterSemicolon_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitSemicolon_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitSemicolon_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_instructionContext semicolon_instruction() throws RecognitionException {
		Semicolon_instructionContext _localctx = new Semicolon_instructionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_semicolon_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SEMICOLON);
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

	public static class Defining_functionsContext extends ParserRuleContext {
		public List<TerminalNode> TYPES() { return getTokens(a22Parser.TYPES); }
		public TerminalNode TYPES(int i) {
			return getToken(a22Parser.TYPES, i);
		}
		public List<TerminalNode> ID() { return getTokens(a22Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(a22Parser.ID, i);
		}
		public TerminalNode LPARENTH() { return getToken(a22Parser.LPARENTH, 0); }
		public TerminalNode RPARENTH() { return getToken(a22Parser.RPARENTH, 0); }
		public TerminalNode LBRACKET() { return getToken(a22Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(a22Parser.RBRACKET, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> REFERENCED() { return getTokens(a22Parser.REFERENCED); }
		public TerminalNode REFERENCED(int i) {
			return getToken(a22Parser.REFERENCED, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(a22Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(a22Parser.COMMA, i);
		}
		public Defining_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defining_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).enterDefining_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof a22Listener ) ((a22Listener)listener).exitDefining_functions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof a22Visitor ) return ((a22Visitor<? extends T>)visitor).visitDefining_functions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defining_functionsContext defining_functions() throws RecognitionException {
		Defining_functionsContext _localctx = new Defining_functionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_defining_functions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(TYPES);
			setState(371);
			match(ID);
			setState(372);
			match(LPARENTH);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPES) {
				{
				{
				setState(373);
				match(TYPES);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REFERENCED) {
					{
					setState(374);
					match(REFERENCED);
					}
				}

				setState(377);
				match(ID);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(378);
					match(COMMA);
					}
				}

				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(RPARENTH);
			setState(387);
			match(LBRACKET);
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				instruction();
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KEYWORDS) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << RETURN) | (1L << TYPES) | (1L << LBRACKET) | (1L << LPARENTH) | (1L << MINUS) | (1L << NOT) | (1L << SEMICOLON) | (1L << BOOL) | (1L << REAL) | (1L << INT) | (1L << STRING) | (1L << ID))) != 0) );
			setState(393);
			match(RBRACKET);
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
		case 4:
			return int_expression_sempred((Int_expressionContext)_localctx, predIndex);
		case 5:
			return real_expression_sempred((Real_expressionContext)_localctx, predIndex);
		case 6:
			return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		case 8:
			return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		case 13:
			return attribution_instruction_sempred((Attribution_instructionContext)_localctx, predIndex);
		case 14:
			return attribution_no_semicolon_sempred((Attribution_no_semicolonContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean int_expression_sempred(Int_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean real_expression_sempred(Real_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attribution_instruction_sempred(Attribution_instructionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attribution_no_semicolon_sempred(Attribution_no_semicolonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u018e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\5\2\64\n\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3"+
		"\6\3\6\5\6U\n\6\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3"+
		"\7\3\7\5\7v\n\7\3\7\3\7\3\7\5\7{\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0091\n\7\f\7"+
		"\16\7\u0094\13\7\3\b\3\b\3\b\5\b\u0099\n\b\3\b\5\b\u009c\n\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00a2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bd\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c9\n\b\f\b\16\b\u00cc\13\b\3"+
		"\t\3\t\3\n\3\n\3\n\5\n\u00d3\n\n\3\n\3\n\3\n\7\n\u00d8\n\n\f\n\16\n\u00db"+
		"\13\n\3\13\3\13\5\13\u00df\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00e6\n\f\3\f"+
		"\3\f\3\f\5\f\u00eb\n\f\7\f\u00ed\n\f\f\f\16\f\u00f0\13\f\3\f\3\f\3\f\5"+
		"\f\u00f5\n\f\3\r\3\r\3\r\3\r\7\r\u00fb\n\r\f\r\16\r\u00fe\13\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0104\n\r\f\r\16\r\u0107\13\r\3\r\3\r\5\r\u010b\n\r\3\16"+
		"\3\16\3\16\3\16\6\16\u0111\n\16\r\16\16\16\u0112\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u011d\n\17\f\17\16\17\u0120\13\17\3\17\3\17\5"+
		"\17\u0124\n\17\3\17\3\17\3\17\6\17\u0129\n\17\r\17\16\17\u012a\3\17\3"+
		"\17\7\17\u012f\n\17\f\17\16\17\u0132\13\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u013a\n\20\f\20\16\20\u013d\13\20\3\20\3\20\5\20\u0141\n\20\3"+
		"\20\3\20\3\20\7\20\u0146\n\20\f\20\16\20\u0149\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u0151\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u015d\n\23\3\23\3\23\3\24\3\24\5\24\u0163\n\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\7\26\u016c\n\26\f\26\16\26\u016f\13\26\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u017a\n\30\3\30\3\30"+
		"\5\30\u017e\n\30\7\30\u0180\n\30\f\30\16\30\u0183\13\30\3\30\3\30\3\30"+
		"\6\30\u0188\n\30\r\30\16\30\u0189\3\30\3\30\3\30\2\b\n\f\16\22\34\36\31"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\n\3\2\31\33\3\2\27"+
		"\30\3\2\31\32\3\2\37 \3\2#$\4\2\34\35!\"\4\2\3\3,,\3\2\n\13\2\u01bc\2"+
		"\67\3\2\2\2\4@\3\2\2\2\6D\3\2\2\2\bP\3\2\2\2\nf\3\2\2\2\f\u0088\3\2\2"+
		"\2\16\u00bc\3\2\2\2\20\u00cd\3\2\2\2\22\u00cf\3\2\2\2\24\u00dc\3\2\2\2"+
		"\26\u00f4\3\2\2\2\30\u010a\3\2\2\2\32\u010c\3\2\2\2\34\u0116\3\2\2\2\36"+
		"\u0133\3\2\2\2 \u014a\3\2\2\2\"\u0152\3\2\2\2$\u0156\3\2\2\2&\u0160\3"+
		"\2\2\2(\u0166\3\2\2\2*\u0169\3\2\2\2,\u0172\3\2\2\2.\u0174\3\2\2\2\60"+
		"\64\5\4\3\2\61\64\5\6\4\2\62\64\5\b\5\2\63\60\3\2\2\2\63\61\3\2\2\2\63"+
		"\62\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678"+
		"\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<A\5\n\6\2=A\5\f\7"+
		"\2>A\5\22\n\2?A\5\16\b\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5\3"+
		"\2\2\2BE\5\30\r\2CE\5\32\16\2DB\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FQ\5\30\r"+
		"\2GQ\5\34\17\2HQ\5 \21\2IQ\5\"\22\2JQ\5$\23\2KQ\5&\24\2LQ\5(\25\2MQ\5"+
		"*\26\2NQ\5,\27\2OQ\5.\30\2PF\3\2\2\2PG\3\2\2\2PH\3\2\2\2PI\3\2\2\2PJ\3"+
		"\2\2\2PK\3\2\2\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\t\3\2\2\2RT"+
		"\b\6\1\2SU\7\30\2\2TS\3\2\2\2TU\3\2\2\2UX\3\2\2\2VY\7*\2\2WY\5\24\13\2"+
		"XV\3\2\2\2XW\3\2\2\2Yg\3\2\2\2Z[\7\25\2\2[\\\5\n\6\2\\]\t\2\2\2]^\5\n"+
		"\6\2^_\7\26\2\2_g\3\2\2\2`a\7\25\2\2ab\5\n\6\2bc\t\3\2\2cd\5\n\6\2de\7"+
		"\26\2\2eg\3\2\2\2fR\3\2\2\2fZ\3\2\2\2f`\3\2\2\2gp\3\2\2\2hi\f\4\2\2ij"+
		"\t\2\2\2jo\5\n\6\5kl\f\3\2\2lm\t\3\2\2mo\5\n\6\4nh\3\2\2\2nk\3\2\2\2o"+
		"r\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\13\3\2\2\2rp\3\2\2\2su\b\7\1\2tv\7\30\2"+
		"\2ut\3\2\2\2uv\3\2\2\2vz\3\2\2\2w{\7)\2\2x{\7*\2\2y{\5\24\13\2zw\3\2\2"+
		"\2zx\3\2\2\2zy\3\2\2\2{\u0089\3\2\2\2|}\7\25\2\2}~\5\f\7\2~\177\t\4\2"+
		"\2\177\u0080\5\f\7\2\u0080\u0081\7\26\2\2\u0081\u0089\3\2\2\2\u0082\u0083"+
		"\7\25\2\2\u0083\u0084\5\f\7\2\u0084\u0085\t\3\2\2\u0085\u0086\5\f\7\2"+
		"\u0086\u0087\7\26\2\2\u0087\u0089\3\2\2\2\u0088s\3\2\2\2\u0088|\3\2\2"+
		"\2\u0088\u0082\3\2\2\2\u0089\u0092\3\2\2\2\u008a\u008b\f\4\2\2\u008b\u008c"+
		"\t\4\2\2\u008c\u0091\5\f\7\5\u008d\u008e\f\3\2\2\u008e\u008f\t\3\2\2\u008f"+
		"\u0091\5\f\7\4\u0090\u008a\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0098\b\b\1\2\u0096\u0099\7(\2\2\u0097\u0099\5\24\13\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u00bd\3\2\2\2\u009a\u009c"+
		"\7\30\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a1\3\2\2\2"+
		"\u009d\u00a2\7)\2\2\u009e\u00a2\7*\2\2\u009f\u00a2\7+\2\2\u00a0\u00a2"+
		"\5\24\13\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2"+
		"\u00a1\u00a0\3\2\2\2\u00a2\u00bd\3\2\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5"+
		"\7%\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7\26\2\2\u00a7\u00bd\3\2\2\2"+
		"\u00a8\u00a9\7%\2\2\u00a9\u00bd\5\16\b\t\u00aa\u00ab\7\25\2\2\u00ab\u00ac"+
		"\5\16\b\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\7\26\2"+
		"\2\u00af\u00bd\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\5\16\b\2\u00b2"+
		"\u00b3\t\5\2\2\u00b3\u00b4\5\16\b\2\u00b4\u00b5\7\26\2\2\u00b5\u00bd\3"+
		"\2\2\2\u00b6\u00b7\7\25\2\2\u00b7\u00b8\5\16\b\2\u00b8\u00b9\t\6\2\2\u00b9"+
		"\u00ba\5\16\b\2\u00ba\u00bb\7\26\2\2\u00bb\u00bd\3\2\2\2\u00bc\u0095\3"+
		"\2\2\2\u00bc\u009b\3\2\2\2\u00bc\u00a3\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc"+
		"\u00aa\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bd\u00ca\3\2"+
		"\2\2\u00be\u00bf\f\5\2\2\u00bf\u00c0\5\20\t\2\u00c0\u00c1\5\16\b\6\u00c1"+
		"\u00c9\3\2\2\2\u00c2\u00c3\f\4\2\2\u00c3\u00c4\t\5\2\2\u00c4\u00c9\5\16"+
		"\b\5\u00c5\u00c6\f\3\2\2\u00c6\u00c7\t\6\2\2\u00c7\u00c9\5\16\b\4\u00c8"+
		"\u00be\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\17\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00ce\t\7\2\2\u00ce\21\3\2\2\2\u00cf\u00d2\b\n\1\2\u00d0"+
		"\u00d3\7+\2\2\u00d1\u00d3\5\24\13\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3"+
		"\2\2\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\f\3\2\2\u00d5\u00d6\7\27\2\2\u00d6"+
		"\u00d8\5\22\n\4\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\23\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00de\t\b\2\2\u00dd\u00df\5\26\f\2\u00de\u00dd\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\25\3\2\2\2\u00e0\u00e1\7\23\2\2\u00e1\u00e2\7*\2\2\u00e2"+
		"\u00e5\7\24\2\2\u00e3\u00e4\7\20\2\2\u00e4\u00e6\7,\2\2\u00e5\u00e3\3"+
		"\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f5\3\2\2\2\u00e7\u00ee\7\25\2\2\u00e8"+
		"\u00ea\5\4\3\2\u00e9\u00eb\7&\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e8\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f5\7\26\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f5\7,\2\2\u00f4"+
		"\u00e0\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\27\3\2\2"+
		"\2\u00f6\u00fc\7,\2\2\u00f7\u00f8\7\23\2\2\u00f8\u00f9\7*\2\2\u00f9\u00fb"+
		"\7\24\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u010b\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100"+
		"\7\17\2\2\u0100\u0105\5\30\r\2\u0101\u0102\7&\2\2\u0102\u0104\5\30\r\2"+
		"\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\'\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u00f6\3\2\2\2\u010a\u00ff\3\2\2\2\u010b\31\3\2\2"+
		"\2\u010c\u010d\7\4\2\2\u010d\u010e\7,\2\2\u010e\u0110\7\21\2\2\u010f\u0111"+
		"\5\30\r\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\22\2\2\u0115\33"+
		"\3\2\2\2\u0116\u0117\b\17\1\2\u0117\u011e\7,\2\2\u0118\u0119\7\23\2\2"+
		"\u0119\u011a\5\n\6\2\u011a\u011b\7\24\2\2\u011b\u011d\3\2\2\2\u011c\u0118"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0123\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\20\2\2\u0122\u0124\7"+
		",\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0130\3\2\2\2\u0125"+
		"\u0126\f\3\2\2\u0126\u0128\7\36\2\2\u0127\u0129\5\4\3\2\u0128\u0127\3"+
		"\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\7\'\2\2\u012d\u012f\3\2\2\2\u012e\u0125\3\2"+
		"\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\35\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\b\20\1\2\u0134\u013b\7,\2"+
		"\2\u0135\u0136\7\23\2\2\u0136\u0137\5\n\6\2\u0137\u0138\7\24\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u0140\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7\20\2\2\u013f\u0141\7,\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0147\3\2\2\2\u0142\u0143\f\3\2\2\u0143\u0144\7\36\2\2\u0144"+
		"\u0146\5\4\3\2\u0145\u0142\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2"+
		"\2\2\u0147\u0148\3\2\2\2\u0148\37\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b"+
		"\7\5\2\2\u014b\u014c\5\16\b\2\u014c\u014d\7\6\2\2\u014d\u0150\5\b\5\2"+
		"\u014e\u014f\7\7\2\2\u014f\u0151\5\b\5\2\u0150\u014e\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151!\3\2\2\2\u0152\u0153\7\b\2\2\u0153\u0154\5\16\b\2\u0154"+
		"\u0155\5\b\5\2\u0155#\3\2\2\2\u0156\u0157\7\t\2\2\u0157\u0158\5\36\20"+
		"\2\u0158\u0159\t\t\2\2\u0159\u015c\7*\2\2\u015a\u015b\7\f\2\2\u015b\u015d"+
		"\7*\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\5\b\5\2\u015f%\3\2\2\2\u0160\u0162\7\r\2\2\u0161\u0163\5\4\3\2"+
		"\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\7\'\2\2\u0165\'\3\2\2\2\u0166\u0167\5\4\3\2\u0167\u0168\7\'\2\2\u0168"+
		")\3\2\2\2\u0169\u016d\7\21\2\2\u016a\u016c\5\b\5\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170"+
		"\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\22\2\2\u0171+\3\2\2\2\u0172"+
		"\u0173\7\'\2\2\u0173-\3\2\2\2\u0174\u0175\7\17\2\2\u0175\u0176\7,\2\2"+
		"\u0176\u0181\7\25\2\2\u0177\u0179\7\17\2\2\u0178\u017a\7\16\2\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\7,"+
		"\2\2\u017c\u017e\7&\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u0177\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184"+
		"\u0185\7\26\2\2\u0185\u0187\7\21\2\2\u0186\u0188\5\b\5\2\u0187\u0186\3"+
		"\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\22\2\2\u018c/\3\2\2\2\61\63\67@DPTXfnpuz"+
		"\u0088\u0090\u0092\u0098\u009b\u00a1\u00bc\u00c8\u00ca\u00d2\u00d9\u00de"+
		"\u00e5\u00ea\u00ee\u00f4\u00fc\u0105\u010a\u0112\u011e\u0123\u012a\u0130"+
		"\u013b\u0140\u0147\u0150\u015c\u0162\u016d\u0179\u017d\u0181\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}