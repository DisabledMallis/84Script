package EFScript.Script;

import EFScript.Ti.TiCompiler;
import EFScript.Ti.TiToken;

public class EFSVarToken implements EFSToken {

    String name;
    int listPos;

    public EFSVarToken(String name, int listPos)
    {
        this.name = name;
        this.listPos = listPos;
    }

    @Override
    public TiToken[] genAccessor() {
        TiCompiler compiler = new TiCompiler();
        compiler.appendInstruction(TiToken.LIST);
        compiler.appendInstruction(TiToken.LIST_SUBSCRIPT_1);
        compiler.appendInstruction(TiToken.OPEN_BRACKET);
        TiToken indexToken = TiToken.getTokenByName("NUM_"+listPos);
        compiler.appendInstruction(indexToken);
        compiler.appendInstruction(TiToken.CLOSE_BRACKET);
        return compiler.getTokens();
    }
    
}
