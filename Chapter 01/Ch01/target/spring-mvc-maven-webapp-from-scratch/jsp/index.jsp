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
          <c:url var="redirectIndex" value="/pwp/index.html"/>
          <h1><a href="<c:out value="${ redirectIndex }"/>">personal<span class="logo_colour">+web portal</span></a></h1>
          <h2>Dream Big Always.</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu"><!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li class="selected"><a href="index.html">Home</a></li>
          <li><a href="personal.html">Personal</a></li>
          <li><a href="professional.html">Professional</a></li>
          <li><a href="contact.html">Reach Out</a></li>
        </ul></div>
    </div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>Post A Message</h3>
        <c:forEach var="post" items="${ posts }">
            <h4><c:out value="${ post.subject }" /></h4>
            <h5><c:out value="${ post.datePosted }" /></h5>
            <p><c:out value="${ post.postedMsg }" /></p>
        </c:forEach>
      
        <form:form action="/ch01/pwp/index.html" method="get" modelAttribute="postForm">
         <table>
           <tr>
              <td>Subject:</td>
           </tr>
           <tr>
              <td><form:input path="subject" /></td>
           </tr>
           <tr>
              <td>Message:</td>
           </tr>
           <tr>
           	 <td><form:textarea path="postedMsg" cols="22" rows="5"  draggable="false"/></td>
             
           </tr>
           <tr>
           	 <td><input type="submit" value="POST"/></td>
             
           </tr>
         </table>
        </form:form>
        <h3>Reference Links</h3>
        <ul>
          <li><a href="http://www.google.com">Google</a></li>
          <li><a href="http://www.gmail.com">Gmail</a></li>
          <li><a href="http://www.mail.yahoo.com">Yahoo Mail</a></li>
          <li><a href="http://www.alibatabusiness.com">Alibata Business</a></li>
        </ul>
        
      </div>
      
      <c:set var="statusSess" value="${ sessionScope.statusSess }" />
      <c:choose>
        <c:when test="${ statusSess eq 'undefault'  }">
          <c:set var="home" value="${ sessionScope.homeSess }" />
         </c:when>
        
          <c:otherwise>
             <c:set var="home" value="${ home }" />
        </c:otherwise>
      </c:choose>
      <div id="content">
             <!-- insert the page content here -->
             <h1>Welcome to my abode.</h1>
             <p>This web portal is a mirror of my life. I am thankful of the life given to me because i learned so much from it.</p>
             <p>For every moment i always believe that...</p>
             
             <p><c:out value="${ home.message }" escapeXml="false"></c:out> </p>

             <h2>My Favorite Quote</h2>
             <p><c:out value="${ home.quote }" escapeXml="false"></c:out></p>
             
             <c:url var="redirectIndexUpdate" value="/pwp/index_redirect.html"/>
             <form action="<c:out value="${redirectIndexUpdate }"/>" method="get">
                <div class="form_settings">
                  <p style="padding-top: 15px; padding-left: 20px"><span></span><input class="submit" type="submit" name="name" value="Update Quotes"></p>
                </div>
            </form>
       </div>
         
       
      
    </div>
    <div id="content_footer">    
    </div>
    <div id="footer">
      Copyright © black &amp; white | <a href="http://validator.w3.org/check?uri=referer">HTML5</a> | <a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a> | <a href="http://www.html5webtemplates.co.uk">design from HTML5webtemplates.co.uk</a>
    </div>
  </div>
</body></html>
