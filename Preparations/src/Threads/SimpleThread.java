package Threads;

		public class SimpleThread extends Thread {
		  public void run()
		  {
			 System.out.println("running Run method");
		  }
		  public static void main(String args[])
		  {
			  SimpleThread  obj = new SimpleThread();
			 
			 obj.start();
		  }
		}

