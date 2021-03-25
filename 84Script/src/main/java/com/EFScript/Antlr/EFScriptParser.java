// Generated from EFScript.g4 by ANTLR 4.9.1

package com.efscript.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EFScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN_BRACKET=2, CLOSE_BRACKET=3, OPEN_CURLEY=4, CLOSE_CURLEY=5, 
		END_STMT=6, ADD=7, SUB=8, MUL=9, DIV=10, GREATER_THAN=11, LESS_THAN=12, 
		EQUAL_TO=13, NOT_EQUAL_TO=14, ASSIGN=15, ADDASSIGN=16, SUBASSIGN=17, MULASSIGN=18, 
		DIVASSIGN=19, INCREMENT=20, DECREMENT=21, DEF=22, VAR=23, IF=24, WHILE=25, 
		RETURN=26, TRUE=27, FALSE=28, IDENTIFIER=29, NUMBER=30, PI=31, E=32, QUOTED_TEXT=33, 
		LINECOMMENT=34, BLOCKCOMMENT=35, WHITESPACE=36;
	public static final int
		RULE_script = 0, RULE_code = 1, RULE_function = 2, RULE_statement = 3, 
		RULE_assign_stmt = 4, RULE_add_assign_stmt = 5, RULE_sub_assign_stmt = 6, 
		RULE_mul_assign_stmt = 7, RULE_div_assign_stmt = 8, RULE_inc_stmt = 9, 
		RULE_dec_stmt = 10, RULE_if_stmt = 11, RULE_while_stmt = 12, RULE_var_stmt = 13, 
		RULE_return_stmt = 14, RULE_expression = 15, RULE_boolexpr = 16, RULE_methodcall = 17, 
		RULE_methodparams = 18, RULE_value = 19, RULE_identifier = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "code", "function", "statement", "assign_stmt", "add_assign_stmt", 
			"sub_assign_stmt", "mul_assign_stmt", "div_assign_stmt", "inc_stmt", 
			"dec_stmt", "if_stmt", "while_stmt", "var_stmt", "return_stmt", "expression", 
			"boolexpr", "methodcall", "methodparams", "value", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'++'", "'--'", "'def'", "'var'", "'if'", "'while'", "'return'", "'true'", 
			"'false'", null, null, "'pi'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
			"DIVASSIGN", "INCREMENT", "DECREMENT", "DEF", "VAR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "QUOTED_TEXT", "LINECOMMENT", 
			"BLOCKCOMMENT", "WHITESPACE"
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
	public String getGrammarFileName() { return "EFScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EFScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode EOF() { return getToken(EFScriptParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << OPEN_CURLEY) | (1L << END_STMT) | (1L << DEF) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << QUOTED_TEXT))) != 0)) {
					{
					{
					setState(42);
					code();
					}
					}
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(EOF);
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

	public static class CodeContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				function();
				}
				break;
			case OPEN_BRACKET:
			case OPEN_CURLEY:
			case END_STMT:
			case VAR:
			case IF:
			case WHILE:
			case RETURN:
			case IDENTIFIER:
			case NUMBER:
			case QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				statement();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(EFScriptParser.DEF, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(EFScriptParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(EFScriptParser.CLOSE_BRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(DEF);
			setState(56);
			identifier();
			setState(57);
			match(OPEN_BRACKET);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(58);
				identifier();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(64);
				match(T__0);
				setState(65);
				identifier();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(CLOSE_BRACKET);
			setState(72);
			statement();
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
		public TerminalNode OPEN_CURLEY() { return getToken(EFScriptParser.OPEN_CURLEY, 0); }
		public TerminalNode CLOSE_CURLEY() { return getToken(EFScriptParser.CLOSE_CURLEY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Add_assign_stmtContext add_assign_stmt() {
			return getRuleContext(Add_assign_stmtContext.class,0);
		}
		public Sub_assign_stmtContext sub_assign_stmt() {
			return getRuleContext(Sub_assign_stmtContext.class,0);
		}
		public Mul_assign_stmtContext mul_assign_stmt() {
			return getRuleContext(Mul_assign_stmtContext.class,0);
		}
		public Div_assign_stmtContext div_assign_stmt() {
			return getRuleContext(Div_assign_stmtContext.class,0);
		}
		public Inc_stmtContext inc_stmt() {
			return getRuleContext(Inc_stmtContext.class,0);
		}
		public Dec_stmtContext dec_stmt() {
			return getRuleContext(Dec_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(OPEN_CURLEY);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << OPEN_CURLEY) | (1L << END_STMT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << QUOTED_TEXT))) != 0)) {
					{
					{
					setState(75);
					statement();
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(CLOSE_CURLEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				assign_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				add_assign_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				sub_assign_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				mul_assign_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				div_assign_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				inc_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				dec_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				if_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				while_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				var_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
				return_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(93);
				expression();
				setState(94);
				match(END_STMT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(96);
				match(END_STMT);
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EFScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			identifier();
			setState(100);
			match(ASSIGN);
			setState(101);
			expression();
			setState(102);
			match(END_STMT);
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

	public static class Add_assign_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADDASSIGN() { return getToken(EFScriptParser.ADDASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Add_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterAdd_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitAdd_assign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitAdd_assign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_assign_stmtContext add_assign_stmt() throws RecognitionException {
		Add_assign_stmtContext _localctx = new Add_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			identifier();
			setState(105);
			match(ADDASSIGN);
			setState(106);
			value();
			setState(107);
			match(END_STMT);
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

	public static class Sub_assign_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SUBASSIGN() { return getToken(EFScriptParser.SUBASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Sub_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterSub_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitSub_assign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitSub_assign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_assign_stmtContext sub_assign_stmt() throws RecognitionException {
		Sub_assign_stmtContext _localctx = new Sub_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			identifier();
			setState(110);
			match(SUBASSIGN);
			setState(111);
			value();
			setState(112);
			match(END_STMT);
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

	public static class Mul_assign_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MULASSIGN() { return getToken(EFScriptParser.MULASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Mul_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterMul_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitMul_assign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitMul_assign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_assign_stmtContext mul_assign_stmt() throws RecognitionException {
		Mul_assign_stmtContext _localctx = new Mul_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mul_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			identifier();
			setState(115);
			match(MULASSIGN);
			setState(116);
			value();
			setState(117);
			match(END_STMT);
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

	public static class Div_assign_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DIVASSIGN() { return getToken(EFScriptParser.DIVASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Div_assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterDiv_assign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitDiv_assign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitDiv_assign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_assign_stmtContext div_assign_stmt() throws RecognitionException {
		Div_assign_stmtContext _localctx = new Div_assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_div_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			identifier();
			setState(120);
			match(DIVASSIGN);
			setState(121);
			value();
			setState(122);
			match(END_STMT);
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

	public static class Inc_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(EFScriptParser.INCREMENT, 0); }
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Inc_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterInc_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitInc_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitInc_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inc_stmtContext inc_stmt() throws RecognitionException {
		Inc_stmtContext _localctx = new Inc_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			identifier();
			setState(125);
			match(INCREMENT);
			setState(126);
			match(END_STMT);
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

	public static class Dec_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(EFScriptParser.DECREMENT, 0); }
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Dec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterDec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitDec_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitDec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_stmtContext dec_stmt() throws RecognitionException {
		Dec_stmtContext _localctx = new Dec_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dec_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			identifier();
			setState(129);
			match(DECREMENT);
			setState(130);
			match(END_STMT);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EFScriptParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(EFScriptParser.OPEN_BRACKET, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EFScriptParser.CLOSE_BRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(IF);
			setState(133);
			match(OPEN_BRACKET);
			setState(134);
			boolexpr();
			setState(135);
			match(CLOSE_BRACKET);
			setState(136);
			statement();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EFScriptParser.WHILE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(EFScriptParser.OPEN_BRACKET, 0); }
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EFScriptParser.CLOSE_BRACKET, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(WHILE);
			setState(139);
			match(OPEN_BRACKET);
			setState(140);
			boolexpr();
			setState(141);
			match(CLOSE_BRACKET);
			setState(142);
			statement();
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

	public static class Var_stmtContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(EFScriptParser.VAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EFScriptParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterVar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitVar_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitVar_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(VAR);
			setState(145);
			identifier();
			setState(146);
			match(ASSIGN);
			setState(147);
			expression();
			setState(148);
			match(END_STMT);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(EFScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END_STMT() { return getToken(EFScriptParser.END_STMT, 0); }
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(RETURN);
			setState(151);
			expression();
			setState(152);
			match(END_STMT);
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
		public TerminalNode OPEN_BRACKET() { return getToken(EFScriptParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EFScriptParser.CLOSE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode ADD() { return getToken(EFScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(EFScriptParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(EFScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(EFScriptParser.DIV, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(EFScriptParser.NUMBER, 0); }
		public TerminalNode QUOTED_TEXT() { return getToken(EFScriptParser.QUOTED_TEXT, 0); }
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(OPEN_BRACKET);
				setState(155);
				expression();
				setState(156);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				value();
				setState(159);
				match(ADD);
				setState(160);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				value();
				setState(163);
				match(SUB);
				setState(164);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				value();
				setState(167);
				match(MUL);
				setState(168);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				value();
				setState(171);
				match(DIV);
				setState(172);
				value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175);
				match(NUMBER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(176);
				match(QUOTED_TEXT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				methodcall();
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

	public static class BoolexprContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(EFScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EFScriptParser.FALSE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(EFScriptParser.GREATER_THAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(EFScriptParser.LESS_THAN, 0); }
		public TerminalNode EQUAL_TO() { return getToken(EFScriptParser.EQUAL_TO, 0); }
		public TerminalNode NOT_EQUAL_TO() { return getToken(EFScriptParser.NOT_EQUAL_TO, 0); }
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitBoolexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolexpr);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				identifier();
				setState(184);
				match(GREATER_THAN);
				setState(185);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				identifier();
				setState(188);
				match(LESS_THAN);
				setState(189);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				identifier();
				setState(192);
				match(EQUAL_TO);
				setState(193);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				identifier();
				setState(196);
				match(NOT_EQUAL_TO);
				setState(197);
				expression();
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

	public static class MethodcallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(EFScriptParser.OPEN_BRACKET, 0); }
		public MethodparamsContext methodparams() {
			return getRuleContext(MethodparamsContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(EFScriptParser.CLOSE_BRACKET, 0); }
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			identifier();
			setState(202);
			match(OPEN_BRACKET);
			setState(203);
			methodparams();
			setState(204);
			match(CLOSE_BRACKET);
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

	public static class MethodparamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MethodparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterMethodparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitMethodparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitMethodparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodparamsContext methodparams() throws RecognitionException {
		MethodparamsContext _localctx = new MethodparamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expression();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(207);
				match(T__0);
				setState(208);
				expression();
				}
				}
				setState(213);
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

	public static class ValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(EFScriptParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(NUMBER);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EFScriptParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\5\2\64\n\2\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13"+
		"\4\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\4\3\5\3\5\7\5O\n\5\f\5\16"+
		"\5R\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5d\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u00b5\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00ca\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00d4\n\24\f"+
		"\24\16\24\u00d7\13\24\3\25\3\25\5\25\u00db\n\25\3\26\3\26\3\26\2\2\27"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00ec\2\63\3\2\2"+
		"\2\4\67\3\2\2\2\69\3\2\2\2\bc\3\2\2\2\ne\3\2\2\2\fj\3\2\2\2\16o\3\2\2"+
		"\2\20t\3\2\2\2\22y\3\2\2\2\24~\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2"+
		"\2\32\u008c\3\2\2\2\34\u0092\3\2\2\2\36\u0098\3\2\2\2 \u00b4\3\2\2\2\""+
		"\u00c9\3\2\2\2$\u00cb\3\2\2\2&\u00d0\3\2\2\2(\u00da\3\2\2\2*\u00dc\3\2"+
		"\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\64\3\2\2"+
		"\2\61/\3\2\2\2\62\64\7\2\2\3\63/\3\2\2\2\63\62\3\2\2\2\64\3\3\2\2\2\65"+
		"8\5\6\4\2\668\5\b\5\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\30\2"+
		"\2:;\5*\26\2;?\7\4\2\2<>\5*\26\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2"+
		"\2@F\3\2\2\2A?\3\2\2\2BC\7\3\2\2CE\5*\26\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\5\2\2JK\5\b\5\2K\7\3\2\2\2LP\7\6"+
		"\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2"+
		"\2\2Sd\7\7\2\2Td\5\n\6\2Ud\5\f\7\2Vd\5\16\b\2Wd\5\20\t\2Xd\5\22\n\2Yd"+
		"\5\24\13\2Zd\5\26\f\2[d\5\30\r\2\\d\5\32\16\2]d\5\34\17\2^d\5\36\20\2"+
		"_`\5 \21\2`a\7\b\2\2ad\3\2\2\2bd\7\b\2\2cL\3\2\2\2cT\3\2\2\2cU\3\2\2\2"+
		"cV\3\2\2\2cW\3\2\2\2cX\3\2\2\2cY\3\2\2\2cZ\3\2\2\2c[\3\2\2\2c\\\3\2\2"+
		"\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2cb\3\2\2\2d\t\3\2\2\2ef\5*\26\2fg\7\21"+
		"\2\2gh\5 \21\2hi\7\b\2\2i\13\3\2\2\2jk\5*\26\2kl\7\22\2\2lm\5(\25\2mn"+
		"\7\b\2\2n\r\3\2\2\2op\5*\26\2pq\7\23\2\2qr\5(\25\2rs\7\b\2\2s\17\3\2\2"+
		"\2tu\5*\26\2uv\7\24\2\2vw\5(\25\2wx\7\b\2\2x\21\3\2\2\2yz\5*\26\2z{\7"+
		"\25\2\2{|\5(\25\2|}\7\b\2\2}\23\3\2\2\2~\177\5*\26\2\177\u0080\7\26\2"+
		"\2\u0080\u0081\7\b\2\2\u0081\25\3\2\2\2\u0082\u0083\5*\26\2\u0083\u0084"+
		"\7\27\2\2\u0084\u0085\7\b\2\2\u0085\27\3\2\2\2\u0086\u0087\7\32\2\2\u0087"+
		"\u0088\7\4\2\2\u0088\u0089\5\"\22\2\u0089\u008a\7\5\2\2\u008a\u008b\5"+
		"\b\5\2\u008b\31\3\2\2\2\u008c\u008d\7\33\2\2\u008d\u008e\7\4\2\2\u008e"+
		"\u008f\5\"\22\2\u008f\u0090\7\5\2\2\u0090\u0091\5\b\5\2\u0091\33\3\2\2"+
		"\2\u0092\u0093\7\31\2\2\u0093\u0094\5*\26\2\u0094\u0095\7\21\2\2\u0095"+
		"\u0096\5 \21\2\u0096\u0097\7\b\2\2\u0097\35\3\2\2\2\u0098\u0099\7\34\2"+
		"\2\u0099\u009a\5 \21\2\u009a\u009b\7\b\2\2\u009b\37\3\2\2\2\u009c\u009d"+
		"\7\4\2\2\u009d\u009e\5 \21\2\u009e\u009f\7\5\2\2\u009f\u00b5\3\2\2\2\u00a0"+
		"\u00a1\5(\25\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\5(\25\2\u00a3\u00b5\3\2"+
		"\2\2\u00a4\u00a5\5(\25\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7\5(\25\2\u00a7"+
		"\u00b5\3\2\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\5"+
		"(\25\2\u00ab\u00b5\3\2\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\7\f\2\2\u00ae"+
		"\u00af\5(\25\2\u00af\u00b5\3\2\2\2\u00b0\u00b5\5*\26\2\u00b1\u00b5\7 "+
		"\2\2\u00b2\u00b5\7#\2\2\u00b3\u00b5\5$\23\2\u00b4\u009c\3\2\2\2\u00b4"+
		"\u00a0\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00ac\3\2"+
		"\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00ca\5*\26\2\u00b7\u00ca\7\35\2\2"+
		"\u00b8\u00ca\7\36\2\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\7\r\2\2\u00bb\u00bc"+
		"\5 \21\2\u00bc\u00ca\3\2\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7\16\2\2"+
		"\u00bf\u00c0\5 \21\2\u00c0\u00ca\3\2\2\2\u00c1\u00c2\5*\26\2\u00c2\u00c3"+
		"\7\17\2\2\u00c3\u00c4\5 \21\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6\5*\26\2"+
		"\u00c6\u00c7\7\20\2\2\u00c7\u00c8\5 \21\2\u00c8\u00ca\3\2\2\2\u00c9\u00b6"+
		"\3\2\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00b8\3\2\2\2\u00c9\u00b9\3\2\2\2\u00c9"+
		"\u00bd\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca#\3\2\2\2"+
		"\u00cb\u00cc\5*\26\2\u00cc\u00cd\7\4\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf"+
		"\7\5\2\2\u00cf%\3\2\2\2\u00d0\u00d5\5 \21\2\u00d1\u00d2\7\3\2\2\u00d2"+
		"\u00d4\5 \21\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\'\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db"+
		"\5*\26\2\u00d9\u00db\7 \2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		")\3\2\2\2\u00dc\u00dd\7\37\2\2\u00dd+\3\2\2\2\r/\63\67?FPc\u00b4\u00c9"+
		"\u00d5\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}