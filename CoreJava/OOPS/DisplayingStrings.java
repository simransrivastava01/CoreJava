// // Write overloaded static void display(String a) and static void display(String a, String b) functions

static void display(String a)
{
  System.out.print(a);
}

static void display(String a,String b)
{
  String s;
  s=a+"-"+b;
  System.out.print(s);
}
