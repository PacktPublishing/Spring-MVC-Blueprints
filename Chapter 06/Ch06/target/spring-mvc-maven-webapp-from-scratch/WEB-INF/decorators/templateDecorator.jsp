<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title><sitemesh:write property='title'/></title>
<meta charset="utf-8">
<link rel="stylesheet" href="../../css/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="../../css/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="../../<spring:theme  code='styleSheet' />" type="text/css"/>
<script type="text/javascript" src="../../js/jquery-1.6.js" ></script>
<script type="text/javascript" src="../../js/cufon-yui.js"></script>
<script type="text/javascript" src="../../js/cufon-replace.js"></script>
<script type="text/javascript" src="../../js/Adamina_400.font.js"></script>
<script type="text/javascript" src="../../js/jquery.jqtransform.js" ></script>
<script type="text/javascript" src="../../js/script.js" ></script>
<script type="text/javascript" src="../../js/kwicks-1.5.1.pack.js" ></script>
<script type="text/javascript" src="../../js/atooltip.jquery.js"></script>
<!--[if lt IE 9]>
<script type="text/javascript" src="js/html5.js"></script>
<link rel="stylesheet" href="css/ie.css" type="text/css" media="all">
<![endif]-->
</head>
<body id="page1">
    <div class="bg1">
  <div class="bg2">
    <div class="main">
        <!-- header -->
      <header>
        <h1><a href="index.html" id="logo"><spring:message code="hms_header" /></a></h1>
        <div class="department"> 9863 - 9867 Mill Road, LA, MG09 99HT<br>
          <span><spring:message code="hms_free_phone" />: &nbsp; +1 800 559 6580</span> </div>
      </header>
      <div class="box">
        <nav>
          <ul id="menu">
            <c:url value="/hms/decorate/first.html" var="profiles"/>
           
            <li class="active"><a href='<c:out value="${ profiles }"/>'><spring:message code="hms_profiles" /></a></li>
           
          </ul>
        </nav>
        <!-- header end -->
        </div>
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
                <h2><img src="../../images/title_marker1.jpg" alt="">Active Members</h2>
                <div class="wrapper line1">
                
                  <div class="col3">  
                   <sitemesh:write property='body'/>
                    </div>
                 
                </div>
                
              </div>
            </div>
            </div>
            <div class="pad">
              <div class="line1">
                <div class="wrapper line2">
                  <div class="col1">
                    <h2><img src="../../images/title_marker1.jpg" alt="">On Mobile</h2>
                    <p class="pad_bot1">Lounge Hotel is one of free mobile templates created by TemplateMonster.com team. This website template is optimized for 1280X1024 screen resolution. It is also XHTML &amp; CSS valid.</p>
                    <a href="#" class="color1">On Mobile</a> </div>
                  <div class="col1 pad_left1">
                    <h2><img src="../../images/title_marker2.jpg" alt="">On Tablet</h2>
                    <p class="pad_bot1">Lounge Hotel Template goes with 2 tablet view packages. PSD source files are available for free for the registered members of Templates.com. Basic package is available for anyone without registration.</p>
                    <a href="#" class="color1">On Tablet</a> </div>
                  <div class="col1 pad_left1">
                    <h2><img src="../../images/title_marker3.jpg" alt="">Table Listing</h2>
                    <p class="pad_bot1">This Lounge Hotel website template has several pages: <a href="index.html">About Us</a>, <a href="services.html">Services</a>, <a href="booking.html">Booking</a>, <a href="rooms.html">Our Rooms</a>, <a href="locations.html">Contact Us</a> (note that contact us form – doesn’t work). Aliquip ex ea commodo consequat.</p>
                    <a href="#" class="color1">Table Listing</a> </div>
                </div>
              </div>
            </div>
            
          
          <div class="pad">
            <div class="wrapper line3">
              <div class="col2">
                <h2>Welcome to Our Hotel!</h2>
                <p class="pad_bot1"><strong class="color2">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor</strong><br>
                  Incididunt ut labore dolore magna. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. </p>
                <p class="pad_bot2"> Duis aute irure dolorin reprehenderit in voluptate velit esse cillum dolore eu fugiat pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem.</p>
                <a href="#" class="button1">Read More</a> </div>
              <div class="col1 pad_left1">
                <h2>About Us</h2>
                <div class="wrapper">
                  <figure class="left marg_right1"><img src="../../images/page1_img1.jpg" alt=""></figure>
                  <p class="pad_bot1"><strong class="color2">10.10.2011</strong></p>
                  <p class="pad_bot2"> Lorem ipsum dolor sit amet, consectetur adipisicing elited do eiusmod tempor incididunt.</p>
                </div>
                <a href="#" class="button1">Read More</a> </div>
            </div>
          </div>
        </article>
        <!--content end-->
      
      </div>
    </div>
  </div>

<div class="main">
  <!-- footer -->
  <footer>
    <div class="col2">Copyright &copy; <a href="#">Domain Name</a> All Rights Reserved | Design by <a target="_blank" href="http://www.templatemonster.com/">TemplateMonster.com</a>
      <nav>
        <ul id="footer_menu">
          <li class="active"><a href="index.html">About Us</a></li>
          <li><a href="services.html">Services</a></li>
          <li><a href="booking.html">Booking</a></li>
          <li><a href="rooms.html">Rooms</a></li>
          <li class="last"><a href="locations.html">Locations</a></li>
        </ul>
      </nav>
    </div>
    <div class="col1 pad_left1">
      <ul id="icons">
        <li><a href="#" class="normaltip"><img src="../../images/icon1.jpg" alt=""></a></li>
        <li><a href="#" class="normaltip"><img src="../../images/icon2.jpg" alt=""></a></li>
        <li><a href="#" class="normaltip"><img src="../../images/icon3.jpg" alt=""></a></li>
        <li><a href="#" class="normaltip"><img src="../../images/icon4.jpg" alt=""></a></li>
      </ul>
    </div>
    <!-- {%FOOTER_LINK} -->
  </footer>
  <!-- footer end -->
</div>
<script type="text/javascript">Cufon.now();</script>
<script type="text/javascript">
$(document).ready(function () {
    $('.kwicks').kwicks({
        max: 500,
        spacing: 0,
        event: 'mouseover'
    });
})
</script>
</body>
</html>