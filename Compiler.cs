namespace EFScript
{
  public class Compiler : ICompiler
  {
    IParser parser;
    public Compiler()
    {
      parser = new Parser();
    }
    public void Compile(string script)
    {
      List<IToken> tokens = parser.ParseTokens(script);
    }
  }
}