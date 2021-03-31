// Generated from EFScript.g4 by ANTLR 4.9.1

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
public class EFScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, OPEN_BRACKET=3, CLOSE_BRACKET=4, OPEN_CURLEY=5, CLOSE_CURLEY=6, 
		END_STMT=7, ADD=8, SUB=9, MUL=10, DIV=11, GREATER_THAN=12, LESS_THAN=13, 
		EQUAL_TO=14, NOT_EQUAL_TO=15, GREATER_THAN_OR_EQUAL=16, LESS_THAN_OR_EQUAL=17, 
		OR=18, AND=19, ASSIGN=20, ADDASSIGN=21, SUBASSIGN=22, MULASSIGN=23, DIVASSIGN=24, 
		INCREMENT=25, DECREMENT=26, DEF=27, VAR=28, STR=29, IF=30, WHILE=31, RETURN=32, 
		TRUE=33, FALSE=34, IDENTIFIER=35, NUMBER=36, PI=37, E=38, I=39, QUOTED_TEXT=40, 
		LINECOMMENT=41, BLOCKCOMMENT=42, WHITESPACE=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"OR", "AND", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"INCREMENT", "DECREMENT", "DEF", "VAR", "STR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "I", "INT", "QUOTED_TEXT", 
			"LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'__tibasic'", "'('", "')'", "'{'", "'}'", "';'", "'+'", 
			"'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'||'", 
			"'&&'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'def'", 
			"'var'", "'str'", "'if'", "'while'", "'return'", "'true'", "'false'", 
			null, null, "'pi'", "'e'", "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"OR", "AND", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"INCREMENT", "DECREMENT", "DEF", "VAR", "STR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "I", "QUOTED_TEXT", 
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


	public EFScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EFScript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3$\3$\7$\u00cd\n$\f$\16$\u00d0\13$\3%\5%\u00d3\n%\3%\3%\3%\6%\u00d8"+
		"\n%\r%\16%\u00d9\5%\u00dc\n%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\7)\u00e8"+
		"\n)\f)\16)\u00eb\13)\5)\u00ed\n)\3*\3*\7*\u00f1\n*\f*\16*\u00f4\13*\3"+
		"*\3*\3+\3+\3+\3+\7+\u00fc\n+\f+\16+\u00ff\13+\3+\3+\3,\3,\3,\3,\7,\u0107"+
		"\n,\f,\16,\u010a\13,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3\u0108\2.\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q\2S*U+W,Y-\3\2\t\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\3\2\63;\5"+
		"\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u011b\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13k\3\2\2\2\rm\3\2"+
		"\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31y\3"+
		"\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\u0080\3\2\2\2!\u0083\3\2\2\2#\u0086"+
		"\3\2\2\2%\u0089\3\2\2\2\'\u008c\3\2\2\2)\u008f\3\2\2\2+\u0091\3\2\2\2"+
		"-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u009a\3\2\2\2\63\u009d\3\2\2\2\65\u00a0"+
		"\3\2\2\2\67\u00a3\3\2\2\29\u00a7\3\2\2\2;\u00ab\3\2\2\2=\u00af\3\2\2\2"+
		"?\u00b2\3\2\2\2A\u00b8\3\2\2\2C\u00bf\3\2\2\2E\u00c4\3\2\2\2G\u00ca\3"+
		"\2\2\2I\u00d2\3\2\2\2K\u00dd\3\2\2\2M\u00e0\3\2\2\2O\u00e2\3\2\2\2Q\u00ec"+
		"\3\2\2\2S\u00ee\3\2\2\2U\u00f7\3\2\2\2W\u0102\3\2\2\2Y\u0110\3\2\2\2["+
		"\\\7.\2\2\\\4\3\2\2\2]^\7a\2\2^_\7a\2\2_`\7v\2\2`a\7k\2\2ab\7d\2\2bc\7"+
		"c\2\2cd\7u\2\2de\7k\2\2ef\7e\2\2f\6\3\2\2\2gh\7*\2\2h\b\3\2\2\2ij\7+\2"+
		"\2j\n\3\2\2\2kl\7}\2\2l\f\3\2\2\2mn\7\177\2\2n\16\3\2\2\2op\7=\2\2p\20"+
		"\3\2\2\2qr\7-\2\2r\22\3\2\2\2st\7/\2\2t\24\3\2\2\2uv\7,\2\2v\26\3\2\2"+
		"\2wx\7\61\2\2x\30\3\2\2\2yz\7@\2\2z\32\3\2\2\2{|\7>\2\2|\34\3\2\2\2}~"+
		"\7?\2\2~\177\7?\2\2\177\36\3\2\2\2\u0080\u0081\7#\2\2\u0081\u0082\7?\2"+
		"\2\u0082 \3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085\7?\2\2\u0085\"\3\2\2"+
		"\2\u0086\u0087\7>\2\2\u0087\u0088\7?\2\2\u0088$\3\2\2\2\u0089\u008a\7"+
		"~\2\2\u008a\u008b\7~\2\2\u008b&\3\2\2\2\u008c\u008d\7(\2\2\u008d\u008e"+
		"\7(\2\2\u008e(\3\2\2\2\u008f\u0090\7?\2\2\u0090*\3\2\2\2\u0091\u0092\7"+
		"-\2\2\u0092\u0093\7?\2\2\u0093,\3\2\2\2\u0094\u0095\7/\2\2\u0095\u0096"+
		"\7?\2\2\u0096.\3\2\2\2\u0097\u0098\7,\2\2\u0098\u0099\7?\2\2\u0099\60"+
		"\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7?\2\2\u009c\62\3\2\2\2\u009d"+
		"\u009e\7-\2\2\u009e\u009f\7-\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7/\2\2\u00a1"+
		"\u00a2\7/\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7f\2\2\u00a4\u00a5\7g\2\2\u00a5"+
		"\u00a6\7h\2\2\u00a68\3\2\2\2\u00a7\u00a8\7x\2\2\u00a8\u00a9\7c\2\2\u00a9"+
		"\u00aa\7t\2\2\u00aa:\3\2\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7v\2\2\u00ad"+
		"\u00ae\7t\2\2\u00ae<\3\2\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		">\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7t\2\2"+
		"\u00bd\u00be\7p\2\2\u00beB\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2"+
		"\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2\u00c3D\3\2\2\2\u00c4\u00c5\7"+
		"h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9"+
		"\7g\2\2\u00c9F\3\2\2\2\u00ca\u00ce\t\2\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"H\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\7/\2\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00db\5Q)\2\u00d5\u00d7\7\60"+
		"\2\2\u00d6\u00d8\t\4\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d5\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7r\2\2\u00de\u00df"+
		"\7k\2\2\u00dfL\3\2\2\2\u00e0\u00e1\7g\2\2\u00e1N\3\2\2\2\u00e2\u00e3\7"+
		"k\2\2\u00e3P\3\2\2\2\u00e4\u00ed\7\62\2\2\u00e5\u00e9\t\5\2\2\u00e6\u00e8"+
		"\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00e4\3\2"+
		"\2\2\u00ec\u00e5\3\2\2\2\u00edR\3\2\2\2\u00ee\u00f2\7$\2\2\u00ef\u00f1"+
		"\n\6\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7$"+
		"\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fd"+
		"\3\2\2\2\u00fa\u00fc\n\7\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0101\b+\2\2\u0101V\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104"+
		"\7,\2\2\u0104\u0108\3\2\2\2\u0105\u0107\13\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7,\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\b,\2\2\u010fX\3\2\2\2\u0110\u0111\t\b\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\b-\2\2\u0113Z\3\2\2\2\f\2\u00ce\u00d2\u00d9"+
		"\u00db\u00e9\u00ec\u00f2\u00fd\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}