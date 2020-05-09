class Book extends Publication
{
 
 int pa;
   String wr;
 
 Book(String t,int r,int p,String w)
 {
 
   title=t;
   price=r;
   pa=p;
   wr=w;
  
 }
  
 public void putdata()
  {
  System.out.println("Book Title \""+title + "\", written by \"" + wr + "\" has "+ pa + " pages and of "+ price + " rupees.");
  }

}
class CD extends Publication
{
 
  int le;
  
  CD(String t2,int r2,int l)
  {
  
    title=t2;
    price=r2;
    le=l;
   
  }
  
  public void putdata()
  {
  System.out.println("CD Title \"" + title + "\", is of " + le + " minutes length and of "+ price + " rupees.");
  }

}