<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, 
         initial-scale=1.0">

<title>Insert title here</title>
<spring:url value="/css/kickstrap.less" var="cssLess" />
<spring:url value="/css/Kickstrap/js/less-1.3.3.min.js"
	var="jsLess" />
	<spring:url value="/css/Kickstrap/css/responsive/responsive.css"
	var="cssresp" />
<link rel="stylesheet/less" type="text/css" href="${ cssLess }">
<link rel="stylesheet/less" type="text/css" href="${ cssresp }">
<script src="${ jsLess }"></script>

</head>
<body>
<div id="sf-wrapper"> <!-- Sticky Footer Wrapper -->

    <div class="container-fluid">
    	<div class="row-fluid">
    	  <div class="span12">

              <form action="#" >
     

                
     <div class="navbar-inner">
        <div class="container">
              <h2><a class="brand" href="#"><spring:message code="book_room_title" /></a></h2>
              </div>
              </div>
                <fieldset>
                  <div>
                    <spring:message code="book_room_name" />: </div>
                    <input type="text" >
                   
                  <div>
                    <spring:message code="book_room_email" />: </div>
                    <input type="text" >
           
                  <div >
                    <spring:message code="book_romm_phone" />: </div>
                    <input type="text" >
                   
                  <div>
                    <div>
                     <spring:message code="book_room_length" />: </div>
                      <select>
                        <option>&nbsp;</option>
                        <option>...</option>
                      </select>
                      
                    </div>
                  
                  <div>
                    <div>
                      <spring:message code="book_room_number" />:  </div>
                      <select>
                        <option>&nbsp;</option>
                        <option>...</option>
                      </select>
                   
                  
                  
                    <div>
                      <spring:message code="book_room_arrival" />:  </div>
                      <select>
                        <option>&nbsp;</option>
                        <option>...</option>
                      </select>
                   
                     </div>
                  <div><spring:message code="book_room_comment" />:  </div>
                    <textarea cols="1" rows="1"></textarea>
                 
                  <div>  
                           <button id="submit">Send</button> 
                           <button id="submit">Clear</button> 
                  </div>
                </fieldset>
              </form>


	  </div>
    	</div>
    </div>  	

  <footer class="container" id="footer">
	  <p>Built with <a href="http://getkickstrap.com">Kickstrap</a></p>
  </footer>

   </div>
</body>
</html>