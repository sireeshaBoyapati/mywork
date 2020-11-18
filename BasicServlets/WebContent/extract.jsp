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
<jsp:useBean id="s" class="d.student" scope="session"/>
name:<jsp:getProperty property="name" name="s"/>
age:<jsp:getProperty property="age" name="s"/>
phone:<jsp:getProperty property="phone" name="s"/>
gender:<jsp:getProperty property="gender" name="s"/>
reading:<jsp:getProperty property="reading" name="s"/>
</body>
</html>