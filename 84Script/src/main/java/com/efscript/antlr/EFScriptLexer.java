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
		T__0=1, T__1=2, T__2=3, T__3=4, OPEN_BRACKET=5, CLOSE_BRACKET=6, OPEN_CURLEY=7, 
		CLOSE_CURLEY=8, END_STMT=9, ADD=10, SUB=11, MUL=12, DIV=13, GREATER_THAN=14, 
		LESS_THAN=15, EQUAL_TO=16, NOT_EQUAL_TO=17, GREATER_THAN_OR_EQUAL=18, 
		LESS_THAN_OR_EQUAL=19, OR=20, AND=21, ASSIGN=22, ADDASSIGN=23, SUBASSIGN=24, 
		MULASSIGN=25, DIVASSIGN=26, INCREMENT=27, DECREMENT=28, DEF=29, VAR=30, 
		STR=31, IF=32, WHILE=33, RETURN=34, TRUE=35, FALSE=36, IDENTIFIER=37, 
		NUMBER=38, PI=39, E=40, I=41, QUOTED_TEXT=42, LINECOMMENT=43, BLOCKCOMMENT=44, 
		WHITESPACE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", 
			"CLOSE_CURLEY", "END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", 
			"LESS_THAN", "EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"OR", "AND", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"INCREMENT", "DECREMENT", "DEF", "VAR", "STR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "I", "INT", "QUOTED_TEXT", 
			"LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'name:'", "'include:'", "','", "'__tibasic'", "'('", "')'", "'{'", 
			"'}'", "';'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'=='", "'!='", 
			"'>='", "'<='", "'||'", "'&&'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'++'", "'--'", "'def'", "'var'", "'str'", "'if'", "'while'", "'return'", 
			"'true'", "'false'", null, null, "'pi'", "'e'", "'i'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", 
			"CLOSE_CURLEY", "END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", 
			"LESS_THAN", "EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\7&\u00e0\n&\f&\16&\u00e3\13&\3\'\5\'\u00e6\n\'\3\'\3\'\3\'\6\'\u00eb"+
		"\n\'\r\'\16\'\u00ec\5\'\u00ef\n\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\7+\u00fb"+
		"\n+\f+\16+\u00fe\13+\5+\u0100\n+\3,\3,\7,\u0104\n,\f,\16,\u0107\13,\3"+
		",\3,\3-\3-\3-\3-\7-\u010f\n-\f-\16-\u0112\13-\3-\3-\3.\3.\3.\3.\7.\u011a"+
		"\n.\f.\16.\u011d\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\u011b\2\60\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U\2W,Y-[.]/\3\2\t\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\3"+
		"\2\63;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u012e\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5e\3\2\2\2\7n\3\2\2\2"+
		"\tp\3\2\2\2\13z\3\2\2\2\r|\3\2\2\2\17~\3\2\2\2\21\u0080\3\2\2\2\23\u0082"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008a\3"+
		"\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u0093\3\2\2\2"+
		"%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u009f\3\2\2\2-\u00a2\3"+
		"\2\2\2/\u00a4\3\2\2\2\61\u00a7\3\2\2\2\63\u00aa\3\2\2\2\65\u00ad\3\2\2"+
		"\2\67\u00b0\3\2\2\29\u00b3\3\2\2\2;\u00b6\3\2\2\2=\u00ba\3\2\2\2?\u00be"+
		"\3\2\2\2A\u00c2\3\2\2\2C\u00c5\3\2\2\2E\u00cb\3\2\2\2G\u00d2\3\2\2\2I"+
		"\u00d7\3\2\2\2K\u00dd\3\2\2\2M\u00e5\3\2\2\2O\u00f0\3\2\2\2Q\u00f3\3\2"+
		"\2\2S\u00f5\3\2\2\2U\u00ff\3\2\2\2W\u0101\3\2\2\2Y\u010a\3\2\2\2[\u0115"+
		"\3\2\2\2]\u0123\3\2\2\2_`\7p\2\2`a\7c\2\2ab\7o\2\2bc\7g\2\2cd\7<\2\2d"+
		"\4\3\2\2\2ef\7k\2\2fg\7p\2\2gh\7e\2\2hi\7n\2\2ij\7w\2\2jk\7f\2\2kl\7g"+
		"\2\2lm\7<\2\2m\6\3\2\2\2no\7.\2\2o\b\3\2\2\2pq\7a\2\2qr\7a\2\2rs\7v\2"+
		"\2st\7k\2\2tu\7d\2\2uv\7c\2\2vw\7u\2\2wx\7k\2\2xy\7e\2\2y\n\3\2\2\2z{"+
		"\7*\2\2{\f\3\2\2\2|}\7+\2\2}\16\3\2\2\2~\177\7}\2\2\177\20\3\2\2\2\u0080"+
		"\u0081\7\177\2\2\u0081\22\3\2\2\2\u0082\u0083\7=\2\2\u0083\24\3\2\2\2"+
		"\u0084\u0085\7-\2\2\u0085\26\3\2\2\2\u0086\u0087\7/\2\2\u0087\30\3\2\2"+
		"\2\u0088\u0089\7,\2\2\u0089\32\3\2\2\2\u008a\u008b\7\61\2\2\u008b\34\3"+
		"\2\2\2\u008c\u008d\7@\2\2\u008d\36\3\2\2\2\u008e\u008f\7>\2\2\u008f \3"+
		"\2\2\2\u0090\u0091\7?\2\2\u0091\u0092\7?\2\2\u0092\"\3\2\2\2\u0093\u0094"+
		"\7#\2\2\u0094\u0095\7?\2\2\u0095$\3\2\2\2\u0096\u0097\7@\2\2\u0097\u0098"+
		"\7?\2\2\u0098&\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b(\3"+
		"\2\2\2\u009c\u009d\7~\2\2\u009d\u009e\7~\2\2\u009e*\3\2\2\2\u009f\u00a0"+
		"\7(\2\2\u00a0\u00a1\7(\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3.\3"+
		"\2\2\2\u00a4\u00a5\7-\2\2\u00a5\u00a6\7?\2\2\u00a6\60\3\2\2\2\u00a7\u00a8"+
		"\7/\2\2\u00a8\u00a9\7?\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7\61\2\2\u00ae\u00af\7?\2\2\u00af"+
		"\66\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2\7-\2\2\u00b28\3\2\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4\u00b5\7/\2\2\u00b5:\3\2\2\2\u00b6\u00b7\7f\2\2\u00b7"+
		"\u00b8\7g\2\2\u00b8\u00b9\7h\2\2\u00b9<\3\2\2\2\u00ba\u00bb\7x\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7t\2\2\u00bd>\3\2\2\2\u00be\u00bf\7u\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1@\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7h\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7j\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00caD\3\2\2\2\u00cb"+
		"\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7w\2\2"+
		"\u00cf\u00d0\7t\2\2\u00d0\u00d1\7p\2\2\u00d1F\3\2\2\2\u00d2\u00d3\7v\2"+
		"\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7w\2\2\u00d5\u00d6\7g\2\2\u00d6H\3\2"+
		"\2\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7n\2\2\u00da\u00db"+
		"\7u\2\2\u00db\u00dc\7g\2\2\u00dcJ\3\2\2\2\u00dd\u00e1\t\2\2\2\u00de\u00e0"+
		"\t\3\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2L\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7/\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ee\5U"+
		"+\2\u00e8\u00ea\7\60\2\2\u00e9\u00eb\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ef\3\2\2\2\u00efN\3\2\2\2\u00f0\u00f1"+
		"\7r\2\2\u00f1\u00f2\7k\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4R\3"+
		"\2\2\2\u00f5\u00f6\7k\2\2\u00f6T\3\2\2\2\u00f7\u0100\7\62\2\2\u00f8\u00fc"+
		"\t\5\2\2\u00f9\u00fb\t\4\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2"+
		"\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2\2\2\u0100V\3\2\2\2\u0101\u0105"+
		"\7$\2\2\u0102\u0104\n\6\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\7$\2\2\u0109X\3\2\2\2\u010a\u010b\7\61\2\2\u010b\u010c"+
		"\7\61\2\2\u010c\u0110\3\2\2\2\u010d\u010f\n\7\2\2\u010e\u010d\3\2\2\2"+
		"\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\b-\2\2\u0114Z\3\2\2\2\u0115\u0116"+
		"\7\61\2\2\u0116\u0117\7,\2\2\u0117\u011b\3\2\2\2\u0118\u011a\13\2\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u011c\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7,\2\2\u011f"+
		"\u0120\7\61\2\2\u0120\u0121\3\2\2\2\u0121\u0122\b.\2\2\u0122\\\3\2\2\2"+
		"\u0123\u0124\t\b\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b/\2\2\u0126^\3\2"+
		"\2\2\f\2\u00e1\u00e5\u00ec\u00ee\u00fc\u00ff\u0105\u0110\u011b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}