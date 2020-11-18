<%@page import="d.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <form>
name:<input type="text" name="name"><br>
age:<input type="number" name="age"><br>
phone:<input type="text" name="phone"><br>
gender<input type="radio" name="gender" value="male">male 
<input type="radio" name="gender" value="female">female <br>
reading<input type="radio" name="reading" value="true">yes
<input type="radio" name="reading" value="false">no <br>
<input type="submit">
</form>

 

<jsp:useBean id="s" class= "d.student" scope="application"/>
<jsp:setProperty property="name" name="s" param="name" />
<jsp:setProperty property="age" name="s" param="age"/>
<jsp:setProperty property="phone" name="s" param="phone"/>
<jsp:setProperty property="gender" name="s" param="gender"/>
<jsp:setProperty property="reading" name="s" value="false"/>
<a href="extract.jsp">display</a>
</body>
</html>