package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class BasicEx 
{
	public static void main(String args[])
	{
       Collection basic = new ArrayList();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number: ");
       int num = sc.nextInt();
	   basic.add(num);
	   basic.add("hi");	   
	  
	   
	   Iterator i = basic.iterator();
	   
	   while(i.hasNext())
	   {
		  
		   System.out.println(i.next());
	   }
	   
	   /*
	     Collection<Integer> basic1 = new ArrayList<>();
	  	 Iterator<Integer> i1 = basic.iterator();
	   basic1.add(12);
	   
	   while(i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }*/
	   
    }
}
