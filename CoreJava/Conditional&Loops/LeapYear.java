import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
      int y=obj.nextInt();
       if(y%4==0 &&y%100!=0)
      {System.out.print("Leap Year");}
      else if(y%400==0)
      {System.out.print("Leap Year");}
      else
      {System.out.print("Not a Leap Year");}
    }
}