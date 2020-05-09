static void doubleQueue(Queue<Integer> q)
{
  int l=q.size();
  for(int i=0;i<l;i++)
  {
    int k=q.remove();
    q.add(k);
    q.add(k);
  }
  
}