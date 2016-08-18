<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<title>Hotel Management System</title>

<spring:url value="/css/bootstrap.min.css"
	var="bootstrapCss" />
<spring:url value="/css/bootstrap-theme.min.css"
	var="themeBootstrapCss" />

<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${themeBootstrapCss}" rel="stylesheet" />
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
</style>

<style type="text/css">
    /* Some custom styles to beautify this example */
    .stub-space{
        padding: 15px;
        font-size: 18px;
        min-height: 300px;
        background: #dbdfe5;
        margin-bottom: 10px;
    }
    .stub-space.bg-alt{
        background: #abb1b8;
    }
</style>
</head>



<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Rooms</a>
		</div>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#">Back to Site</a></li>
			</ul>
		</div>
	</div>
</nav>