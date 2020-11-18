package Controller;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class list_request implements ServletRequestListener {
   public int total,active;
   
    public void requestDestroyed(ServletRequestEvent arg0)  
    { 
      active-= 1; 
    }
    public void requestInitialized(ServletRequestEvent arg0)  { 
       total+= 1;
       active+=1;
    }
	
}
