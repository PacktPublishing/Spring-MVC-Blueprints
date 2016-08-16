<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
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
        <ul id="menu">
        <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on --><li>
          <a href="index.html">Home</a></li>
          <li><a href="personal.html">Personal</a></li>
          <li class="selected"><a href="professional.html">Professional</a></li>
          <li><a href="contact.html">Contact Us</a></li>
        </ul></div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div class="sidebar">
       <h3>Reference Links</h3>
        <ul>
          <li><a href="http://www.google.com">Google</a></li>
          <li><a href="http://www.gmail.com">Gmail</a></li>
          <li><a href="http://www.mail.yahoo.com">Yahoo Mail</a></li>
          <li><a href="http://www.alibatabusiness.com">Alibata Business</a></li>
        </ul>
      </div>
      
      <c:set var="profStatusSess" value="${ sessionScope.profStatusSess }" />
      <c:choose>
        <c:when test="${ profStatusSess eq 'undefault'  }">
          <c:set var="professional" value="${ sessionScope.professionalSess }" />
         </c:when>
        
          <c:otherwise>
             <c:set var="professional" value="${ professional }" />
        </c:otherwise>
      </c:choose>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Career</h1>
        <p>I have been busy lately with my job. I love my job. Loving your job makes improves your skill set and makes you productive.
           Below is the my current professional credentials. If you are both on the same discipline then hope we chat about things.</p>
        <h2>Professional Background</h2>
        <table style="width:100%; border-spacing:0;">
              <tr><td>Current Position</td><td><c:out value="${ professional.position }"/></td></tr>
              <tr><td>Company</td><td><c:out value="${ professional.company }"/></td></tr>
              <tr><td>Years</td><td><c:out value="${ professional.years }"/></td></tr>
              <tr><td>Location</td><td><c:out value="${ professional.location }"/></td></tr>
        </table>
        
        <h2>Skill Sets</h2>
        <p>Specialization</p>
        <ul>
          <c:forEach var="skill" items="${ professional.skillSets }">
             <li><c:out value="${skill }"/></li>
           </c:forEach>
        </ul>
        
        <h2>Previous Jobs</h2>
        <ul>
          <c:forEach var="job" items="${ professional.prevJobs }">
             <li><c:out value="${job }"/></li>
           </c:forEach>
        </ul>
        
        <c:url var="redirectProfessionalUpdate" value="/pwp/professional_redirect.html"/>   
        <form action="<c:out value="${ redirectProfessionalUpdate }"/>" method="get">
          <div class="form_settings">
             <p style="padding-top: 15px; padding-left: 20px"><input class="submit" type="submit" name="name" value="Update Portfolio"></p>
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
