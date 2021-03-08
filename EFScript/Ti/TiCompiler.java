package EFScript.Ti;

import java.util.ArrayList;

public class TiCompiler {
    ArrayList<TiToken> tokens;
    public TiCompiler()
    {
        tokens = new ArrayList<>();
    }
    public void appendInstruction(TiToken token)
    {
        tokens.add(token);
    }
    public TiToken[] getTokens()
    {
        TiToken[] ret = new TiToken[tokens.size()];
        for(int i = 0; i < ret.length; i++)
        {
            ret[i] = tokens.get(i);
        }
        return ret;
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
