import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner obj = new Scanner(System.in);
      float p=obj.nextFloat();
      float r=obj.nextFloat();
      float t=obj.nextFloat();
      float rate=(float)(100+r)/100;
      rate=(float)(Math.pow(rate,t));
      p=(float)(p*rate);
      System.out.printf("%.1f",p);
    }
}