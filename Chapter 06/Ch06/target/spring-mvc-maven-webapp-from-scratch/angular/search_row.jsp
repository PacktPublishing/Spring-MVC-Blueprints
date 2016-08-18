<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="helloApp">
<head>
<title>Hello AngularJS - Add Table Row Dynamically</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script
	src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.17/angular.min.js"></script>
<script>
var helloApp = angular.module("helloApp", []);
helloApp.controller("CompanyCtrl", function($scope) {
$scope.companies = [
                    { 'name':'Infosys Technologies',
                    	'employees': 125000,
                    	'headoffice': 'Bangalore'},
                    	{ 'name':'Cognizant Technologies',
	                    	'employees': 100000,
	                    	'headoffice': 'Bangalore'},
	                    	{ 'name':'Wipro',
		                    	'employees': 115000,
		                    	'headoffice': 'Bangalore'},
		                    	{ 'name':'Tata Consultancy Services (TCS)',
			                    	'employees': 150000,
			                    	'headoffice': 'Bangalore'},
			                    	{ 'name':'HCL Technologies',
				                    	'employees': 90000,
				                    	'headoffice': 'Noida'},
                    ];
$scope.addRow = function(){		
	$scope.companies.push({ 'name':$scope.name, 'employees': $scope.employees, 'headoffice':$scope.headoffice });
	$scope.name='';
	$scope.employees='';
	$scope.headoffice='';
};
$scope.removeRow = function(name){				
		var index = -1;		
		var comArr = eval( $scope.companies );
		for( var i = 0; i < comArr.length; i++ ) {
			if( comArr[i].name === name ) {
				index = i;
				break;
			}
		}
		if( index === -1 ) {
			alert( "Something gone wrong" );
		}
		$scope.companies.splice( index, 1 );		
	};
});
</script>
</head>
<!-- Controller name goes here -->
<body ng-controller="CompanyCtrl">
<div style="padding:20px 0px 60px 0px">
			<span class="col-md-1" style="font-weight:bold">Search</span>
			<span class="col-md-3">
			<input type="text" class="form-control" ng-model="searchKeyword"/>
			</span>
		</div>

<table class="table">
	<tr>
		<th>Name
		</th>
		<th>Employees
		</th>
		<th>Head Office
		</th>
	</tr>
	<tr ng-repeat="company in companies | filter: searchKeyword">
		<td>{{company.name}}
		</td>
		<td>{{company.employees}}
		</td>
		<td>{{company.headoffice}}
		</td>
		<td>
		<input type="button" value="Remove" class="btn btn-primary" ng-click="removeRow(company.name)"/>
		</td>
	</tr>
</table>
<form class="form-horizontal" role="form" ng-submit="addRow()">
	<div class="form-group">
		<label class="col-md-2 control-label">Name</label>
		<div class="col-md-4">
			<input type="text" class="form-control" name="name"
				ng-model="name" />
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label">Employees</label>
		<div class="col-md-4">
			<input type="text" class="form-control" name="employees"
				ng-model="employees" />
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label">Headoffice</label>
		<div class="col-md-4">
			<input type="text" class="form-control" name="headoffice"
				ng-model="headoffice" />
		</div>
	</div>
	<div class="form-group">								
		<div style="padding-left:110px">
			<input type="submit" value="Submit" class="btn btn-primary"/>
		</div>
	</div>
</form>

</body>
</html>