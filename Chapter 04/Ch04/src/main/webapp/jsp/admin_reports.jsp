<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
  
 <head>
    <meta charset="utf-8">
    <title>Reports - Human Resources Management System</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/bootstrap-responsive.min.css" rel="stylesheet">
    
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
    <link href="../css/font-awesome.css" rel="stylesheet">
    
    <link href="../css/style.css" rel="stylesheet">
    
    <link href="../css/pages/reports.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

<body>

<div class="navbar navbar-fixed-top">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			
			<a class="brand" href="index.html">
				Human Resources Management System					
			</a>		
			
			<div class="nav-collapse">
				<ul class="nav pull-right">
					<li class="dropdown">						
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-cog"></i>
							Account
							<b class="caret"></b>
						</a>
						
						<ul class="dropdown-menu">
							<li><a href="javascript:;">Settings</a></li>
							<li><a href="javascript:;">Help</a></li>
						</ul>						
					</li>
			
					<li class="dropdown">						
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							<i class="icon-user"></i> 
							HRMS
							<b class="caret"></b>
						</a>
						
						<ul class="dropdown-menu">
							<li><a href="javascript:;">Profile</a></li>
						<li><a href="./login.html">Logout</a></li>
						</ul>						
					</li>
				</ul>
			
				<form class="navbar-search pull-right">
					<input type="text" class="search-query" placeholder="Search">
				</form>
				
			</div><!--/.nav-collapse -->	
	
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->
    



    
<div class="subnavbar">

	<div class="subnavbar-inner">
	
		<div class="container">

			<ul class="mainnav">
			
				<li>
					<a href="admin_index.html">
						<i class="icon-dashboard"></i>
						<span>Dashboard</span>
					</a>	    				
				</li>
				
				  <li><a href="admin_reports.html"><i class="icon-list-alt"></i><span>Reports</span> </a> </li>
			               
                
                <li>			
                    <c:url var="admin_charts_url"  value="/hrms/admin_charts" />		
					<a href='<c:out value="${ admin_charts_url }"/>'>
						<i class="icon-bar-chart"></i>
						<span>Charts</span>
					</a>  									
				</li>
                
                
			</ul>

		</div> <!-- /container -->
	
	</div> <!-- /subnavbar-inner -->

</div> <!-- /subnavbar -->
    

    
<div class="main">
	
	<div class="main-inner">

	    <div class="container">
	    	
	     <div class="row">
	      	
	      	<div class="span12">
	      
	      	<div class="info-box">
	      	<div class="row-fluid stats-box">
	      	 <div class="stats-box-title">
	      	           <i class="icon-star"></i>
						<h3>Download Reports</h3>
	      	 </div>
                  <div class="span12">
                 
                  	<div class="controls">
                  	<table style="margin-left: 50px; margin-right: 50px; width: 500px; display: block;" >
                  	   <caption></caption>
                  	   <thead>
                  	     <tr>
                  	       <th colspan="2" valign="middle">POI</th>
                  	       <th></th>
                  	        <th colspan="2" valign="middle">JEXCEL API</th>
                  	       <th></th>
                  	        <th colspan="2" valign="middle">iText 5.x</th>
                  	       <th></th>
                  	     </tr>
                  	   </thead>
                  	  <tbody>
                  	      <tr>
                  	        <td colspan="2" valign="middle"> <a class="btn btn-medium" href="/ch04/hrms/downloadExcelUserList.xls"><i class="icon-download"></i> Master List of Users (Download)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle"> <a class="btn btn-medium" href="/ch04/hrms/downloadJExcelUserList.xls"><i class="icon-download"></i> List of Administrators (Download)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle"> <a class="btn btn-medium" href="/ch04/hrms/downloadPDFUserListF.pdf"><i class="icon-download"></i> List of HR Managers (Download)</a></td>
                  	        <td></td>
                  	      </tr>
                  	  </tbody>
                  	</table>
                  	  </div>
                  	                     
                                        
                  </div>
                    </div>
                    
                     </div>
               
               
         </div>
         </div>     
                   <div class="row">
	      	
	      	<div class="span12">
	      
	      	<div class="info-box">
                  <div class="row-fluid stats-box">
                   <div class="stats-box-title">
	      	           <i class="icon-camera"></i>
						<h3>JasperReports Transactions</h3>
	      	 </div>
                  <div class="span12">
                  <div class="table">
                  
                  	<table style="margin-left: 50px; margin-right: 50px; width: 700px; display: block;" >
                  	   <caption></caption>
                  	   
                  	  <tbody>
                  	      <tr>
                  	        <td colspan="2" valign="middle">  <a class="btn btn-medium" href="/ch04/hrms/showJasperManagerPDF.pdf"><i class="icon-download"></i>Using Jasper File (Download) </a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle">  <a class="btn btn-medium" href="/ch04/hrms/showJasperBasePDF.pdf"><i class="icon-camera"></i> Using Typical View Resolver (View PDF)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle">  <a class="btn btn-medium" href="/ch04/hrms/showJasperViewPDF.pdf"><i class="icon-camera"></i> Using JasperReports View (View PDF)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle"> <a class="btn btn-medium" href="/ch04/hrms/showJasperMVCPDF.pdf"><i class="icon-camera"></i> Using JasperReports View Resolver (View PDF)</a></td>
                  	        <td></td>
                  	       
                  	      </tr>
                  	      <tr>
                  	       <td colspan="2" valign="middle">   <a class="btn btn-medium" href="/ch04/hrms/showRTFFile.rpt"><i class="icon-download"></i> Jasper RPT (Download)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle">   <a class="btn btn-medium" href="/ch04/hrms/showDOCXFile.docx"><i class="icon-download"></i> Jasper DOCX (Download)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle">    <a class="btn btn-medium" href="/ch04/hrms/showCSVFile.csv"><i class="icon-camera"></i> Jasper CSV (View)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle"> <a class="btn btn-medium" href="/ch04/hrms/showHTMLFile.html"><i class="icon-camera"></i> Users (HTML)</a></td>
                  	        <td></td>
                  	      </tr>
                  	  </tbody>
                  	</table>
          
                       
                  </div>
                  </div>
                    </div>
                    
                     </div>
               
               
         </div>
         </div>     
          <div class="row">
	      	
	      	<div class="span12">
	      
	      	<div class="info-box">
                  <div class="row-fluid stats-box">
                  <div class="stats-box-title">
	      	           <i class="icon-cloud"></i>
						<h3>ContentNegotiationViewResolver Transactions</h3>
	      	 </div>
                  <div class="span12">
                   <div class="table">
                     
                    	<table style="margin-left: 50px; margin-right: 50px; width: 700px; display: block;" >
                  	   <caption></caption>
                  	   
                  	  <tbody>
                  	      <tr>
                  	        <td colspan="2" valign="middle">   <a class="btn btn-medium" href="/ch04/hrms/userListNego.html"><i class="icon-cloud"></i> List of Employees (HTML)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle">   <a class="btn btn-medium" href="/ch04/hrms/userListNego.xml"><i class="icon-cloud"></i> List Employees (XML)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle">  <a class="btn btn-medium" href="/ch04/hrms/userListNego.json"><i class="icon-cloud"></i> List of Users  (JSON)</a></td>
                  	        <td></td>
                  	        <td colspan="2" valign="middle"> <a class="btn btn-medium" href="/ch04/hrms/userListNego.xlsx"><i class="icon-cloud"></i> List of Employees (XLSX)</a></td>
                  	        <td></td>
                  	       
                  	      </tr>
                  	    
                  	  </tbody>
                  	</table>
          
                   
                   
                     
                   
                    </div>
                    </div>
                  </div>
          
             </div>
               
               
         </div>
         </div>      
	      	
	  	  <!-- /row -->
	
	      <div class="row">
	      	
	      	<div class="span6">
	      		
	      		<div class="widget">
						
					<div class="widget-header">
						<i class="icon-star"></i>
						<h3>Some Stats</h3>
					</div> <!-- /widget-header -->
					
					<div class="widget-content">
						<canvas id="pie-chart" class="chart-holder" height="250" width="538"></canvas>
					</div> <!-- /widget-content -->
						
				</div> <!-- /widget -->
				
	      		
	      		
	      		
		    </div> <!-- /span6 -->
	      	
	      	
	      	<div class="span6">
	      		
	      		<div class="widget">
							
					<div class="widget-header">
						<i class="icon-list-alt"></i>
						<h3>Another Chart</h3>
					</div> <!-- /widget-header -->
					
					<div class="widget-content">
						<canvas id="bar-chart" class="chart-holder" height="250" width="538"></canvas>
					</div> <!-- /widget-content -->
				
				</div> <!-- /widget -->
									
		      </div> <!-- /span6 -->
	      	
	      </div> <!-- /row -->
	      
	      
	      
	      
			
	      
	      
	    </div> <!-- /container -->
	    
	</div> <!-- /main-inner -->
    
</div> <!-- /main -->
    

    

<div class="extra">

	<div class="extra-inner">

		<div class="container">

			<div class="row">
                    <div class="span3">
                        <h4>
                            About Free Admin Template</h4>
                        <ul>
                            <li><a href="javascript:;">EGrappler.com</a></li>
                            <li><a href="javascript:;">Web Development Resources</a></li>
                            <li><a href="javascript:;">Responsive HTML5 Portfolio Templates</a></li>
                            <li><a href="javascript:;">Free Resources and Scripts</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                    <div class="span3">
                        <h4>
                            Support</h4>
                        <ul>
                            <li><a href="javascript:;">Frequently Asked Questions</a></li>
                            <li><a href="javascript:;">Ask a Question</a></li>
                            <li><a href="javascript:;">Video Tutorial</a></li>
                            <li><a href="javascript:;">Feedback</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                    <div class="span3">
                        <h4>
                            Something Legal</h4>
                        <ul>
                            <li><a href="javascript:;">Read License</a></li>
                            <li><a href="javascript:;">Terms of Use</a></li>
                            <li><a href="javascript:;">Privacy Policy</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                    <div class="span3">
                        <h4>
                            Open Source jQuery Plugins</h4>
                        <ul>
                            <li><a href="http://www.egrappler.com">Open Source jQuery Plugins</a></li>
                            <li><a href="http://www.egrappler.com;">HTML5 Responsive Tempaltes</a></li>
                            <li><a href="http://www.egrappler.com;">Free Contact Form Plugin</a></li>
                            <li><a href="http://www.egrappler.com;">Flat UI PSD</a></li>
                        </ul>
                    </div>
                    <!-- /span3 -->
                </div> <!-- /row -->

		</div> <!-- /container -->

	</div> <!-- /extra-inner -->

</div> <!-- /extra -->


    
    
<div class="footer">
	
	<div class="footer-inner">
		
		<div class="container">
			
			<div class="row">
				
    			<div class="span12">
    				&copy; 2013 <a href="http://www.egrappler.com/">Bootstrap Responsive Admin Template</a>.
    			</div> <!-- /span12 -->
    			
    		</div> <!-- /row -->
    		
		</div> <!-- /container -->
		
	</div> <!-- /footer-inner -->
	
</div> <!-- /footer -->
    

<script src="../js/jquery-1.7.2.min.js"></script>
<script src="../js/excanvas.min.js"></script>
<script src="../js/chart.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.js"></script>
<script src="../js/base.js"></script>
<script>

    var pieData = [
				{
				    value: 30,
				    color: "#F38630"
				},
				{
				    value: 50,
				    color: "#E0E4CC"
				},
				{
				    value: 100,
				    color: "#69D2E7"
				}

			];

    var myPie = new Chart(document.getElementById("pie-chart").getContext("2d")).Pie(pieData);

    var barChartData = {
        labels: ["January", "February", "March", "April", "May", "June", "July"],
        datasets: [
				{
				    fillColor: "rgba(220,220,220,0.5)",
				    strokeColor: "rgba(220,220,220,1)",
				    data: [65, 59, 90, 81, 56, 55, 40]
				},
				{
				    fillColor: "rgba(151,187,205,0.5)",
				    strokeColor: "rgba(151,187,205,1)",
				    data: [28, 48, 40, 19, 96, 27, 100]
				}
			]

    }

    var myLine = new Chart(document.getElementById("bar-chart").getContext("2d")).Bar(barChartData);
	var myLine = new Chart(document.getElementById("bar-chart1").getContext("2d")).Bar(barChartData);
	var myLine = new Chart(document.getElementById("bar-chart2").getContext("2d")).Bar(barChartData);
	var myLine = new Chart(document.getElementById("bar-chart3").getContext("2d")).Bar(barChartData);
	
	</script>


  </body>

</html>
