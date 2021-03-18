package com.EFScript.Script;

import java.util.ArrayList;
import java.util.List;

import com.EFScript.Logger;

import com.EFScript.Antlr.EFScriptLexer;
import com.EFScript.Antlr.EFScriptParser;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class EFSCompiler
{
	public EFSCompiler(String code)
	{
		EFScriptLexer lexer = new EFScriptLexer(CharStreams.fromString(code));
		EFScriptParser parser = new EFScriptParser(new CommonTokenStream(lexer));
		ParseTree tree = parser.parse();
	}

	public byte[] compile()
	{
		return new byte[0];
	}
}