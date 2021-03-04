using System;

class Entry
{
  public static void Main (string[] args)
  {
    string filename = "Main.84s";
    try
    {
      filename = args[0];
    }catch(Exception)
    {
      Console.WriteLine("No file provided, assuming with name 'Main.84s'");
    }
    Console.WriteLine(filename);
    Console.WriteLine("Compiling...")
    
  }


}