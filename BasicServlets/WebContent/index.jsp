<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <% 
  int num1 = Integer.parseInt(request.getParameter("n1"));
  int num2 = Integer.parseInt(request.getParameter("n2"));
  int num3= num1+num2;
   %>
  <%="The sum is: "+ num3 %>
   
   
</body>
</html>