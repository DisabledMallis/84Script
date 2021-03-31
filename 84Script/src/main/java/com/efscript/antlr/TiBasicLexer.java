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
		T__0=1, T__1=2, QUOTE=3, LETTER=4, COLON=5, COMMA=6, NUMBER=7, PI=8, E=9, 
		I=10, NEWLINE=11, LINECOMMENT=12, BLOCKCOMMENT=13, WHITESPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "QUOTE", "LETTER", "COLON", "COMMA", "NUMBER", "PI", 
			"E", "I", "INT", "NEWLINE", "LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Disp'", "'Input'", "'\"'", null, "':'", "','", null, "'pi'", 
			"'e'", "'i'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "QUOTE", "LETTER", "COLON", "COMMA", "NUMBER", "PI", 
			"E", "I", "NEWLINE", "LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5\b\66\n"+
		"\b\3\b\3\b\3\b\6\b;\n\b\r\b\16\b<\5\b?\n\b\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\7\fK\n\f\f\f\16\fN\13\f\5\fP\n\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16X\n\16\f\16\16\16[\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17"+
		"c\n\17\f\17\16\17f\13\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3d\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\r\33\16"+
		"\35\17\37\20\3\2\7\3\2C\\\3\2\62;\3\2\63;\4\2\f\f\17\17\5\2\13\13\17\17"+
		"\"\"\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5&\3\2\2\2\7"+
		",\3\2\2\2\t.\3\2\2\2\13\60\3\2\2\2\r\62\3\2\2\2\17\65\3\2\2\2\21@\3\2"+
		"\2\2\23C\3\2\2\2\25E\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35^\3"+
		"\2\2\2\37l\3\2\2\2!\"\7F\2\2\"#\7k\2\2#$\7u\2\2$%\7r\2\2%\4\3\2\2\2&\'"+
		"\7K\2\2\'(\7p\2\2()\7r\2\2)*\7w\2\2*+\7v\2\2+\6\3\2\2\2,-\7$\2\2-\b\3"+
		"\2\2\2./\t\2\2\2/\n\3\2\2\2\60\61\7<\2\2\61\f\3\2\2\2\62\63\7.\2\2\63"+
		"\16\3\2\2\2\64\66\7/\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67"+
		">\5\27\f\28:\7\60\2\29;\t\3\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2"+
		"\2=?\3\2\2\2>8\3\2\2\2>?\3\2\2\2?\20\3\2\2\2@A\7r\2\2AB\7k\2\2B\22\3\2"+
		"\2\2CD\7g\2\2D\24\3\2\2\2EF\7k\2\2F\26\3\2\2\2GP\7\62\2\2HL\t\4\2\2IK"+
		"\t\3\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2O"+
		"G\3\2\2\2OH\3\2\2\2P\30\3\2\2\2QR\7\f\2\2R\32\3\2\2\2ST\7\61\2\2TU\7\61"+
		"\2\2UY\3\2\2\2VX\n\5\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3"+
		"\2\2\2[Y\3\2\2\2\\]\b\16\2\2]\34\3\2\2\2^_\7\61\2\2_`\7,\2\2`d\3\2\2\2"+
		"ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3\2\2\2eg\3\2\2\2fd\3\2\2"+
		"\2gh\7,\2\2hi\7\61\2\2ij\3\2\2\2jk\b\17\2\2k\36\3\2\2\2lm\t\6\2\2mn\3"+
		"\2\2\2no\b\20\2\2o \3\2\2\2\n\2\65<>LOYd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}