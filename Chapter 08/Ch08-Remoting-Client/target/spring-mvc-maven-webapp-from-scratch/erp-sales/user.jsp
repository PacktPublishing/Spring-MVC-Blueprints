<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
		<title>Steal My Admin</title>
		<spring:url var="rotateCSS" value="/erp-sales/css/960.css"/>
		 <spring:url var="fluidCSS" value="/erp-sales/css/fluid.css"/>
		 <spring:url var="templateCSS" value="/erp-sales/css/template.css"/>
		<spring:url var="colourCSS" value="/erp-sales/css/colour.css"/>
		<link rel="stylesheet" href="${ rotateCSS }" type="text/css" media="screen" charset="utf-8" />
		<!--<link rel="stylesheet" href="css/fluid.css" type="text/css" media="screen" charset="utf-8" />-->
		<link rel="stylesheet" href="${ templateCSS  }" type="text/css" media="screen" charset="utf-8" />
		<link rel="stylesheet" href="${ colourCSS }" type="text/css" media="screen" charset="utf-8" />
	</head>
	<body>
		
					<h1 id="head">Steal My Admin Template</h1>
		
		<ul id="navigation">
			<li><span class="active">Overview</span></li>
			<li><a href="#">News</a></li>
			<li><a href="#">Users</a></li>
		</ul>
		
			<div id="content" class="container_16 clearfix">
				<div class="grid_4">
					<p>
						<label>Username<small>Alpha-numeric values</small></label>
						<input type="text" />
					</p>
				</div>
				<div class="grid_5">
					<p>
						<label>Email Address</label>
						<input type="text" />
					</p>
				</div>
				<div class="grid_5">
					<p>
						<label>Department</label>
						<select>
							<option>Development</option>
							<option>Marketing</option>
							<option>Design</option>
							<option>IT</option>
						</select>
					</p>
				</div>
				<div class="grid_2">
					<p>
						<label>&nbsp;</label>
						<input type="submit" value="Search" />
					</p>
				</div>
				<div class="grid_16">
					<table>
						<thead>
							<tr>
								<th>Username</th>
								<th>Manager</th>
								<th>Department</th>
								<th colspan="2" width="10%">Actions</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<td colspan="5" class="pagination">
									<span class="active curved">1</span><a href="#" class="curved">2</a><a href="#" class="curved">3</a><a href="#" class="curved">4</a> ... <a href="#" class="curved">10 million</a>
								</td>
							</tr>
						</tfoot>
						<tbody>
							<tr>
								<td>Philip</td>
								<td>Claire</td>
								<td>Development</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Thomas</td>
								<td>Philip</td>
								<td>Marketing</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr>
								<td>Ben</td>
								<td>Thomas</td>
								<td>Marketing</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Richard</td>
								<td>Ben</td>
								<td>Development</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr>
								<td>Alon</td>
								<td>Richard</td>
								<td>Development</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Alex</td>
								<td>Alon</td>
								<td>IT</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr>
								<td>Nathan</td>
								<td>Alex</td>
								<td>IT</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Habib</td>
								<td>Nathan</td>
								<td>Design</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr>
								<td>Jeremy</td>
								<td>Habib</td>
								<td>Design</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Ed</td>
								<td>Jeremy</td>
								<td>Design</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Claire</td>
								<td>Ed</td>
								<td>Development</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr>
								<td>Philip</td>
								<td>Tom</td>
								<td>Development</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr class="alt">
								<td>Thomas</td>
								<td>Claire</td>
								<td>Marketing</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
							<tr>
								<td>Ben</td>
								<td>Thomas</td>
								<td>Marketing</td>
								<td><a href="#" class="edit">Edit</a></td>
								<td><a href="#" class="delete">Delete</a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		
		<div id="foot">
					<a href="#">Contact Me</a>
				
		</div>
	</body>
</html>