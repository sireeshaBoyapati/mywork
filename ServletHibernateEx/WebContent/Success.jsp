<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>

	<h1>Registration Success</h1><br>
	Enter Student RegNo : <%= request.getAttribute("RegNo")%><br>
	Enter Student Name : <%= request.getAttribute("Sname") %><br>
	Enter Course taken :  <%= request.getAttribute("CourseName") %><br>
	Enter Student Location :  <%= request.getAttribute("Location") %><br>
	Enter Student Score :  <%= request.getAttribute("Score") %><br><br>
	
	<a href="display">Click here to see all the students Record</a>
	

</body>