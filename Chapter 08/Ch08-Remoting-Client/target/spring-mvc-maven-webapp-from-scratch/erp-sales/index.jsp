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
		<title>Steal My Admin</title>
		<spring:url var="rotateCSS" value="/erp-sales/css/960.css"/>
		 <spring:url var="fluidCSS" value="/erp-sales/css/fluid.css"/>
		 <spring:url var="templateCSS" value="/erp-sales/css/template.css"/>
		<spring:url var="colourCSS" value="/erp-sales/css/colour.css"/>
		<link rel="stylesheet" href="${ rotateCSS }" type="text/css" media="screen" charset="utf-8" />
		<link rel="stylesheet" href="${ templateCSS  }" type="text/css" media="screen" charset="utf-8" />
		<link rel="stylesheet" href="${ colourCSS }" type="text/css" media="screen" charset="utf-8" />
	</head>
	<body>

		<h1 id="head">Profile</h1>

		<ul id="navigation">
			<li><span class="active">Dashboard</span></li>
			<li><a href="#">Profiles</a></li>
			<li><a href="#">Customers</a></li>
			<li><a href="#">Suppliers</a></li>

		</ul>
		
		<div id="content" class="container_16 clearfix">
			<div class="grid_11">
				<h2>About</h2>
				<p>After looking for a decent admin template and not having any success I decided to knock this one up. It's released under the creative commons license, so make sure you look at that before using it in your project.</p>
				<h3>Credits</h3>
				<p>I would like to thank Nathan Smith for creating the 960.gs CSS framework which made this project a <i>little</i> easier.</p>
			</div>
			<div class="grid_5">
				<h2>CRM</h2>
				<ol>
					<li><a href="add_profile.html">Add Profile</a></li>
					<li><a href="add_customer.html">Add Customer</a></li>
					<li><a href="add_supplier.html">Add Supplier</a></li>
				</ol>
			</div>
		</div>

			<div id="foot">
				<i>Designed by </i><a href="http://mathew-davies.co.uk/">Mathew Davies</a>
			</div>
		
	</body>
</html>