package EFScript.Script;

public class EFSToken {
    public enum EFSTokenType
    {
        EFS_DOUBLE("double"),
        EFS_IDENTIFIER("identifier"),
        EFS_STRING_LITERAL("string"),
        EFS_EOF("end of file"),
        EFS_IF("if"),
        EFS_WHILE("while"),
        EFS_FOR("for"),
        EFS_RETURN("return"),
        EFS_VAR("var"),
        EFS_OPEN_BRACKET("("),
        EFS_CLOSE_BRACKET(")"),
        EFS_COMMA(","),
        EFS_OPEN_CURLY("{"),
        EFS_CLOSE_CURLY("}"),
        EFS_ADD("+"),
        EFS_SUB("-"),
        EFS_MUL("*"),
        EFS_DIV("/"),
        EFS_EQUAL("="),
        EFS_INC("++"),
        EFS_DEC("--"),
        EFS_ADD_TO("+="),
        EFS_SUB_FROM("-="),
        EFS_OR("||"),
        EFS_AND("&&"),
        EFS_NOT_EQUAL("!="),
        EFS_EQUALS("==");

        String typeStr = "";
        private EFSTokenType(String typeStr)
        {
            this.typeStr = typeStr;
        }
    }
    private EFSTokenType type;
    private String value;
    public EFSToken(EFSTokenType type, String value)
    {
        this.type = type;
        this.value = value;
    }
    public EFSTokenType getType()
    {
        return this.type;
    }
    public String getValue()
    {
        return this.value;
    }
}
