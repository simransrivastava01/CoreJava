class Date
{
        // Write your code here
  int mon;
  int day;
  Date(int m,int d)
  {
    mon=m;
    day=d;
  }
  public int daysInMonth()
  {
    if(mon==1 || mon==3 | mon==5||mon==7||mon==8||mon==10||mon==12)
    {return 31;}
    else if(mon==2)
    {return 28;}
    else
    {return 30;}
  }
  public int getDay()
  {return day;}
  public int getMonth()
  {return mon;}
  public int nextDay()
  {
    /*if(mon==12 && day==31)
    {day=1;
    mon=1;}
    else if(mon==2 && day==29)
    {day=1;}
    else 
    {day=day+1;}
    return day;*/
    if(mon==12 || day==31)
    {mon=1;
    day=1;}
    else
    {day=day+1;}
    return day;
  }
  public String toString()
  {
    String s;
    s=mon+"/"+day;
    return s;
  }
  public int absoluteDay()
  {
    int arr[]={0,31,28,31,30,31,30,31,31,30,31,30};
    int sum=0;
    for(int i=0;i<mon;i++)
    sum=sum+arr[i];
    return sum+day;
  }
}