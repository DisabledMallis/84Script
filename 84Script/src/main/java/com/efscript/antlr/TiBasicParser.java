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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, LETTER=20, NUMBER=21, LINECOMMENT=22, BLOCKCOMMENT=23, 
		WHITESPACE=24;
	public static final int
		RULE_script = 0, RULE_token = 1, RULE_disp = 2, RULE_input = 3, RULE_store = 4, 
		RULE_if_ = 5, RULE_then = 6, RULE_end = 7, RULE_list = 8, RULE_space = 9, 
		RULE_quote = 10, RULE_letter = 11, RULE_colon = 12, RULE_comma = 13, RULE_period = 14, 
		RULE_open_bracket = 15, RULE_close_bracket = 16, RULE_equals = 17, RULE_number = 18, 
		RULE_pi = 19, RULE_e = 20, RULE_i = 21, RULE_newline = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "token", "disp", "input", "store", "if_", "then", "end", "list", 
			"space", "quote", "letter", "colon", "comma", "period", "open_bracket", 
			"close_bracket", "equals", "number", "pi", "e", "i", "newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DISP '", "'INPUT '", "'->'", "'IF '", "'THEN'", "'END'", "'LIST'", 
			"' '", "'\"'", "':'", "','", "'.'", "'('", "')'", "'='", "'pi'", "'e'", 
			"'i'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LETTER", "NUMBER", "LINECOMMENT", 
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
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << LETTER) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(46);
					token();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Open_bracketContext open_bracket() {
			return getRuleContext(Open_bracketContext.class,0);
		}
		public Close_bracketContext close_bracket() {
			return getRuleContext(Close_bracketContext.class,0);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				number();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				colon();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				if_();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				then();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				end();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				pi();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				e();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				i();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				letter();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				quote();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 11);
				{
				setState(65);
				disp();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 12);
				{
				setState(66);
				input();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 13);
				{
				setState(67);
				newline();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 14);
				{
				setState(68);
				comma();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 15);
				{
				setState(69);
				store();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 16);
				{
				setState(70);
				period();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 17);
				{
				setState(71);
				equals();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 18);
				{
				setState(72);
				space();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 19);
				{
				setState(73);
				list();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 20);
				{
				setState(74);
				open_bracket();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 21);
				{
				setState(75);
				close_bracket();
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
			setState(78);
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
			setState(80);
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
			setState(82);
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
			setState(84);
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
		enterRule(_localctx, 12, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		enterRule(_localctx, 14, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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

	public static class ListContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__6);
			setState(91);
			number();
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
			setState(93);
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
			setState(95);
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
			setState(97);
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
			setState(99);
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
			setState(101);
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
			setState(103);
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

	public static class Open_bracketContext extends ParserRuleContext {
		public Open_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterOpen_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitOpen_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitOpen_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_bracketContext open_bracket() throws RecognitionException {
		Open_bracketContext _localctx = new Open_bracketContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_open_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
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

	public static class Close_bracketContext extends ParserRuleContext {
		public Close_bracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).enterClose_bracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TiBasicListener ) ((TiBasicListener)listener).exitClose_bracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TiBasicVisitor ) return ((TiBasicVisitor<? extends T>)visitor).visitClose_bracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_bracketContext close_bracket() throws RecognitionException {
		Close_bracketContext _localctx = new Close_bracketContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_close_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
		enterRule(_localctx, 34, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
		enterRule(_localctx, 36, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
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
		enterRule(_localctx, 38, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
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
		enterRule(_localctx, 40, RULE_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__16);
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
		enterRule(_localctx, 42, RULE_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__17);
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
		enterRule(_localctx, 44, RULE_newline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__18);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62\n\2"+
		"\f\2\16\2\65\13\2\3\2\5\28\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3O\n\3\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\2\2z\2\67\3\2\2\2\4N\3\2\2\2\6P\3\2\2"+
		"\2\bR\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22\\\3\2\2"+
		"\2\24_\3\2\2\2\26a\3\2\2\2\30c\3\2\2\2\32e\3\2\2\2\34g\3\2\2\2\36i\3\2"+
		"\2\2 k\3\2\2\2\"m\3\2\2\2$o\3\2\2\2&q\3\2\2\2(s\3\2\2\2*u\3\2\2\2,w\3"+
		"\2\2\2.y\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2"+
		"\2\63\64\3\2\2\2\648\3\2\2\2\65\63\3\2\2\2\668\7\2\2\3\67\63\3\2\2\2\67"+
		"\66\3\2\2\28\3\3\2\2\29O\5&\24\2:O\5\32\16\2;O\5\f\7\2<O\5\16\b\2=O\5"+
		"\20\t\2>O\5(\25\2?O\5*\26\2@O\5,\27\2AO\5\30\r\2BO\5\26\f\2CO\5\6\4\2"+
		"DO\5\b\5\2EO\5.\30\2FO\5\34\17\2GO\5\n\6\2HO\5\36\20\2IO\5$\23\2JO\5\24"+
		"\13\2KO\5\22\n\2LO\5 \21\2MO\5\"\22\2N9\3\2\2\2N:\3\2\2\2N;\3\2\2\2N<"+
		"\3\2\2\2N=\3\2\2\2N>\3\2\2\2N?\3\2\2\2N@\3\2\2\2NA\3\2\2\2NB\3\2\2\2N"+
		"C\3\2\2\2ND\3\2\2\2NE\3\2\2\2NF\3\2\2\2NG\3\2\2\2NH\3\2\2\2NI\3\2\2\2"+
		"NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\7\3\2\2Q\7\3\2\2"+
		"\2RS\7\4\2\2S\t\3\2\2\2TU\7\5\2\2U\13\3\2\2\2VW\7\6\2\2W\r\3\2\2\2XY\7"+
		"\7\2\2Y\17\3\2\2\2Z[\7\b\2\2[\21\3\2\2\2\\]\7\t\2\2]^\5&\24\2^\23\3\2"+
		"\2\2_`\7\n\2\2`\25\3\2\2\2ab\7\13\2\2b\27\3\2\2\2cd\7\26\2\2d\31\3\2\2"+
		"\2ef\7\f\2\2f\33\3\2\2\2gh\7\r\2\2h\35\3\2\2\2ij\7\16\2\2j\37\3\2\2\2"+
		"kl\7\17\2\2l!\3\2\2\2mn\7\20\2\2n#\3\2\2\2op\7\21\2\2p%\3\2\2\2qr\7\27"+
		"\2\2r\'\3\2\2\2st\7\22\2\2t)\3\2\2\2uv\7\23\2\2v+\3\2\2\2wx\7\24\2\2x"+
		"-\3\2\2\2yz\7\25\2\2z/\3\2\2\2\5\63\67N";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}