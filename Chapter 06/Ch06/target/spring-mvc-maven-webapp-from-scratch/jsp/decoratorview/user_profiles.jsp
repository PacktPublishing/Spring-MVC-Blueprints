<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HMS - User Profiles</title>
</head>
<body>
	<table style="width: 550px">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address</th>
				<th>Mobile</th>
				<th>Email</th>
				<th>Username</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="p" items="${ profiles }">

             <tr>
				<td>${ p.id }</td>
				<td>${ p.firstName }</td>
				<td>${ p.lastName }</td>
				<td>${ p.address }</td>
				<td>${ p.mobile }</td>
				<td>${ p.email }</td>
				<td>${ p.username }</td>
			</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>