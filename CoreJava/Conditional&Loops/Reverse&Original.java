import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
      int i,d,r=0;
      Scanner obj=new Scanner(System.in);
      int t=obj.nextInt();
      for(i=0;i<t;i++)
      {
        r=0;
        int n=obj.nextInt();
        int num;
        num=n;
       
        while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
        if(r==num)
        {System.out.println("Equal");}
        else
        {System.out.println("Not Equal");}
      }
    }
}