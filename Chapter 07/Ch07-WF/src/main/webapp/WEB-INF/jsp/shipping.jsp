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
		<div class="step" id="step3">
			<div class="number">
				<span>3</span>
			</div>
			<div class="title">
				<h1>Shipping Information</h1>
			</div>
			<div class="modify">
				<i class="fa fa-plus-circle"></i>
			</div>
		</div>
		<div class="content" id="shipping">
			<form action="${flowExecutionUrl}&_eventId=payment" method="post">
				<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey}" />
				<div>
					<input type="radio" id="shipping_1" value="1"/><label for="shipping_1"> Standard Shipping <span class="price">$4.00</span></label>
        </div>
				<div>		
					<input type="radio" id="shipping_2" value="2"/><label for="shipping_2"> Express Shipping <span class="price">$8.00</span></label>
				</div>
				<div>		
					<input type="radio" id="shipping_3" value="3"/><label for="shipping_3"> Overnight Shipping <span class="price">$12.00</span></label>
				</div>
				<div>
					<br /> <input type="submit" value="Shipping" />
					</div>
			</form>
			
		</div>

</div>
</div>


</body>

</body>
</html>

