// Generated from EFScript.g4 by ANTLR 4.9.1

package com.EFScript.Antlr;

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
		DIVASSIGN=19, INCREMENT=20, DECREMENT=21, ALIAS=22, BASIC_STMT_KEYWORD=23, 
		TI_TOKEN=24, DEF=25, VAR=26, IF=27, WHILE=28, RETURN=29, TRUE=30, FALSE=31, 
		IDENTIFIER=32, NUMBER=33, PI=34, E=35, QUOTED_TEXT=36, TEXT=37, LINECOMMENT=38, 
		BLOCKCOMMENT=39, WHITESPACE=40;
	public static final int
		RULE_script = 0, RULE_function = 1, RULE_statement = 2, RULE_assign_stmt = 3, 
		RULE_add_assign_stmt = 4, RULE_sub_assign_stmt = 5, RULE_mul_assign_stmt = 6, 
		RULE_div_assign_stmt = 7, RULE_inc_stmt = 8, RULE_dec_stmt = 9, RULE_if_stmt = 10, 
		RULE_while_stmt = 11, RULE_var_stmt = 12, RULE_return_stmt = 13, RULE_basic_stmt = 14, 
		RULE_expression = 15, RULE_boolexpr = 16, RULE_methodcall = 17, RULE_methodparams = 18, 
		RULE_value = 19, RULE_identifier = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "function", "statement", "assign_stmt", "add_assign_stmt", 
			"sub_assign_stmt", "mul_assign_stmt", "div_assign_stmt", "inc_stmt", 
			"dec_stmt", "if_stmt", "while_stmt", "var_stmt", "return_stmt", "basic_stmt", 
			"expression", "boolexpr", "methodcall", "methodparams", "value", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'++'", "'--'", "'alias'", "'__tibasic'", null, "'def'", "'var'", "'if'", 
			"'while'", "'return'", "'true'", "'false'", null, null, "'pi'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
			"DIVASSIGN", "INCREMENT", "DECREMENT", "ALIAS", "BASIC_STMT_KEYWORD", 
			"TI_TOKEN", "DEF", "VAR", "IF", "WHILE", "RETURN", "TRUE", "FALSE", "IDENTIFIER", 
			"NUMBER", "PI", "E", "QUOTED_TEXT", "TEXT", "LINECOMMENT", "BLOCKCOMMENT", 
			"WHITESPACE"
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DEF) {
					{
					{
					setState(42);
					function();
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
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACKET) | (1L << OPEN_CURLEY) | (1L << END_STMT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << QUOTED_TEXT))) != 0)) {
					{
					{
					setState(48);
					statement();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
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
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(DEF);
			setState(58);
			identifier();
			setState(59);
			match(OPEN_BRACKET);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(60);
				identifier();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(66);
				match(T__0);
				setState(67);
				identifier();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(CLOSE_BRACKET);
			setState(74);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CLOSE_CURLEY() { return getToken(EFScriptParser.CLOSE_CURLEY, 0); }
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(OPEN_CURLEY);
				setState(77);
				statement();
				setState(78);
				match(CLOSE_CURLEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				assign_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				add_assign_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				sub_assign_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				mul_assign_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				div_assign_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				inc_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				dec_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				if_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				while_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(89);
				var_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(90);
				return_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(91);
				expression();
				setState(92);
				match(END_STMT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(94);
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
		enterRule(_localctx, 6, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			identifier();
			setState(98);
			match(ASSIGN);
			setState(99);
			expression();
			setState(100);
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
		enterRule(_localctx, 8, RULE_add_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			identifier();
			setState(103);
			match(ADDASSIGN);
			setState(104);
			value();
			setState(105);
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
		enterRule(_localctx, 10, RULE_sub_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			identifier();
			setState(108);
			match(SUBASSIGN);
			setState(109);
			value();
			setState(110);
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
		enterRule(_localctx, 12, RULE_mul_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			identifier();
			setState(113);
			match(MULASSIGN);
			setState(114);
			value();
			setState(115);
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
		enterRule(_localctx, 14, RULE_div_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			identifier();
			setState(118);
			match(DIVASSIGN);
			setState(119);
			value();
			setState(120);
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
		enterRule(_localctx, 16, RULE_inc_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			identifier();
			setState(123);
			match(INCREMENT);
			setState(124);
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
		enterRule(_localctx, 18, RULE_dec_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			identifier();
			setState(127);
			match(DECREMENT);
			setState(128);
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
		enterRule(_localctx, 20, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(IF);
			setState(131);
			match(OPEN_BRACKET);
			setState(132);
			boolexpr();
			setState(133);
			match(CLOSE_BRACKET);
			setState(134);
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
		enterRule(_localctx, 22, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHILE);
			setState(137);
			match(OPEN_BRACKET);
			setState(138);
			boolexpr();
			setState(139);
			match(CLOSE_BRACKET);
			setState(140);
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
		enterRule(_localctx, 24, RULE_var_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(VAR);
			setState(143);
			identifier();
			setState(144);
			match(ASSIGN);
			setState(145);
			expression();
			setState(146);
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
		enterRule(_localctx, 26, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(RETURN);
			setState(149);
			expression();
			setState(150);
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

	public static class Basic_stmtContext extends ParserRuleContext {
		public TerminalNode BASIC_STMT_KEYWORD() { return getToken(EFScriptParser.BASIC_STMT_KEYWORD, 0); }
		public TerminalNode OPEN_CURLEY() { return getToken(EFScriptParser.OPEN_CURLEY, 0); }
		public List<TerminalNode> TI_TOKEN() { return getTokens(EFScriptParser.TI_TOKEN); }
		public TerminalNode TI_TOKEN(int i) {
			return getToken(EFScriptParser.TI_TOKEN, i);
		}
		public TerminalNode CLOSE_CURLEY() { return getToken(EFScriptParser.CLOSE_CURLEY, 0); }
		public Basic_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).enterBasic_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EFScriptListener ) ((EFScriptListener)listener).exitBasic_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EFScriptVisitor ) return ((EFScriptVisitor<? extends T>)visitor).visitBasic_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_stmtContext basic_stmt() throws RecognitionException {
		Basic_stmtContext _localctx = new Basic_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_basic_stmt);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_STMT_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(BASIC_STMT_KEYWORD);
				}
				break;
			case OPEN_CURLEY:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(OPEN_CURLEY);
				}
				break;
			case EOF:
			case TI_TOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TI_TOKEN) {
					{
					{
					setState(154);
					match(TI_TOKEN);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLOSE_CURLEY:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(CLOSE_CURLEY);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(OPEN_BRACKET);
				setState(164);
				expression();
				setState(165);
				match(CLOSE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				value();
				setState(168);
				match(ADD);
				setState(169);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				value();
				setState(172);
				match(SUB);
				setState(173);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				value();
				setState(176);
				match(MUL);
				setState(177);
				value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				value();
				setState(180);
				match(DIV);
				setState(181);
				value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				identifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				match(NUMBER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				match(QUOTED_TEXT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				identifier();
				setState(193);
				match(GREATER_THAN);
				setState(194);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				identifier();
				setState(197);
				match(LESS_THAN);
				setState(198);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(200);
				identifier();
				setState(201);
				match(EQUAL_TO);
				setState(202);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				identifier();
				setState(205);
				match(NOT_EQUAL_TO);
				setState(206);
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
			setState(210);
			identifier();
			setState(211);
			match(OPEN_BRACKET);
			setState(212);
			methodparams();
			setState(213);
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
			setState(215);
			expression();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(216);
				match(T__0);
				setState(217);
				expression();
				}
				}
				setState(222);
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
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				identifier();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
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
			setState(227);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00e8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\7\2.\n\2\f\2\16\2\61\13\2"+
		"\3\2\7\2\64\n\2\f\2\16\2\67\13\2\3\2\5\2:\n\2\3\3\3\3\3\3\3\3\7\3@\n\3"+
		"\f\3\16\3C\13\3\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"b\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u009e\n\20\f\20\16"+
		"\20\u00a1\13\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00be\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d3\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00dd\n\24\f\24\16\24\u00e0"+
		"\13\24\3\25\3\25\5\25\u00e4\n\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00f9\29\3\2\2\2\4;\3\2\2\2\6a\3"+
		"\2\2\2\bc\3\2\2\2\nh\3\2\2\2\fm\3\2\2\2\16r\3\2\2\2\20w\3\2\2\2\22|\3"+
		"\2\2\2\24\u0080\3\2\2\2\26\u0084\3\2\2\2\30\u008a\3\2\2\2\32\u0090\3\2"+
		"\2\2\34\u0096\3\2\2\2\36\u00a3\3\2\2\2 \u00bd\3\2\2\2\"\u00d2\3\2\2\2"+
		"$\u00d4\3\2\2\2&\u00d9\3\2\2\2(\u00e3\3\2\2\2*\u00e5\3\2\2\2,.\5\4\3\2"+
		"-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60:\3\2\2\2\61/\3\2\2\2\62"+
		"\64\5\6\4\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		":\3\2\2\2\67\65\3\2\2\28:\7\2\2\39/\3\2\2\29\65\3\2\2\298\3\2\2\2:\3\3"+
		"\2\2\2;<\7\33\2\2<=\5*\26\2=A\7\4\2\2>@\5*\26\2?>\3\2\2\2@C\3\2\2\2A?"+
		"\3\2\2\2AB\3\2\2\2BH\3\2\2\2CA\3\2\2\2DE\7\3\2\2EG\5*\26\2FD\3\2\2\2G"+
		"J\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\5\2\2LM\5\6\4\2"+
		"M\5\3\2\2\2NO\7\6\2\2OP\5\6\4\2PQ\7\7\2\2Qb\3\2\2\2Rb\5\b\5\2Sb\5\n\6"+
		"\2Tb\5\f\7\2Ub\5\16\b\2Vb\5\20\t\2Wb\5\22\n\2Xb\5\24\13\2Yb\5\26\f\2Z"+
		"b\5\30\r\2[b\5\32\16\2\\b\5\34\17\2]^\5 \21\2^_\7\b\2\2_b\3\2\2\2`b\7"+
		"\b\2\2aN\3\2\2\2aR\3\2\2\2aS\3\2\2\2aT\3\2\2\2aU\3\2\2\2aV\3\2\2\2aW\3"+
		"\2\2\2aX\3\2\2\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a`"+
		"\3\2\2\2b\7\3\2\2\2cd\5*\26\2de\7\21\2\2ef\5 \21\2fg\7\b\2\2g\t\3\2\2"+
		"\2hi\5*\26\2ij\7\22\2\2jk\5(\25\2kl\7\b\2\2l\13\3\2\2\2mn\5*\26\2no\7"+
		"\23\2\2op\5(\25\2pq\7\b\2\2q\r\3\2\2\2rs\5*\26\2st\7\24\2\2tu\5(\25\2"+
		"uv\7\b\2\2v\17\3\2\2\2wx\5*\26\2xy\7\25\2\2yz\5(\25\2z{\7\b\2\2{\21\3"+
		"\2\2\2|}\5*\26\2}~\7\26\2\2~\177\7\b\2\2\177\23\3\2\2\2\u0080\u0081\5"+
		"*\26\2\u0081\u0082\7\27\2\2\u0082\u0083\7\b\2\2\u0083\25\3\2\2\2\u0084"+
		"\u0085\7\35\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7"+
		"\5\2\2\u0088\u0089\5\6\4\2\u0089\27\3\2\2\2\u008a\u008b\7\36\2\2\u008b"+
		"\u008c\7\4\2\2\u008c\u008d\5\"\22\2\u008d\u008e\7\5\2\2\u008e\u008f\5"+
		"\6\4\2\u008f\31\3\2\2\2\u0090\u0091\7\34\2\2\u0091\u0092\5*\26\2\u0092"+
		"\u0093\7\21\2\2\u0093\u0094\5 \21\2\u0094\u0095\7\b\2\2\u0095\33\3\2\2"+
		"\2\u0096\u0097\7\37\2\2\u0097\u0098\5 \21\2\u0098\u0099\7\b\2\2\u0099"+
		"\35\3\2\2\2\u009a\u00a4\7\31\2\2\u009b\u00a4\7\6\2\2\u009c\u009e\7\32"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\7"+
		"\2\2\u00a3\u009a\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5 \21"+
		"\2\u00a7\u00a8\7\5\2\2\u00a8\u00be\3\2\2\2\u00a9\u00aa\5(\25\2\u00aa\u00ab"+
		"\7\t\2\2\u00ab\u00ac\5(\25\2\u00ac\u00be\3\2\2\2\u00ad\u00ae\5(\25\2\u00ae"+
		"\u00af\7\n\2\2\u00af\u00b0\5(\25\2\u00b0\u00be\3\2\2\2\u00b1\u00b2\5("+
		"\25\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5(\25\2\u00b4\u00be\3\2\2\2\u00b5"+
		"\u00b6\5(\25\2\u00b6\u00b7\7\f\2\2\u00b7\u00b8\5(\25\2\u00b8\u00be\3\2"+
		"\2\2\u00b9\u00be\5*\26\2\u00ba\u00be\7#\2\2\u00bb\u00be\7&\2\2\u00bc\u00be"+
		"\5$\23\2\u00bd\u00a5\3\2\2\2\u00bd\u00a9\3\2\2\2\u00bd\u00ad\3\2\2\2\u00bd"+
		"\u00b1\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be!\3\2\2\2\u00bf\u00d3"+
		"\5*\26\2\u00c0\u00d3\7 \2\2\u00c1\u00d3\7!\2\2\u00c2\u00c3\5*\26\2\u00c3"+
		"\u00c4\7\r\2\2\u00c4\u00c5\5 \21\2\u00c5\u00d3\3\2\2\2\u00c6\u00c7\5*"+
		"\26\2\u00c7\u00c8\7\16\2\2\u00c8\u00c9\5 \21\2\u00c9\u00d3\3\2\2\2\u00ca"+
		"\u00cb\5*\26\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\5 \21\2\u00cd\u00d3\3"+
		"\2\2\2\u00ce\u00cf\5*\26\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1\5 \21\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00bf\3\2\2\2\u00d2\u00c0\3\2\2\2\u00d2\u00c1\3\2"+
		"\2\2\u00d2\u00c2\3\2\2\2\u00d2\u00c6\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00ce\3\2\2\2\u00d3#\3\2\2\2\u00d4\u00d5\5*\26\2\u00d5\u00d6\7\4\2\2"+
		"\u00d6\u00d7\5&\24\2\u00d7\u00d8\7\5\2\2\u00d8%\3\2\2\2\u00d9\u00de\5"+
		" \21\2\u00da\u00db\7\3\2\2\u00db\u00dd\5 \21\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\'\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e4\5*\26\2\u00e2\u00e4\7#\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4)\3\2\2\2\u00e5\u00e6\7\"\2\2\u00e6"+
		"+\3\2\2\2\16/\659AHa\u009f\u00a3\u00bd\u00d2\u00de\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}