package Threads;

public class Main {

	public static void main(String[] args)
	
	{    // thread1 prints 1 to 10
			Thread1 thread1 = new Thread1();
			
		 // thread prints 10 to 1 in reverse.
			Thread2 thread2 = new Thread2();
			
	     // start method to start thread
			thread1.start();
			thread2.start();
		
	}

}
