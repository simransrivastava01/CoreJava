import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    int sum=0,marks;
    Scanner obj = new Scanner(System.in);
    int n;
     n=obj.nextInt();
    sum=sum+n;
    
     n=obj.nextInt();
    sum=sum+n;
    
     n=obj.nextInt();
    sum=sum+n;
    
     n=obj.nextInt();
    sum=sum+n;
    
     n=obj.nextInt();
    sum=sum+n;
    
    marks=sum*100/500;
   System.out.print(sum + " " + marks);
  }
}