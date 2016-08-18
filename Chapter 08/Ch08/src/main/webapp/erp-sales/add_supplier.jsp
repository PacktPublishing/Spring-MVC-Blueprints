<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<title>Packt CRM Module</title>
		<spring:url var="rotateCSS" value="/erp-sales/css/960.css"/>
		 <spring:url var="fluidCSS" value="/erp-sales/css/fluid.css"/>
		 <spring:url var="templateCSS" value="/erp-sales/css/template.css"/>
		<spring:url var="colourCSS" value="/erp-sales/css/colour.css"/>
		<link rel="stylesheet" href="${ rotateCSS }" type="text/css" media="screen" charset="utf-8" />
		<!--<link rel="stylesheet" href="css/fluid.css" type="text/css" media="screen" charset="utf-8" />-->
		<link rel="stylesheet" href="${ templateCSS }" type="text/css" media="screen" charset="utf-8" />
		<link rel="stylesheet" href="${ colourCSS }" type="text/css" media="screen" charset="utf-8" />
	</head>
	<body>
	<h1 id="head">Packt CRM Module</h1>
	<ul id="navigation">
			<li><span class="active">Overview</span></li>
				<li><span class="active">Home</span></li>
			<li><a href="#">Suppliers</a></li>

		</ul>
			<div id="content" class="container_16 clearfix">
				<div class="grid_16">
				<h2>Add Supplier</h2>
<!--
				<p class="error">Something went wronk.</p> -->
				</div>

				<div class="grid_14">
					<p>
 					<label for="title">Supplier Name</label>
					<input type="text" name="name" />
					</p>
				</div>
				<div class="grid_3">
					<p>
 				<label for="title">Street</label>
					<input type="text" name="street" />
					</p>
				</div>

				<div class="grid_3">
					<p>
 					<label for="title">City</label>
					<input type="text" name="city" />
					</p>
				</div>


				<div class="grid_4">
					<p>
						<label for="title">Country</label>
					<input type="text" name="country" />
					</p>
						
				</div>

<div class="grid_4">
					<p>
						<label for="title">Zip </label>
					<input type="text" name="zip" />
					</p>
						
				</div>
<div class="grid_3">
					<p>
						<label for="title">Telephone </label>
					<input type="text" name="telephone" />
					</p>
						
				</div>
<div class="grid_3">
					<p>
						<label for="title">Fax </label>
					<input type="text" name="fax" />
					</p>
						
				</div>
<div class="grid_3">
					<p>
						<label for="title">Email </label>
					<input type="text" name="email" />
					</p>
						
				</div>

				

				

				<div class="grid_16">
					
					<p class="submit">
						<input type="reset" value="Reset" />
						<input type="submit" value="Post" />
					</p>
				</div>
			</div>
		
		<div id="foot">
					<a href="#">Contact Me</a>
		</div>
	</body>
</html>
