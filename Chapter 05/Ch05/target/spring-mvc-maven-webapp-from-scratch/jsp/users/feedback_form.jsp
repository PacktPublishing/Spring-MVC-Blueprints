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

	<c:choose>
		<c:when test="${feedbackForm['new']}">
			<h1>Add Feedback</h1>
		</c:when>
		<c:otherwise>
			<h1>Update Feedback</h1>
		</c:otherwise>
	</c:choose>
	<br />

	<c:choose>
		<c:when test="${feedbackForm['new']}">
		     <spring:url value="/cfs/feedback_process_add" var="userActionUrl" />
		</c:when>
		<c:otherwise>
			 <spring:url value="/cfs/feedback_process_edit" var="userActionUrl" />
		</c:otherwise>
	</c:choose>

	<form:form class="form-horizontal" method="post" modelAttribute="feedbackForm" action="${userActionUrl}">

		<form:hidden path="topicId" />
        <form:hidden path="id" />
		<spring:bind path="name">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<form:input path="name" type="text" class="form-control " id="name" placeholder="Name" />
					<form:errors path="name" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="email">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Email Address</label>
				<div class="col-sm-10">
					<form:input path="email" type="text" class="form-control " id="email" placeholder="Email" />
					<form:errors path="email" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="feedback">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Feedback</label>
				<div class="col-sm-10">
					<form:input path="feedback" type="text" class="form-control " id="feedback" placeholder="Feedback" />
					<form:errors path="feedback" class="control-label" />
				</div>
			</div>
		</spring:bind>
		<div class="form-group">
				<label class="col-sm-2 control-label">Verify Code</label>
				<c:choose>
					<c:when test="${feedbackForm['new']}">
						<div class="col-sm-10"> 
      						    <img src="/ch05/captcha/kaptcha-image.do" style="width: 250px" id="kaptchaImage"  style="margin-bottom: -3px"/>
      						    <input name="kaptchaAnswer" type="text" id="kaptcha" maxlength="100" class="chknumber_input" />               
      						    <button type="button" id="reloadKaptcha">Reload Kaptcha</button>
				       </div>
					</c:when>
					<c:otherwise>
						<div class="col-sm-10">
				            	<img id="simpleCaptcha" src="/ch05/captcha/simple.png"/>
				            	<input type="text" maxlength="12" name="simpleCaptchaAnswer"
				                     id="txtCaptchaAnswer" value="" style="width: 250"
									 class="validate[required,minSize[8]]"/>
							    <button type="button" id="reloadSimpleCaptcha">Reload SimpleCaptcha</button>
						</div>
					</c:otherwise>
				</c:choose>
				
			</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<c:choose>
					<c:when test="${feedbackForm['new']}">
					   
						<button type="submit" class="btn-lg btn-primary pull-right">Add Feedback</button>
					</c:when>
					<c:otherwise>
					    
						<button type="submit" class="btn-lg btn-primary pull-right">Update Feedback</button>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</form:form>

</div>

<jsp:include page="../fragments/footer_feedback.jsp" />

</body>
</html>