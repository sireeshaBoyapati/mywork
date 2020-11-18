<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Registration</title>
</head>
<body>

	<form action="insert" method="get">
	Enter Student RegNo : <input type="text" name="RegNo" value='${Student.Regno}'><br>
	Enter Student Name : <input type="text" name="Sname" value='${Student.Sname}'><br>
	Enter Course taken : <input type="text" name="CourseName" value='${Student.CourseName}'><br>
	Enter Student Location : <input type="text" name="Location" value='${Student.Location}'><br>
	Enter Student Score : <input type="text" name="Score" value='${Student.Score}'><br><br>
	<input type="submit" value=submit>
	</form>

</body>
</html>
