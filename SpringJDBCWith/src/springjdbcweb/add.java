package springjdbcweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@WebServlet("/add")
public class add extends HttpServlet {
	
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		int scid,marks;
		String name,adress,email,phno,status;
		scid=Integer.parseInt(request.getParameter("sid"));
		marks=Integer.parseInt(request.getParameter("marks"));
		name=request.getParameter("name");
		adress=request.getParameter("adress");
		email=request.getParameter("email");
		phno=request.getParameter("phno");
		status=request.getParameter("status");
		p.print(scid+" "+marks+" "+name+" "+adress+" "+email+" "+phno+" "+status);
		scholer sc=new scholer(scid, marks, name, adress, email, phno, status);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("somthing.xml");
		scholerDaoImpl scd=(scholerDaoImpl)ctx.getBean("edao");
		if(scd.insert(sc)>0)
		{
			p.print("added");
		}
		else
		{
			p.print("not added");
		}
	}

}
