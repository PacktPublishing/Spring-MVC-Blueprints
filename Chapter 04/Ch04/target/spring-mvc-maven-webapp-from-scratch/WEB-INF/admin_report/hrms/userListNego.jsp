<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pizza JSP View</title>
</head>
<body>
    <table border="1">
        <tr>
        <td>Employee ID</td>
        <td>Username</td>
        <td>Password</td>
        <td>Role</td>
        </tr>
        <c:forEach var="user" items="${ allUsers }">
             <tr>
            <td><c:out value="${user.hrmsEmployeeDetails.empId}"/></td>
            <td><c:out value="${user.username}"/></td>
             <td><c:out value="${user.password}"/></td>
             <td><c:out value="${user.role}"/></td>
        </tr>
        </c:forEach>
       
    </table>
</body>
</html>