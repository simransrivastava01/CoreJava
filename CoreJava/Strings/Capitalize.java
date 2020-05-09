static String capitalizeFirstChar(String str)
{
  String st="";
  String w[]=str.split(" ");
  for(String s:w)
  {
    int l=s.length();
    char s1=s.charAt(0);
    s1=Character.toUpperCase(s1);
    st=st+s1;
    for(int i=1;i<l;i++)
    {
      st=st+s.charAt(i);
    }
    st=st+" ";
  }
  st=st.trim();
  return st;
}
