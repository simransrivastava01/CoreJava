static String reverseString(String str)
{
  int l=str.length();
  String st="";
  for(int i=0;i<l;i++)
  {
    st=st+str.charAt(l-1-i);
  }
  return st;
}
