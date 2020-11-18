package Beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SecondBean a = (SecondBean)context.getBean("secondBean");
		System.out.println("Message: "+ a.getMessage());
		System.out.println("Id: "+ a.getId());
		System.out.println("Name: "+ a.getName());
	}

}
