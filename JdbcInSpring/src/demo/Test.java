package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
   ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
   
   VehicleDao dao=(VehicleDao)ctx.getBean("vbean");
   
   int status=dao.saveVehicle(new Vehicle(2,"red",4,8));
  System.out.println(status);
   
   /*int status=dao.updateVehicle(new Vehicle(2,"black",4,10));
   System.out.println(status);*/
  /* 
   Vehicle v=new Vehicle();
   v.setVno(2);
   int status=dao.deleteVehicle(v);
   System.out.println(status); */
   }
}
