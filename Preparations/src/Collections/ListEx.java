package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEx {

	public static void main(String[] args)
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(1,2); // 1 -> INDEX NUM, 2 -> ELEMENT
		li.add(4);
		li.add(5);
		li.add(2,3);
		li.remove(2);
		System.out.println("List1 elements :");
		for(int i : li)
		{
			System.out.println(i);
		}

		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(20);
		li1.add(21);
		System.out.println("List2 elements :");
		for(int i : li1)
		{
			System.out.println(i);
		}
		System.out.println("get ele: "+li.get(1));
		System.out.println("set ele: "+li.set(3,1111));
		li1.addAll(li);
		System.out.println("All elements :");
		for(int i : li1)
		{
			System.out.println(i);
		}
		System.out.println("lastindexOf: " + li1.lastIndexOf(1111));
		
		li1.removeAll(li);
		System.out.println("All elements after removing:");
		for(int i : li1)
		{
			System.out.println(i);
		}
		
		System.out.println("indexOf: " + li.indexOf(1111));
		
		ListIterator<Integer> i = li.listIterator();
		   
		   while(i.hasNext())
		   {
			  
			   System.out.println("li elements"+i.next());
		   }
		   while(i.hasPrevious())
		   {
			  
			   System.out.println("li elements"+i.previous());
		   }
		   
	}

}
