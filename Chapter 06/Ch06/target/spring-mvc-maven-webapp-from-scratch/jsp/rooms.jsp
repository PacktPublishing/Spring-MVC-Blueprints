<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>LoungeHotel | Rooms</title>
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
<body id="page4">
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
            <li class="active"><a href='<c:out value="${ rooms }"/>'>Rooms</a></li>
            <li><a href='<c:out value="${ locations }"/>'>Locations</a></li>
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
                <h2><img src="images/title_marker1.jpg" alt="">Best Propositions of This Month</h2>
                <div class="wrapper line1">
                  <div class="col3">
                    <a href="./ext/extroomtypes" class="button2">Rooms</a>
                    <p class="pad_bot1"><strong class="color3">An ExtJS implementation</strong></p>
                    <p>Adipisicing elito eiusmod tempor incididunt ut labore dolore magna.</p>
                     </div>
                  <div class="col3 pad_left2">
                    <a href="./ext/extroomtypesgrid" class="button2">Rooms (Grid)</a> 
                    <p class="pad_bot1"><strong class="color3">An ExtJS implementation</strong></p>
                    <p>Ut enim ad minim veniam nostrud exercitation ullamco laboris nisi ut aliquip.</p>
                    </div>
                </div>
                </div>
              </div>
            </div>
          </div>
          <div class="pad">
            <div class="wrapper line3">
              <div class="col2">
                <h2>Quality Standards</h2>
                <p class="pad_bot1"><strong class="color2">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo</strong> </p>
                <p class="pad_bot1"> Inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enigm ipsam voluptatem nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus quia voluptas sit aspernatur aut odit aut fugit.</p>
                <div class="wrapper pad_bot2">
                  <div class="col1">
                    <ul class="list1">
                      <li><a href="#">Inventore veritatis et quasi architecto</a></li>
                      <li><a href="#">Nemo enim ipsam voluptatem quivolupta</a></li>
                      <li><a href="#">Sit aspernatur aut odit aut fugit sed</a></li>
                    </ul>
                  </div>
                  <div class="col1 pad_left1">
                    <ul class="list1">
                      <li><a href="#">Neque porro quisquam est, qui dolorem</a></li>
                      <li><a href="#">Ipsum quia dolor amet consectetur</a></li>
                      <li><a href="#">Adipisci velit, sed quia non numquam</a></li>
                    </ul>
                  </div>
                </div>
                <p class="pad_bot1"><strong class="color2">Duis aute irure dolorin reprehenderit in voluptate velit esse cillum dolore eu fugiat pariatur</strong></p>
                Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam. </div>
              <div class="col1 pad_left1">
                <h2>The Rooms</h2>
                <p class="pad_bot1"><strong class="color2">Nemo enim ipsam voluptatem</strong><br>
                  Quia voluptas sit aspernatur aut odit autugit sed quia ne voluptatem nesciunt. </p>
                <figure class="pad_bot3"><img src="images/page4_img1.jpg" alt=""></figure>
                <ul class="list1 pad_bot3">
                  <li><a href="#">Neque porro quisquam est qui</a></li>
                  <li><a href="#">Dolorem ipsum quia dolor sit amet</a></li>
                  <li><a href="#">Consectetur adipisci velit sed</a></li>
                </ul>
                <a href="#" class="button1">Read More</a> </div>
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
          <li class="active"><a href="rooms.html">Rooms</a></li>
          <li class="last"><a href="locations.html">Locations</a></li>
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