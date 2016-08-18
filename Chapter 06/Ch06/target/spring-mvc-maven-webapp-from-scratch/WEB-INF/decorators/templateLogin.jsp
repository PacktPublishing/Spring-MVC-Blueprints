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
            
          </ul>
        </nav>
        <!-- header end -->
        <!-- content -->
        <article id="content">
          <div class="box1">
            <div class="wrapper">
               
              <div class="kwicks-wrapper marg_bot1">
               <sitemesh:write property='body'/>
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