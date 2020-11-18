package listener_ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.ServletContext;

@WebListener
public class listener_con implements ServletContextListener {

    public listener_con() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	 ServletContext sc=arg0.getServletContext();
         sc.setAttribute("demo", "demo value added");
    }
	
}
