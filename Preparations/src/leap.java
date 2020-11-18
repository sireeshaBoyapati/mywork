import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:");
		int year = sc.nextInt();
		if(year%2==0)
		{
		float quotient= year/2;
		 			 /*2017%2=1008.5
		 					 1008.5%2==odd*/
		
		
		float a = quotient%2;
		if(a==0)
		{
			System.out.print("leap");
		}
		else
			System.out.print("non leap");
		}
		else
			System.out.print("non leap");
	}

}
