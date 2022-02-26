import java.util.*;

class Balance
{
  public static void main(String args[])
  {
    try
    {
      int b=100;
      if(b<500)
         {
            throw new lowbalanceException();
         }
    }
    catch(lowbalanceException e)
      {
          System.out.println(e);
      }
  }
class lowbalanceException extends Exception
   {
          lowbalanceException()
  {
      System.out.println("Low balance");
  }
}
