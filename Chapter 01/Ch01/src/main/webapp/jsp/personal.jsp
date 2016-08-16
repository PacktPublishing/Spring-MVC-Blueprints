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
        <ul id="menu"><!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="index.html">Home</a></li>
          <li class="selected"><a href="personal.html">Personal</a></li>
          <li><a href="professional.html">Professional</a></li>
          <li><a href="contact.html">Reach Out</a></li>
        </ul></div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>My Face</h3>
        <span class="left"><img src="../style/face.png" alt="The Author"></span>
        <p><i>"Out of the abundance of the heart the mouth speaks"</i><br>
        <p></p>
         <h3>Reference Links</h3>
        <ul>
          <li><a href="http://www.google.com">Google</a></li>
          <li><a href="http://www.gmail.com">Gmail</a></li>
          <li><a href="http://www.mail.yahoo.com">Yahoo Mail</a></li>
          <li><a href="http://www.alibatabusiness.com">Alibata Business</a></li>
        </ul>
       
      </div>
      
       <c:set var="pStatusSess" value="${ sessionScope.pStatusSess }" />
       <c:choose>
          <c:when test="${ pStatusSess eq 'undefault' }">
            <c:set var="person" value="${ sessionScope.personSess }" />
          </c:when>
          <c:otherwise>
            <c:set var="person" value="${ person }" />
          </c:otherwise>
       </c:choose>
       
      <div id="content">
        <!-- insert the page content here -->
        <h1>Biography</h1>
        <p>Welcome to my web portal. I am <b style="color: black;"><c:out value="${ person.biography.firstName }"/> </b> and i will share to you my biography below so that people will know me.
           Hope we can keep in touch and have some conversation.</p>
        <h2>Personal Information</h2>
        <table style="width:100%; border-spacing:0;">
              <tr><td>First Name</td><td><c:out value="${ person.biography.firstName }"/> </td></tr>
              <tr><td>Last Name</td><td><c:out value="${ person.biography.lastName }"/> </td></tr>
              <tr><td>Age</td><td><c:out value="${ person.biography.age }"/> </td></tr>
              <tr><td>Birth Date</td><td><c:out value="${ person.biography.birthDate }"/> </td></tr>
              <tr><td>Birth Location</td><td><c:out value="${ person.biography.location }"/> </td></tr>
              <tr><td>Country of Origin</td><td><c:out value="${ person.biography.country }"/> </td></tr>
        </table>
        
         <h2>Hobbies</h2>
         <p>Some of my favorite free time chores:</p>
         <ul>
           <c:forEach var="hobby" items="${ person.biography.hobbies }">
             <li><c:out value="${hobby }"/></li>
           </c:forEach>
         </ul>
        
         <h2>Readings</h2>
         <p>These are my favorite reading materials:</p>
         <ul>
          <c:forEach var="reading" items="${ person.biography.readings }">
             <li><c:out value="${ reading }"/></li>
           </c:forEach>
        </ul>
        
        <h2>Educational Background</h2>
        <table style="width:100%; border-spacing:0;">
              <tr><td>Highest Education</td><td><c:out value="${ person.education.educLevel }"/></td></tr>
              <tr><td>University/College</td><td><c:out value="${ person.education.degree }"/></td></tr>
              <tr><td>Degree</td><td><c:out value="${ person.education.institution }"/></td></tr>
              <tr><td>Specialization</td><td><c:out value="${ person.education.specialization }"/></td></tr>
              <tr><td>Year Graduated</td><td><c:out value="${ person.education.year }"/></td></tr>
        </table>
        <c:url var="redirectPersonalUpdate" value="/pwp/personal_redirect.html"/>    
        <form action='<c:out value="${ redirectPersonalUpdate  }"/>' method="get">
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
