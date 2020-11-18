<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <table align="center" cellpadding="10" cellspacing="10" border="10">
        <tr
        align="center" bgcolor="#eeeeee">
        <td  colspan="10"><i>Employee Details</i></td>
        </tr>
        <tr bgcolor="#ff6473">
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Salary</th>
            <th>Mobile Number</th>
            <th>Email Id</th>
            <th>Gender</th>
            <th>Address</th>
            <th>Date Of Birth</th>
            
        </tr>
        <c:forEach items="${listKey}" var="emp">
        <tr>
            <td><c:out value="${emp.empId}" /></td>
            <td><c:out value="${emp.empName}" /></td>
            <td><c:out value="${emp.empSalary}" /></td>
            <td><c:out value="${emp.mobileNumber}" /></td>
            <td><c:out value="${emp.emailId}" /></td>
            <td><c:out value="${emp.gender}" /></td>
            <td><c:out value="${emp.empAddress}" /></td>
            <td><c:out value="${emp.dob}" /></td>
            
        </tr>
     </c:forEach> 
	
</body>
</html>