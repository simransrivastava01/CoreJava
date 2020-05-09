import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      int b=obj.nextInt();
      int c=obj.nextInt();
      if(a>b && a>c)
      {System.out.print(a);}
      else if(b>c && b>a)
      {System.out.print(b);}
      else
      {System.out.print(c);}
    }
}