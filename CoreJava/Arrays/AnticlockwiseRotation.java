import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
       int n=0,s=0,i=0,j=0;
      Scanner obj=new Scanner(System.in);
      n=obj.nextInt();
      int arr[]=new int[n];
      int a[]=new int[n];
      s=obj.nextInt();
      for(i=0;i<n;i++)
      {
        arr[i]=obj.nextInt();
      }
      
       for(i=s,j=0;i<n;i++,j++)
      {
        a[j]=arr[i];
      }
      
       for(j=j,i=0;i<s;j++,i++)
      {
        a[j]=arr[i];
      }
      
     
     
      
      for(i=0;i<n;i++)
      {
        System.out.print(a[i]+" ");
      }
    }
    }