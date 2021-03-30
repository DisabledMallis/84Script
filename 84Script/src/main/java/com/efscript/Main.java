package com.efscript;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.efscript.script.EFSCompiler;
import com.efscript.ti.TiDecompiler;
import com.efscript.ti.TiFile;

public class Main {
	// EFSCompiler version
	public static final String version = "0.0.1";
	public static final String fileDesc = "Compiled with 84Script ("+version+")";

	// Entry function
	public static void main(String[] args) throws Exception {
		//Compile "Test.ti"
		if(testCompileTI()) {
			Logger.Log("Successfully compiled Ti-Basic!");
		}
		//Compile "Test.efs"
		if(testCompileEF()) {
			Logger.Log("Successfully compiled EFS!");
		}
	}

	static boolean testCompileEF() {
		try{
			// Compile "Test.84s"
			String code = Files.readString(Paths.get("Test.efs"));
			EFSCompiler compiler = new EFSCompiler(code);
			byte[] compiled = compiler.compile();
			TiDecompiler decomp = new TiDecompiler(compiled);
			Logger.Log(decomp.decompile());

			TiFile newFile = new TiFile(fileDesc, "Test", compiled);
			byte[] fileBytes = newFile.generateNew();
			File jFile = new File("Gen.8xp");
			if (!jFile.exists()) {
				jFile.createNewFile();
			}
			jFile.setWritable(true);
			Files.write(jFile.toPath(), fileBytes);

			return true;
		}catch (Exception ex){
			return false;
		}
	}
	static boolean testCompileTI() {

	}
}