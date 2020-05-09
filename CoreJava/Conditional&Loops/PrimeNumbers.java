import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int count=0,i,j;
        Scanner obj=new Scanner(System.in);
      int n=obj.nextInt();
      int m=obj.nextInt();
      for(i=2;i<=n;i++)
      {
        count=0;
        for(j=2;j<=i;j++)
        {
          if(i%j==0)
          {count++;}
        }
        if(m>0)
        {
         if(count==1)
         {System.out.println(i);
          m--;
        }
        }
      }
    }
}