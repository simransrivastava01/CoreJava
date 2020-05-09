class Person
{
  String n;
  String c;
  int e;
  int y;
}
class Actor extends Person
{
   Actor(String name,String color,int eyes,int year)
   {
     n=name;
     c=color;
     e=eyes;
     y=year;
   }
   
   public String toString()
   {
    String s;
    s="The person "+n+" is an Actor. He is "+c+" in color, has "+e+" eyes and debut in "+y;
    return s;
   }

}
class Actress extends Person
{
   Actress(String name,String color,int eyes,int year)
   {
     n=name;
     c=color;
     e=eyes;
     y=year;
   }
   
   public String toString()
   {
    String s;
    s="The person "+n+" is an Actress. She is "+c+" in color, has "+e+" eyes and debut in "+y;
    return s;
   }
}
