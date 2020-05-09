class Circle
{
  double pi=3.14159;
  double rad;
  public Circle(double r)
  {rad=r;}
  public double area()
  {
    return Math.round(pi*rad*rad*100.0)/100.0;
  }
  public double circumference()
  {
    return Math.round(2*pi*rad*100.0)/100.0;
  }
  public double getRadius()
  {
    return rad;
  }
  public String toString()
  {
    String s;
    s="Circle{radius="+rad+"}";
    return s;
  }
  
}