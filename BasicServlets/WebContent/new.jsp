<%@page import="d.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- ghfjyyuktiyui
hukgukfyui
huigyui -->
  <form>
name:<input type="text" name="name"><br>
age:<input type="number" name="age"><br>
phone:<input type="text" name="phone"><br>
gender<input type="radio" name="gender" value="male">male 
<input type="radio" name="gender" value="female">female <br>
H.No.:<input type="text" name="hnum"><br>
street:<input type="text" name="street"><br>
city:<input type="text" name="city"><br>
State:<input type="text" name="state"><br>
Pin code:<input type="number" name="pincode"><br>
<input type="submit">
</form>

 <jsp:useBean id="add" class= "d.address"/>
 <jsp:setProperty property="hnum" name="add" param="hnum" />
<jsp:setProperty property="city" name="add" param="city"/>
<jsp:setProperty property="street" name="add" param="street"/>
<jsp:setProperty property="state" name="add" param="state"/>
<jsp:setProperty property="pincode" name="add" param="pincode"/>  

<jsp:useBean id="s" class= "d.Person" scope="session"/>
<jsp:setProperty property="name" name="s" param="name" />
<jsp:setProperty property="age" name="s" param="age"/>
<jsp:setProperty property="phone" name="s" param="phone"/>
<jsp:setProperty property="gender" name="s" param="gender"/>


<jsp:setProperty property="add" name="s" value="${add}"/>
<a href="ext.jsp">display</a>
</body>
</html>