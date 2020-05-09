import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int sum=0,i=0;
        Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      for(i=1;i<=n;i++)
      {
        sum=sum+i;
      }
      System.out.print(sum);
    }
}