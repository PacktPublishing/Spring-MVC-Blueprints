<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="hms">
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
<script>
var hms = angular.module("hms", []);
hms.config(['$httpProvider', function ($httpProvider) {    
	$httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded; charset=UTF-8';
}]);
hms.controller('roomTypeController', 
   
    function($scope, $http) {
	    $scope.roomTypes = [];
	    $http({
		        method : 'GET',
		        url : '/ch06/hms/getRoomTypes'
	          }).success(function(data, status, headers, config) {
		              $scope.roomTypes = data;
	          }).error(function(data, status, headers, config) {
		               alert( "failure");
	          });

	     $scope.addRow = function(){		
    		//$scope.companies.push({ 'name':$scope.name, 'employees': $scope.employees, 'headoffice':$scope.headoffice });
    		// Writing it to the server
    		//		
    		var data = 'id=' + $scope.id + '&type=' + $scope.type;								
    		$http.post('/ch06/hms/addRoomType', data )
    		.success(function(data, status, headers, config) {
    			$scope.message = data;
    			window.location = '#/ch06/hms/getRoomTypes';
    		    window.location.reload();
    		})
    		.error(function(data, status, headers, config) {
    			alert( "failure message: " + JSON.stringify({data: data}));
    		});
    		// Making the fields empty
    		//
    		$scope.id='';
    		$scope.type='';
    		
    	}
      }

     
 );
</script>
</head>
<body ng-controller="roomTypeController">
<table class="table">
	<tr>
		<th>ID
		</th>
		<th>Room Types
		</th>
		
	</tr>
	<tr ng-repeat="rtype in roomTypes">
		<td>{{rtype.id}}
		</td>
		<td>{{rtype.type}}
		</td>
		
	</tr>
</table>
<form class="form-horizontal" role="form" ng-submit="addRow()">
	<div class="form-group">
		<label class="col-md-2 control-label">ID</label>
		<div class="col-md-4">
			<input type="text" class="form-control" name="id"
				ng-model="id" />
		</div>
	</div>
	<div class="form-group">
		<label class="col-md-2 control-label">Type</label>
		<div class="col-md-4">
			<input type="text" class="form-control" name="type"
				ng-model="type" />
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