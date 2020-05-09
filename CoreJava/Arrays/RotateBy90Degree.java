import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
     Scanner obj=new Scanner(System.in);
    int t=obj.nextInt();
    for(int i=0;i<t;i++)
    {
      int n=obj.nextInt();
      int arr[][]=new int[n][n];
      for(int j=0;j<n;j++)
      {
  
        for(int k=0;k<n;k++)
        {
          arr[j][k]=obj.nextInt();
        }
      }
      for(int j=0;j<n;j++)
      {
        for(int k=n-1;k>0;k--)
        {
          System.out.print(arr[k][j] + " ");
        }
         System.out.print(arr[0][j]);
        System.out.println();
      }
        System.out.println();
      
    }
  }
}