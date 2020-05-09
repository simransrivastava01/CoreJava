import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int sum=0;
      Scanner obj=new Scanner(System.in);
       int n=obj.nextInt();
       File f=new File();
        sum=f.divisor_sum(n);
      System.out.println("Sum of all it's divisor is: "+sum);
    }
}
       interface AdvancedArithmetic
       {
         int divisor_sum(int n);
       }
      class File implements AdvancedArithmetic
      {
            public int divisor_sum(int n)
        {
        int d=0;
          for(int i=1;i<=n;i++)
          {
            if(n%i==0)
            {d=d+i;}
          }
          return d;
        }
      }