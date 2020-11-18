package Collections;

import java.util.HashSet;

public class HashSetEx 
{
	public static void main(String args[])
	{
		 HashSet <Integer> set= new HashSet();
		 set.add(1);
		 set.add(2);
		 set.add(6);
		 set.add(3);
		 set.add(4);
		 set.add(5);
		 set.add(10);
		 set.add(7);
		 set.add(9);
		 set.add(4);
		 
		 for(int i : set)
		 {
			 System.out.println(i);
		 }
	}
}
