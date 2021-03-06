import java.util.ArrayList;

public class EFSFunctionTable
{
  public static class EFSFunction
  {
    String name;
    String[] parameters;
    public EFSFunction(String name, String[] parameters)
    {
      this.name = name;
      this.parameters = parameters;
    }
  }
  ArrayList<EFSFunction> functionList;

  public EFSFunctionTable()
  {
    functionList = new ArrayList<>();
  }

  public void addFunc(String name, String[] params)
  {
    functionList.add(new EFSFunction(name, params));
  }
  public EFSFunction getFunc(String name)
  {
    for(EFSFunction f : functionList)
    {
      if(f.name.equals(name))
      {
        return f;
      }
    }
    return null;
  }
}