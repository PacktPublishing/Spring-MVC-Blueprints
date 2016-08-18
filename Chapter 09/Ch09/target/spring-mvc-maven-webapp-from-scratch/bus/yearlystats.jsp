<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Management Statistics</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
 <script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
    google.charts.load('current', {
		packages : [ 'corechart' ]
	});
	google.charts.setOnLoadCallback(drawLines);
	
	function drawLines() {
		var jsonData = $.ajax({
	          url: "http://localhost:8080/ch09/bts/trips/year.json",
	          dataType: "json",
	          async: false
	          }).responseText;
		
	    alert(jsonData);
	   
	      // Create our data table out of JSON data loaded from server.
	      var data = new google.visualization.DataTable();  
	      data.addColumn('number', 'Month');
          data.addColumn('number', 'Trip Frequency');
          // Required Parsing for DataTable creation
          var json = $.parseJSON(jsonData);
          for (var i=0;i<json.length;++i){
                  alert(json[i].month);
               	  data.addRows([
               	                  [json[i].month, json[i].numTrips]
               	              ]); 
	      }
                  
		 var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
		 chart.draw(data, {
			 title: 'Year 2016 Trip Abalysis',
	          curveType: 'function',
	          legend: { position: 'bottom' }
		});
	}
</script>
</head>
<body>

	<div id="chart_div" ></div>
</body>
</html>