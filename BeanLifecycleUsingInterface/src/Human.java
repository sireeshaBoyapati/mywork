import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Human implements InitializingBean,DisposableBean
{
   int id;
   String name;
   
   
	public Human()
	{
	super();
    }
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("Initalised");
		
	}

	@Override
	public void destroy() throws Exception 
	{
		
		System.out.println("Destroyed");
	}  
   
}
