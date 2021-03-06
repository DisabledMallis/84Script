import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main
{
    public static final String version = "0.0.1"; 
    public static void main(String[] args) throws Exception
    {
        TiFile file = new TiFile("Test.8xp");
        System.out.println(file.toString());
        TiDecompiler decomp = new TiDecompiler(file);
        System.out.println(decomp.decompile());
        file.setFileDescriptor("Generated with 84Script v"+version);
        TiCompiler compile = new TiCompiler();
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
        file.setProgramCode(newCode);
        byte[] newFile = file.generateNew();
        Files.write(Paths.get("New.8xp"), newFile);

        // String code = Files.readString(Paths.get("Test.84s"));
        // TICompiler compiler = new TICompiler(code);
        // byte[] result = compiler.compile();
    }
}