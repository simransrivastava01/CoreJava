class Box
{
  private int length;
  private int breadth;
  private int height;
  Box()
  {
    length=0;
    breadth=0;
    height=0;
  }
  Box(int length,int breadth,int height)
  {
    this.length=length;
    this.breadth=breadth;
    this.height=height;
  }
  Box(Box b1)
  {
    length=b1.length;
    breadth=b1.breadth;
    height=b1.height;
  }
  
  int getLength()
  {return length;}
  int getBreadth()
  {return breadth;}
  int getHeight()
  {return height;}
  long CalculateVolume()
  {
    return length*breadth*height;
  }
}