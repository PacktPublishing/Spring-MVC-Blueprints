<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="botDetect" uri="botDetect"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header_feedback.jsp" />

<div class="container">

	
	<h1>Email Feedback</h1>
	<br />

	
    <spring:url value="/cfs/email" var="sendGridUrl" />

	<form:form class="form-horizontal" method="post" modelAttribute="emailForm" action="${sendGridUrl}">

		
		<spring:bind path="senderEmail">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Sender's Email:</label>
				<div class="col-sm-10">
					<form:input path="senderEmail" type="text" class="form-control " id="senderEmail" placeholder="Sender's Email:" />
					<form:errors path="senderEmail" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="senderName">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Sender's Name:</label>
				<div class="col-sm-10">
					<form:input path="senderName" type="text" class="form-control " id="senderName" placeholder="Sender's Name:" />
					<form:errors path="senderName" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="ccEmail">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">CC:</label>
				<div class="col-sm-10">
					<form:input path="ccEmail" type="text" class="form-control " id="ccEmail" placeholder="CC" />
					<form:errors path="ccEmail" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="subject">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Subject:</label>
				<div class="col-sm-10">
					<form:input path="subject" type="text" class="form-control " id="subject" placeholder="Subject" />
					<form:errors path="subject" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="body">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Feedback:</label>
				<div class="col-sm-10">
					<form:input path="body" type="text" class="form-control " id="body" placeholder="Message:" />
					<form:errors path="body" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="receiverEmail">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Reciever's Email:</label>
				<div class="col-sm-10">
					<form:input path="receiverEmail" type="text" class="form-control " id="receiverEmail" placeholder="Reciever's Email:" />
					<form:errors path="receiverEmail" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="receiverName">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Reciever's Name:</label>
				<div class="col-sm-10">
					<form:input path="receiverName" type="text" class="form-control " id="receiverName" placeholder="Reciever's Name:" />
					<form:errors path="receiverName" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		
		
			<div class="form-group">
				<label class="col-sm-2 control-label">Encode the text below:</label>
				<div class="col-sm-10">
					<img id="jcaptcha" src="/ch05/cfs/captcha/emailCaptcha" />
                    <button type="button" id="reloadJCaptcha">Reload JCaptcha</button>
                    <br/>
                    <input type="text" name="captchTextResult" />
				</div>
			</div>
	
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">  
				<button type="submit" class="btn-lg btn-primary pull-right">Send Email</button>
			</div>
		</div>
	</form:form>

</div>

<jsp:include page="../fragments/footer_feedback.jsp" />

</body>
</html>