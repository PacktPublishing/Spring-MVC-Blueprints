<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="helloApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script
	src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.17/angular.min.js"></script>
<script	src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-route.js"></script>
<script>
var helloApp = angular.module("helloApp", ['ngRoute']);
helloApp.config(function($routeProvider){
	$routeProvider
		.when( '/searchtable', { controller: 'CompanyCtrl', templateUrl: 'http://localhost:8080/ch06/ng/searchrow.html' } )
		.when('/sorttablecolumn', { controller: 'CompanyCtrl', templateUrl: 'http://localhost:8080/ch06/ng/sortcols.html' })
		.otherwise( { redirectTo: '/searchtable' } );
});
</script>
</head>
<body>
	<ol>
		<li><strong><a href="#/searchtable">views/searchtable.html</a></strong>Search Table</li>
		<li><strong><a href="#/sorttablecolumn">views/sorttablecolumn.html</a></strong>Sort Table</li>
	</ol>
<div style="padding:40px 0px 40px 0px">
		<!--  Placeholder for the views  -->
		<div ng-view></div>
	</div>

</body>
</html>