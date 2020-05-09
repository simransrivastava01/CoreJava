import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n,d,num=0,number=0;
    n=obj.nextInt();
    while(n>0)
    {
      d=n%10;
      num=num*10 +d;
      n=n/10;
    }
    while(num>0)
    {
      d=num%10;
      d=d+1;
      d=d%10;
      number=number*10+d;
      num=num/10;
    }
    System.out.print(number);
  }
}