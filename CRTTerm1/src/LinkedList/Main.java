package LinkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args)
	{
		
		Employee emp1 = new Employee(1, "b","6309585990" , 50000);
		Employee emp2 = new Employee(2, "d","9390093161" , 60000);
		Employee emp3 = new Employee(3, "e","6309585991" , 100000);
		Employee emp4 = new Employee(4, "a","6301889785" , 200000);
		Employee emp5 = new Employee(5, "c","7799446870" , 30000);
		
		LinkedList<Employee> li = new LinkedList<>();
		li.add(emp1);		
		li.add(emp5);
		li.addFirst(emp4);
		li.add(emp2);
		li.addLast(emp3);
		
		for(Employee e:li)
		{
			e.display();
		}
		
	}

}
