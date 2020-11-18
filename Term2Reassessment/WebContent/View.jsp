<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import = "java.sql.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
try{ 

		     int productid = Integer.parseInt(request.getParameter("P_ID")); 
		     String P_Name = request.getParameter("P_Name"); 
		     int Rate = Integer.parseInt(request.getParameter("Rate")); 
			 int Quantity = Integer.parseInt(request.getParameter("Quantity")); 
			 String Supplier =request.getParameter("Supplier"); 

		 

			ProductPojo p = new ProductPojo();
			
			  p.setP_ID(P_ID); 
			
			  p.setP_Name(P_Name); 
			
			  p.setRate(Rate); 
			
			  p.setQuantity(Quantity); 
			
			  p.setSupplier(Supplier); 

		    Class.forName("oracle.jdbc.driver.OracleDriver"); 

		    System.out.println("Driver loaded successfully.."); 

		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system" ,"system"); 

		    System.out.println("Connection established successfully..."); 

		    String sql = "select * from product"; 

		    PreparedStatement st = con.prepareStatement(sql); 


		    int r = st.executeUpdate(); 

		    System.out.println(rs); 

		    if(r>0){ 

		    ResultSet rs = statement.executeUpdate();

		    System.out.println(rs); 

		    } 
		    while(rs.next()){
		    %>
		    
		  
</body>
</html>