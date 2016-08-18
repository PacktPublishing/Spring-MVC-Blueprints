<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://portals.apache.org/pluto/portlet-el_2_0" prefix="portlet"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<portlet:actionURL var="urlAgain">
           <portlet:param name="action" value="signup" />
         </portlet:actionURL>

				
				<br/>
				
				<form action="${ urlAgain }" method="post" class="go-right">
					<div>
						<input type="text" id="username" name="username" value=""
							placeholder="Username" data-trigger="change"
							data-validation-minlength="1" data-type="username"
							data-required="true" data-error-message="Enter a valid username." /><label
							for="username">Username</label>
					</div>
					<div>
						<input type="password" id="password" name="password" value=""
							placeholder="Password" data-trigger="change"
							data-validation-minlength="1" data-type="password"
							data-required="true" data-error-message="Enter a valid password." /><label
							for="password">Password</label>
					</div>
					<input id="j_submitButton" type="submit" value="Submit" /> 
				</form>
				
			</div>
		</div>
	</div>
</body>

</body>
</html>

