import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    // Write your code here
    Scanner obj = new Scanner(System.in);
    String s=obj.next();
    String p=obj.next();
    int l=p.length();
    int flag=0;
    try
    {
    if(l<6)
    {throw new Exception("Too short!");}
    else
    {
      for(int i=0;i<l;i++)
      {
        if(p.charAt(i)>=48 && p.charAt(i)<=57)
        {flag=1;
        break;}
        else
        {flag=0;}
      }
    }
      if(flag==1)
      {throw new Exception("Correct");}
      else
      {throw new Exception("No digit!");}
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}