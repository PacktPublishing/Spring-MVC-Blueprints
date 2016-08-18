<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--

PS: This landing page is badly/quickly coded to save time! The library is not.
Don't judge a book by its cover. Or something like that.

-->
<html>
<head>
    <spring:url var="gridCSS" value="/erp-catalog/gridforms/gridforms.css"/>
    <spring:url var="gridJS" value="/erp-catalog/gridforms/gridforms.js"/>
    <spring:url var="mediaCSS" value="/erp-catalog/media/style.css"/>
	<title>Grid Forms &middot; Data entry made beautiful</title>
	<link rel="stylesheet" type="text/css" href="${ gridCSS }">
	<link rel="stylesheet" type="text/css" href="${ mediaCSS }">
	<script type="text/javascript" src="//use.typekit.net/jmi3kol.js"></script>
	<script type="text/javascript">try{Typekit.load();}catch(e){}</script>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script type="text/javascript" src="${ gridJS }"></script>
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
</head>
<body>
	<h1>Packt ERP</h1>
	<h2>Inventory Module</h2>

	<br><br><br>
	<br>

	<br>

	<form:form class="my-grid-form" commandName="invForm" method="POST" >
		<fieldset>
			<legend>Add to inventory</legend>
			<div data-row-span="4">
				<div data-field-span="3">
					<label>Product Name</label>
					<form:input path="name" />
				</div>
				<div data-field-span="1">
					<label>Tags</label>
					<form:input path="tags"/>
				</div>
			</div>
			<div data-row-span="2">
				<div data-field-span="1">
					<label>Vendor</label>
					<form:select path="vendor" items="${ supplierNames }"/>
					
				</div>
				<div data-field-span="1">
					<label>Product Type</label>
				<form:select path="typeId" items="${ materialNames }"/> 
				</div>
			</div>
			<div data-row-span="1">
				<div data-field-span="1">
					<label>Product Description</label>
					<form:textarea path="description"/>
				</div>
			</div>
			<div data-row-span="5">
				<div data-field-span="1">
					<label>SKU</label>
					 <form:select path="uomId" items="${ units }"/> 
					
				</div>
				<div data-field-span="1">
					<label>Initial Stock Level</label>
					<form:input path="stock"/>
				</div>
				<div data-field-span="1">
					<label>Cost Price</label>
					<form:input path="costPrice"/>
				</div>
				<div data-field-span="1">
					<label>Wholesale Price</label>
					<form:input path="wholeSalePrice"/>
				</div>
				<div data-field-span="1">
					<label>Retail Price</label>
					<form:input path="retailPrice"/>
				</div>
			</div>
			<div data-row-span="1">
				<div data-field-span="1">
					<input type="submit" value="Add Catalog"/>
				</div>
			</div>
		</fieldset>
	</form:form>

	
</body>
</html>
