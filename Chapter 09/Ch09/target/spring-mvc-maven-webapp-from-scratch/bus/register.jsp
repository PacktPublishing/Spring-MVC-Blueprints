<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    
    <!-- TITLE -->
    <title>Gofar</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-capable" content="yes">

    <!-- GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:700,600,400,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Oswald:400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Lato:400,700' rel='stylesheet' type='text/css'>

    <!-- CSS LIBRARY -->
    <link rel="stylesheet" type="text/css" href="../bus/css/lib/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../bus/css/lib/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../bus/css/lib/awe-booking-font.css">
    <link rel="stylesheet" type="text/css" href="../bus/css/lib/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="../bus/css/lib/jquery-ui.css">

    <!-- MAIN STYLE -->
    <link rel="stylesheet" type="text/css" href="../bus/css/style.css">
    <link rel="stylesheet" type="text/css" href="../bus/css/demo.css">
    
    <!-- CSS COLOR -->
    <link id="colorreplace" rel="stylesheet" type="text/css" href="../bus/css/colors/blue.css">
    
    <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
    <![endif]-->
</head>

<!--[if IE 7]> <body class="ie7 lt-ie8 lt-ie9 lt-ie10"> <![endif]-->
<!--[if IE 8]> <body class="ie8 lt-ie9 lt-ie10"> <![endif]-->
<!--[if IE 9]> <body class="ie9 lt-ie10"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <body> <!--<![endif]-->



    <!-- PAGE WRAP -->
    <div id="page-wrap">
        <!-- PRELOADER -->
        <div class="preloader"></div>
        <!-- END / PRELOADER -->

        
        <!-- HEADER PAGE -->
        <header id="header-page">
            <div class="header-page__inner">
                <div class="container">
                    <!-- LOGO -->
                    <div class="logo">
                        <a href="index.html"><img src="../bus/images/logo.png" alt=""></a>
                    </div>
                    <!-- END / LOGO -->
                    
                   

                    <!-- TOGGLE MENU RESPONSIVE -->
                    <a class="toggle-menu-responsive" href="#">
                        <div class="hamburger">
                            <span class="item item-1"></span>
                            <span class="item item-2"></span>
                            <span class="item item-3"></span>
                        </div>
                    </a>
                    <!-- END / TOGGLE MENU RESPONSIVE -->
                </div>
            </div>
        </header>
        <!-- END / HEADER PAGE -->
        
        <section class="awe-parallax register-page-demo">
            <div class="awe-overlay"></div>
            <div class="container">
                <div class="login-register-page__content">
                    <div class="content-title">
                        <span>Don’t stay at home</span>
                        <h2>JOIN US !</h2>
                        <div id="message"></div>
                    </div>
                    
                    <form>
                    <div class="form-item">
                            <label>First Name</label>
                            <input type="text" id="firstName">
                        </div>
                        <div class="form-item">
                            <label>Middle Name</label>
                            <input type="text" id="middleName">
                        </div>
                        <div class="form-item">
                            <label>Last Name</label>
                            <input type="text" id="lastName">
                        </div>
                        <div class="form-item">
                            <label>Age</label>
                            <input type="text" id="age">
                        </div>
                       
                        <div class="form-item">
                            <label>Email</label>
                            <input type="email" id="username">
                        </div>
                        <div class="form-item">
                            <label>Password</label>
                            <input type="password" id="password">
                        </div>
                        <div class="form-item">
                            <label>Confirm password</label>
                            <input type="password">
                        </div>
                        <a href="#" class="terms-conditions">By registering, you accept terms &amp; conditions</a>
                        <div class="form-actions">
                            <input type="submit" value="Register" onclick="saveUser();">
                        </div>
                    </form>
                    <div class="login-register-link">
                        Already have Account? <a href="login.html">Log in HERE</a>
                    </div>
                </div>
            </div>
        </section>



        <!-- FOOTER PAGE -->
        <footer id="footer-page">
            <div class="container">
                <div class="row">
                    <!-- WIDGET -->
                    <div class="col-md-3">
                        <div class="widget widget_contact_info">
                            <div class="widget_background">
                                <div class="widget_background__half">
                                    <div class="bg"></div>
                                </div>
                                <div class="widget_background__half">
                                    <div class="bg"></div>
                                </div>
                            </div>
                            <div class="logo">
                                <img src="../bus/images/logo-footer.png" alt="">
                            </div>
                            <div class="widget_content">
                                <p>25 California Avenue, Santa Monica, California. USA</p>
                                <p>+1-888-8765-1234</p>
                                <a href="#">contact@gofar.com</a>
                            </div>
                        </div>
                    </div>
                    <!-- END / WIDGET -->

                    <!-- WIDGET -->
                    <div class="col-md-2">
                        <div class="widget widget_about_us">
                            <h3>About Us</h3>
                            <div class="widget_content">
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vel dignissim dolor. Ut risus orci, aliquam sit amet semper eget, egestas aliquam felis.</p>
                            </div>
                        </div>
                    </div>
                    <!-- END / WIDGET -->

                    <!-- WIDGET -->
                    <div class="col-md-2">
                        <div class="widget widget_categories">
                            <h3>Categiries</h3>
                            <ul>
                                <li><a href="#">Countries</a></li>
                                <li><a href="#">Regions</a></li>
                                <li><a href="#">Cities</a></li>
                                <li><a href="#">Districts</a></li>
                                <li><a href="#">Countries</a></li>
                                <li><a href="#">Airports</a></li>
                                <li><a href="#">Hotels</a></li>
                                <li><a href="#">Places of interest</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- END / WIDGET -->

                    <!-- WIDGET -->
                    <div class="col-md-2">
                        <div class="widget widget_recent_entries">
                            <h3>Recent Blog</h3>
                            <ul>
                                <li><a href="#">Countries</a></li>
                                <li><a href="#">Regions</a></li>
                                <li><a href="#">Cities</a></li>
                                <li><a href="#">Districts</a></li>
                                <li><a href="#">Countries</a></li>
                                <li><a href="#">Airports</a></li>
                                <li><a href="#">Hotels</a></li>
                                <li><a href="#">Places of interest</a></li>
                            </ul>
                        </div>
                    </div>
                    <!-- END / WIDGET -->

                    <!-- WIDGET -->
                    <div class="col-md-3">
                        <div class="widget widget_follow_us">
                            <div class="widget_content">
                                <p>For Special booking request, please call</p>
                                <span class="phone">099-099-000</span>
                                <div class="awe-social">
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-pinterest"></i></a>
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-youtube-play"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- END / WIDGET -->
                </div>
                <div class="copyright">
                    <p>©2015 GOFAR travel™ All rights reserved.</p>
                </div>
            </div>
        </footer>
        <!-- END / FOOTER PAGE -->

    </div>
    <!-- END / PAGE WRAP -->

    <!-- LOAD JQUERY -->
    <script type="text/javascript" src="../bus/js/lib/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="../bus/js/lib/masonry.pkgd.min.js"></script>
    <script type="text/javascript" src="../bus/js/lib/jquery.parallax-1.1.3.js"></script>
    <script type="text/javascript" src="../bus/js/lib/jquery.owl.carousel.js"></script>
    <script type="text/javascript" src="../bus/js/lib/theia-sticky-sidebar.js"></script>
    <script type='text/javascript' src="../bus/js/lib/jquery-ui.js"></script>
    <script type="text/javascript" src="../bus/js/scripts.js"></script>
    
     <script type="text/javascript" src="${ contextPath }/dwr/engine.js"></script>
     <script type="text/javascript" src="${ contextPath }/dwr/interface/RegisterServiceImpl.js"></script>
     <script type="text/javascript" src="${ contextPath }/dwr/util.js"></script>
     
     <script type="text/javascript">
         function saveUser(){
        	 var registerForm = {
        			 firstName: document.getElementById("firstName").value,
        			 middleName: document.getElementById("middleName").value,
        			 lastName: document.getElementById("lastName").value,
        			 age: document.getElementById("age").value,
        			 username: document.getElementById("username").value,
        			 password: document.getElementById("password").value
        	 };
        	 RegisterServiceImpl.registerUser(registerForm,{
        		 callback:function(registerForm){
        			 document.getElementById("message").innerHTML = "User Added";
        		 }
        	 });
        	 
         }
     
     </script>
</body>
</html>