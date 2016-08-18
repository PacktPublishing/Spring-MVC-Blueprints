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
<script	src="//ajax.googleapis.com/ajax/libs/prototype/1.7.3.0/prototype.js"></script>
<script type="text/javascript">

function submitNewAjxCall()
{
 new Ajax.Request('http://localhost:8080/ch09/bts/bookingproto.html',
 {
  method: 'post',
  parameters: $('submitForm').serialize(true),
  onComplete: function(transport)
  {
   alert(transport.responseText);
  }
 });

 Event.preventDefault();
}








</script>
</head>
<body>
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