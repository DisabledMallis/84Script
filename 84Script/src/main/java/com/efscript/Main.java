package com.efscript;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.efscript.script.EFSCompiler;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiDecompiler;
import com.efscript.ti.TiFile;
import com.efscript.ti.TiToken;

public class Main {
	// EFSCompiler version
	public static final String version = "0.0.1";

	// Entry function
	public static void main(String[] args) throws Exception {
		// Testing compilation shit
		// TODO: Remove when done
		TiCompiler compile = new TiCompiler();
		compile.appendInstruction(TiToken.CONST_E);
		compile.appendInstruction(TiToken.LIST_SUBSCRIPT_1);
		compile.appendInstruction(TiToken.LETTER_H);
		compile.appendInstruction(TiToken.LETTER_E);
		compile.appendInstruction(TiToken.LETTER_L);
		compile.appendInstruction(TiToken.LETTER_L);
		compile.appendInstruction(TiToken.LETTER_O);
		compile.appendInstruction(TiToken.COMMA);
		compile.appendInstruction(TiToken.BLANK);
		compile.appendInstruction(TiToken.LETTER_W);
		compile.appendInstruction(TiToken.LETTER_O);
		compile.appendInstruction(TiToken.LETTER_R);
		compile.appendInstruction(TiToken.LETTER_L);
		compile.appendInstruction(TiToken.LETTER_D);
		compile.appendInstruction(TiToken.EXCLAMATION_MARK);
		byte[] newCode = compile.compile();
		TiDecompiler decomp = new TiDecompiler(newCode);
		String dcode = decomp.decompile();
		Logger.Log(dcode);

		TiFile file = new TiFile("Generated with 84Script v" + version, "Swag", newCode);
		byte[] newFile = file.generateNew();
		Files.write(Paths.get("New.8xp"), newFile);

		// Compile "Test.84s"
		String code = Files.readString(Paths.get("Test.84s"));
		EFSCompiler compiler = new EFSCompiler(code);
		byte[] compiled = compiler.compile();
	}
}