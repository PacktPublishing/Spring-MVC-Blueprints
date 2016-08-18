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
    <title>
        Sample Page by Designscrazed.com
    </title>
 
<spring:url value="/css/style.css"
	var="stylesCSS" />

<link rel="stylesheet" type="text/css" href="${ stylesCSS }" />
    
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
     <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,600' rel='stylesheet' type='text/css'>

</head>
<body>
<div id="wrap">
	<div id="accordian">
		<div class="step" id="step2">
			<div class="number">
				<span>2</span>
			</div>
			<div class="title">
				<h1>Billing Information</h1>
			</div>
			<div class="modify">
				<i class="fa fa-plus-circle"></i>
			</div>
		</div>
		<div class="content" id="address">
			<form class="go-right">
				<div>
				<input type="name" name="first_name" value="" id="first_name" placeholder="John" data-trigger="change" data-validation-minlength="1" data-type="name" data-required="true" data-error-message="Enter Your First Name"/><label for="first_name">First Name</label>
        </div>
				<div>
				<label for="last_name">Last Name</label>
				<input type="name" name="last_name" value="" id="last_name" placeholder="Smith" data-trigger="change" data-validation-minlength="1" data-type="name" data-required="true" data-error-message="Enter Your Last Name"/><label for="last_name">Last Name</label>
				</div>
				<div>
				<input type="phone" name="telephone" value="" id="telephone" placeholder="(555)-867-5309" data-trigger="change" data-validation-minlength="1" data-type="number" data-required="true" data-error-message="Enter Your Telephone Number"/><label for="telephone">Telephone</label>
				</div>
				<div>
				<input type="text" name="company" value="" id="company" placeholder="Company" data-trigger="change" data-validation-minlength="1" data-type="name" data-required="false"/><label for="Company">Company</label>
				</div>
				<div>
				<input type="text" name="address" value="" id="address" placeholder="123 Main Street" data-trigger="change" data-validation-minlength="1" data-type="text" data-required="true" data-error-message="Enter Your Billing Address"/><label for="Address">Address</label>
				</div>
				<div>
				<input type="text" name="city" value="" id="city" placeholder="Everytown" data-trigger="change" data-validation-minlength="1" data-type="text" data-required="true" data-error-message="Enter Your Billing City"/><label for="city">City</label>
				</div>
				<div>
				<div class="state_options">
        			<div class="select">
                 		<select id="state">
                  	 		<option value = "1">Alabama</option>
                   			<option value = "2">Alaska</option>
                   			<option value = "3">Arkansas</option>
                   			<option value = "4">Etc.</option>
                 		</select>
                 	</div>
                  <label class="state" for="state">State</label>
          		</div>
				</div>
				<div>
				<input type="text" name="zip" value="" id="zip" placeholder="12345" data-trigger="change" data-validation-minlength="1" data-type="text" data-required="true" data-error-message="Enter Your Billing Zip Code"/><label for="zip">Zip Code</label>
				</div>
				<div>
				<div class="country_options">
				  <label class="country" for="country">Country</label>
        			<div class="select">
                 		<select id="country">
                  	 		<option value = "1">United States</option>
                   			<option value = "2">United Kingdom</option>
                   			<option value = "3">Uganda</option>
                   			<option value = "4">Etc.</option>
                 		</select>
                 	</div>
          		</div>
				</div>
				<div>
				<input type="checkbox"/>
				<label class="same" for="same_as_shipping">Same As Shipping Address</label><span></span>
				</div>
			</form>
			
			
			<spring:url value="/ocs/payment.html"	var="nextPage" />
			<a class="continue" href="${ nextPage }">Continue</a>
		</div>
		

</div>
</div>


</body>

</body>
</html>

