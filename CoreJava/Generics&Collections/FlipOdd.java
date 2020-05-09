static void flipHalfQueue(Queue<Integer> q)
{
  int l=q.size();
  int k=0,k1=0;
  int j=0,i=0;
  int a1[]=new int[l];
  int a2[]=new int[l];
  int arr[]=new int[l];
  
  for(i=0;i<l;i++)
  {
    k=q.remove();
    arr[i]=k;
  }
  i=0;
  while(i<l)
  {
    a1[j]=arr[i];
    i=i+2;
    j++;
  }
  i=l-1;
  j=0;
  while(i>=0)
  {
    a2[j]=arr[i];
    i=i-2;
    j++;
  }

  if(l==1)
  {System.out.print(arr[0]);}
  else
  {
  for(i=0;i<l/2;i++)
  {
    System.out.print(a1[i] + " " + a2[i] +" ");
  }
  }
	
}

