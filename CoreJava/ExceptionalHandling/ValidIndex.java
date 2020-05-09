import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner obj = new Scanner(System.in);
      int n=obj.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {arr[i]=obj.nextInt();}
      int a[]=new int[2];
      for(int i=0;i<2;i++)
      {
        a[i]=obj.nextInt();
        try
        {
          if(a[i]<n)
          {System.out.println(arr[a[i]]);}
          else
          {throw new Exception("Out of Bounds");}
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
      }
    }
}