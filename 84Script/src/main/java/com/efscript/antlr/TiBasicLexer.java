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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LETTER=17, 
		NUMBER=18, LINECOMMENT=19, BLOCKCOMMENT=20, WHITESPACE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "LETTER", 
			"NUMBER", "INT", "LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\7\24i\n\24\f\24\16\24l\13\24\5\24n\n\24\3\25\3"+
		"\25\3\25\3\25\7\25t\n\25\f\25\16\25w\13\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\177\n\26\f\26\16\26\u0082\13\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\u0080\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\27\3\2\7\3"+
		"\2C\\\3\2\62;\3\2\63;\4\2\f\f\17\17\4\2\13\13\17\17\2\u008e\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\65\3\2\2\2\7<\3\2\2"+
		"\2\t?\3\2\2\2\13C\3\2\2\2\rE\3\2\2\2\17J\3\2\2\2\21N\3\2\2\2\23P\3\2\2"+
		"\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35[\3\2\2\2\37]\3\2"+
		"\2\2!_\3\2\2\2#a\3\2\2\2%c\3\2\2\2\'m\3\2\2\2)o\3\2\2\2+z\3\2\2\2-\u0088"+
		"\3\2\2\2/\60\7F\2\2\60\61\7k\2\2\61\62\7u\2\2\62\63\7r\2\2\63\64\7\"\2"+
		"\2\64\4\3\2\2\2\65\66\7K\2\2\66\67\7p\2\2\678\7r\2\289\7w\2\29:\7v\2\2"+
		":;\7\"\2\2;\6\3\2\2\2<=\7/\2\2=>\7@\2\2>\b\3\2\2\2?@\7K\2\2@A\7h\2\2A"+
		"B\7\"\2\2B\n\3\2\2\2CD\7?\2\2D\f\3\2\2\2EF\7V\2\2FG\7j\2\2GH\7g\2\2HI"+
		"\7p\2\2I\16\3\2\2\2JK\7G\2\2KL\7p\2\2LM\7f\2\2M\20\3\2\2\2NO\7\"\2\2O"+
		"\22\3\2\2\2PQ\7$\2\2Q\24\3\2\2\2RS\7<\2\2S\26\3\2\2\2TU\7.\2\2U\30\3\2"+
		"\2\2VW\7\60\2\2W\32\3\2\2\2XY\7r\2\2YZ\7k\2\2Z\34\3\2\2\2[\\\7g\2\2\\"+
		"\36\3\2\2\2]^\7k\2\2^ \3\2\2\2_`\7\f\2\2`\"\3\2\2\2ab\t\2\2\2b$\3\2\2"+
		"\2cd\t\3\2\2d&\3\2\2\2en\7\62\2\2fj\t\4\2\2gi\t\3\2\2hg\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2me\3\2\2\2mf\3\2\2\2n(\3\2"+
		"\2\2op\7\61\2\2pq\7\61\2\2qu\3\2\2\2rt\n\5\2\2sr\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\b\25\2\2y*\3\2\2\2z{\7\61\2\2{"+
		"|\7,\2\2|\u0080\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7,\2\2\u0084\u0085\7\61\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\b\26\2\2\u0087,\3\2\2\2\u0088\u0089\t\6\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\27\2\2\u008b.\3\2\2\2\7\2jmu\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}