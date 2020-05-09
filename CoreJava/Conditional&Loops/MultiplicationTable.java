import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
    int i;
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int m=obj.nextInt();
    for(i=1;i<=m;i++)
    {
      System.out.println(n*i);
    }
  }
}