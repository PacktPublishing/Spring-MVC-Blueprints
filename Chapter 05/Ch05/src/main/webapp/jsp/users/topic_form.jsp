<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="botDetect" uri="botDetect"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

<div class="container">

	<c:choose>
		<c:when test="${topicForm['new']}">
			<h1>Add Topic</h1>
		</c:when>
		<c:otherwise>
			<h1>Update Topic</h1>
		</c:otherwise>
	</c:choose>
	<br />

	<c:choose>
		<c:when test="${topicForm['new']}">
		     <spring:url value="/cfs/topic_process_add" var="userActionUrl" />
		</c:when>
		<c:otherwise>
			 <spring:url value="/cfs/topic_process_update" var="userActionUrl" />
		</c:otherwise>
	</c:choose>

	<form:form class="form-horizontal" method="post" modelAttribute="topicForm" action="${userActionUrl}">

		<form:hidden path="id" />

		<spring:bind path="title">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Title</label>
				<div class="col-sm-10">
					<form:input path="title" type="text" class="form-control " id="title" placeholder="Title" />
					<form:errors path="title" class="control-label" />
				</div>
			</div>
		</spring:bind>
		
		<spring:bind path="description">
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="col-sm-2 control-label">Description</label>
				<div class="col-sm-10">
					<form:input path="description" type="text" class="form-control " id="description" placeholder="Description" />
					<form:errors path="description" class="control-label" />
				</div>
			</div>
		</spring:bind>
		<div class="form-group">
				<label class="col-sm-2 control-label">Verify Code</label>
				<c:choose>
					<c:when test="${topicForm['new']}">
						<div class="col-sm-10">
				   	       <tags:captcha privateKey="6Lf2rwsTAAAAACsFdaTempAjILAuK3GhMuZe3ZDK" publicKey="6Lf2rwsTAAAAAIvxqJn7ZiIjCmE-Jbb6Gw6Fcozo"></tags:captcha>
				       </div>
					</c:when>
					<c:otherwise>
						<fieldset>
       						<label for="captchaCodeTextBox" class="prompt">
            					Retype the code from the picture:</label>
        					<!-- Adding BotDetect Captcha to the page -->
        					<botDetect:captcha id="updateTopicCaptcha"
        					codeLength="7"
            				  imageWidth="300"
              					imageStyles="graffiti, graffiti2, halo, lego, mass, vertigo, strippy"/>
        					<div class="validationDiv">
          						<form:input path="botModel.captchaCodeTextBox" />
               						
        					</div>
      					</fieldset>
					</c:otherwise>
				</c:choose>
				
			</div>

		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<c:choose>
					<c:when test="${topicForm['new']}">
					    
						<button type="submit" class="btn-lg btn-primary pull-right">Add Topic</button>
					</c:when>
					<c:otherwise>
					   
						<button type="submit" class="btn-lg btn-primary pull-right">Update Topic</button>
					</c:otherwise>
				</c:choose>
			</div>
		</div>
	</form:form>

</div>

<jsp:include page="../fragments/footer.jsp" />

</body>
</html>