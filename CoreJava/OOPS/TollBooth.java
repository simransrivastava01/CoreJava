import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class TollBooth
{
  int c=0,cash=0;
  TollBooth()
  {
    c=0;
    cash=0;
  }
  public void payingCar()
  {
    c++;
    cash=cash+50;
  }
  public void nopayCar()
  {
    c++;
  }
   public void display()
      {
        System.out.println("Total Cash : "+cash+"/-");
        System.out.println("Total Cars : "+c);
      }
}
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      TollBooth t=new TollBooth();
      Scanner obj=new Scanner(System.in);
      String s2=obj.nextLine();
      char s=s2.charAt(0);
      while(s!='q')
      {
        if(s=='p')
        {t.payingCar();}
        else if(s=='n')
        {t.nopayCar();}
        
         s2=obj.nextLine();
         s=s2.charAt(0);
      }
     t.display();
    }
}