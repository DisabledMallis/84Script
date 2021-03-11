package EFScript.Script;

public class EFSToken {
    public enum EFSTokenType
    {
		// EFS - An 84Script token
		// EOP - Expression operator
		// DOP - Double operator (Requires 2 expressions)
		// SOP - Single operator (Requires 1 expression)
		
        EFS_DOUBLE("double"),
        EFS_IDENTIFIER("identifier"),
        EFS_STRING_LITERAL("string"),
        EFS_EOF("end of file"),
        EFS_IF("if"),
        EFS_WHILE("while"),
        EFS_FOR("for"),
        EFS_RETURN("return"),
        EFS_VAR("var"),
        EFS_EOP_OPEN_BRACKET("("),
        EFS_EOP_CLOSE_BRACKET(")"),
        EFS_COMMA(","),
        EFS_OPEN_CURLY("{"),
        EFS_CLOSE_CURLY("}"),
        EFS_DOP_ADD("+"),
        EFS_DOP_SUB("-"),
        EFS_DOP_MUL("*"),
        EFS_DOP_DIV("/"),
        EFS_DOP_EQUAL("="),
        EFS_SOP_INC("++"),
        EFS_SOP_DEC("--"),
        EFS_SOP_ADD_TO("+="),
        EFS_SOP_SUB_FROM("-="),
        EFS_DOP_OR("||"),
        EFS_DOP_AND("&&"),
        EFS_DOP_NOT_EQUAL("!="),
        EFS_DOP_EQUALS("==");

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
