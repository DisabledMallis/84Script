import java.util.ArrayList;

public class TICompiler {
    ArrayList<TIToken> tokens;
    private static final String compilerVersion = "0.0.1";
    private static final String fileType = "**TI83F*";
    public TICompiler(String code)
    {
        tokens = new ArrayList<>();
    }
    public void appendInstruction(TIToken token)
    {
        tokens.add(token);
    }
    public byte[] compile()
    {

    }
}
