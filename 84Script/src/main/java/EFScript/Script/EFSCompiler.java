package EFScript.Script;

import EFScript.Logger;

import java.nio.file.Paths;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserInterpreter;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.tool.Grammar;
import org.antlr.v4.tool.LexerGrammar;

public class EFSCompiler
{
	public static ParseTree parse(String fileName, String combinedGrammarFileName, String startRule) throws Exception
	{
		final Grammar g = Grammar.load(combinedGrammarFileName);
		LexerInterpreter lexEngine = g.createLexerInterpreter(CharStreams.fromPath(Paths.get(fileName)));
		CommonTokenStream tokens = new CommonTokenStream(lexEngine);
		ParserInterpreter parser = g.createParserInterpreter(tokens);
		ParseTree t = parser.parse(g.getRule(startRule).index);
		return t;
	}
	public EFSCompiler(String code)
	{
		try {
			ParseTree tree = parse("Test.84s", "EFScript.g4", "script");
			Logger.Log(tree);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public byte[] compile()
	{
		return new byte[0];
	}
}