import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int fact=1;
        Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      while(n>0)
      {
        fact=fact*n;
        n--;
      }
      System.out.print(fact);
    }
}