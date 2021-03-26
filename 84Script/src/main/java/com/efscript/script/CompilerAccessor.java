package com.efscript.script;

public abstract class CompilerAccessor {
	public EFSCompiler currentCompiler()
	{
		return EFSCompiler.currentCompiler();
	}
}
