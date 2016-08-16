<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
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
        <ul id="menu"><!-- put class="selected" in the li tag for the selected page - to highlight which page you're on --><li><a href="index.html">Home</a></li>
         
          <li><a href="index.html">Home</a></li>
          <li><a href="personal.html">Personal</a></li>
          <li><a href="professional.html">Professional</a></li>
          <li class="selected"><a href="contact.html">Reach Out</a></li>
       
        </ul></div>
    </div>
    <div id="content_header"></div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Contact Us</h1>
        <p>Send us all your inquiries if you have one. </p>
        <form action="#" method="post">
          <div class="form_settings">
            <table style="width:100px; border-spacing:0;">
               <tr>
                  <td>Name</td><td><input class="contact" type="text" name="your_name" value=""></td>
               </tr>
               <tr>
                  <td>Email</td><td><input class="contact" type="text" name="your_email" value=""></td>
               </tr>
             
               
            </table>
            <table style="width:100px; border-spacing:0;">
              <tr>
                  <td>Message:</td> 
               </tr>
               <tr>
                  <td><textarea class="contact textarea" rows="8" cols="50" name="your_enquiry"></textarea></td>
               </tr>
            </table>
            <p><br/></p>
            <p style="padding-top: 15px; padding-left: 20px"><span> </span><input class="submit" type="submit" name="contact_submitted" value="Send Email"></p>
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
