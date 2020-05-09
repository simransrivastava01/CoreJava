class Bill
{
  int b,pay,n;
}

class Cash extends Bill
{
 void get_cash()
 {
 	// Complete the input function, dont change the name.
    Scanner obj=new Scanner(System.in);
    int p=obj.nextInt();
    int q=obj.nextInt();
    int n2000=obj.nextInt();
    int n500=obj.nextInt();
    int n100=obj.nextInt();
    int n50=obj.nextInt();
    int n10=obj.nextInt();
    b=p*q;
    n=2000*n2000+500*n500+100*n100+50*n50+10*n10;
    pay=b-n;
 }
 void display()
 {
 	// Complete the display function, dont change the name.
    if(pay<=0)
    System.out.print("Clear");
    else
    System.out.print("Need to pay: "+pay);
 }
}
