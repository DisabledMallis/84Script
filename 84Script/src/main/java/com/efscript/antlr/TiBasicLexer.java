// Generated from TiBasic.g4 by ANTLR 4.9.1

package com.efscript.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TiBasicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, LETTER=21, NUMBER=22, LINECOMMENT=23, BLOCKCOMMENT=24, 
		WHITESPACE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "LETTER", "NUMBER", "INT", "LINECOMMENT", 
			"BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DISP'", "'INPUT'", "'->'", "'IF'", "'THEN'", "'END'", "'LIST'", 
			"' '", "'\"'", "':'", "';'", "','", "'.'", "'('", "')'", "'='", "'pi'", 
			"'e'", "'i'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "LETTER", "NUMBER", 
			"LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
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


	public TiBasicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TiBasic.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30y\n\30\f\30\16\30|\13\30\5\30~\n"+
		"\30\3\31\3\31\3\31\3\31\7\31\u0084\n\31\f\31\16\31\u0087\13\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\7\32\u008f\n\32\f\32\16\32\u0092\13\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\u0090\2\34\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\2\61\31\63\32\65\33\3\2\7\3\2C\\\3\2\62;\3\2\63;\4\2"+
		"\f\f\17\17\4\2\13\13\17\17\2\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3"+
		"\2\2\2\5<\3\2\2\2\7B\3\2\2\2\tE\3\2\2\2\13H\3\2\2\2\rM\3\2\2\2\17Q\3\2"+
		"\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`"+
		"\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#h\3\2\2\2%k\3\2\2\2\'m\3\2"+
		"\2\2)o\3\2\2\2+q\3\2\2\2-s\3\2\2\2/}\3\2\2\2\61\177\3\2\2\2\63\u008a\3"+
		"\2\2\2\65\u0098\3\2\2\2\678\7F\2\289\7K\2\29:\7U\2\2:;\7R\2\2;\4\3\2\2"+
		"\2<=\7K\2\2=>\7P\2\2>?\7R\2\2?@\7W\2\2@A\7V\2\2A\6\3\2\2\2BC\7/\2\2CD"+
		"\7@\2\2D\b\3\2\2\2EF\7K\2\2FG\7H\2\2G\n\3\2\2\2HI\7V\2\2IJ\7J\2\2JK\7"+
		"G\2\2KL\7P\2\2L\f\3\2\2\2MN\7G\2\2NO\7P\2\2OP\7F\2\2P\16\3\2\2\2QR\7N"+
		"\2\2RS\7K\2\2ST\7U\2\2TU\7V\2\2U\20\3\2\2\2VW\7\"\2\2W\22\3\2\2\2XY\7"+
		"$\2\2Y\24\3\2\2\2Z[\7<\2\2[\26\3\2\2\2\\]\7=\2\2]\30\3\2\2\2^_\7.\2\2"+
		"_\32\3\2\2\2`a\7\60\2\2a\34\3\2\2\2bc\7*\2\2c\36\3\2\2\2de\7+\2\2e \3"+
		"\2\2\2fg\7?\2\2g\"\3\2\2\2hi\7r\2\2ij\7k\2\2j$\3\2\2\2kl\7g\2\2l&\3\2"+
		"\2\2mn\7k\2\2n(\3\2\2\2op\7\f\2\2p*\3\2\2\2qr\t\2\2\2r,\3\2\2\2st\t\3"+
		"\2\2t.\3\2\2\2u~\7\62\2\2vz\t\4\2\2wy\t\3\2\2xw\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}u\3\2\2\2}v\3\2\2\2~\60\3\2\2\2\177"+
		"\u0080\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\n"+
		"\5\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\31"+
		"\2\2\u0089\62\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7,\2\2\u008c\u0090"+
		"\3\2\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\7,\2\2\u0094\u0095\7\61\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\32\2\2\u0097\64\3\2\2\2\u0098\u0099\t\6\2\2\u0099\u009a\3\2\2"+
		"\2\u009a\u009b\b\33\2\2\u009b\66\3\2\2\2\7\2z}\u0085\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}