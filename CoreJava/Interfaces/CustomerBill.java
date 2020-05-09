class Customer
{
   int id,dis;
   String n;
  public Customer(int ID,String name,int Discount)
  {
    id=ID;
    dis=Discount;
    n=name;
  }
  
  public int getID()
  {return id;}
  public String getName()
  {return n;}
  public int getDiscount()
  {return dis;}
  public void getDiscount(int disc)
  {dis=disc;}
  
  public String toString()
  {
    return n+"("+id+")";
  }
  
}

class Bill
{
  int id;
  Customer c;
  double a;
  int dis;
  public Bill(int ID,Customer customer,double amt)
  {
    id=ID;
    a=amt;
    c=customer;
  }
  public int getID()
  {return id;}
   public Customer getCustomer()
  {return c;}
   public  void setCustomer(Customer c1)
  {c=c1;}
 
 
  public double getAmount()
  {return a;}
   public void setAmount(double amt)
  {a=amt;}
  public int getCustomerID()
  {return c.id;}
  public String getCustomerName()
  {return c.n;}
  public int getCustomerDiscount()
  {return c.dis;}
  public double getFinalAmt()
  {
    double at;
    at=(a*c.dis)/100;
    return (a-at);
  }
  
}

