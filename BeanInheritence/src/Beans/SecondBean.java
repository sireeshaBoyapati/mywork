package Beans;

public class SecondBean 
{
	String message;
     int id;
     String name;
     
     
 	
 	public String getMessage() {
 		return message;
 	}
 	
 	public void setMessage(String message) {
 		this.message = message;
 	}
   
	public SecondBean() {
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
	public String toString() {
		return "SecondBean [message=" + message + ", id=" + id + ", name=" + name + "]";
	}
     
     
}
