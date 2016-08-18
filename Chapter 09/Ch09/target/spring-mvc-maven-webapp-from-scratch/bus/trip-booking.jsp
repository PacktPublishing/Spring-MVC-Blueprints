<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <!-- This will include the whole javascript file including ajax handling  -->
<script language="javascript" src="../bus/js/rest-api.js"></script>
<script language="javascript">
            function addBookingForm()
            {
               
                //Collect input from html page
                var idTxt = document.getElementById("id").value;
                var userIdTxt = document.getElementById("userId").value;
                var tripIdTxt = document.getElementById("tripId").value;
                var adultsTxt = document.getElementById("adults").value;
                var kidsTxt = document.getElementById("kids").value;
                var bookedTxt = document.getElementById("booked").value;
                var totalTxt = document.getElementById("total").value;
                var statusTxt = document.getElementById("status").value;

                var data = {$entity: { id: idTxt,  userId: userIdTxt, tripId: tripIdTxt,  adults: adultsTxt, kids: kidsTxt, booked: null, total: totalTxt, status: statusTxt }};
                 alert(statusTxt);
               
                var message = BookServiceImpl.reserveSeat(data);

                //Use the REST API response
                document.getElementById("error").innerHTML = "<h2><span style='color:red'>" + message + " !!</span></h2>";
            }
        </script>
</head>
<body>
<div id="error"></div>
     <form:form commandName="bookingForm" method="post" id="submitForm">
                        <div class="form-item">
                            <label>Booking ID</label>
                            <form:input path="id" id="id"/>
                        </div>
                        <div class="form-item">
                            <label>Trip ID</label>
                            <form:input path="tripId" id="tripId"/>
                        </div>
                         <div class="form-item">
                            <label>User ID</label>
                            <form:input path="userId" id="userId"/>
                        </div>
                         <div class="form-item">
                            <label>Adults</label>
                            <form:input path="adults" id="adults"/>
                        </div>
                         <div class="form-item">
                            <label>Kids</label>
                            <form:input path="kids" id="kids"/>
                        </div>
                         <div class="form-item">
                            <label>Date Booked</label>
                            <form:input path="booked" id="booked"/>
                        </div>
                         <div class="form-item">
                            <label>Total Amount</label>
                            <form:input path="total" id="total"/>
                        </div>
                         <div class="form-item">
                            <label>Reservation Status</label>
                            <form:input path="status" id="status"/>
                        </div>
                        <a href="#" class="forgot-password">Forgot Password</a>
                        <div class="form-actions">
                            <input type="submit" value="Log In" onclick="addBookingForm()"/>
                        </div>
                    </form:form>

</body>
</html>