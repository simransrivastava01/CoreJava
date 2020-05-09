static int countPalindrome(String str)
{
  int count=0,flag=0;
  String w[]=str.split(" ");
  for(String s:w)
  {
    int l1=s.length();
    for(int i=0;i<l1;i++)
    {
      if(s.charAt(i)==s.charAt(l1-i-1))
      {flag=1;}
      else
      {flag=0;
      break;}
    }
    if(flag==1)
    {count++;}
  }
  return count;
}


