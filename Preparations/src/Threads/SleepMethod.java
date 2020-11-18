package Threads;

public class SleepMethod extends Thread {
	
	public void run()
	{
		System.out.println("running....");
		for(int i=0;i<11;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello"+i);
		}
	} 
	public static void main(String[] args) {
		
		SleepMethod sm1 = new SleepMethod();
		SleepMethod sm2 = new SleepMethod();
		SleepMethod sm3 = new SleepMethod();
	  sm1.start();	
	  sm2.start();
	  sm3.start();	
	}

}
