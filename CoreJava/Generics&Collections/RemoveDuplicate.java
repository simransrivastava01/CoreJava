static void removeDuplicates(Vector<Integer> v)
{
  int l=v.size();
  for(int i=0;i<l;i++)
  {
    for(int j=i+1;j<l;j++)
    {
      if(v.get(i)==v.get(j))
      {v.remove(j);
      l--;
      j--;}
    }
  }

}