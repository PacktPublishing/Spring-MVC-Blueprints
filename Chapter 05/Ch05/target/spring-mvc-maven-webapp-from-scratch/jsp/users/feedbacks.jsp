<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header_feedback.jsp" />

<body>

	<div class="container">

		<c:if test="${not empty msg}">
			<div class="alert alert-${css} alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>${msg}</strong>
			</div>
		</c:if>

		<h1>Post-it Here</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#ID</th>
					<th>Respondent</th>
					<th>Feedback</th>
					<th>Date</th>
				</tr>
			</thead>

			<c:forEach var="feedback" items="${feedbacks}">
				<tr>
					<td>
						${feedback.id}
					</td>
					<td>${feedback.name}</td>
					<td>${feedback.feedback}</td>
					<td>${feedback.date}</td>
					
					<td>
						<spring:url value="/cfs/feedbacks/${feedback.cfsTopic.id}/${feedback.id }" var="showUrl" />
						<spring:url value="/cfs/feedbacks/${feedback.cfsTopic.id}/${feedback.id }/delete" var="deleteUrl" /> 
						<spring:url value="/cfs/feedbacks/${feedback.cfsTopic.id}/${feedback.id }/update" var="updateUrl" />

						
						<button class="btn btn-primary" onclick="location.href='${updateUrl}'">Edit</button>
						<button class="btn btn-danger" onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>				
					</td>
				</tr>
			</c:forEach>
		</table>

	</div>

	<jsp:include page="../fragments/footer_feedback.jsp" />

</body>
</html>