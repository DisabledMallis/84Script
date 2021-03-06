import java.util.ArrayList;

public class EFSVarTable
{
  public static class EFSVariable
  {
    String name;
    double initVal;

    public EFSVariable(String name, double initVal)
    {
      this.name = name;
      this.initVal = initVal;
    }
  }
  public ArrayList<EFSVariable> varPtrs;
  public EFSVarTable()
  {
    varPtrs = new ArrayList<>();
  }
  
  public void addVar(String name, double initVal)
  {
    varPtrs.add(new EFSVariable(name, initVal));
  }

  public int getLxOfVar(String varName)
  {
    int index = 0;
    for (EFSVariable var : varPtrs) {
      if(var.name.equals(varName))
      {
        break;
      }
      index++;
    }
    return index;
  }

  public EFSVariable[] getVariables()
  {
    EFSVariable[] vars = new EFSVariable[varPtrs.size()];
    for (int i = 0; i < vars.length; i++) {
      vars[i] = varPtrs.get(i);
    }
    return vars;
  }
}