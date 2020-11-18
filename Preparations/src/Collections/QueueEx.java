package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(1);
		Q.add(2);
		Q.add(3);
		System.out.println("Queue elements: ");
		for(int i : Q)
		{
			System.out.println(i);
		}
		System.out.println("PEEK IS : "+Q.peek());
		System.out.println("Element is: "+Q.element());
		System.out.println("AFTER REMOVAL : "+Q.remove());
		
		System.out.println("AFTER poll : "+Q.poll());
		System.out.println("Queue elements: ");
		for(int i : Q)
		{
			System.out.println(i);
		}
		System.out.println("SIZE : "+Q.size());
	}

}
