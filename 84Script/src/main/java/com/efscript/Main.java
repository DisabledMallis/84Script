package com.efscript;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.efscript.script.EFSCompiler;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiDecompiler;
import com.efscript.ti.TiFile;

public class Main {
	// EFSCompiler version
	public static final String version = "0.0.1";
	public static final String fileDesc = "Compiled with 84Script (" + version + ")";

	// Entry function
	public static void main(String[] args) throws Exception {
		//If args dont exist
		if(args == null || args.length == 0) {
			Logger.Log("No args provided! Use -h for help.");
		}
		String first = args[0];
		if(first.equals("-h")) {
			Logger.Log("84Script compiler");
			Logger.Log("-f <filename> | compile an 'efs' file");
			Logger.Log("-ti <filename> | Compile a 'ti' file (TiBasic)");
			Logger.Log("-o <filename> | The output file. Should end with '.8xp'");
		}
		/*
		// Compile "Test.ti"
		if (testCompileTI()) {
			Logger.Log("Successfully compiled Ti-Basic!");
		}
		// Compile "Test.efs"
		if (testCompileEF()) {
			Logger.Log("Successfully compiled EFS!");
		}
		*/
	}

	static boolean testCompileEF() {
		try {
			// Compile "Test.efs"
			String code = Files.readString(Paths.get("Test.efs"));
			EFSCompiler compiler = new EFSCompiler(code);
			byte[] compiled = compiler.compile();
			TiDecompiler decomp = new TiDecompiler(compiled);
			Logger.Log("EFS TEST RESULTS");
			Logger.Log(decomp.getCode());

			TiFile newFile = new TiFile(fileDesc, "Test", compiled);
			byte[] fileBytes = newFile.generateNew();
			File jFile = new File("Gen.8xp");
			if (!jFile.exists()) {
				jFile.createNewFile();
			}
			jFile.setWritable(true);
			Files.write(jFile.toPath(), fileBytes);

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	static boolean testCompileTI() {
		try {
			// Compile "Test.efs"
			String code = Files.readString(Paths.get("Test.ti"));
			TiCompiler comp = new TiCompiler(code);
			byte[] compiled = comp.compile();

			TiDecompiler decomp = new TiDecompiler(compiled);
			Logger.Log("TI TEST RESULTS");
			Logger.Log(decomp.getCode());

			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}