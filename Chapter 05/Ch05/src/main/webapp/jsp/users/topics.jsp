<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../fragments/header.jsp" />

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

		<h1>Post your Issues</h1>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>#Ticket ID</th>
					<th>Topic</th>
					<th>Date</th>
				</tr>
			</thead>

			<c:forEach var="topic" items="${topics}">
				<tr>
					<td>
						${topic.id}
					</td>
					<td>${topic.title}</td>
					<td>${topic.date}</td>
					
					<td>
						<spring:url value="/cfs/topics/${topic.id}" var="showUrl" />
						<spring:url value="/cfs/topics/${topic.id}/delete" var="deleteUrl" /> 
						<spring:url value="/cfs/topics/${topic.id}/update" var="updateUrl" />
						<spring:url value="/cfs/feedbacks/${topic.id}" var="feedbackUrl" />

						<button class="btn btn-info" onclick="location.href='${showUrl}'">Show</button>
						<button class="btn btn-primary" onclick="location.href='${updateUrl}'">Update</button>
						<button class="btn btn-danger" onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>
						<button class="btn btn-success" onclick="location.href='${feedbackUrl}'">Feedback</button>
					</td>
				</tr>
			</c:forEach>
		</table>

	</div>

	<jsp:include page="../fragments/footer.jsp" />

</body>
</html>