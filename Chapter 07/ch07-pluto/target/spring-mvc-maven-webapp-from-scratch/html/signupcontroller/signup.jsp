<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://portals.apache.org/pluto/portlet-el_2_0" prefix="portlet"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<!-- By Designscrazed.com , just a structure for easy usage. -->
<portlet:actionURL var="formUrl">
    <portlet:param name="action" value="login" />
</portlet:actionURL>

 

<spring:url value="/css/style.css"
	var="stylesCSS" />
<html lang='en'>
<head>
<meta charset="UTF-8" />
<title>Sample Page by Designscrazed.com</title>

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
			<div class="content" id="create">
				<form:form commandName="loginForm" class="go-right" name="form"  method="POST" action="${formUrl}">
					<div>
						<form:input  path="firstName" id="firstname"
							placeholder="First Name" data-trigger="change"
							data-validation-minlength="1" data-type="usernae"
							data-required="true"
							data-error-message="Enter a valid first name." /><label
							for="firstname">First Name</label>
					</div>
					<div>


						<form:input path="midName" id="password"
							placeholder="Middle Name" data-trigger="change"
							data-validation-minlength="1" data-type="password"
							data-required="true"
							data-error-message="Enter a valid middle name." /><label
							for="middlename">Middle Name</label>

					</div>

					<div>
						<form:input path="lastName" id="lastname"
							placeholder="Last Name" data-trigger="change"
							data-validation-minlength="1" data-type="lastname"
							data-required="true"
							data-error-message="Enter a valid last name." /><label
							for="lastname">Last Name</label>
					</div>
					
					<div>
						<form:input path="birthDate" id="birthdate"
							placeholder="Birth Date" data-trigger="change"
							data-validation-minlength="1" data-type="birthdate"
							data-required="true"
							data-error-message="Enter a valid birth date." /><label
							for="birthdate">Birth Date</label>
					</div>
					<div>
						<form:input path="address"  id="address"
							placeholder="Address" data-trigger="change"
							data-validation-minlength="1" data-type="address"
							data-required="true"
							data-error-message="Enter a valid last name." /><label
							for="address">Address</label>
					</div>

					<div>
						<form:input path="email" id="email"
							placeholder="Email" data-trigger="change"
							data-validation-minlength="1" data-type="email"
							data-required="true"
							data-error-message="Enter a valid email." /><label
							for="email">Email</label>
					</div>
					
					<div>
						<form:input path="mobile"  id="mobile"
							placeholder="Mobile" data-trigger="change"
							data-validation-minlength="1" data-type="mobile"
							data-required="true"
							data-error-message="Enter a valid mobile." /><label
							for="mobile">Mobile</label>
					</div>

					<div>
						<form:input path="username" id="username"
							placeholder="Username" data-trigger="change"
							data-validation-minlength="1" data-type="username"
							data-required="true" data-error-message="Enter a valid username." /><label
							for="username">Username</label>
					</div>
					<div>


						<form:input path="password" id="password"
							placeholder="Password" data-trigger="change"
							data-validation-minlength="1" data-type="password"
							data-required="true" data-error-message="Enter a valid password." /><label
							for="password">Password</label>

					</div>
					<div>
					<form:checkboxes path="roles" items="${ roles }"/>
					</div>
					
					<div>
					<form:checkboxes path="permissions" items="${ permissions }"/>
					</div>
                     <input type="submit" value="ADD ACCOUNT"/>
				</form:form>
				
			</div>
		</div>
	</div>


</body>

</body>
</html>


