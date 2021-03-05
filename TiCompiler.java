import java.util.ArrayList;

public class TiCompiler {
    ArrayList<TiToken> tokens;
    private static final String compilerVersion = "0.0.1";
    private static final String fileType = "**TI83F*";
    public TiCompiler()
    {
        tokens = new ArrayList<>();
    }
    public void appendInstruction(TiToken token)
    {
        tokens.add(token);
    }
    public byte[] compile()
    {
        byte[] compiled = new byte[tokens.size()];
        for(int i = 0; i < compiled.length; i++)
        {
          compiled[i] = tokens.get(i).hex;
        }
        return compiled;
    }
}
