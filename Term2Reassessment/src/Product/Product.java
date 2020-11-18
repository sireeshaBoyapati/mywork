package Product;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try{ 

		     int productid = Integer.parseInt(request.getParameter("P_ID")); 
		     String P_Name = request.getParameter("P_Name"); 
		     int Rate = Integer.parseInt(request.getParameter("Rate")); 
			 int Quantity = Integer.parseInt(request.getParameter("Quantity")); 
			 String Supplier =request.getParameter("Supplier"); 

		 

			ProductPojo p = new ProductPojo();
			
			  p.setP_ID(productid); 
			
			  p.setP_Name(P_Name); 
			
			  p.setRate(Rate); 
			
			  p.setQuantity(Quantity); 
			
			  p.setSupplier(Supplier); 

		    Class.forName("oracle.jdbc.driver.OracleDriver"); 

		    System.out.println("Driver loaded successfully.."); 

		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system" ,"system"); 

		    System.out.println("Connection established successfully..."); 

		    String sql = "insert into product(P_ID, P_Name,Rate,Quantity,Supplier) values(?,?,?,?,?)"; 

		    PreparedStatement st = con.prepareStatement(sql); 

		     

		    st.setInt(1,p.getP_ID()); 

		    st.setString(2,p.getP_Name()); 

		    st.setInt(3,p.getRate()); 

		    st.setInt(4,p.getQuantity()); 

		    st.setString(5,p.getSupplier()); 

		    int rs = st.executeUpdate(); 

		    System.out.println(rs); 

		    if(rs>0){ 

		    con.commit(); 

		    System.out.println("Inserted"); 

		    response.sendRedirect("insert.jsp"); 

		} 
		    else{ 

		    response.sendRedirect("error.jsp"); 

		    } 

			} 
			
			catch(Exception e){ 
			
			System.out.println(e); 
			
			}  
			
	}

}
