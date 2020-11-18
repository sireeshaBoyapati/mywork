package Threads;

import java.util.Scanner;
import java.util.Random;

public class RandomPassword extends Thread{
	
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Username:");
	String username = sc.next();
	
	RandomPassword rp = new RandomPassword();
	rp.start();
	System.out.println("Username: "+username);
	
   }
   
   public void run()
   {
	   Random rand= new Random(); 
	   int Password = rand.nextInt(800000); 
	   System.out.println("Password: "+Password);
   }
}
