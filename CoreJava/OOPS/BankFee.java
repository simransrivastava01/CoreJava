public boolean bankFees(double fees)
{
  double sum=0,s=0;
  for(int i=0;i<4;i++)
  {
    sum=sum+fees;
    s=s+sum;
  }
  if(s<balance)
  {return true;}
  else
  {return false;}
}
