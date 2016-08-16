<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html><head><title>PWP</title><meta name="description" content="website description"><meta name="keywords" content="website keywords, website keywords"><meta http-equiv="content-type" content="text/html; charset=windows-1252"><link rel="stylesheet" type="text/css" href="../style/style.css" title="style"></head><body>
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
        <!-- insert your sidebar items here -->
        <h3>My Face</h3>
        <span class="left"><img src="../style/face.png" alt="My Face"></span>
        <p><i>"The future is me...</i><br>
        <p></p>
        <h3>Content Update</h3>
        <p>Here are the rules for updating the home page:</p>
        <ol>
          <li>All <b>BIOGRAPHY</b> information are required to filled up.</li>
          <li>Information such as Education, Degree Course and the Institution where the author graduated are required data.</li>
          <li>HTML tags can be included for styling purposes.</li>
          <li>Content must be related to the objective of this portal.</li>
          <li>To cancel update, click <b>CANCEL UPDATE</b> button.</li>
        </ol>
       
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Update Biography</h1>
        <p>Updating Information for transparency.</p>
        <form:form commandName="personForm" method="post">
          <div class="form_settings">
             <!-- insert the page content here -->
            
             <h2>Update Personal Information</h2>
              <table style="width:100%; border-spacing:0;">
                  <tr><td>First Name (*)</td><td><form:input path="biography.firstName"/></td></tr>
                  <tr><td><span class="errorblock"><form:errors path="biography.firstName" /></span></td><td></td></tr>
                  <tr><td>Last Name (*)</td><td><form:input path="biography.lastName"/></td></tr>
                  <tr><td><span class="errorblock"><form:errors path="biography.lastName"/></span></td><td></td> </tr>
                  <tr><td>Age (*)</td><td><form:input path="biography.age"/></td></tr>
                  <tr><td><span class="errorblock"><form:errors path="biography.age"/></span><td></td> </tr>
                  <tr><td>Birth Date (*)</td><td><form:input path="biography.birthDate"/></td></tr>
                  <tr><td><span class="errorblock"><form:errors path="biography.birthDate" /></span></td><td></td> </tr>
                  <tr><td>Birth Location (*)</td><td><form:input path="biography.location"/></td></tr>
                  <tr><td><span class="errorblock"><form:errors path="biography.location" /></span></td><td></td> </tr>
                  <tr><td>Country of Origin (*)</td><td><form:input path="biography.country"/></td></tr>
                  <tr><td><span class="errorblock"><form:errors path="biography.country"/></span></td> <td></td> </tr>
              </table>
              
         <h2>Hobbies</h2>
         <p>Some of my favorite free time chores: (Choose at least 2)</p>
         <p><form:checkboxes path="biography.hobbies" class="checkbox" items="${ hobbiesList }"/></p>
          <br/> <br/> <br/>
         <span class="errorblock"><form:errors path="biography.hobbies" cssClass="errorblock"/></span>
         <br/> <br/> <br/>
         
         <h2>Readings</h2>
         <p>These are my favorite reading materials: (Choose at least 2)</p>
         <p><form:checkboxes  path="biography.readings"  class="checkbox" items="${ readingsList }" /></p>
          <br/> <br/> <br/>
         <span class="errorblock"><form:errors path="biography.readings" cssClass="errorblock"/></span>
         <br/> <br/> <br/>
         
         <h2>Educational Background</h2>
         <table style="width:100%; border-spacing:0;">
              <tr><td>Highest Education (*)</td><td><form:select path="education.educLevel" items="${ educLevelList }"/></td></tr>
              <tr><td><span class="errorblock"><form:errors path="education.educLevel" /></span></td> <td></td> </tr>
              <tr><td>University/College (*)</td><td><form:input path="education.institution"/></td></tr>
               <tr><td><span class="errorblock"><form:errors path="education.institution" /></span></td> <td></td> </tr>
              <tr><td>Degree (*)</td><td><form:input path="education.degree"/></td></tr>
               <tr><td><span class="errorblock"><form:errors path="education.degree" /></span></td> <td></td> </tr>
              <tr><td>Specialization</td><td><form:input path="education.specialization"/></td></tr>
              
              <tr><td>Year Graduated</td><td><form:input path="education.year"/></td></tr>
              
         </table>
            
         <p style="padding-top: 15px; padding-left: 20px"><input class="submit" type="submit" name="name" value="Update Portfolio"></p>
          </div>
        </form:form>
        
        <c:url var="redirectPersonal" value="/pwp/personal.html"/>  
        <form action="<c:out value="${ redirectPersonal }"/>" method="get">
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
