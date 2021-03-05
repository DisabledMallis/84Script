public class EFSToken
{
  public enum Type
  {
    FUNCTION_DEFINITION,
    FUNCTION_CALL,
    VARIABLE_DECLARATION,
    VARIABLE_REFERENCE,
    PARAMETER_TYPE,
    PARAMETER_NAME;
  }
  String tokenStr;
  Type tokenType;

  public EFSToken(String tokenStr, Type tokenType)
  {
    this.tokenStr = tokenStr;
    this.tokenType = tokenType;
  }
}