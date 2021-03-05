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
        file.setFileDescriptor("Generated with 84Script v"+version);
        byte[] newCode = new byte[]{
            TiToken.LETTER_H.hex,
            TiToken.LETTER_E.hex,
            TiToken.LETTER_L.hex,
            TiToken.LETTER_L.hex,
            TiToken.LETTER_O.hex,
            TiToken.COMMA.hex,
            TiToken.BLANK.hex,
            TiToken.LETTER_W.hex,
            TiToken.LETTER_O.hex,
            TiToken.LETTER_R.hex,
            TiToken.LETTER_L.hex,
            TiToken.LETTER_D.hex,
            TiToken.EXCLAMATION_MARK.hex
        };
        file.setProgramCode(newCode);
        byte[] newFile = file.generateNew();
        Files.write(Paths.get("New.8xp"), newFile);
        // String code = Files.readString(Paths.get("Test.84s"));
        // TICompiler compiler = new TICompiler(code);
        // byte[] result = compiler.compile();
    }
}