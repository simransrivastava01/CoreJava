static int verifyPrime(int n)
{
  int count=0;
  for(int i=2;i<=n;i++)
  {
    if(n%i==0)
    {count++;}
  }
  if(count==1)
  {return 1;}
  else
  {return 0;}
}