<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>LoungeHotel | Locations</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="<spring:theme  code='styleSheet' />" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.6.js" ></script>
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/cufon-replace.js"></script>
<script type="text/javascript" src="js/Adamina_400.font.js"></script>
<script type="text/javascript" src="js/jquery.jqtransform.js" ></script>
<script type="text/javascript" src="js/script.js" ></script>
<script type="text/javascript" src="js/atooltip.jquery.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<link rel="stylesheet" href="css/ie.css" type="text/css" media="all">
<![endif]-->
</head>
<body id="page5">
<div class="bg1">
  <div class="bg2">
    <div class="main">
      <!-- header -->
      <header>
        <h1><a href="index.html" id="logo">LoungeHotel</a></h1>
        <div class="department"> 9863 - 9867 Mill Road, LA, MG09 99HT<br>
          <span>Freephone: &nbsp; +1 800 559 6580</span> </div>
      </header>
      <div class="box">
        <nav>
          <ul id="menu">
           <c:url value="/hms/index?theme=main" var="index"/>
            <c:url value="/hms/locations?theme=locations" var="locations"/>
            <c:url value="/hms/rooms?theme=rooms" var="rooms"/>
            <c:url value="/hms/services?theme=services" var="services"/>
            <c:url value="/hms/booking?theme=booking" var="booking"/>
            <li><a href='<c:out value="${ index }"/>'>About Us</a></li>
            <li><a href='<c:out value="${ services }"/>'>Services</a></li>
            <li><a href='<c:out value="${ booking }"/>'>Booking</a></li>
            <li><a href='<c:out value="${ rooms }"/>'>Rooms</a></li>
            <li class="active"><a href='<c:out value="${ locations }"/>'>Locations</a></li>
          </ul>
        </nav>
        <!-- header end -->
        <!-- content -->
        <article id="content">
          <div class="box1">
            <div class="wrapper">
              <form:form commandName="freeBookForm" method="POST" id="form1">
                <h2><spring:message code="book_room_title" /></h2>
                <fieldset>
                  <div class="row">
                    <form:input path="name" />
                    <spring:message code="book_room_name" />: </div>
                  <div class="row">
                     <form:input path="email" />
                    <spring:message code="book_room_email" />: </div>
                  <div class="row">
                     <form:input path="mobile" />
                    <spring:message code="book_romm_phone" />: </div>
                  <div class="row">
                    <div class="select1">
                      <form:select path="length" items="${ stays }" />                    </div>
                   <spring:message code="book_room_length" />: </div>
                  <div class="row">
                    <div class="select1">
                      <form:select path="heads" items="${ heads }" /> 
                    </div>
                   <spring:message code="book_room_number" />: </div>
                  <div class="row">
                    <form:input path="arrivalDate" />
                    <spring:message code="book_room_arrival" />: </div>
                  <div class="row_textarea"> <spring:message code="book_room_comment" />:
                  <form:textarea cols="1" rows="1" path="arrivalDate" />
                   
                  </div>
                  <div class="wrapper"> <input type="submit" value="Send" class="button1"> <a href="#" class="button1">Clear</a> </div>
                </fieldset>
              </form:form>
              <div class="col2 pad">
                <h2><img src="images/title_marker1.jpg" alt="">Contact Form</h2>
                <form id="ContactForm" action="#">
                  <div>
                    <div  class="wrapper">
                      <input type="text" class="input">
                      Name: </div>
                    <div  class="wrapper">
                      <input type="text" class="input">
                      Address: </div>
                    <div  class="wrapper">
                      <input type="text" class="input">
                      Email: </div>
                    <div  class="textarea_box">
                      <textarea name="textarea" cols="1" rows="1"></textarea>
                      Contacts: </div>
                    <a href="#" class="button2">Send</a> <a href="#" class="button2">Clear</a> </div>
                </form>
              </div>
            </div>
          </div>
          <div class="pad">
            <h2>Our Contacts</h2>
            <div class="line2">
              <div class="wrapper line3">
                <div class="col1">
                  <p class="pad_bot1"><strong class="color2">USA</strong></p>
                  <p class="pad_bot1">8901 Marmora Road, Glasgow, D04</p>
                  <p class="cols"> Freephone:<br>
                    Telephone:<br>
                    Fax:<br>
                    Email:</p>
                  +1 800 559 6580<br>
                  +1 800 603 6035<br>
                  +1 800 889 9898<br>
                  <a href="#" class="color1">mail@demolink.org</a> </div>
                <div class="col1 pad_left1">
                  <p class="pad_bot1"><strong class="color2">Canada</strong></p>
                  <p class="pad_bot1">8901 Marmora Road, Glasgow, D04</p>
                  <p class="cols"> Freephone:<br>
                    Telephone:<br>
                    Fax:<br>
                    Email:</p>
                  +1 800 559 6580<br>
                  +1 800 603 6035<br>
                  +1 800 889 9898<br>
                  <a href="#" class="color1">mail@demolink.org</a> </div>
                <div class="col1 pad_left1">
                  <p class="pad_bot1"><strong class="color2">Mexico</strong></p>
                  <p class="pad_bot1">8901 Marmora Road, Glasgow, D04</p>
                  <p class="cols"> Freephone:<br>
                    Telephone:<br>
                    Fax:<br>
                    Email:</p>
                  +1 800 559 6580<br>
                  +1 800 603 6035<br>
                  +1 800 889 9898<br>
                  <a href="#" class="color1">mail@demolink.org</a> </div>
              </div>
            </div>
          </div>
        </article>
        <!--content end-->
      </div>
    </div>
  </div>
</div>
<div class="main">
  <!-- footer -->
  <footer>
    <div class="col2">Copyright &copy; <a href="#">Domain Name</a> All Rights Reserved | Design by <a target="_blank" href="http://www.templatemonster.com/">TemplateMonster.com</a>
      <nav>
        <ul id="footer_menu">
          <li><a href="index.html">About Us</a></li>
          <li><a href="services.html">Services</a></li>
          <li><a href="booking.html">Booking</a></li>
          <li><a href="rooms.html">Rooms</a></li>
          <li class="last active"><a href="locations.html">Locations</a></li>
        </ul>
      </nav>
    </div>
    <div class="col1 pad_left1">
      <ul id="icons">
        <li><a href="#" class="normaltip"><img src="images/icon1.jpg" alt=""></a></li>
        <li><a href="#" class="normaltip"><img src="images/icon2.jpg" alt=""></a></li>
        <li><a href="#" class="normaltip"><img src="images/icon3.jpg" alt=""></a></li>
        <li><a href="#" class="normaltip"><img src="images/icon4.jpg" alt=""></a></li>
      </ul>
    </div>
    <!-- {%FOOTER_LINK} -->
  </footer>
  <!-- footer end -->
</div>
<script type="text/javascript">Cufon.now();</script>
</body>
</html>