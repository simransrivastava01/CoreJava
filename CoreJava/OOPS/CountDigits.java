public int countDigits(int number)
{
  int count=0,d=0;
  while(number>0)
  {
    d=number%10;
    count++;
    number=number/10;
  }
  return count;
}