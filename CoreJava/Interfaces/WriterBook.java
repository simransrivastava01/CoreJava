class Writer
{
  private String n,e;
  private char g;
  public Writer(String name,String email,char gender)
  {
    n=name;
    e=email;
    g=gender;
  }
  public String getName()
  {return n;}
  public String getEmail()
  {return e;}
  public void setGender(char gender)
  {g=gender;}
  public char getGender()
  {return g;}
  public String toString()
  {
    String s;
    s="Writer[name="+n+",email="+e+",gender="+g+"]";
    return s;
  }
  
}

class Book
{
  private String n;
  private String w;
  private double p;
  private int q;
  public Book(String name, Writer writer, double price)
  {
    n=name;
    p=price;
  }
  public Book(String name, Writer writer, double price, int qty)
  {
    n=name;
    p=price;
    q=qty;
    w=writer.toString();
   }
  public String getName()
  {return n;}
  public void setPrice(double price)
  {p=price;}
  public double getPrice()
  {return p;}
  public void setQty(int qty)
  {q=qty;}
  public int getQty()
  {return q;}
  public String toString()
  {
    String s;
    s="Book[name="+n+","+w+",price="+p+",qty="+q;
    return s;
  }
  
}