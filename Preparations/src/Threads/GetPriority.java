package Threads;

public class GetPriority extends Thread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		 System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());   
		/*Thread t1 = new Thread();
		t1.start();
		System.out.println("Priority of thread is: "+Thread.currentThread().getPriority()); 
		System.out.println(t1.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("MIN PRIORITY: "+t1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("MAX PRIORITY: "+t1.getPriority());*/
	}
	

}
