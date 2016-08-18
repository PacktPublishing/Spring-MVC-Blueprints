<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  >
<html ng-app="helloApp" >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello AngularJS - Hello World</title>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.17/angular.min.js"></script>
<script>
	var helloApp = angular.module("helloApp", []);
	helloApp.controller("HelloCtrl", function($scope) {
		$scope.name = "Calvin Hobbes";
	});
</script>
</head>
<body ng-controller="HelloCtrl">
	<header class="navbar navbar-static-top" id="top" role="banner">
	<div class="container">
		<div class="navbar-header">
			<button class="navbar-toggle" type="button" data-toggle="collapse"
				data-target=".bs-navbar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="/" class="navbar-brand">Hello-AngularJS</a>
		</div>		
	</div>
	</header>
	<div class="container">
		<div class="page-header" style="margin: 0">
			<h1>Hello World</h1>
		</div>
		<div style="padding-top: 15px">This example demonstrate the code
			sample for Hello World program. Type your name in the text field
			below</div>
		<div style="padding-top: 30px">
			<div style="padding: 0px 0px 20px 30px">
				<h4>Hello {{name}}! How are you doing today</h4></div>
			<form class="form-horizontal" role="form" method="post" action="#">
				<div class="form-group">
					<label class="col-md-1 control-label">Name</label>
					<div class="col-md-3">
						<input type="text" class="form-control" name="firstname"
							ng-model="name">
					</div>
				</div>
			</form>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Notes</h3>
			</div>
			<div class="panel-body">Pay attention to ng-model="name" and the template Calvin Hobbes</div>
		</div>		
	</div>
</body>
</html>	