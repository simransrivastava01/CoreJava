import java.util.Scanner;
import java.util.*;
// Other imports go here
// Do NOT change the class name and method signature
class Main
{
  static int balancedString(String s)
  {
	Stack<Character> st = new Stack<Character>();
    int i=0;
    for(i=0;i<s.length();i++)
    {
      if(s.charAt(i) == '(' || s.charAt(i) == '{')
      {
        st.push(s.charAt(i));
      }
      else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(')
      {
        st.pop();
      }
      else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{')
      {
        st.pop();
      }
      else if(s.charAt(i) == '}' && st.isEmpty())
      {
        return i;
      }
      else if(s.charAt(i) == ')' && st.isEmpty())
      {
        return i;
      }
      else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() != '(')
      {
        return i;
      }
      else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() != '{')
      {
        return i;
      }
    }
if(st.isEmpty())
{
return -1;
}
else
{
return i;
}
}