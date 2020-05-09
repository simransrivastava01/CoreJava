import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
      int t=s.nextInt();
      for(int i=0;i<t;i++)
      {
        int n=s.nextInt();
        int num;
        num=n;
        int sq=n*n;            
        int res=sq;
        int count=0,sum=1;
        int n1,n2,base=10;       
        while(sq!=0)
        {
          count++;
          sq=sq/10;
        }
       
        if(count%2==0)
        {
           for(int j=0;j<count/2;j++)
        {
          sum=1*base;
          base=base*10;
        }
          n1=res%sum;
          n2=res/sum;  
          if(n1+n2==num)
            System.out.println("1");
          else
            System.out.println("0");  
  
        }
        else
        {
           for(int j=0;j<=count/2;j++)
        {
          sum=1*base;
          base=base*10;
        }
          n1=res%sum;
          n2=res/sum;
        
          if(n1+n2==num)
            System.out.println("1");
          else
            System.out.println("0");
        }
      }
    }
}