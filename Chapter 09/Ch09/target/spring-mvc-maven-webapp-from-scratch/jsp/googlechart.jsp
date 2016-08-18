<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
   <script type="text/javascript">

	google.charts.load('current', {
		packages: [ 'corechart']
		});
	
	google.charts.setOnLoadCallback(drawBarColors);
	function drawBarColors() {
		var data = google.visualization.arrayToDataTable([
    
			['Department', '% Hot', '% Not Hot'],
			['Accounting', 45, 55],
			['Chemistry', 40, 60],
			['Biology', 30, 70],
			['Mathematics', 20, 80]
   
		]);
		
		
		var options = {
		        chart: {
		          title: 'Box Office Earnings in First Two Weeks of Opening',
		          subtitle: 'in millions of dollars (USD)'
		        },
		        width: 900,
		        height: 500
		      };
  
	var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
		chart.draw(data, options);
	}
	
	</script>
	
 </head>
 <body>
  
   <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
   <div id="chart_div"></div>
   
  </body>

</html>