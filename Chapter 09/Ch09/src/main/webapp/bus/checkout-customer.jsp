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
    <link rel="stylesheet" type="text/css" href="css/lib/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/lib/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="css/lib/awe-booking-font.css">
    <link rel="stylesheet" type="text/css" href="css/lib/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="css/lib/jquery-ui.css">

    <!-- MAIN STYLE -->
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="css/demo.css">
    
    <!-- CSS COLOR -->
    <link id="colorreplace" rel="stylesheet" type="text/css" href="css/colors/blue.css">
    
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
                        <a href="index.html"><img src="images/logo.png" alt=""></a>
                    </div>
                    <!-- END / LOGO -->
                    
                    <!-- NAVIGATION -->
                    <nav class="navigation awe-navigation" data-responsive="1200">
                        <ul class="menu-list">
                            <li class="menu-item-has-children">
                                <a href="index.html">Home</a>
                                <ul class="sub-menu">
                                    <li><a href="index.html">Home 1</a></li>
                                   
                                </ul>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="destinations-list.html">Destinations</a>
                                <ul class="sub-menu">
                                    <li><a href="destinations-list.html">List</a></li>
                                  
                                </ul>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="trip.html">Trips</a>
                                <ul class="sub-menu">
                                    <li><a href="trip.html">Trips</a></li>
                                   
                                </ul>
                            </li>
                           
                            <li class="menu-item-has-children current-menu-parent">
                                <a href="#">Pages</a>
                                <ul class="sub-menu">
                                    <li class="menu-item-has-children">
                                        <a href="blog.html">Blog</a>
                                        <ul class="sub-menu">
                                            <li><a href="blog.html">Blog</a></li>
                                            <li><a href="single-post.html">Single Post</a></li>
                                           
                                        </ul>
                                    </li>
                                    <li class="menu-item-has-children">
                                        <a href="login.html">Log In</a>
                                        <ul class="sub-menu">
                                            <li><a href="login.html">Log In</a></li>
                                            <li><a href="register.html">Register</a></li>
                                           
                                        </ul>
                                    </li>
                                    <li class="menu-item-has-children current-menu-parent">
                                        <a href="checkout-yourcart.html">Checkout</a>
                                        <ul class="sub-menu">
                                            <li><a href="checkout-yourcart.html">Your cart</a></li>
                                            <li class="current-menu-item"><a href="checkout-customer.html">Customer</a></li>
                                            <li><a href="checkout-complete.html">Complete</a></li>
                                           
                                        </ul>
                                    </li>
                                   

                                </ul>
                            </li>
                            <li class="menu-item-has-children">
                                <a href="contact.html">Contact</a>
                                <ul class="sub-menu">
                                    <li><a href="contact.html">Light</a></li>
                                    
                                </ul>
                            </li>
                        </ul>
                    </nav>
                    <!-- END / NAVIGATION -->
                    
                    <!-- SEARCH BOX -->
                    <div class="search-box">
                        <span class="searchtoggle"><i class="awe-icon awe-icon-search"></i></span>
                        <form class="form-search">
                            <div class="form-item">
                                <input type="text" value="Search &amp; hit enter">
                            </div>
                        </form>
                    </div>
                    <!-- END / SEARCH BOX -->


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

        
        <section class="checkout-section-demo">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="checkout-page__top">
                            <div class="title">
                                <h1 class="text-uppercase">CHECKOUT</h1>
                            </div>
                            <span class="phone">Support Call: +1-888-8765-1234</span>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="checkout-page__sidebar">
                            <ul>
                                <li><a href="checkout-yourcart.html">Your Cart</a></li>
                                <li class="current"><a href="checkout-customer.html">Customer information</a></li>
                                <li><a href="checkout-complete.html">Complete order</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="checkout-page__content">
                            <div class="customer-content">
                                <div class="woocommerce-info">
                                    Returning customer? 
                                    <a href="#" class="showlogin">Click here to login</a>
                                </div>

                                <div class="woocommerce-info">
                                    Have a coupon? <a href="#" class="showcoupon">Click here to enter your code</a>
                                </div>

                                <div class="coupon">
                                    <form class="checkout_coupon">
                                        <div class="form-row form-row-first">
                                            <input type="text" value="Coupon code">
                                        </div>
                                        <div class="form-row form-row-last">
                                            <input type="submit" class="button" value="Apply Coupon">
                                        </div>
                                    </form>
                                </div>

                                <div class="woocommerce-billing-fields">
                                    <h3>Billing info</h3>
                                    <div class="form-row" id="billing_first_name_field">
                                        <label>First name</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_last_name_field">
                                        <label>Last name</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_email">
                                        <label>Email</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_company_field">
                                        <label>Company Name</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_country_field">
                                        <label>Country</label>
                                        <div class="country_select">
                                            <a href="#">
                                                <span>United Kingdom (UK)</span>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="form-row" id="billing_city_field">
                                        <label>Town / city</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_state_field">
                                        <label>State / county</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_address_1_field">
                                        <label>Address</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_postcode_field">
                                        <label>Postcode / zip</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row" id="billing_phone_field">
                                        <label>Phone</label>
                                        <input type="text">
                                    </div>
                                    <div class="form-row form-row-wide create-account">
                                        <input id="createaccount" type="checkbox"> <label for="createaccount">Create an account?</label>
                                    </div>
                                </div>

                                <div class="woocommerce-shipping-fields">
                                    <h3 id="ship-to-different-address">
                                        <label for="ship-to-different-address-checkbox">Ship to a different address?</label>
                                        <input id="ship-to-different-address-checkbox" type="checkbox" checked="checked">
                                    </h3>
                                    <div class="shipping_address">
                                        <div class="form-row" id="shipping_first_name_field">
                                            <label>First name</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="shipping_last_name_field">
                                            <label>Last name</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="order_comments_field">
                                            <label>Order Notes</label>
                                            <textarea></textarea>
                                        </div>
                                        <div class="form-row" id="shipping_company_field">
                                            <label>Company Name</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="shipping_country_field">
                                            <label>Country</label>
                                            <div class="country_select">
                                                <a href="#">
                                                    <span>United Kingdom (UK)</span>
                                                </a>
                                            </div>
                                        </div>
                                        <div class="form-row" id="shipping_city_field">
                                            <label>Town / city</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="shipping_state_field">
                                            <label>State / county</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="shipping_address_1_field">
                                            <label>Address</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="shipping_postcode_field">
                                            <label>Postcode / zip</label>
                                            <input type="text">
                                        </div>
                                        <div class="form-row" id="shipping_phone_field">
                                            <label>Phone</label>
                                            <input type="text">
                                        </div>
                                    </div>
                                </div>

                                <div id="payment">
                                    <h3>Payment method</h3>
                                    <ul class="payment_methods methods">
                                        <li class="payment_method_bacs">
                                            <input id="payment_method_bacs" type="radio" name="payment_method">
                                            <label for="payment_method_bacs">Direct Bank Transfer </label>
                                            <div class="payment_box payment_method_bacs"><p>Make your payment directly into our bank account. Please use your Order ID as the payment reference. Your order won’t be shipped until the funds have cleared in our account.</p>
                                            </div>
                                        </li>
                                        <li class="payment_method_cheque">
                                            <input id="payment_method_cheque" type="radio" name="payment_method">
                                            <label for="payment_method_cheque">Cheque Payment </label>
                                            <div class="payment_box payment_method_cheque"><p>Please send your cheque to Store Name, Store Street, Store Town, Store State / County, Store Postcode.</p>
                                            </div>
                                        </li>
                                        <li class="payment_method_paypal">
                                            <input id="payment_method_paypal" type="radio" name="payment_method">
                                            <label for="payment_method_paypal">
                                                PayPal 
                                                <img src="images/paypal.png" alt="">
                                                <a href="#" class="about_paypal">What is PayPal?</a>
                                            </label>
                                            <div class="payment_box payment_method_paypal"><p>Pay via PayPal; you can pay with your credit card if you don’t have a PayPal account.</p>
                                            </div>
                                        </li>
                                    </ul>
                                    <div class="form-row place-order">
                                        <input type="submit" class="button alt" id="place_order" value="Place order">
                                    </div>
                                </div>

                            </div>
                        </div>
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
                                <img src="images/logo-footer.png" alt="">
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
    <script type="text/javascript" src="js/lib/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="js/lib/masonry.pkgd.min.js"></script>
    <script type="text/javascript" src="js/lib/jquery.parallax-1.1.3.js"></script>
    <script type="text/javascript" src="js/lib/jquery.owl.carousel.js"></script>
    <script type='text/javascript' src="js/lib/jquery-ui.js"></script>
    <script type="text/javascript" src="js/scripts.js"></script>
</body>
</html>