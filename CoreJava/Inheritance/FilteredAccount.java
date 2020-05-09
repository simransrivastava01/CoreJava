class FilteredAccount extends Account
{
 private int count;
 private int cn;
	FilteredAccount(int a)
    {
       super(a);
    
    }
   
     public boolean process(Transaction t)
      {
        if(t.value()==0)
           {count++;
           return true;
           }
           else
           {cn++;
           return false;}
       }
       
        int filtered()
     {
        return count;
     }
 
   
    
}
