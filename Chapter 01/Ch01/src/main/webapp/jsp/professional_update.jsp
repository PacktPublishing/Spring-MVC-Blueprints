<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html><head><title>PWP</title><meta name="description" content="personal professional description"><meta name="keywords" content="portfolio keywords, portal keywords"><meta http-equiv="content-type" content="text/html; charset=windows-1252"><link rel="stylesheet" type="text/css" href="../style/style.css" title="style"></head><body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.html">personal<span class="logo_colour">+web portal</span></a></h1>
          <h2>Dream Big Always.</h2>
        </div>
      </div>
      <div id="menubar">
        </div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div class="sidebar">
       <h3>The Expert</h3>
        <span class="left"><img src="../style/face.png" alt="My Face"></span>
        <p><i>"The future is me...</i><br>
        <p></p>
        <h3>Content Update</h3>
        <p>Here are the rules for updating the home page:</p>
        <ol>
          <li>All <b>PROFESSIONAL</b> information are required to filled up.</li>
          <li>HTML tags can be included for styling purposes.</li>
          <li>Content must be related to the objective of this portal.</li>
          <li>To cancel update, click <b>CANCEL UPDATE</b> button.</li>
        </ol>
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Update Career</h1>
        <p>Updating career information for transparency.</p>
        
        <form:form commandName="professionalForm" method="post">
          <div class="form_settings">
             <!-- insert the page content here -->
             <h2>Update Professional Background</h2>
            
             <table style="width:100%; border-spacing:0;">
                <tr><td><span class="errorblock"><form:errors path="*"/></span></td><td></td></tr>
                <tr><td>Current Position (*)</td><td><form:input path="position" /></td></tr>
                <tr><td>Company (*)</td><td><form:input path="company" /></td></tr>
                <tr><td>Years (*)</td><td><form:input path="years" /></td><td></tr>
                <tr><td>Location (*)</td><td><form:select path="location" items="${ locationList }"/></td><td><form:errors path="location" cssStyle="color: #ff0000"/></td></tr>
             </table>
            
             <h2>Skill Sets</h2>
             <p>Have done the following professionally: </p>
             <p><form:checkboxes path="skillSets" class="checkbox" items="${ skillSetsList }"/></p>
             <p><br/><br/><br/></p>
             
             <h2>Previous Jobs: </h2>
             <p>Before i got my current position:</p>
             <p><form:checkboxes path="prevJobs" class="checkbox" items="${ prevJobsList }"/></p>
             <p><br/><br/><br/></p>
             
             <p style="padding-top: 15px; padding-left: 20px"><input class="submit" type="submit" name="name" value="Update Career"></p>
           </div>
        </form:form>
       
        <c:url var="redirectPersonal" value="/pwp/professional.html"/>      
        <form action='<c:out value="${ redirectPersonal }"/>' method="get">
          <div class="form_settings">
             <p style="padding-top: 15px; padding-left: 20px"><input class="submit" type="submit" name="name" value="Cancel Update"></p>
          </div>
        </form>
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
      Copyright © black &amp; white | <a href="http://validator.w3.org/check?uri=referer">HTML5</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> | <a href="http://www.html5webtemplates.co.uk">design from HTML5webtemplates.co.uk</a>
</div>
  </div>
</body></html>
