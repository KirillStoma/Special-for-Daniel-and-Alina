// Generated from D:/Programs/IntelliJ IDEA 2019.3.4/proj/ChislaLanguage\ChislaLanguage.g4 by ANTLR 4.8

package compiler.language;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChislaLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAIN=2, FUNCTION=3, RETURN=4, PRINT=5, PRITTY_PRINT=6, BEGIN=7, 
		END=8, SEMICOLON=9, OPAR=10, CPAR=11, OANGLEBR=12, EQOANGLEBR=13, CANGLEBR=14, 
		EQCANGLEBR=15, OBRACKET=16, CBRACKET=17, COLON=18, CONST=19, IF=20, ELSE=21, 
		WHILE=22, FOR=23, CASE=24, DEFAULT=25, NEGATION=26, INCR=27, DECR=28, 
		EQ=29, NEQ=30, IS=31, MOD=32, MUL=33, DIV=34, ADD=35, SUB=36, IN=37, POW=38, 
		ASSIGN=39, INT_TYPE=40, FLOAT_TYPE=41, INT=42, FLOAT=43, ID=44, COMMENT=45, 
		SPACES=46;
	public static final int
		RULE_math = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_expr = 4, 
		RULE_create = 5, RULE_create_int = 6, RULE_create_const_int = 7, RULE_create_float = 8, 
		RULE_create_const_float = 9, RULE_name_object_int = 10, RULE_name_object_float = 11, 
		RULE_if_stat = 12, RULE_condition_block = 13, RULE_stat_block = 14, RULE_while_stat = 15, 
		RULE_for_stat = 16, RULE_condition_for = 17, RULE_condition = 18, RULE_print = 19, 
		RULE_print_expr = 20, RULE_function_call = 21, RULE_param_call = 22, RULE_arg_call = 23, 
		RULE_function = 24, RULE_stat_block_with_return = 25, RULE_return_id = 26, 
		RULE_param = 27, RULE_arg = 28, RULE_type = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"math", "main", "start", "instruction", "expr", "create", "create_int", 
			"create_const_int", "create_float", "create_const_float", "name_object_int", 
			"name_object_float", "if_stat", "condition_block", "stat_block", "while_stat", 
			"for_stat", "condition_for", "condition", "print", "print_expr", "function_call", 
			"param_call", "arg_call", "function", "stat_block_with_return", "return_id", 
			"param", "arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'main'", "'fun'", "'return'", "'print'", "'<<'", "'begin'", 
			"'end'", "';'", "'('", "')'", "'<'", "'<='", "'>'", "'>='", "'{'", "'}'", 
			"':'", "'const'", "'if'", "'else'", "'while'", "'for'", "'case'", "'default'", 
			"'!'", "'++'", "'--'", "'=='", "'!='", "'is'", "'%'", "'*'", "'/'", "'+'", 
			"'-'", "'in'", "'^'", "'='", "'int'", "'flt'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAIN", "FUNCTION", "RETURN", "PRINT", "PRITTY_PRINT", "BEGIN", 
			"END", "SEMICOLON", "OPAR", "CPAR", "OANGLEBR", "EQOANGLEBR", "CANGLEBR", 
			"EQCANGLEBR", "OBRACKET", "CBRACKET", "COLON", "CONST", "IF", "ELSE", 
			"WHILE", "FOR", "CASE", "DEFAULT", "NEGATION", "INCR", "DECR", "EQ", 
			"NEQ", "IS", "MOD", "MUL", "DIV", "ADD", "SUB", "IN", "POW", "ASSIGN", 
			"INT_TYPE", "FLOAT_TYPE", "INT", "FLOAT", "ID", "COMMENT", "SPACES"
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
	public String getGrammarFileName() { return "ChislaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChislaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MathContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ChislaLanguageParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << INT_TYPE) | (1L << FLOAT_TYPE))) != 0)) {
				{
				{
				setState(60);
				create();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(66);
				function();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(73);
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
		public TerminalNode MAIN() { return getToken(ChislaLanguageParser.MAIN, 0); }
		public TerminalNode BEGIN() { return getToken(ChislaLanguageParser.BEGIN, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode END() { return getToken(ChislaLanguageParser.END, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(MAIN);
			setState(76);
			match(BEGIN);
			setState(77);
			start();
			setState(78);
			match(END);
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

	public static class StartContext extends ParserRuleContext {
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
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << OPAR) | (1L << CONST) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << ADD) | (1L << SUB) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				instruction();
				}
				}
				setState(85);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				for_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				function_call();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ChislaLanguageParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(ChislaLanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ChislaLanguageParser.DIV, 0); }
		public ModMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterModMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitModMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitModMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatExprContext extends ExprContext {
		public Name_object_floatContext name_object_float() {
			return getRuleContext(Name_object_floatContext.class,0);
		}
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public PrimContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ChislaLanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ChislaLanguageParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExrpContext extends ExprContext {
		public Name_object_intContext name_object_int() {
			return getRuleContext(Name_object_intContext.class,0);
		}
		public IntExrpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterIntExrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitIntExrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitIntExrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConversionContext extends ExprContext {
		public Token tp;
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(ChislaLanguageParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ChislaLanguageParser.FLOAT_TYPE, 0); }
		public TypeConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ChislaLanguageParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ChislaLanguageParser.SUB, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(ChislaLanguageParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ChislaLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ChislaLanguageParser.SEMICOLON, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(OPAR);
				setState(97);
				((TypeConversionContext)_localctx).tp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
					((TypeConversionContext)_localctx).tp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				match(CPAR);
				setState(99);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				setState(101);
				match(OPAR);
				setState(102);
				expr(0);
				setState(103);
				match(CPAR);
				}
				break;
			case 3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				expr(7);
				}
				break;
			case 4:
				{
				_localctx = new PrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(OPAR);
				setState(108);
				expr(0);
				setState(109);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntExrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				name_object_int();
				}
				break;
			case 7:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				name_object_float();
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ID);
				setState(115);
				match(ASSIGN);
				setState(116);
				expr(0);
				setState(117);
				match(SEMICOLON);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ModMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						((ModMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((ModMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(123);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(125);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						match(POW);
						setState(129);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class CreateContext extends ParserRuleContext {
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext create_const_int() {
			return getRuleContext(Create_const_intContext.class,0);
		}
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext create_const_float() {
			return getRuleContext(Create_const_floatContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				create_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				create_const_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				create_float();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				create_const_float();
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

	public static class Create_intContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(ChislaLanguageParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ChislaLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ChislaLanguageParser.SEMICOLON, 0); }
		public Create_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCreate_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCreate_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCreate_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_intContext create_int() throws RecognitionException {
		Create_intContext _localctx = new Create_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(INT_TYPE);
			setState(142);
			match(ID);
			setState(143);
			match(ASSIGN);
			setState(144);
			expr(0);
			setState(145);
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

	public static class Create_const_intContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ChislaLanguageParser.CONST, 0); }
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCreate_const_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCreate_const_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCreate_const_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_intContext create_const_int() throws RecognitionException {
		Create_const_intContext _localctx = new Create_const_intContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_const_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(CONST);
			setState(148);
			create_int();
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

	public static class Create_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(ChislaLanguageParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ChislaLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ChislaLanguageParser.SEMICOLON, 0); }
		public Create_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCreate_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCreate_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCreate_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_floatContext create_float() throws RecognitionException {
		Create_floatContext _localctx = new Create_floatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(FLOAT_TYPE);
			setState(151);
			match(ID);
			setState(152);
			match(ASSIGN);
			setState(153);
			expr(0);
			setState(154);
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

	public static class Create_const_floatContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ChislaLanguageParser.CONST, 0); }
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCreate_const_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCreate_const_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCreate_const_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_floatContext create_const_float() throws RecognitionException {
		Create_const_floatContext _localctx = new Create_const_floatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_const_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(CONST);
			setState(157);
			create_float();
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

	public static class Name_object_intContext extends ParserRuleContext {
		public Name_object_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_int; }
	 
		public Name_object_intContext() { }
		public void copyFrom(Name_object_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectIntContext extends Name_object_intContext {
		public TerminalNode INT() { return getToken(ChislaLanguageParser.INT, 0); }
		public NameObjectIntContext(Name_object_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterNameObjectInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitNameObjectInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitNameObjectInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_intContext name_object_int() throws RecognitionException {
		Name_object_intContext _localctx = new Name_object_intContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_int);
		try {
			_localctx = new NameObjectIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(INT);
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

	public static class Name_object_floatContext extends ParserRuleContext {
		public Name_object_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_float; }
	 
		public Name_object_floatContext() { }
		public void copyFrom(Name_object_floatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectFloatContext extends Name_object_floatContext {
		public TerminalNode FLOAT() { return getToken(ChislaLanguageParser.FLOAT, 0); }
		public NameObjectFloatContext(Name_object_floatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterNameObjectFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitNameObjectFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitNameObjectFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_floatContext name_object_float() throws RecognitionException {
		Name_object_floatContext _localctx = new Name_object_floatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_object_float);
		try {
			_localctx = new NameObjectFloatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(FLOAT);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(ChislaLanguageParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ChislaLanguageParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(ChislaLanguageParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ChislaLanguageParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IF);
			setState(164);
			condition_block();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(ELSE);
					setState(166);
					match(IF);
					setState(167);
					condition_block();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(173);
				match(ELSE);
				setState(174);
				stat_block();
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(ChislaLanguageParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(OPAR);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(178);
				match(NEGATION);
				}
			}

			setState(181);
			condition();
			setState(182);
			match(CPAR);
			setState(183);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ChislaLanguageParser.BEGIN, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode END() { return getToken(ChislaLanguageParser.END, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(BEGIN);
			setState(186);
			start();
			setState(187);
			match(END);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ChislaLanguageParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE);
			setState(190);
			condition_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ChislaLanguageParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public Condition_forContext condition_for() {
			return getRuleContext(Condition_forContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FOR);
			setState(193);
			match(OPAR);
			setState(194);
			condition_for();
			setState(195);
			match(CPAR);
			setState(196);
			stat_block();
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

	public static class Condition_forContext extends ParserRuleContext {
		public Condition_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for; }
	 
		public Condition_forContext() { }
		public void copyFrom(Condition_forContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondContext extends Condition_forContext {
		public Token oper;
		public List<TerminalNode> ID() { return getTokens(ChislaLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ChislaLanguageParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(ChislaLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ChislaLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ChislaLanguageParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(ChislaLanguageParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(ChislaLanguageParser.DECR, 0); }
		public ForCondContext(Condition_forContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitForCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_forContext condition_for() throws RecognitionException {
		Condition_forContext _localctx = new Condition_forContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_for);
		int _la;
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ID);
			setState(199);
			match(ASSIGN);
			setState(200);
			expr(0);
			setState(201);
			match(SEMICOLON);
			setState(202);
			condition();
			setState(203);
			match(SEMICOLON);
			setState(204);
			match(ID);
			setState(205);
			((ForCondContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
				((ForCondContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public TerminalNode IS() { return getToken(ChislaLanguageParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ChislaLanguageParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ChislaLanguageParser.NEQ, 0); }
		public TerminalNode OANGLEBR() { return getToken(ChislaLanguageParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(ChislaLanguageParser.CANGLEBR, 0); }
		public TerminalNode EQOANGLEBR() { return getToken(ChislaLanguageParser.EQOANGLEBR, 0); }
		public TerminalNode EQCANGLEBR() { return getToken(ChislaLanguageParser.EQCANGLEBR, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(ID);
				setState(208);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OANGLEBR) | (1L << EQOANGLEBR) | (1L << CANGLEBR) | (1L << EQCANGLEBR) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(209);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ID);
				setState(211);
				match(IS);
				setState(212);
				type();
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
		public TerminalNode PRINT() { return getToken(ChislaLanguageParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ChislaLanguageParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(PRINT);
			setState(216);
			print_expr();
			setState(217);
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pretty_printContext extends Print_exprContext {
		public TerminalNode PRITTY_PRINT() { return getToken(ChislaLanguageParser.PRITTY_PRINT, 0); }
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public Pretty_printContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPretty_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPretty_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPretty_print(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_exprContext {
		public TerminalNode INT() { return getToken(ChislaLanguageParser.INT, 0); }
		public PrintIntContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPrintInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPrintInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFloatContext extends Print_exprContext {
		public TerminalNode FLOAT() { return getToken(ChislaLanguageParser.FLOAT, 0); }
		public PrintFloatContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterPrintFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitPrintFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitPrintFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_expr);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(ID);
				}
				break;
			case INT:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new PrintFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(FLOAT);
				}
				break;
			case PRITTY_PRINT:
				_localctx = new Pretty_printContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				match(PRITTY_PRINT);
				setState(223);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ChislaLanguageParser.SEMICOLON, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(ID);
			setState(227);
			param_call();
			setState(228);
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(OPAR);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(231);
				arg_call();
				}
			}

			setState(234);
			match(CPAR);
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterParamCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitParamCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterParamCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitParamCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arg_call);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ID);
				setState(238);
				match(T__0);
				setState(239);
				arg_call();
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
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(ChislaLanguageParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(ChislaLanguageParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(FUNCTION);
				setState(243);
				match(ID);
				setState(244);
				param();
				setState(245);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(FUNCTION);
				setState(248);
				type();
				setState(249);
				match(ID);
				setState(250);
				param();
				setState(251);
				stat_block_with_return();
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ChislaLanguageParser.BEGIN, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode END() { return getToken(ChislaLanguageParser.END, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterStat_block_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitStat_block_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(BEGIN);
			setState(256);
			start();
			setState(257);
			return_id();
			setState(258);
			match(END);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ChislaLanguageParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ChislaLanguageParser.SEMICOLON, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterReturn_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitReturn_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(RETURN);
			setState(261);
			match(ID);
			setState(262);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(ChislaLanguageParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(ChislaLanguageParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(OPAR);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(265);
				arg();
				}
			}

			setState(268);
			match(CPAR);
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
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterParamArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitParamArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ChislaLanguageParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterParamArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitParamArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arg);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				type();
				setState(271);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				type();
				setState(274);
				match(ID);
				setState(275);
				match(T__0);
				setState(276);
				arg();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(ChislaLanguageParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ChislaLanguageParser.FLOAT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChislaLanguageListener ) ((ChislaLanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChislaLanguageVisitor ) return ((ChislaLanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u011d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"`\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u0085\n\6\f\6\16\6\u0088\13\6\3\7\3\7\3\7\3\7\5\7\u008e\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00ab\n\16\f\16"+
		"\16\16\u00ae\13\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\5\17\u00b6\n\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00d8\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00e3\n\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00eb\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00f3\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0100\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u010d\n\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0119\n\36\3\37\3\37\3\37\2\3\n \2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\7\3\2"+
		"*+\3\2%&\3\2\"$\3\2\35\36\4\2\16\21\37 \2\u0120\2A\3\2\2\2\4M\3\2\2\2"+
		"\6U\3\2\2\2\b_\3\2\2\2\ny\3\2\2\2\f\u008d\3\2\2\2\16\u008f\3\2\2\2\20"+
		"\u0095\3\2\2\2\22\u0098\3\2\2\2\24\u009e\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3"+
		"\3\2\2\2\32\u00a5\3\2\2\2\34\u00b3\3\2\2\2\36\u00bb\3\2\2\2 \u00bf\3\2"+
		"\2\2\"\u00c2\3\2\2\2$\u00c8\3\2\2\2&\u00d7\3\2\2\2(\u00d9\3\2\2\2*\u00e2"+
		"\3\2\2\2,\u00e4\3\2\2\2.\u00e8\3\2\2\2\60\u00f2\3\2\2\2\62\u00ff\3\2\2"+
		"\2\64\u0101\3\2\2\2\66\u0106\3\2\2\28\u010a\3\2\2\2:\u0118\3\2\2\2<\u011a"+
		"\3\2\2\2>@\5\f\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2C"+
		"A\3\2\2\2DF\5\62\32\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2"+
		"\2IG\3\2\2\2JK\5\4\3\2KL\7\2\2\3L\3\3\2\2\2MN\7\4\2\2NO\7\t\2\2OP\5\6"+
		"\4\2PQ\7\n\2\2Q\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3"+
		"\2\2\2V\7\3\2\2\2WU\3\2\2\2X`\5\f\7\2Y`\5\n\6\2Z`\5(\25\2[`\5\32\16\2"+
		"\\`\5 \21\2]`\5\"\22\2^`\5,\27\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2"+
		"\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\b\6\1\2bc\7\f\2\2cd\t\2"+
		"\2\2de\7\r\2\2ez\5\n\6\ffg\7.\2\2gh\7\f\2\2hi\5\n\6\2ij\7\r\2\2jz\3\2"+
		"\2\2kl\t\3\2\2lz\5\n\6\tmn\7\f\2\2no\5\n\6\2op\7\r\2\2pz\3\2\2\2qz\7."+
		"\2\2rz\5\26\f\2sz\5\30\r\2tu\7.\2\2uv\7)\2\2vw\5\n\6\2wx\7\13\2\2xz\3"+
		"\2\2\2ya\3\2\2\2yf\3\2\2\2yk\3\2\2\2ym\3\2\2\2yq\3\2\2\2yr\3\2\2\2ys\3"+
		"\2\2\2yt\3\2\2\2z\u0086\3\2\2\2{|\f\r\2\2|}\t\4\2\2}\u0085\5\n\6\16~\177"+
		"\f\13\2\2\177\u0080\t\3\2\2\u0080\u0085\5\n\6\f\u0081\u0082\f\4\2\2\u0082"+
		"\u0083\7(\2\2\u0083\u0085\5\n\6\5\u0084{\3\2\2\2\u0084~\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\13\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008e\5\16\b\2\u008a\u008e"+
		"\5\20\t\2\u008b\u008e\5\22\n\2\u008c\u008e\5\24\13\2\u008d\u0089\3\2\2"+
		"\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\r"+
		"\3\2\2\2\u008f\u0090\7*\2\2\u0090\u0091\7.\2\2\u0091\u0092\7)\2\2\u0092"+
		"\u0093\5\n\6\2\u0093\u0094\7\13\2\2\u0094\17\3\2\2\2\u0095\u0096\7\25"+
		"\2\2\u0096\u0097\5\16\b\2\u0097\21\3\2\2\2\u0098\u0099\7+\2\2\u0099\u009a"+
		"\7.\2\2\u009a\u009b\7)\2\2\u009b\u009c\5\n\6\2\u009c\u009d\7\13\2\2\u009d"+
		"\23\3\2\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\5\22\n\2\u00a0\25\3\2\2\2"+
		"\u00a1\u00a2\7,\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4\31\3\2\2"+
		"\2\u00a5\u00a6\7\26\2\2\u00a6\u00ac\5\34\17\2\u00a7\u00a8\7\27\2\2\u00a8"+
		"\u00a9\7\26\2\2\u00a9\u00ab\5\34\17\2\u00aa\u00a7\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7\27\2\2\u00b0\u00b2\5\36\20\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b5\7\f\2\2\u00b4"+
		"\u00b6\7\34\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\5&\24\2\u00b8\u00b9\7\r\2\2\u00b9\u00ba\5\36\20\2\u00ba"+
		"\35\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\7\n\2"+
		"\2\u00be\37\3\2\2\2\u00bf\u00c0\7\30\2\2\u00c0\u00c1\5\34\17\2\u00c1!"+
		"\3\2\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\5$\23\2"+
		"\u00c5\u00c6\7\r\2\2\u00c6\u00c7\5\36\20\2\u00c7#\3\2\2\2\u00c8\u00c9"+
		"\7.\2\2\u00c9\u00ca\7)\2\2\u00ca\u00cb\5\n\6\2\u00cb\u00cc\7\13\2\2\u00cc"+
		"\u00cd\5&\24\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf\7.\2\2\u00cf\u00d0\t\5"+
		"\2\2\u00d0%\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2\u00d3\t\6\2\2\u00d3\u00d8"+
		"\5\n\6\2\u00d4\u00d5\7.\2\2\u00d5\u00d6\7!\2\2\u00d6\u00d8\5<\37\2\u00d7"+
		"\u00d1\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\'\3\2\2\2\u00d9\u00da\7\7\2\2"+
		"\u00da\u00db\5*\26\2\u00db\u00dc\7\13\2\2\u00dc)\3\2\2\2\u00dd\u00e3\7"+
		".\2\2\u00de\u00e3\7,\2\2\u00df\u00e3\7-\2\2\u00e0\u00e1\7\b\2\2\u00e1"+
		"\u00e3\7.\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df\3\2"+
		"\2\2\u00e2\u00e0\3\2\2\2\u00e3+\3\2\2\2\u00e4\u00e5\7.\2\2\u00e5\u00e6"+
		"\5.\30\2\u00e6\u00e7\7\13\2\2\u00e7-\3\2\2\2\u00e8\u00ea\7\f\2\2\u00e9"+
		"\u00eb\5\60\31\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ed\7\r\2\2\u00ed/\3\2\2\2\u00ee\u00f3\7.\2\2\u00ef\u00f0"+
		"\7.\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f3\5\60\31\2\u00f2\u00ee\3\2\2\2"+
		"\u00f2\u00ef\3\2\2\2\u00f3\61\3\2\2\2\u00f4\u00f5\7\5\2\2\u00f5\u00f6"+
		"\7.\2\2\u00f6\u00f7\58\35\2\u00f7\u00f8\5\36\20\2\u00f8\u0100\3\2\2\2"+
		"\u00f9\u00fa\7\5\2\2\u00fa\u00fb\5<\37\2\u00fb\u00fc\7.\2\2\u00fc\u00fd"+
		"\58\35\2\u00fd\u00fe\5\64\33\2\u00fe\u0100\3\2\2\2\u00ff\u00f4\3\2\2\2"+
		"\u00ff\u00f9\3\2\2\2\u0100\63\3\2\2\2\u0101\u0102\7\t\2\2\u0102\u0103"+
		"\5\6\4\2\u0103\u0104\5\66\34\2\u0104\u0105\7\n\2\2\u0105\65\3\2\2\2\u0106"+
		"\u0107\7\6\2\2\u0107\u0108\7.\2\2\u0108\u0109\7\13\2\2\u0109\67\3\2\2"+
		"\2\u010a\u010c\7\f\2\2\u010b\u010d\5:\36\2\u010c\u010b\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\r\2\2\u010f9\3\2\2\2\u0110"+
		"\u0111\5<\37\2\u0111\u0112\7.\2\2\u0112\u0119\3\2\2\2\u0113\u0114\5<\37"+
		"\2\u0114\u0115\7.\2\2\u0115\u0116\7\3\2\2\u0116\u0117\5:\36\2\u0117\u0119"+
		"\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0113\3\2\2\2\u0119;\3\2\2\2\u011a"+
		"\u011b\t\2\2\2\u011b=\3\2\2\2\24AGU_y\u0084\u0086\u008d\u00ac\u00b1\u00b5"+
		"\u00d7\u00e2\u00ea\u00f2\u00ff\u010c\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}