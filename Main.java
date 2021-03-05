import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        TiFile file = new TiFile("Test.8xp");
        System.out.println(file.toString());
        byte[] newCode = file.generateNew();
        Files.write(Paths.get("New.8xp"), newCode);
        // String code = Files.readString(Paths.get("Test.84s"));
        // TICompiler compiler = new TICompiler(code);
        // byte[] result = compiler.compile();
    }
}