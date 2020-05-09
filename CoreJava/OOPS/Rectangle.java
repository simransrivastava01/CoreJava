import java.util.Scanner;
// Other imports go here// Do NOT change the class name

class Rectangle
{
  // Write your code here
  int X,Y,h,w;
  public Rectangle(int x, int y, int width, int height)
  {
    X=x;
    Y=y;
    h=height;
    w=width;
  }
    public int getHeight()
    {return h;}
    public int getWidth()
    {return w;}
    public int getX()
    {return X;}
    public int getY()
    {return Y;}
    public String toString()
    {
      String s="Rectangle[x="+X+",y="+Y+",width="+w+",height="+h+"]";
      return s;
    }
}
