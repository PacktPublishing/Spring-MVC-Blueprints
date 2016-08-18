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
<form:form modelAttribute="order" action="${flowExecutionUrl}">

<table width="30%"  border="0" cellspacing="3" cellpadding="1">
<tr>
    <td><spring:message code="firstName"/></td>
    <td><form:input path="cust.firstName"/></td>
    <td><form:errors path="cust.firstName" cssClass="error"/></td>
</tr>
<tr>
    <td><spring:message code="lastName"/></td>
    <td><form:input path="cust.lastName"/></td>
    <td><form:errors path="cust.lastName" cssClass="error"/></td>
</tr>
<tr>
    <td><spring:message code="email"/></td>
    <td><form:input path="cust.emailAddress"/></td>
    <td><form:errors path="cust.emailAddress" cssClass="error"/></td>
</tr>
</table>
<table width="20%"  border="0" cellspacing="3" cellpadding="1">
<tr><td>
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