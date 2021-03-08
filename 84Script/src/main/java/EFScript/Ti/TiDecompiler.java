package EFScript.Ti;

public class TiDecompiler
{
  byte[] code;
  public TiDecompiler(TiFile source)
  {
    code = source.programCode;
  }
  public TiDecompiler(byte[] code)
  {
    this.code = code;
  }

  public String decompile()
  {
    StringBuilder build = new StringBuilder();
    for(byte c : code)
    {
      TiToken token = TiToken.getToken(c);
      build.append(token.str);
    }
    return build.toString();
  }
}