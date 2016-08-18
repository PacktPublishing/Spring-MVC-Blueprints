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
		<portlet:actionURL var="urlAgain">
           <portlet:param name="action" value="signup" />
         </portlet:actionURL>
</head>
<body>
	<div id="wrap">
		<div id="accordian">
			<div class="step" id="step5">
				<div class="number">
					<span>5</span>
				</div>
				<div class="title">
					<h1>Finalize Order</h1>
				</div>
				<div class="modify">
					<i class="fa fa-plus-circle"></i>
				</div>
			</div>
			<div class="content" id="final_products">
				<div class="left" id="ordered">
					<div class="products">
						<div class="product_image">
							<img src="img/lady.jpg" />
						</div>
						<div class="product_details">
							<span class="product_name">Cherry Bikini</span> <span
								class="quantity">1</span> <span class="price">$45.00</span>
						</div>
					</div>
					<div class="totals">
						<span class="subtitle">Subtotal <span id="sub_price">$45.00</span></span>
						<span class="subtitle">Tax <span id="sub_tax">$2.00</span></span>
						<span class="subtitle">Shipping <span id="sub_ship">$4.00</span></span>
					</div>
					<div class="final">
						<span class="title">Total <span id="calculated_total">$51.00</span></span>
					</div>
				</div>
				<div class="right" id="reviewed">
					<div class="billing">
						<span class="title">Billing:</span>
						<div class="address_reviewed">
							<span class="name">John Smith</span> <span class="address">123
								Main Street</span> <span class="location">Everytown, USA, 12345</span>
							<span class="phone">(123)867-5309</span>
						</div>
					</div>
					<div class="shipping">
						<span class="title">Shipping:</span>
						<div class="address_reviewed">
							<span class="name">John Smith</span> <span class="address">123
								Main Street</span> <span class="location">Everytown, USA, 12345</span>
							<span class="phone">(123)867-5309</span>
						</div>
					</div>
					<div class="payment">
						<span class="title">Payment:</span>
						<div class="payment_reviewed">
							<span class="method">Visa</span> <span class="number_hidden">xxxx-xxxx-xxxx-1111</span>
						</div>
					</div>
					
					
					
					<form action="${flowExecutionUrl}&_eventId=billing" method="post">
					<div>
					<div>
					<br /> <input type="submit" value="Login" />
					</div>
					</div>
					</form>
					
				</div>
			</div>

		</div>
	</div>


</body>

</body>
</html>

