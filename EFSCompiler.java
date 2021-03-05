import java.util.ArrayList;
import java.util.Scanner;

public class EFSCompiler
{
  String code;
  int index = 0;
  Scanner scan;
  public EFSCompiler(String code)
  {
    this.code = code;
    this.scan = new Scanner(code);
  }
  public String readBlock()
  {
    scan.useDelimiter(";");
    String theNext = scan.next();
    return theNext;
  }

  public TiToken[] compile()
  {
    ArrayList<TiToken> tokens = new ArrayList<>();
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
    return tokens;
  }
}