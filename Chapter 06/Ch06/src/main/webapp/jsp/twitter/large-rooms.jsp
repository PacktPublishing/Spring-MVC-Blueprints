<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="../fragments/header.jsp" />

<body>
  <h1 class="visible-xs">For Mobile Users Only</h1>
  <h1 class="visible-md">For Tablet Users Only</h1>
  <h1 class="visible-lg">For Desktop Users only</h1>
	<div class="container">
		<!--Row with two equal columns-->
		<div class="row">
			<div class="col-sm-3 cols col-md-2">
				<strong>Room Masterlist</strong>
			</div>

			<div class="col-sm-9 col-md-8">
				<h4>List of Rooms Vacant</h4>
				<table class="table table-striped">
				<thead>
					<tr>
						<th>Room ID</th>
						<th>Description</th>
						<th>Type</th>
					</tr>
				</thead>
				<tr>
					<td>101</td>
					<td>Diamnond A</td>
					<td>2-br-regular</td>
				</tr>
				<tr>
					<td>356</td>
					<td>Ruby F</td>
					<td>2-br-loft</td>
				</tr>
				<tr>
					<td>102</td>
					<td>Granite H</td>
					<td>1-br-studio</td>
				</tr>
			</table>
				
				
			</div>
			
			<div class="col-sm-12 col-md-2">
           <h4>List of Rooms Reserved</h4>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Room ID</th>
						<th>Description</th>
						<th>Type</th>
					</tr>
				</thead>
				<tr>
					<td>101</td>
					<td>Sapphire A</td>
					<td>2-br-deluxe</td>
				</tr>
				<tr>
					<td>356</td>
					<td>Garnet F</td>
					<td>2-br-deluxe</td>
				</tr>
				<tr>
					<td>102</td>
					<td>Emerald H</td>
					<td>1-br-family</td>
				</tr>
			</table>


		</div>
</div>
		
</div>



</body>

	<jsp:include page="../fragments/footer.jsp" />