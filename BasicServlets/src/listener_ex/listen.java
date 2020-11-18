package listener_ex;

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Listen")

    class Listen extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public Listen() {
        super();
        
    }
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        ServletContext sc=getServletContext();
        String var=(String) sc.getAttribute("demo");
        pw.print(var);
        
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

}