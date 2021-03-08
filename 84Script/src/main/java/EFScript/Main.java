package EFScript;

import java.nio.file.Files;
import java.nio.file.Paths;

import EFScript.Script.EFSCompiler;
import EFScript.Ti.TiCompiler;
import EFScript.Ti.TiFile;
import EFScript.Ti.TiToken;

public class Main
{
    public static final String version = "0.0.1"; 
    public static void main(String[] args) throws Exception
    {
        TiCompiler compile = new TiCompiler();
        compile.appendInstruction(TiToken.LIST);
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
        TiFile file = new TiFile("Generated with 84Script v"+version, "Swag", newCode);
        byte[] newFile = file.generateNew();
        Files.write(Paths.get("New.8xp"), newFile);

        String code = Files.readString(Paths.get("Test.84s"));
        EFSCompiler compiler = new EFSCompiler(code);
        byte[] result = compiler.compile();
    }
}