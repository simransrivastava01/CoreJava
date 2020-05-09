class MinMaxAccount extends BankAccount 
{
    // Complete the class definition according to requirement
    MinMaxAccount(int number,int bal)
    {
      super(number,bal);
    }
    int min=balance;
    int max=balance;
    /*public int getBalance()  
    {
     return balance;
    }*/
    public void withdraw(int amt)
    {
     balance=balance-amt;
     if(balance<min)
     {min=balance;}
    }
public void deposit(int amt)
{
 balance=balance+amt;
 if(balance>max)
 {max=balance;}
}
public int getMin()
{return min;}
public int getMax()
{return max;}

}