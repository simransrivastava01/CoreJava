import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
    Scanner obj=new Scanner(System.in);
    int a[]=new int[10];
    int b[]=new int[10];
    for(int i=0;i<10;i++)
    {
      a[i]=obj.nextInt();
    }
    for(int i=0;i<10;i++)
    {
      b[i]=a[9-i];
    }
    for(int i:b)
    {
      System.out.println(i);
    }
   
  }
}