import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    int n=obj.nextInt();
    int gs = n + 10*n/100 + 20*n/100;
    System.out.print(gs);
  }
}