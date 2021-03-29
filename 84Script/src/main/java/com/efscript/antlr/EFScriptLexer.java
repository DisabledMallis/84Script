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
		INCREMENT=24, DECREMENT=25, DEF=26, VAR=27, IF=28, WHILE=29, RETURN=30, 
		TRUE=31, FALSE=32, IDENTIFIER=33, NUMBER=34, PI=35, E=36, QUOTED_TEXT=37, 
		LINECOMMENT=38, BLOCKCOMMENT=39, WHITESPACE=40;
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
			"INCREMENT", "DECREMENT", "DEF", "VAR", "IF", "WHILE", "RETURN", "TRUE", 
			"FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "INT", "QUOTED_TEXT", "LINECOMMENT", 
			"BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'||'", "'&&'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'def'", "'var'", 
			"'if'", "'while'", "'return'", "'true'", "'false'", null, null, "'pi'", 
			"'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "GREATER_THAN_OR_EQUAL", "LESS_THAN_OR_EQUAL", 
			"OR", "AND", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", "DIVASSIGN", 
			"INCREMENT", "DECREMENT", "DEF", "VAR", "IF", "WHILE", "RETURN", "TRUE", 
			"FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "QUOTED_TEXT", "LINECOMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fe\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\7\"\u00b9\n\"\f\"\16\"\u00bc\13\"\3#\5#\u00bf\n"+
		"#\3#\3#\3#\6#\u00c4\n#\r#\16#\u00c5\5#\u00c8\n#\3$\3$\3$\3%\3%\3&\3&\3"+
		"&\7&\u00d2\n&\f&\16&\u00d5\13&\5&\u00d7\n&\3\'\3\'\7\'\u00db\n\'\f\'\16"+
		"\'\u00de\13\'\3\'\3\'\3(\3(\3(\3(\7(\u00e6\n(\f(\16(\u00e9\13(\3(\3(\3"+
		")\3)\3)\3)\7)\u00f1\n)\f)\16)\u00f4\13)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3\u00f2"+
		"\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\2M\'O(Q)S*\3\2\t\4\2C\\c|\6\2\62;C\\aac|\3\2\62;"+
		"\3\2\63;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0105\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3"+
		"\2\2\2\7Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\r_\3\2\2\2\17a\3\2\2\2\21c\3"+
		"\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35"+
		"p\3\2\2\2\37s\3\2\2\2!v\3\2\2\2#y\3\2\2\2%|\3\2\2\2\'\177\3\2\2\2)\u0081"+
		"\3\2\2\2+\u0084\3\2\2\2-\u0087\3\2\2\2/\u008a\3\2\2\2\61\u008d\3\2\2\2"+
		"\63\u0090\3\2\2\2\65\u0093\3\2\2\2\67\u0097\3\2\2\29\u009b\3\2\2\2;\u009e"+
		"\3\2\2\2=\u00a4\3\2\2\2?\u00ab\3\2\2\2A\u00b0\3\2\2\2C\u00b6\3\2\2\2E"+
		"\u00be\3\2\2\2G\u00c9\3\2\2\2I\u00cc\3\2\2\2K\u00d6\3\2\2\2M\u00d8\3\2"+
		"\2\2O\u00e1\3\2\2\2Q\u00ec\3\2\2\2S\u00fa\3\2\2\2UV\7.\2\2V\4\3\2\2\2"+
		"WX\7*\2\2X\6\3\2\2\2YZ\7+\2\2Z\b\3\2\2\2[\\\7}\2\2\\\n\3\2\2\2]^\7\177"+
		"\2\2^\f\3\2\2\2_`\7=\2\2`\16\3\2\2\2ab\7-\2\2b\20\3\2\2\2cd\7/\2\2d\22"+
		"\3\2\2\2ef\7,\2\2f\24\3\2\2\2gh\7\61\2\2h\26\3\2\2\2ij\7@\2\2j\30\3\2"+
		"\2\2kl\7>\2\2l\32\3\2\2\2mn\7?\2\2no\7?\2\2o\34\3\2\2\2pq\7#\2\2qr\7?"+
		"\2\2r\36\3\2\2\2st\7@\2\2tu\7?\2\2u \3\2\2\2vw\7>\2\2wx\7?\2\2x\"\3\2"+
		"\2\2yz\7~\2\2z{\7~\2\2{$\3\2\2\2|}\7(\2\2}~\7(\2\2~&\3\2\2\2\177\u0080"+
		"\7?\2\2\u0080(\3\2\2\2\u0081\u0082\7-\2\2\u0082\u0083\7?\2\2\u0083*\3"+
		"\2\2\2\u0084\u0085\7/\2\2\u0085\u0086\7?\2\2\u0086,\3\2\2\2\u0087\u0088"+
		"\7,\2\2\u0088\u0089\7?\2\2\u0089.\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c"+
		"\7?\2\2\u008c\60\3\2\2\2\u008d\u008e\7-\2\2\u008e\u008f\7-\2\2\u008f\62"+
		"\3\2\2\2\u0090\u0091\7/\2\2\u0091\u0092\7/\2\2\u0092\64\3\2\2\2\u0093"+
		"\u0094\7f\2\2\u0094\u0095\7g\2\2\u0095\u0096\7h\2\2\u0096\66\3\2\2\2\u0097"+
		"\u0098\7x\2\2\u0098\u0099\7c\2\2\u0099\u009a\7t\2\2\u009a8\3\2\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7h\2\2\u009d:\3\2\2\2\u009e\u009f\7y\2\2\u009f"+
		"\u00a0\7j\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7g\2\2"+
		"\u00a3<\3\2\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2"+
		"\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7p\2\2\u00aa>\3\2"+
		"\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af"+
		"\7g\2\2\u00af@\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5B\3\2\2\2\u00b6\u00ba"+
		"\t\2\2\2\u00b7\u00b9\t\3\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bbD\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bd\u00bf\7/\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c7\5K&\2\u00c1\u00c3\7\60\2\2\u00c2\u00c4\t\4\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"F\3\2\2\2\u00c9\u00ca\7r\2\2\u00ca\u00cb\7k\2\2\u00cbH\3\2\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cdJ\3\2\2\2\u00ce\u00d7\7\62\2\2\u00cf\u00d3\t\5\2\2\u00d0"+
		"\u00d2\t\4\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d7L\3\2\2\2\u00d8\u00dc\7$\2\2\u00d9"+
		"\u00db\n\6\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\7$\2\2\u00e0N\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7\61\2\2"+
		"\u00e3\u00e7\3\2\2\2\u00e4\u00e6\n\7\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00eb\b(\2\2\u00ebP\3\2\2\2\u00ec\u00ed\7\61\2\2"+
		"\u00ed\u00ee\7,\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\13\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\7\61"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b)\2\2\u00f9R\3\2\2\2\u00fa\u00fb"+
		"\t\b\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b*\2\2\u00fdT\3\2\2\2\f\2\u00ba"+
		"\u00be\u00c5\u00c7\u00d3\u00d6\u00dc\u00e7\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}