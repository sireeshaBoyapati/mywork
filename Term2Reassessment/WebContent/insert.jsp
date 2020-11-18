<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="Product" method="post">
	P_ID:<input type="number" name="P_ID" required><br>
	P_Name:<input type="text" name="P_Name" required><br>
	Rate:<input type="number" name="Rate" required><br>
	Quantity:<input type="number" name="Quantity" required><br>
	Supplier:<input type="text" name="Supplier" required><br>
	<input type="submit">
  </form>
</body>
</html>