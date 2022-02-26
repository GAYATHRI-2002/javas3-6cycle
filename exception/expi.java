import java.util.*;

class expi
 {
      public static void main(String args[]) throws Exception
  {
    try
        {
             FileInputStream file=new FileInputStream("expi.txt");
             int i;
             while((i=file.read())!=-1)
         {
             System.out.println((char)i);
         }
             catch(FileNotFoundException e)
		     {
			    System.out.println(e);
		     }
	   }
   }
}
