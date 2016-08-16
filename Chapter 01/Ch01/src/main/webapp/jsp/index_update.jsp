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
        </div>
    </div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>Content Update</h3>
        <p>Here are the rules for updating the home page:</p>
        <ol>
          <li>The <b>INSPIRATIONAL MESSAGE</b> must not be less than 50  and not more than 500 letters (including space).</li>
          <li>The <b>QUOTES</b> must not be less than 50  and not more than 500 letters (including space).</li>
          <li>HTML tags can be included for styling purposes.</li>
          <li>Content must be related to the objective of this portal.</li>
          <li>To cancel update, click <b>CANCEL UPDATE</b> button.</li>
        </ol>
        
      </div>
      <div id="content">
        <!-- insert the page content here -->
       
        <h1>Update Home Page (Required)</h1>
        <p>Updating daily your inspirational message and quote.</p>
        <form:form commandName="homeForm" method="post">
          <div class="form_settings">
             <!-- insert the page content here -->
             
             <h2>Update Inspirational Message</h2>
             <table style="width:100px; border-spacing:0;">
               <tr>
                 <td><form:textarea path="message" rows="8" cols="80" /></td>
               </tr>
               <tr >
                  <td><span class="errorblock"><form:errors path="message"/></span></td>
               </tr>
             </table>
           
            
            
            
            
           
             
             <h2>Update Best Quote (Required)</h2>
             <table style="width:100px; border-spacing:0;">
               <tr>
                 <td><form:textarea path="quote" rows="8" cols="80"/></td>
               </tr>
                <tr>
                   <td><span class="errorblock"><form:errors path="quote"/></span></td>
                </tr>
                
             
            </table>
         
            
            
            
           
            
            
            <p style="padding-top: 15px; padding-left: 20px"><input class="submit" type="submit" value="Update Home"/></p>
           </div>
        </form:form>
       
        <c:url var="redirectIndex" value="/pwp/index.html"/>      
        <form action="<c:out value="${ redirectIndex }"/>" method="get">
          <div class="form_settings">
          <p style="padding-top: 15px; padding-left: 20px"><input class="submit" type="submit" value="Cancel Update" /></p>
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
