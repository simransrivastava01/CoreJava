import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      if(n%2==0)
      {System.out.print("Even");}
      else
      {System.out.print("Odd");}
    }
}