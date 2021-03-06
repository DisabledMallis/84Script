import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EFSCompiler
{
  String code;
  int index = 0;
  Scanner scan;
  EFSFunctionTable funcTable;
  EFSVarTable varTable;
  public EFSCompiler(String code)
  {
    this.code = collapseCode(removeComments(code));
    this.scan = new Scanner(this.code);
    funcTable = new EFSFunctionTable();
    varTable = new EFSVarTable();
  }

  public String removeComments(String code)
  {
    return code.replaceAll("(#.*)", "");
  }

  public String collapseCode(String code)
  {
    return code.replaceAll(" ", "").replaceAll("\r", "").replaceAll("\n", "");
  }

  public boolean blocksRemain()
  {
    return scan.hasNext();
  }

  public String readBlock()
  {
    scan.useDelimiter(Pattern.compile("[;{]"));
    String theNext = scan.next();
    return theNext;
  }

  public void parseBlock()
  {
    String block = readBlock();
    System.out.println(block);
    //Is a var, add it to the table & compile its code
    if(block.startsWith("var"))
    {
      String[] tokens = block.replaceFirst("var", "").split("=");
      String name = tokens[0];
      double value = Double.parseDouble(tokens[1]);
      varTable.addVar(name, value);
    }
  }
  public TiToken[] compile()
  {
    ArrayList<TiToken> tokens = new ArrayList<>();

    while(blocksRemain())
    {
      parseBlock();
    }

    for(EFSVarTable.EFSVariable var : varTable.getVariables())
    {
      System.out.println("Got variable: " + var.name + " with base value: " + var.initVal);
    }


    /*
    Initialization section

      IF I=0
      THEN
      0->F
      0->G
      0->C
      1->I
      END

    */
    /*
    Prologue

      IF I=0
      THEN

    */
    tokens.add(TiToken.IF);
    tokens.add(TiToken.LETTER_I);
    tokens.add(TiToken.EQUALS);
    tokens.add(TiToken.NUM_0);
    tokens.add(TiToken.NEWLINE);
    tokens.add(TiToken.THEN);
    /*
    Initialization code

      0->F
      0->G
      0->C
      1->I

    */
    //0->F
    tokens.add(TiToken.NUM_0);
    tokens.add(TiToken.STORE);
    tokens.add(TiToken.LETTER_F);
    //0->G
    tokens.add(TiToken.NUM_0);
    tokens.add(TiToken.STORE);
    tokens.add(TiToken.LETTER_G);
    //0->C
    tokens.add(TiToken.NUM_0);
    tokens.add(TiToken.STORE);
    tokens.add(TiToken.LETTER_C);
    //1->I
    tokens.add(TiToken.NUM_1);
    tokens.add(TiToken.STORE);
    tokens.add(TiToken.LETTER_I);
    /*
    Epilogue

      END

    */
    tokens.add(TiToken.END);


    /*
    Function Table

      IF G>0
      THEN
      //Function 1 ------|
      IF F=1             |
      THEN               |
      //Function code    |-Repeated for every function
                         |
      END                |
      //Function 1 end --|
      END
    */
    scan.close();

    TiToken[] retTokes = new TiToken[tokens.size()];
    for(int i = 0; i < retTokes.length; i++)
    {
      retTokes[i] = tokens.get(i);
    }
    return retTokes;
  }
}