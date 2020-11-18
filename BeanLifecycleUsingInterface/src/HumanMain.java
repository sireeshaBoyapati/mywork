import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HumanMain {

	public static void main(String[] args) 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Human h = (Human)context.getBean("human");
        System.out.println("Id: "+h.getId());
        System.out.println("Name: "+h.getName());
        context.registerShutdownHook();
	}

}
