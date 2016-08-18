<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<!-- By Designscrazed.com , just a structure for easy usage. -->

<html lang='en'>
<head>
<meta charset="UTF-8" />
<title>Sample Page by Designscrazed.com</title>

<spring:url value="/css/style.css"
	var="stylesCSS" />

<link rel="stylesheet" type="text/css" href="${ stylesCSS }" />
 
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,600'
	rel='stylesheet' type='text/css'>
</head>
<body>
	<div id="wrap">
		<div id="accordian">
			<div class="step" id="step1">
				<div class="number">
					<span>0</span>
				</div>
				<div class="title">
					<h1>Login</h1>
				</div>
				<div class="modify">
					<i class="fa fa-plus-circle"></i>
				</div>
			</div>
			<div class="content" id="login">
				<form:form modelAttribute="loginForm" action="${flowExecutionUrl}&_eventId=order" method="post" class="go-right">
					<input type="hidden" name="_flowExecutionKey"	value="${flowExecutionKey}" />
					<div>
						<form:input type="text" id="username" path="username" 
							placeholder="Username" data-trigger="change"
							data-validation-minlength="1" data-type="username"
							data-required="true" data-error-message="Enter a valid username." /><label
							for="username">Username</label>
					</div>
					<div>
						<form:errors path="username" />
							
					</div>
					<div>
						<form:input type="password" id="password" path="password" 
							placeholder="Password" data-trigger="change"
							data-validation-minlength="1" data-type="password"
							data-required="true" data-error-message="Enter a valid password." /><label
							for="password">Password</label>
					</div>
					<div>
						<form:errors path="password" />
							
					</div>
					<div>
					<br /> <input type="submit" value="Login" />
					</div>
					
				</form:form>
				
			</div>
		</div>
	</div>
</body>

</body>
</html>

