<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<title>Customer Feedback System</title>

<spring:url value="/css/hello.css" var="coreCss" />
<spring:url value="/css/bootstrap.min.css"
	var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
<link rel="stylesheet" href="stylesheet.css" type="text/css"/>
</head>

<spring:url value="/cfs/topics" var="urlHome" />
<spring:url value="/cfs/topics_add" var="urlAddUser" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Feedback Dashboard</a>
		</div>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlAddUser}">Add Topic</a></li>
			</ul>
		</div>
	</div>
</nav>