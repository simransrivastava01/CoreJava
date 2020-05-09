import java.util.Scanner;
// Other imports go here
class Main
{
  public static void main(String[] args)
  {
    int sum=0;
    Scanner obj=new Scanner(System.in);
    int arr[]=new int[10];
    for(int i=0;i<10;i++)
    {
      arr[i]=obj.nextInt();
    }
    for(int i=0;i<10;i++)
    {
      sum=sum+arr[i];
    }
    System.out.print(sum);
  }
}