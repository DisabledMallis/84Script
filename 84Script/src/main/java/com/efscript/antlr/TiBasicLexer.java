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
		T__0=1, T__1=2, T__2=3, LETTER=4, NUMBER=5, PI=6, E=7, I=8, QUOTED_TEXT=9, 
		LINECOMMENT=10, BLOCKCOMMENT=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "LETTER", "NUMBER", "PI", "E", "I", "INT", "QUOTED_TEXT", 
			"LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Disp'", "'Input'", "','", null, null, "'pi'", "'e'", "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LETTER", "NUMBER", "PI", "E", "I", "QUOTED_TEXT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\5\6.\n\6\3\6\3\6\3\6\6\6\63\n\6\r\6\16\6\64\5"+
		"\6\67\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\nC\n\n\f\n\16\nF\13"+
		"\n\5\nH\n\n\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\7\fW\n\f\f\f\16\fZ\13\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rb\n\r\f\r\16"+
		"\re\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3c\2\17\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31\r\33\16\3\2\b\3\2C\\\3\2\62;"+
		"\3\2\63;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2u\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\3\35\3\2\2\2\5\"\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13-\3\2\2\2\r8\3\2\2"+
		"\2\17;\3\2\2\2\21=\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27R\3\2\2\2\31]\3\2"+
		"\2\2\33k\3\2\2\2\35\36\7F\2\2\36\37\7k\2\2\37 \7u\2\2 !\7r\2\2!\4\3\2"+
		"\2\2\"#\7K\2\2#$\7p\2\2$%\7r\2\2%&\7w\2\2&\'\7v\2\2\'\6\3\2\2\2()\7.\2"+
		"\2)\b\3\2\2\2*+\t\2\2\2+\n\3\2\2\2,.\7/\2\2-,\3\2\2\2-.\3\2\2\2./\3\2"+
		"\2\2/\66\5\23\n\2\60\62\7\60\2\2\61\63\t\3\2\2\62\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\60\3\2\2\2\66\67\3\2"+
		"\2\2\67\f\3\2\2\289\7r\2\29:\7k\2\2:\16\3\2\2\2;<\7g\2\2<\20\3\2\2\2="+
		">\7k\2\2>\22\3\2\2\2?H\7\62\2\2@D\t\4\2\2AC\t\3\2\2BA\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2G?\3\2\2\2G@\3\2\2\2H\24\3\2"+
		"\2\2IM\7$\2\2JL\n\5\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2"+
		"\2\2OM\3\2\2\2PQ\7$\2\2Q\26\3\2\2\2RS\7\61\2\2ST\7\61\2\2TX\3\2\2\2UW"+
		"\n\6\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2["+
		"\\\b\f\2\2\\\30\3\2\2\2]^\7\61\2\2^_\7,\2\2_c\3\2\2\2`b\13\2\2\2a`\3\2"+
		"\2\2be\3\2\2\2cd\3\2\2\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7,\2\2gh\7\61"+
		"\2\2hi\3\2\2\2ij\b\r\2\2j\32\3\2\2\2kl\t\7\2\2lm\3\2\2\2mn\b\16\2\2n\34"+
		"\3\2\2\2\13\2-\64\66DGMXc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}