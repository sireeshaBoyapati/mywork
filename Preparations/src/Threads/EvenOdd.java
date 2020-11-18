package Threads;
import java.util.*;
public class EvenOdd extends Thread{
	int num;
	public static void main(String[] args) {
		EvenOdd   obj = new EvenOdd ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num1 = sc.nextInt();
		
		 obj.num = num1;
		 obj.start();
		 
			if((obj.even())
	    	{
	    		System.out.println("Even");
	    	}
	    	else{
	    		System.out.println("Odd");
	    	}
	}
			public void run()
		    {
		    	public boolean even()
		    	{
		    	if(num%2 == 0)
		    	{
		    		return true;
		    	}
		    	else
		    	{
		    		return false;
		    	}
		    	}
		    	
		    }
			
	

}
