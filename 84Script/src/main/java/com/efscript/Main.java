package com.efscript;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;

import com.efscript.script.EFSCompiler;
import com.efscript.ti.TiCompiler;
import com.efscript.ti.TiDecompiler;
import com.efscript.ti.TiFile;
import com.efscript.ti.TiToken;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

public class Main {
	private enum Lang{
		EFS,
		TIB;

		private Lang() {

		}
		public String getName() {
			return this.toString();
		}
		public static Lang getLang(String str) throws Exception {
			for(Lang l : Lang.values()) {
				if(l.getName().equalsIgnoreCase(str)) {
					return l;
				}
			}
			throw new Exception("Unsupported language \""+str+"\"");
		}
	}

	// EFSCompiler version
	public static final String version = "0.0.1";
	public static final String fileDesc = "Compiled with 84Script (" + version + ")";

	//Default option values
	public static String prgmName = "ESFG"; //84Script Generated
	public static String inputFile = "Source.efs";
	public static String outputFile;
	public static Lang targetLang = Lang.EFS;

	// Entry function
	public static void main(String[] args) throws Exception {
		//Apache commons-cli options
		Options options = new Options();
		Option help = Option.builder("h").longOpt("help").desc("Help menu").required(false).build();
		options.addOption(help);
		Option file = Option.builder("f").longOpt("file").hasArg().desc("Source file to compile").numberOfArgs(1).argName("File name").required(false).build();
		options.addOption(file);
		Option out = Option.builder("o").longOpt("output").hasArg().desc("Output file path").numberOfArgs(1).argName("File name").required(false).build();
		options.addOption(out);
		Option lang = Option.builder("l").longOpt("lang").hasArg().desc("Language to compile (EFS or TIB)").numberOfArgs(1).argName("Target language (EFS or TIB)").required(false).build();
		options.addOption(lang);
		Option useTib = Option.builder("ti").desc("Compile just Ti-Basic. Shorter alternative to -l TIB").required(false).build();
		options.addOption(useTib);
		Option useEfs = Option.builder("efs").desc("Compile just 84Script. Shorter alternative to -l EFS").required(false).build();
		options.addOption(useEfs);

		//Command arg parser stuff
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);

		//If no commands are provided
		if(cmd.getArgs().length == 0) {
			Logger.Log("No args provided! Use '-h' for help.");
			return;
		}
		//Help argument
		if(cmd.hasOption("h")) {
			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("84Script", options);
			return;
		}
		//Options
		if(cmd.hasOption("f")) {
			inputFile = cmd.getOptionValue("f");
		}
		if(cmd.hasOption("o")) {
			outputFile = cmd.getOptionValue("o");
		}
		if(cmd.hasOption("l")) {
			String langTarget = cmd.getOptionValue("l");
			targetLang = Lang.getLang(langTarget);
		}
		if(cmd.hasOption("ti")) {
			targetLang = Lang.TIB;
		}
		if(cmd.hasOption("efs")) {
			targetLang = Lang.EFS;
		}

		//Read input file
		String code = Files.readString(Paths.get(inputFile));

		//Compile code
		TiToken[] programCode;
		if(targetLang == Lang.TIB) {
			TiCompiler compiler = new TiCompiler(code);
			programCode = compiler.getTokens();
		}
		else {
			EFSCompiler compiler = new EFSCompiler(code);
			if(outputFile == null) {
				String scriptName = compiler.getMetaScriptName();
				outputFile = scriptName + ".8xp";
				prgmName = scriptName;
			}
			programCode = compiler.getTokens();
		}

		//Generate the output file
		TiFile outFile = new TiFile(prgmName, programCode);
		byte[] fileData = outFile.pack();

		//Output file creation
		File jFile = new File(outputFile);
		if (!jFile.exists()) {
			jFile.createNewFile();
		}
		jFile.setWritable(true);
		Files.write(jFile.toPath(), fileData);
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

			TiFile newFile = new TiFile("Test", decomp.decompile());
			byte[] fileBytes = newFile.pack();
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