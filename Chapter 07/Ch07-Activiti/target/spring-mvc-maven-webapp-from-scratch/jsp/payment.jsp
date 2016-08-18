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
		<div class="step" id="step4">
			<div class="number">
				<span>3</span>
			</div>
			<div class="title">
				<h1>Payment Information</h1>
			</div>
			<div class="modify">
				<i class="fa fa-plus-circle"></i>
			</div>
		</div>
		<div class="content" id="payment">
			<div class="left credit_card">
			<form class="go-right">
				<div>
				<input type="text" name="card_number" value="" id="card_number" placeholder="xxxx-xxxx-xxxx-xxxx" data-trigger="change" data-validation-minlength="1" data-type="name" data-required="true" data-error-message="Enter Your Credit Card Number"/><label for="card_number">Card Number</label>
				</div>
				<div>
				  <div class="expiry">	
				      <div class="month_select">
				        <select name="exp_month" value="" id="exp_month" placeholder="" data-trigger="change" data-type="name" data-required="true" data-error-message="Enter Your Credit Card Expiration Date">
							<option value = "1">01 (Jan)</option>
                   			<option value = "2">02 (Feb)</option>
                   			<option value = "3">03 (Mar)</option>
                   			<option value = "4">04 (Apr)</option>
                   			<option value = "5">05 (May)</option>
                   			<option value = "6">06 (Jun)</option>
                   			<option value = "7">07 (Jul)</option>
                   			<option value = "8">08 (Aug)</option>
                   			<option value = "9">09 (Sep)</option>
                   			<option value = "10">10 (Oct)</option>
                   			<option value = "11">11 (Nov)</option>
                   			<option value = "12">12 (Dec)</option>
                        </select>
                      </div>
                      <span class="divider">-</span>
                      <div class="year_select">
				        <select name="exp_year" value="" id="exp_year" placeholder="" data-trigger="change" data-type="name" data-required="true" data-error-message="Enter Your Credit Card Expiration Date">
							<option value = "1">14 </option>
                   			<option value = "2">15 (Feb)</option>
                   			<option value = "3">16 (Mar)</option>
                   			<option value = "4">17 (Apr)</option>
                   			<option value = "5">18 (May)</option>
                   			<option value = "6">19 (Jun)</option>
                   			<option value = "7">20 (Jul)</option>
                   			<option value = "8">22 (Aug)</option>
                   			<option value = "9">23 (Sep)</option>
                   			<option value = "10">24 (Oct)</option>
                   			<option value = "11">25 (Nov)</option>
                   			<option value = "12">26 (Dec)</option>
                        </select>
            	      </div>
            	    </div>
                 <label class="exp_date" for="Exp_Date">Exp Date</label>
            	  </div>
            	<div class="sec_num">
              <div>
				        <input type="text" name="ccv" value="" id="ccv" placeholder="123" data-trigger="change" data-validation-minlength="3" data-type="name" data-required="true" data-error-message="Enter Your Card Security Code"/>
                <label for="ccv">Security Code</label>
				      </div>
				      </div>
			      </form>
			</div>
			<div class="right">
				<div class="accepted">
					<span><img src="img/Z5HVIOt.png"></span>
					<span><img src="img/Le0Vvgx.png"></span>
					<span><img src="img/D2eQTim.png"></span>
					<span><img src="img/Pu4e7AT.png"></span>
					<span><img src="img/ewMjaHv.png"></span>
					<span><img src="img/3LmmFFV.png"></span>
				</div>
				<div class="secured">
					<img class="lock" src="img/lock.png">
					<p class="security info">What, well you mean like a date? Doc? Am I to understand you're still hanging around with Doctor Emmett Brown, McFly? Tardy slip for you, Miss Parker. And one for you McFly I believe that makes four in a row. Now let me give you a nickle's worth of advice, young man. This so called Doctor Brown is dangerous, he's a real nuttcase.</p>
				</div>
			</div>
				<spring:url value="/ocs/shipping.html"	var="nextPage" />
			<a class="continue" href="${ nextPage }">Continue</a>

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
</div>


</body>

</body>
</html>

