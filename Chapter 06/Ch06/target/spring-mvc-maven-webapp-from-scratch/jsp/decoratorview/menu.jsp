<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HMS - Hotel Menu</title>
</head>
<body>
   <table style="width: 550px">
		<thead>
			<tr>
				<th>Menu Name</th>
				<th>Menu Plan/th>
				<th>Menu Date</th>
				<th>Qty</th>
				<th>Price</th>
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="m" items="${ menu }">

             <tr>
				<td>${ m.menuName }</td>
				<td>${ m.menuPlan }</td>
				<td>${ m.menuDate }</td>
				<td>${ m.qty }</td>
				<td>${ m.price }</td>
			</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>