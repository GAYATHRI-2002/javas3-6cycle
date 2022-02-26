import java.io.*;
import java.util.*;
class arithmetic1
{
  public static void main(String args[])
  {
    try
    {
      int a=2,b;
      b=a/0;
      System.out.println(b);
    }
    catch(ArithmeticException e);
    {
       System.out.println(e);
    }
  }
}
