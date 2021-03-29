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
		T__0=1, OPEN_BRACKET=2, CLOSE_BRACKET=3, OPEN_CURLEY=4, CLOSE_CURLEY=5, 
		END_STMT=6, ADD=7, SUB=8, MUL=9, DIV=10, GREATER_THAN=11, LESS_THAN=12, 
		EQUAL_TO=13, NOT_EQUAL_TO=14, GREATER_THAN_OR_EQUAL=15, LESS_THAN_OR_EQUAL=16, 
		OR=17, AND=18, ASSIGN=19, ADDASSIGN=20, SUBASSIGN=21, MULASSIGN=22, DIVASSIGN=23, 
		INCREMENT=24, DECREMENT=25, DEF=26, VAR=27, STR=28, IF=29, WHILE=30, RETURN=31, 
		TRUE=32, FALSE=33, IDENTIFIER=34, NUMBER=35, PI=36, E=37, QUOTED_TEXT=38, 
		LINECOMMENT=39, BLOCKCOMMENT=40, WHITESPACE=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"OR", "AND", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"INCREMENT", "DECREMENT", "DEF", "VAR", "STR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "INT", "QUOTED_TEXT", 
			"LINECOMMENT", "BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'def'", "'var'", 
			"'str'", "'if'", "'while'", "'return'", "'true'", "'false'", null, null, 
			"'pi'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"OR", "AND", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"INCREMENT", "DECREMENT", "DEF", "VAR", "STR", "IF", "WHILE", "RETURN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00bf\n#\f#\16#\u00c2\13#\3$"+
		"\5$\u00c5\n$\3$\3$\3$\6$\u00ca\n$\r$\16$\u00cb\5$\u00ce\n$\3%\3%\3%\3"+
		"&\3&\3\'\3\'\3\'\7\'\u00d8\n\'\f\'\16\'\u00db\13\'\5\'\u00dd\n\'\3(\3"+
		"(\7(\u00e1\n(\f(\16(\u00e4\13(\3(\3(\3)\3)\3)\3)\7)\u00ec\n)\f)\16)\u00ef"+
		"\13)\3)\3)\3*\3*\3*\3*\7*\u00f7\n*\f*\16*\u00fa\13*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3\u00f8\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O(Q)S*U+\3\2\t\4\2C\\c|\6\2\62"+
		";C\\aac|\3\2\62;\3\2\63;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17"+
		"\"\"\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3"+
		"\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31"+
		"m\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37u\3\2\2\2!x\3\2\2\2#{\3\2\2\2%~\3"+
		"\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+\u0086\3\2\2\2-\u0089\3\2\2\2/\u008c"+
		"\3\2\2\2\61\u008f\3\2\2\2\63\u0092\3\2\2\2\65\u0095\3\2\2\2\67\u0099\3"+
		"\2\2\29\u009d\3\2\2\2;\u00a1\3\2\2\2=\u00a4\3\2\2\2?\u00aa\3\2\2\2A\u00b1"+
		"\3\2\2\2C\u00b6\3\2\2\2E\u00bc\3\2\2\2G\u00c4\3\2\2\2I\u00cf\3\2\2\2K"+
		"\u00d2\3\2\2\2M\u00dc\3\2\2\2O\u00de\3\2\2\2Q\u00e7\3\2\2\2S\u00f2\3\2"+
		"\2\2U\u0100\3\2\2\2WX\7.\2\2X\4\3\2\2\2YZ\7*\2\2Z\6\3\2\2\2[\\\7+\2\2"+
		"\\\b\3\2\2\2]^\7}\2\2^\n\3\2\2\2_`\7\177\2\2`\f\3\2\2\2ab\7=\2\2b\16\3"+
		"\2\2\2cd\7-\2\2d\20\3\2\2\2ef\7/\2\2f\22\3\2\2\2gh\7,\2\2h\24\3\2\2\2"+
		"ij\7\61\2\2j\26\3\2\2\2kl\7@\2\2l\30\3\2\2\2mn\7>\2\2n\32\3\2\2\2op\7"+
		"?\2\2pq\7?\2\2q\34\3\2\2\2rs\7#\2\2st\7?\2\2t\36\3\2\2\2uv\7@\2\2vw\7"+
		"?\2\2w \3\2\2\2xy\7>\2\2yz\7?\2\2z\"\3\2\2\2{|\7~\2\2|}\7~\2\2}$\3\2\2"+
		"\2~\177\7(\2\2\177\u0080\7(\2\2\u0080&\3\2\2\2\u0081\u0082\7?\2\2\u0082"+
		"(\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085\7?\2\2\u0085*\3\2\2\2\u0086\u0087"+
		"\7/\2\2\u0087\u0088\7?\2\2\u0088,\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b"+
		"\7?\2\2\u008b.\3\2\2\2\u008c\u008d\7\61\2\2\u008d\u008e\7?\2\2\u008e\60"+
		"\3\2\2\2\u008f\u0090\7-\2\2\u0090\u0091\7-\2\2\u0091\62\3\2\2\2\u0092"+
		"\u0093\7/\2\2\u0093\u0094\7/\2\2\u0094\64\3\2\2\2\u0095\u0096\7f\2\2\u0096"+
		"\u0097\7g\2\2\u0097\u0098\7h\2\2\u0098\66\3\2\2\2\u0099\u009a\7x\2\2\u009a"+
		"\u009b\7c\2\2\u009b\u009c\7t\2\2\u009c8\3\2\2\2\u009d\u009e\7u\2\2\u009e"+
		"\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7h\2\2\u00a3<\3\2\2\2\u00a4\u00a5\7y\2\2\u00a5\u00a6\7j\2\2\u00a6"+
		"\u00a7\7k\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9\7g\2\2\u00a9>\3\2\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2"+
		"\u00ae\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0@\3\2\2\2\u00b1\u00b2\7v\2"+
		"\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7g\2\2\u00b5B\3\2"+
		"\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7g\2\2\u00bbD\3\2\2\2\u00bc\u00c0\t\2\2\2\u00bd\u00bf"+
		"\t\3\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1F\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7/\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cd\5M"+
		"\'\2\u00c7\u00c9\7\60\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ceH\3\2\2\2\u00cf\u00d0"+
		"\7r\2\2\u00d0\u00d1\7k\2\2\u00d1J\3\2\2\2\u00d2\u00d3\7g\2\2\u00d3L\3"+
		"\2\2\2\u00d4\u00dd\7\62\2\2\u00d5\u00d9\t\5\2\2\u00d6\u00d8\t\4\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc"+
		"\u00d5\3\2\2\2\u00ddN\3\2\2\2\u00de\u00e2\7$\2\2\u00df\u00e1\n\6\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7$\2\2\u00e6"+
		"P\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ed\3\2\2"+
		"\2\u00ea\u00ec\n\7\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f1\b)\2\2\u00f1R\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7,\2\2\u00f4"+
		"\u00f8\3\2\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7,\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\b*\2\2\u00ffT\3\2\2\2\u0100\u0101\t\b\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0103\b+\2\2\u0103V\3\2\2\2\f\2\u00c0\u00c4\u00cb\u00cd"+
		"\u00d9\u00dc\u00e2\u00ed\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}