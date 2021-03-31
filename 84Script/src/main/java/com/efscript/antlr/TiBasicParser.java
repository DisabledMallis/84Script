// Generated from TiBasic.g4 by ANTLR 4.9.1

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
public class TiBasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LETTER=17, 
		NUMBER=18, LINECOMMENT=19, BLOCKCOMMENT=20, WHITESPACE=21;
	public static final int
		RULE_script = 0, RULE_token = 1, RULE_disp = 2, RULE_input = 3, RULE_store = 4, 
		RULE_if_ = 5, RULE_equals = 6, RULE_then = 7, RULE_end = 8, RULE_space = 9, 
		RULE_quote = 10, RULE_letter = 11, RULE_colon = 12, RULE_comma = 13, RULE_period = 14, 
		RULE_number = 15, RULE_pi = 16, RULE_e = 17, RULE_i = 18, RULE_newline = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "token", "disp", "input", "store", "if_", "equals", "then", 
			"end", "space", "quote", "letter", "colon", "comma", "period", "number", 
			"pi", "e", "i", "newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Disp '", "'Input '", "'->'", "'If '", "'='", "'Then'", "'End'", 
			"' '", "'\"'", "':'", "','", "'.'", "'pi'", "'e'", "'i'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LETTER", "NUMBER", "LINECOMMENT", "BLOCKCOMMENT", 
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
	public String getGrammarFileName() { return "TiBasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TiBasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TiBasicParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << LETTER) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(40);
					token();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
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

	public static class TokenContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public IContext i() {
			return getRuleContext(IContext.class,0);
		}
		public LetterContext letter() {
			return getRuleContext(LetterContext.class,0);
		}
		public QuoteContext quote() {
			return getRuleContext(QuoteContext.class,0);
		}
		public DispContext disp() {
			return getRuleContext(DispContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public NewlineContext newline() {
			return getRuleContext(NewlineContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public PeriodContext period() {
			return getRuleContext(PeriodContext.class,0);
		}
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public SpaceContext space() {
			return getRuleContext(SpaceContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_token);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				number();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				if_();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				then();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				end();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				pi();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				e();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				i();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				letter();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				quote();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				disp();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 11);
				{
				setState(59);
				input();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 12);
				{
				setState(60);
				newline();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 13);
				{
				setState(61);
				colon();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 14);
				{
				setState(62);
				comma();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 15);
				{
				setState(63);
				store();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 16);
				{
				setState(64);
				period();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 17);
				{
				setState(65);
				equals();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 18);
				{
				setState(66);
				space();
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

	public static class DispContext extends ParserRuleContext {
		public DispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterDisp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitDisp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitDisp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DispContext disp() throws RecognitionException {
		DispContext _localctx = new DispContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_disp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__0);
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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

	public static class StoreContext extends ParserRuleContext {
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitStore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitStore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__2);
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
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__3);
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

	public static class EqualsContext extends ParserRuleContext {
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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

	public static class ThenContext extends ParserRuleContext {
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__5);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__6);
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

	public static class SpaceContext extends ParserRuleContext {
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitSpace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitSpace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__7);
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

	public static class QuoteContext extends ParserRuleContext {
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitQuote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitQuote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__8);
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

	public static class LetterContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(TiBasicParser.LETTER, 0); }
		public LetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterLetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitLetter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitLetter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetterContext letter() throws RecognitionException {
		LetterContext _localctx = new LetterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_letter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LETTER);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__9);
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__10);
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

	public static class PeriodContext extends ParserRuleContext {
		public PeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_period; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterPeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitPeriod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitPeriod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PeriodContext period() throws RecognitionException {
		PeriodContext _localctx = new PeriodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_period);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__11);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(TiBasicParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NUMBER);
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

	public static class PiContext extends ParserRuleContext {
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitPi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitPi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__12);
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

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__13);
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

	public static class IContext extends ParserRuleContext {
		public IContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitI(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IContext i() throws RecognitionException {
		IContext _localctx = new IContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__14);
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

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__15);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27l\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\5\2\62\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3F\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(\2\2\2j\2\61\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bI\3\2\2"+
		"\2\nK\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20Q\3\2\2\2\22S\3\2\2\2\24U\3\2\2"+
		"\2\26W\3\2\2\2\30Y\3\2\2\2\32[\3\2\2\2\34]\3\2\2\2\36_\3\2\2\2 a\3\2\2"+
		"\2\"c\3\2\2\2$e\3\2\2\2&g\3\2\2\2(i\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2"+
		"\2\2-+\3\2\2\2-.\3\2\2\2.\62\3\2\2\2/-\3\2\2\2\60\62\7\2\2\3\61-\3\2\2"+
		"\2\61\60\3\2\2\2\62\3\3\2\2\2\63F\5 \21\2\64F\5\f\7\2\65F\5\20\t\2\66"+
		"F\5\22\n\2\67F\5\"\22\28F\5$\23\29F\5&\24\2:F\5\30\r\2;F\5\26\f\2<F\5"+
		"\6\4\2=F\5\b\5\2>F\5(\25\2?F\5\32\16\2@F\5\34\17\2AF\5\n\6\2BF\5\36\20"+
		"\2CF\5\16\b\2DF\5\24\13\2E\63\3\2\2\2E\64\3\2\2\2E\65\3\2\2\2E\66\3\2"+
		"\2\2E\67\3\2\2\2E8\3\2\2\2E9\3\2\2\2E:\3\2\2\2E;\3\2\2\2E<\3\2\2\2E=\3"+
		"\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3"+
		"\2\2\2F\5\3\2\2\2GH\7\3\2\2H\7\3\2\2\2IJ\7\4\2\2J\t\3\2\2\2KL\7\5\2\2"+
		"L\13\3\2\2\2MN\7\6\2\2N\r\3\2\2\2OP\7\7\2\2P\17\3\2\2\2QR\7\b\2\2R\21"+
		"\3\2\2\2ST\7\t\2\2T\23\3\2\2\2UV\7\n\2\2V\25\3\2\2\2WX\7\13\2\2X\27\3"+
		"\2\2\2YZ\7\23\2\2Z\31\3\2\2\2[\\\7\f\2\2\\\33\3\2\2\2]^\7\r\2\2^\35\3"+
		"\2\2\2_`\7\16\2\2`\37\3\2\2\2ab\7\24\2\2b!\3\2\2\2cd\7\17\2\2d#\3\2\2"+
		"\2ef\7\20\2\2f%\3\2\2\2gh\7\21\2\2h\'\3\2\2\2ij\7\22\2\2j)\3\2\2\2\5-"+
		"\61E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}