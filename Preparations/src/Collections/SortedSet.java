package Collections;
import java.util.*;

public class SortedSet 
{
   public static void main(String args[])
   {
	   TreeSet<String> set = new TreeSet<String>();
	   set.add("Apple");
	   set.add("India");
	   set.add("Durga");
	   set.add("Garden");
	   set.add("Girl");
	   Iterator<String> i = set.iterator();
	   while(i.hasNext())
	   {
		   System.out.println(i.next()); 
	   }
	   
	   
   }
}
