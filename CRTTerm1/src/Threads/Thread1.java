package Threads;

public class Thread1 extends Thread
{
  // run method to print prints 1 to 10
	public void run()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println("Normal threads"+i);
		}
	}

}
