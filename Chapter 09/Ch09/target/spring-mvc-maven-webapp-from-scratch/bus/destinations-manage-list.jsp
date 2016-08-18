 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script type="text/javascript" src="../bus/js/jquery.jqGrid.min.js"></script>
    <script type="text/javascript" src="../bus/js/grid.locale-en.js"></script>
        <script type="text/javascript" src="../bus/js/jquery-ui-1.10.4.custom.min.js"></script>
        	
	<link rel="stylesheet" type="text/css" href="../bus/css/ui.jqgrid.css" />
    <link rel="stylesheet"	href="../bus/css/jquery-ui.css" />
        
<title>Insert title here</title>
<script type="text/javascript">

$(document).ready(function() {		
	
	$.when($.getJSON('http://localhost:8080/ch09/bts/trips.json')).then(function (data) {



	$("#trips").jqGrid({
	       datatype: "local",
	       height: 250,
	       width: 700,
	       colNames: ['TRIP ID', 'NAME', 'SIGHTS', 'DAY', 'NIGHT', 'TYPE', 'OTHER', 'LANG', 'ADULT', 'KID'],
	       colModel: [{
	           name: 'id',
	           index: 'id',
	           width: 10,
	           sorttype: "int"},
	       {
	           name: 'name',
	           index: 'name',
	           width: 50},
	       {
	           name: 'sightsStops',
	           index: 'sightsStops',
	           width: 10},
	       {
	           name: 'dayDuration',
	           index: 'dayDuration',
	           width: 10},
	           {
		           name: 'nightDuration',
		           index: 'nightDuration',
		           width: 10},
		           {
			           name: 'typeDuration',
			           index: 'typeDuration',
			           width: 10},
			           {
				           name: 'otherTransport',
				           index: 'otherTransport',
				           width: 10},
				           {
					           name: 'language',
					           index: 'language',
					           width: 10},
					           {
						           name: 'priceAdult',
						           index: 'priceAdult',
						           width: 10},
						           {
							           name: 'priceKid',
							           index: 'priceKid',
							           width: 10}
	       ],
	   });

	   var names = ['id', 'name', 'sightsStops', 'dayDuration', 'nightDuration', 'typeDuration', 'otherTransport', 'language', 'priceAdult', 'priceKid'];
	   var tripsData = [];

	   for (var i = 0; i < data.length; i++) {
		   tripsData[i] = {};
		   tripsData[i][names[0]] = data[i].id;
		   tripsData[i][names[1]] = data[i].name;
		   tripsData[i][names[2]] = data[i].sightsStops;
		   tripsData[i][names[3]] = data[i].dayDuration;
		   tripsData[i][names[4]] = data[i].nightDuration;
		   tripsData[i][names[5]] = data[i].typeDuration;
		   tripsData[i][names[6]] = data[i].otherTransport;
		   tripsData[i][names[7]] = data[i].language;
		   tripsData[i][names[8]] = data[i].priceAdult;
		   tripsData[i][names[9]] = data[i].priceKid;
		  
	   }

	   for (var i = 0; i <= tripsData.length; i++) {
	       $("#trips").jqGrid('addRowData', i + 1, tripsData[i]);
	   }

	   $("#trips").jqGrid('setGridParam', {ondblClickRow: function(rowid,iRow,iCol,e){alert('double clicked');}});
	  
	});      
});
	


</script>
</head>
<body>
   <DIV id="container">
		<DIV id="header" style="float : left; margin-left : 20px">			
			<div class="subtitle">A Spring MVC + jqgrid + Jquery example</div>
		</DIV>
		<div id="contentContainer">			
			<DIV id="rightNavPanel" style="float : left; margin-left : 20px">				

							<div class="section">
								<div class="outline">
									<div class="sectionHeader">
										<span class="sectionTitle" style="background-color: BLACK;color: WHITE;padding-left: 250;">Employees Records</span>
									</div>
									<div style="height : 260px; max-height : 300px; width: 100%; display: inline;float: left;margin-right: 0px; overflow : auto;">
										<table id="trips"></table>
										<div id="pager"></div>
									</div>
								</div>
								<!-- end outline div -->
							</div>
							<!-- end section div -->
								
			</DIV>
			<!-- rightNavPanel -->
		</div>
		<!--  end of content container -->
			<DIV id=footer>
			</DIV>			
	</DIV> 	

   
</body>
</html>