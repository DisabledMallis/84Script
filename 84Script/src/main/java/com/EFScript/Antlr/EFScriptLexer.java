// Generated from EFScript.g4 by ANTLR 4.9.1

package com.EFScript.Antlr;

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
		EQUAL_TO=13, NOT_EQUAL_TO=14, ASSIGN=15, ADDASSIGN=16, SUBASSIGN=17, MULASSIGN=18, 
		DIVASSIGN=19, INCREMENT=20, DECREMENT=21, DEF=22, VAR=23, IF=24, WHILE=25, 
		RETURN=26, TRUE=27, FALSE=28, IDENTIFIER=29, NUMBER=30, PI=31, E=32, TEXT=33, 
		LINECOMMENT=34, BLOCKCOMMENT=35, WHITESPACE=36;
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
			"EQUAL_TO", "NOT_EQUAL_TO", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
			"DIVASSIGN", "INCREMENT", "DECREMENT", "DEF", "VAR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "INT", "TEXT", "LINECOMMENT", 
			"BLOCKCOMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'>'", "'<'", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'++'", "'--'", "'def'", "'var'", "'if'", "'while'", "'return'", "'true'", 
			"'false'", null, null, "'pi'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_CURLEY", "CLOSE_CURLEY", 
			"END_STMT", "ADD", "SUB", "MUL", "DIV", "GREATER_THAN", "LESS_THAN", 
			"EQUAL_TO", "NOT_EQUAL_TO", "ASSIGN", "ADDASSIGN", "SUBASSIGN", "MULASSIGN", 
			"DIVASSIGN", "INCREMENT", "DECREMENT", "DEF", "VAR", "IF", "WHILE", "RETURN", 
			"TRUE", "FALSE", "IDENTIFIER", "NUMBER", "PI", "E", "TEXT", "LINECOMMENT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00ee\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u00a5\n\36\f\36\16\36\u00a8\13\36"+
		"\3\37\5\37\u00ab\n\37\3\37\3\37\3\37\6\37\u00b0\n\37\r\37\16\37\u00b1"+
		"\5\37\u00b4\n\37\3\37\3\37\5\37\u00b8\n\37\3 \3 \3 \3!\3!\3\"\3\"\3\""+
		"\7\"\u00c2\n\"\f\"\16\"\u00c5\13\"\5\"\u00c7\n\"\3#\3#\7#\u00cb\n#\f#"+
		"\16#\u00ce\13#\3#\3#\3$\3$\3$\3$\7$\u00d6\n$\f$\16$\u00d9\13$\3$\3$\3"+
		"%\3%\3%\3%\7%\u00e1\n%\f%\16%\u00e4\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\u00e2"+
		"\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C\2E#G$I%K&\3\2\t\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\3\2\63;\5"+
		"\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00f7\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3"+
		"M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y"+
		"\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33"+
		"e\3\2\2\2\35h\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#p\3\2\2\2%s\3\2\2\2\'v\3\2"+
		"\2\2)y\3\2\2\2+|\3\2\2\2-\177\3\2\2\2/\u0083\3\2\2\2\61\u0087\3\2\2\2"+
		"\63\u008a\3\2\2\2\65\u0090\3\2\2\2\67\u0097\3\2\2\29\u009c\3\2\2\2;\u00a2"+
		"\3\2\2\2=\u00b7\3\2\2\2?\u00b9\3\2\2\2A\u00bc\3\2\2\2C\u00c6\3\2\2\2E"+
		"\u00c8\3\2\2\2G\u00d1\3\2\2\2I\u00dc\3\2\2\2K\u00ea\3\2\2\2MN\7.\2\2N"+
		"\4\3\2\2\2OP\7*\2\2P\6\3\2\2\2QR\7+\2\2R\b\3\2\2\2ST\7}\2\2T\n\3\2\2\2"+
		"UV\7\177\2\2V\f\3\2\2\2WX\7=\2\2X\16\3\2\2\2YZ\7-\2\2Z\20\3\2\2\2[\\\7"+
		"/\2\2\\\22\3\2\2\2]^\7,\2\2^\24\3\2\2\2_`\7\61\2\2`\26\3\2\2\2ab\7@\2"+
		"\2b\30\3\2\2\2cd\7>\2\2d\32\3\2\2\2ef\7?\2\2fg\7?\2\2g\34\3\2\2\2hi\7"+
		"#\2\2ij\7?\2\2j\36\3\2\2\2kl\7?\2\2l \3\2\2\2mn\7-\2\2no\7?\2\2o\"\3\2"+
		"\2\2pq\7/\2\2qr\7?\2\2r$\3\2\2\2st\7,\2\2tu\7?\2\2u&\3\2\2\2vw\7\61\2"+
		"\2wx\7?\2\2x(\3\2\2\2yz\7-\2\2z{\7-\2\2{*\3\2\2\2|}\7/\2\2}~\7/\2\2~,"+
		"\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7g\2\2\u0081\u0082\7h\2\2\u0082"+
		".\3\2\2\2\u0083\u0084\7x\2\2\u0084\u0085\7c\2\2\u0085\u0086\7t\2\2\u0086"+
		"\60\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089\62\3\2\2\2\u008a"+
		"\u008b\7y\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2"+
		"\u008e\u008f\7g\2\2\u008f\64\3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092\7"+
		"g\2\2\u0092\u0093\7v\2\2\u0093\u0094\7w\2\2\u0094\u0095\7t\2\2\u0095\u0096"+
		"\7p\2\2\u0096\66\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7t\2\2\u0099\u009a"+
		"\7w\2\2\u009a\u009b\7g\2\2\u009b8\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e"+
		"\7c\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		":\3\2\2\2\u00a2\u00a6\t\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7<\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\7/\2\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b3\5C\"\2\u00ad\u00af\7\60"+
		"\2\2\u00ae\u00b0\t\4\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ad\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b8\5? \2\u00b6\u00b8"+
		"\5A!\2\u00b7\u00aa\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8"+
		">\3\2\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7k\2\2\u00bb@\3\2\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bdB\3\2\2\2\u00be\u00c7\7\62\2\2\u00bf\u00c3\t\5\2\2\u00c0"+
		"\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c7D\3\2\2\2\u00c8\u00cc\7$\2\2\u00c9"+
		"\u00cb\n\6\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7$\2\2\u00d0F\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2\2"+
		"\u00d3\u00d7\3\2\2\2\u00d4\u00d6\n\7\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\b$\2\2\u00dbH\3\2\2\2\u00dc\u00dd\7\61\2\2"+
		"\u00dd\u00de\7,\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\13\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7\7\61"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b%\2\2\u00e9J\3\2\2\2\u00ea\u00eb"+
		"\t\b\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\b&\2\2\u00edL\3\2\2\2\r\2\u00a6"+
		"\u00aa\u00b1\u00b3\u00b7\u00c3\u00c6\u00cc\u00d7\u00e2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}