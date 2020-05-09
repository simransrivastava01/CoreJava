import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
       int n=0,i,sum=0;
      n=obj.nextInt();
      int arr[]=new int[n];
      for(i=0;i<n;i++)
   {
        arr[i]=obj.nextInt();
   }
   for(i=0;i<n;i++)
   {
     if(arr[i]==10)
     {
       sum=sum+10;
     }
   }
     
      System.out.print("[");
      for(i=0;i<n-1;i++)
      {
        System.out.print(arr[i]+", ");
      }
      System.out.print(arr[n-1]+"]");
   if(sum==30)
   {System.out.println("\nTrue");}
   else
   {System.out.println("\nFalse");}
  
   }
  }