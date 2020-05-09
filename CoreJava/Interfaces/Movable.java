class MovablePoint implements Movable 
{
  int x, y, xSpeed, ySpeed;
    
    MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
      this.x=x;
      this.y=y;
      this.xSpeed=xSpeed;
      this.ySpeed=ySpeed;
    }
    
  public void moveUp()
  {y-=ySpeed;}
  public void moveDown()
  {y+=ySpeed;}
  public void moveLeft()
  {x-=xSpeed;}
  public void moveRight()
  {x+=xSpeed;}

  public String toString()
  {
   String s;
   s = "[X="+x+", "+"Y="+y+"]";
   return s;
  }

 
}

class MovableCircle implements Movable 
{
  private MovablePoint center;
  private int radius;
  
  public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
  {
      // Call the MovablePoint's constructor to allocate the center instance.
     /* this.x=x;
      this.y=y;
      this.xSpeed=xSpeed;
      this.ySpeed=ySpeed;
      this.radius=radius;*/
      center = new MovablePoint(x, y, xSpeed, ySpeed);
     this.radius=radius;
   }

  // Implement abstract methods declared in the interface Movable
   public void moveUp()
  {center.y-=center.ySpeed;}
  public void moveDown()
  {center.y+=center.ySpeed;}
  public void moveLeft()
  {center.x-=center.xSpeed;}
  public void moveRight()
  {center.x+=center.xSpeed;}

  public String toString()
  {
   String s;
   s = "[X="+center.x+", "+"Y="+center.y+", radius="+radius+"]";
   return s;
  }
  
  
}
