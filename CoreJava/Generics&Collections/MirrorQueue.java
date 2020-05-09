static void mirrorQueue(Queue<String> q)
{
  int l=q.size();
  Stack <String> s=new Stack<>();
  Queue <String> q1=new PriorityQueue<>(q);
  for(int i=0;i<l;i++)
  {
    String k=q.remove();
    s.push(k);
  }
 
  for(int i=0;i<l;i++)
  {
    q.add(q1.remove());
  }
  for(int i=0;i<l;i++)
  {
    q.add(s.pop());
  }
 
  
}