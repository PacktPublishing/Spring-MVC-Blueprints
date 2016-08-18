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
 <script type="text/javascript">
    
 function getServerData(){
     $.getJSON("http://localhost:8080/ch09/bts/stations.json", function(response){ 
            $("#stationId option").remove(); 
             var options = '';
             $.each(response, function(index, item) {
                 options += '<option value="' + item + '">' + item + '</option>';
                 $("#stationId").html(options);
             });
     });
 }
 </script>

 <script type="text/javascript">
 function setDefaultName() {
	 $.get("http://localhost:8080/ch09/bts/name.json", function(name){ 
                $("#name").val(name);
          });
  
 }
        
</script>

 <script type="text/javascript">
 $(document).ready(function() {
	  // Save Person AJAX Form Submit
    // $('#submitForm').submit(function(e) {
       // will pass the form data using the jQuery serialize function
     //  $.post('http://localhost:8080/ch09/bts/add_destination.html', $(this).serialize(), function(response) {
      //   $('#tripFormResponse').text(response);
      // });
        
     //  e.preventDefault(); // prevent actual form submit and page reload
    // });

	 $('#submitForm').submit(
	    		function(event) {
	    			var frm = $('#submitForm');
	    			//e.preventDefault();
	     
	    		    var data = {}
	    		    var Form = this;
	     
	    		    //Gather Data also remove undefined keys(buttons)
	    		    $.each(this, function(i, v){
	    		            var input = $(v);
	    		        data[input.attr("name")] = input.val();
	    		        delete data["undefined"];
	    		    });
	    			$.ajax({
	    				contentType : 'application/json; charset=utf-8',
	    	            type: 'POST',
	    	            url: 'http://localhost:8080/ch09/bts/add_destination.html',
	    	            dataType : 'json',
	    	            data : JSON.stringify(data),
	     
	    				success : function(response) {
	    					$('#tripFormResponse').text(response);
	    				
	    				},
	    				error : function(xhr, status, error) {
	    					alert(xhr.responseText);
	    					
	    				}
	    			});
	    			return false;
	    		});
	   event.preventDefault(); // prevent actual form submit and page reload
 });
        
</script>
<title>Insert title here</title>
</head>

<body onload="getServerData(); setDefaultName();" >
  <form:form commandName="tripForm" method="post" id="submitForm">
                        <div class="form-item">
                            <label>Trip ID</label>
                            <form:input path="id" id="id"/>
                        </div>
                        <div class="form-item">
                            <label>Name</label>
                            <form:input path="name" id="name"/>
                        </div>
                         <div class="form-item">
                            <label>No. of Sights</label>
                            <form:input path="nsights" id="nsights"/>
                        </div>
                         <div class="form-item">
                            <label>Travel Duration (Day)</label>
                            <form:input path="dayTrip" id="dayTrip"/>
                        </div>
                         <div class="form-item">
                            <label>Travel Duration (Night)</label>
                            <form:input path="nightTrip" id="nightTrip"/>
                        </div>
                         <div class="form-item">
                            <label>Type Duration</label>
                            <form:input path="typeTrip" id="typeTrip"/>
                        </div>
                         <div class="form-item">
                            <label>Other Modes of Transport</label>
                            <form:input path="otherTranspo" id="otherTranspo"/>
                        </div>
                         <div class="form-item">
                            <label>Languages</label>
                            <form:input path="language" id="language"/>
                        </div>
                         <div class="form-item">
                            <label>Price Per Adult</label>
                            <form:input path="adultPrice" id="adultPrice"/>
                        </div>
                         <div class="form-item">
                            <label>Price Per Kid</label>
                            <form:input path="kidPrice" id="kidPrice"/>
                        </div>
                         <div class="form-item">
                            <label>Nearest station</label>
                            <form:select path="stationId" id="stationId"/>
                        </div>
                        <a href="#" class="forgot-password">Forgot Password</a>
                        <div class="form-actions">
                            <input type="submit" value="Log In">
                        </div>
                    </form:form>
 <div id="tripFormResponse" class="green"> </div>
</body>
</html>