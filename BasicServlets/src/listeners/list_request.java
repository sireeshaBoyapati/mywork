package listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class list_request
 *
 */
@WebListener
public class list_request implements ServletRequestListener {

    public list_request() {
        // TODO Auto-generated constructor stub
    }

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
