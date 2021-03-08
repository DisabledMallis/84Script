package EFScript.Script;

public enum EFSOperators implements EFSToken
{
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");


    String operator;
    EFSOperators(String operator)
    {
        this.operator = operator;
    }
    @Override
    public TiToken[] genAccessor()
    {

        switch(this)
        {
            case ADD:
                return new TiToken[]{TiToken.ADD};
            case SUBTRACT:
                return new TiToken[]{TiToken.SUBTRACT};
            case MULTIPLY:
                return new TiToken[]{TiToken.MULTIPLY};
            case DIVIDE:
                return new TiToken[]{TiToken.DIVIDE};
            default:
                return null;
        }
    }
}
