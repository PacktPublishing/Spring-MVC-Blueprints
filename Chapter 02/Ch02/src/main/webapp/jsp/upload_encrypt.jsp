<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="pl" lang="pl">
<head>
	<meta name="author" content="Luka Cvrk (www.solucija.com)" />
	<meta http-equiv="content-type" content="text/html;charset=iso-8859-2" />
	<link rel="stylesheet" href="css/style.css" type="text/css" />
	<title>EDMS</title>
</head>
<body>
	<div class="content">
		<div class="header">
			<div class="top_info">
				<div class="top_info_right">
					<p><b>You are not Logged in!</b> <a href="#">Log in</a> to check your messages.<br />
					Do you want to <a href="#">Log in</a> or <a href="#">register</a>?</p>
				</div>		
				<div class="top_info_left">
					<p>Today is: <b>27th January, 2006</b><br /></p>
				</div>
			</div>
			<div class="logo">
				<h1><a href="#" title="Electronic Document Management System">EDMS</a></h1>
			</div>
		</div>
		
		<div class="bar">
			<ul>
				<li class="slogan">Electonic Document Management System</li>
				
			</ul>
		</div>
		<div class="search_field">
			
		</div>
		<div class="subheader">
			<p><a href="#">EDMS</a> is a sample electronic file repository which can be enhanced to create a formal document management portal</p>
		</div>
		<div class="left">
			<div class="left_articles">
				<h2><a href="#">Single File Upload</a></h2>
					<div class="search_field">
					    
					   <form:form commandName="singleFileEncryptForm" method="POST"  enctype="multipart/form-data">
					   <div class="fileContainer">
							Search File 
							<input type="file" name="file" /> &nbsp; &nbsp; &nbsp;
							
                        </div>
                        <input type="submit" value="Upload File" class="searchSubmit"/><br /> 
                       </form:form>
                    </div>

			</div>
	<div class="left_links">
				<div class="left_side">
				    <spring:url value="/edms/upload_single_form" var="singleFile" />
					<p><b><img src="images/arrow.gif" alt=">" /><a class="title" href="${ singleFile }">Single File Upload</a></b><br />
					</p>
					<spring:url value="/edms/upload_multiple_form" var="multipleFile" />
					<p><b><img src="images/arrow.gif" alt=">" /><a class="title" href="${ multipleFile }">Multiple File Upload</a></b><br />
					</p>
					<spring:url value="/edms/upload_single_ftp" var="ftpFile" />
					<p><b><img src="images/arrow.gif" alt=">" /><a class="title" href="${ ftpFile }">FTP Server Upload</a></b><br />
					</p>
					
				</div>
				<div class="right_side">
				    <spring:url value="/edms/upload_single_encrypt" var="encryptFile" />
				    <p><b><img src="images/arrow.gif" alt=">" /><a class="title" href="${ encryptFile }">Encrypted File Upload</a></b><br />
					</p>
					<spring:url value="/edms/single_upload_ajax" var="jqueryFile" />
					<p><b><img src="images/arrow.gif" alt=">" /><a class="title" href="${jqueryFile }">JQuery-type File Upload</a></b><br />
					</p>
					<spring:url value="/edms/single_upload_ajax_form" var="formFile" />
					<p><b><img src="images/arrow.gif" alt=">" /><a class="title" href="${ formFile }">AJAX Form Upload</a></b><br />
					</p>
					
				</div>
				<p><b>Want to <a href="#">click some links above</a>?</b></p>
			</div>
			<div class="left_message">
				<p><b>EDMS</b> is 100% implemented using Spring Framework 4.x specification with some third-party plugins like JQuery, JQuery Form, and Bouncy Castle for encryption and decryption libraries.</p>
			</div>
			<div class="left_box">
				<p>This is 100% opens-source that can be customized depending on some specific requirements.</p>
				
			</div>
			
		</div>	
		<div class="right">
			<div class="right_login">
				<form method="post" action="?">
					<p>Username: <input type="text" name="search" class="login" /> @email.com </p>
					<p>Password: <input type="password" name="search" class="login" /> <input type="submit" value="Login" class="searchSubmit" /></p>
				</form>
			</div>
			<div class="right_articles">
				<p><img src="images/image.gif" alt="Image" title="Image" class="image" /><b></b><br />A <b>document management system (DMS)</b> is a system (based on computer programs in the case of the management of digital documents) used to track, manage and store documents. Most are capable of keeping a record of the various versions created and modified by different users (history tracking)</p>
			</div>
			<div class="right_articles">
				<p><img src="images/image.gif" alt="Image" title="Image" class="image" />An <b>Electronic Document and Records Management System (EDRM)</b> is a computer program (or set of programs) used to track and store records. The term is distinguished from imaging and document management systems that specialize in paper capture and document management respectively</p>
			</div>
			<div class="right_articles">
				<p><img src="images/image.gif" alt="Image" title="Image" class="image" />A document repository is a secured location in the file system which contains uploaded documents.</p>
			</div>
		</div>	
		<div class="footer">
			<p><a href="#">RSS Feed</a> | <a href="#">Contact</a> | <a href="#">Accessibility</a> | <a href="#">Products</a> | <a href="#">Disclaimer</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> and <a href="http://validator.w3.org/check?uri=referer">XHTML</a><br />
			&copy; Copyright 2006 Internet Center, Design: Luka Cvrk - <a href="http://www.solucija.com/" title="What's your solution?">Solucija</a><span lang="en-au"> 
			- <a href="http://www.ehostinfo.com/">Web Hosting</a></span></p>
		</div>
	</div>
</body>
</html>