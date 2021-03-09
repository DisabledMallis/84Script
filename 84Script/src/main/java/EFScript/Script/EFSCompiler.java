package EFScript.Script;

import EFScript.Logger;
import EFScript.Ti.TiCompiler;

public class EFSCompiler {
    String efsCode = "";
    int index = -1;
    public EFSCompiler(String efsCode)
    {
        Logger.Log("Initializing EFS compilation...");
        //Any initialization here
        this.efsCode = efsCode;
        Logger.Log("Initialized EFS compilation");
    }

    public char readNext()
    {
        index++;
        return efsCode.charAt(index);
    }
    public boolean hasNext()
    {
        return index+1 < efsCode.length();
    }
    public char readPrevious()
    {
        index--;
        return efsCode.charAt(index);
    }

    public String getNextBlock()
    {
        String total = "";
        char last = ' ';
        while(hasNext() && last != ';')
        {
            last = readNext();
            total += last;
        }
        return total;
    }

    public byte[] compile()
    {
        TiCompiler compiler = new TiCompiler();



        return compiler.compile();
    }
}
