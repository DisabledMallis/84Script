package EFScript.Script;

import org.antlr.v4.tool.LexerGrammar;

public class EFSCompiler
{
	public EFSCompiler(String code)
	{
		LexerGrammar lg = new LexerGrammar();
		Grammar g = new Grammar();
		LexerInterpreter lexEngine = lg.createLexerInterpreter();
	}

	public byte[] compile()
	{
		return new byte[0];
	}
}