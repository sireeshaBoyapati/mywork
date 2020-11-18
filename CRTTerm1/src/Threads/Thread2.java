package Threads;

public class Thread2 extends Thread
{
	//  run method to print 10 to 1 in reverse
	public void run()
	{
		for(int i=10;i>0;i--)
		{
			System.out.println("Reverse thread"+i);
		}
	}
}
