<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
			<div class="content" id="create">
				<form:form commandName="catalogForm" class="go-right"  method="POST">
					<div>
						<form:input  path="name" id="name"
							placeholder="Catalog Name" data-trigger="change"
							data-validation-minlength="1" data-type="usernae"
							data-required="true"
							data-error-message="Enter a valid name." /><label
							for="name">Product Name</label>
					</div>
					<div>


						<form:input path="price" id="price"
							placeholder="Catalog Price" data-trigger="change"
							data-validation-minlength="1" data-type="password"
							data-required="true"
							data-error-message="Enter a valid price." /><label
							for="price">Price</label>

					</div>

					<div>
						<form:input path="stock" id="stock"
							placeholder="Stock" data-trigger="change"
							data-validation-minlength="1" data-type="stock"
							data-required="true"
							data-error-message="Enter number of stocks." /><label
							for="stock">Stock</label>
					</div>
					
					<div>
						<form:input path="expiryDate" id="expiryDate"
							placeholder="Expiry Date" data-trigger="change"
							data-validation-minlength="1" data-type="expiryDate"
							data-required="true"
							data-error-message="Enter a valid expiry date." /><label
							for="expiryDate">Expiry Date</label>
					</div>
					<div>
						<form:select path="category"  id="category" items="${ catId }"
							placeholder="Product Category" data-trigger="change"
							 data-type="category"
							data-required="true"
							data-error-message="Enter a valid category." /><label
							for="category">Category</label>
					</div>

					<div>
						<form:select path="status"  id="status" items="${ statusId }"
							placeholder="Product Status" data-trigger="change"
							data-type="status" data-required="true"
							data-error-message="Enter a valid status." /><label
							for="status">Status</label>
					</div>

									
					
                     <input type="submit" value="ADD PRODUCT"/>
				</form:form>
				
			</div>
		</div>
	</div>


</body>

</html>