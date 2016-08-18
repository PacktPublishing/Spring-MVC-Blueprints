<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="newCatalog" action="${flowExecutionUrl}">
<table width="40%"  border="0" cellspacing="3" cellpadding="1">
 
<tr>
<td><spring:message code="selectCatalog"/></td>
<td><form:select path="name" items="${pizzaList}"/></td>
</tr>
 <tr>
<td><spring:message code="quantity"/></td>
<td><form:input path="quantity"/></td>
</tr>
</table>

<table width="20%"  border="0" cellspacing="3" cellpadding="1">
<tr><td>
<button type="submit" id="add" name="_eventId_add">
        <spring:message code="add"/>
</button>
</td><td>
<button type="submit" id="clear" name="_eventId_clear">
        <spring:message code="clear"/>
</button>
</td>
</tr>
</table>

<table width="40%" border="1" cellspacing="3" cellpadding="1">

<tr><th><spring:message code="catalogName"/></th><th><spring:message code="quantity"/></th></tr>
<c:forEach items="${order.catalog}" var="cat">
<tr>
<td>${cat.name}</td>
<td>${cat.quantity}</td>
</tr>
</c:forEach>
</table>

<table width="30%"  border="0" cellspacing="3" cellpadding="1">
<tr><td>
<button type="submit" id="previous" name="_eventId_previous">
       <spring:message code="previous"/>
</button>
</td><td>
<button type="submit" id="next" name="_eventId_next">
       <spring:message code="next"/>
</button>
</td>
<td>
<button type="submit" id="cancel" name="_eventId_cancel">
       <spring:message code="cancel"/>
</button>
</td></tr>
</table>

</form:form>
</body>
</html>