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
			<div class="col-xs-6">

				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<strong>Room Masterlist</strong>
			</div>

			<div class="col-xs-6">
				<h1>Pending Guest Reservation</h1>
				<div id="myModal" class="modal fade">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">&times;</button>
								<h4 class="modal-title">Confirmation Slot</h4>
							</div>
							<div class="modal-body">
								<p>Do you want to close the deal?</p>
								<p class="text-warning">
									<small>If you don/t reserve, reservation will be free.</small>
								</p>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">Close</button>
								<button type="button" class="btn btn-primary">Save
									changes</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		

		<!--Row with two columns divided in 1:2 ratio-->
		
			<div class="col-xs-4">
				<div class="bs-example">
					<!-- Button HTML (to Trigger Modal) -->
					<a href="#myModal" class="btn btn-lg btn-primary"
						data-toggle="modal">Launch Demo Modal</a>

					<!-- Modal HTML -->
					<div id="myModal" class="modal fade">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title">Confirmation</h4>
								</div>
								<div class="modal-body">
									<p>Do you want to save changes you made to document before
										closing?</p>
									<p class="text-warning">
										<small>If you don't save, your changes will be lost.</small>
									</p>
								</div>
								<div class="modal-footer">
									<button type="button" class="btn btn-default"
										data-dismiss="modal">Close</button>
									<button type="button" class="btn btn-primary">Save
										changes</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		
		<div class="col-xs-8">

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

		<!--Row with two columns divided in 1:3 ratio-->
		<div class="row">
			<div class="col-xs-3" class="stub-space">
				<div class="stub-space.bg-alt" /></div>
				<div class="col-xs-9" class="stub-space">
					<div class="stub-space.bg-alt" /></div>
				</div>
			</div>
		</div>
</div>
</div>

</body>

<jsp:include page="../fragments/footer.jsp" />