<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container">
	<hr>
	<footer>
		<p>&copy; Alibata Hotel 2015</p>
	</footer>
</div>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>



<spring:url value="/js/bootstrap.min.js"	var="bootstrapJs" />
<spring:url value="/js/npm.js"	var="npmJs" />
<script src="${bootstrapJs}"></script>
<script src="${npmJs}"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#myModal").modal('show');
	});
</script>

