class Customer
{
  int id;
  String n;
  char g;
  Customer(int ID,String name,char gender)
  {
    id=ID;
    n=name;
    g=gender;
  }
  
  public int getID()
  {return id;}
  public String getName()
  {return n;}
  public char getGender()
  {return g;}
  
  public String toString()
  {
    String s;
    s=n+"("+id+")";
    return s;
  }
  
}

class BankAccount
{
  int id;
  Customer c;
  double b;
  BankAccount(int ID,Customer customer,double balance)
  {
    id=ID;
    c=customer;
    b=balance;
  }
  
  public int getID()
  {return id;}
  public Customer getCustomer()
  {return c;}
  public double getBalance()
  {return b;}
  public void setBalance(double balance)
  {b=balance;}
  
  public String toString()
  {
    String s;
    s=c.n+"("+c.id+")"+" balance"+"=INR"+" "+b+"0";
    return s;
  }
  
  public void deposit(double amt)
  {b=b+amt;}
  public void withdraw(double amt)
  {
  if(b>amt)
  {b=b-amt;}
   else
   {System.out.println("Insufficient balance");}
  }
  
  
 }