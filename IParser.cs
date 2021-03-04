namespace EFScript
{
  public interface IParser
  {
    List<IToken> ParseTokens(string script);
  }
}