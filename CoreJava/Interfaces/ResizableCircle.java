class Circle implements GeometricObject
{
  protected double r;
  Circle(double radius)
  {r=radius;}
  
  public double getPerimeter()
  {return 2*3.14159*r;}
  public double getArea()
  {return 3.14159*r*r;}
  
  
  public String toString()
  {
   String s;
   s="Circle[radius="+r+"]";
   return s;
  }
}

class ResizableCircle extends Circle implements Resizable
{    
     ResizableCircle(double r)
     {super(r);}
     
   public void resize(int percent)
   {
    r=(r*percent)/100.0;
   }
  
  public String toString()
  {
   String s;
   s="Circle[radius="+r+"]";
   return s;
  }
  

}