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
    <title>International Bus Ticketing System</title>

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
    <link rel="stylesheet" type="text/css" href="css/lib/magnific-popup.css">
    <link rel="stylesheet" type="text/css" href="css/lib/jquery-ui.css">
    <!-- REVOLUTION DEMO -->
    <link rel="stylesheet" type="text/css" href="revslider-demo/css/settings.css">


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
                            <li class="menu-item-has-children current-menu-parent">
                                <a href="index.html">Home</a>
                                <ul class="sub-menu">
                                    <li class="current-menu-item"><a href="index.html">Home 1</a></li>
                                   
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
                        
                            <li class="menu-item-has-children">
                                <a href="#">Pages</a>
                                <ul class="sub-menu">
                                   
                                    <li class="menu-item-has-children">
                                        <a href="login.html">Log In</a>
                                        <ul class="sub-menu">
                                            <li><a href="login.html">Log In</a></li>
                                            <li><a href="register.html">Register</a></li>
                                           
                                        </ul>
                                    </li>
                                    <li class="menu-item-has-children">
                                        <a href="checkout-yourcart.html">Checkout</a>
                                        <ul class="sub-menu">
                                            <li><a href="checkout-yourcart.html">Your cart</a></li>
                                            <li><a href="checkout-customer.html">Customer</a></li>
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
        
        <!-- HERO SECTION -->
        <section class="hero-section">
            <div id="slider-revolution">
                <ul>
                    <li data-slotamount="7" data-masterspeed="500" data-title="Slide title 1">
                        <img src="images/bg/1.jpg" data-bgposition="left center" data-duration="14000" data-bgpositionend="right center" alt="">

                        <div class="tp-caption sfb fadeout slider-caption-sub slider-caption-sub-1" data-x="500" data-y="230" data-speed="700" data-start="1500" data-easing="easeOutBack">
                          Last minute deal
                        </div>

                        <div class="tp-caption sfb fadeout slider-caption slider-caption-1" data-x="center" data-y="280" data-speed="700" data-easing="easeOutBack"  data-start="2000">Top discount Paris Hotels</div>
                        
                        <a href="#" class="tp-caption sfb fadeout awe-btn awe-btn-style3 awe-btn-slider" data-x="center" data-y="380" data-easing="easeOutBack" data-speed="700" data-start="2200">Book now</a>
                    </li> 

                    <li data-slotamount="7" data-masterspeed="500" data-title="Slide title 2">
                        <img src="images/bg/2.jpg" data-bgposition="left center" data-duration="14000" data-bgpositionend="right center" alt="">

                        <div class="tp-caption  sft fadeout slider-caption-sub slider-caption-sub-2" data-x="center" data-y="220" data-speed="700" data-start="1500" data-easing="easeOutBack">
                          Check out the top weekly destination
                        </div>

                        <div class="tp-caption sft fadeout slider-caption slider-caption-2" data-x="center" data-y="260" data-speed="700" data-easing="easeOutBack"  data-start="2000">
                            Travel with us
                        </div>
                        
                        <a href="#" class="tp-caption sft fadeout awe-btn awe-btn-style3 awe-btn-slider" data-x="center" data-y="370" data-easing="easeOutBack" data-speed="700" data-start="2200">Book now</a>
                    </li>

                    <li data-slotamount="7" data-masterspeed="500" data-title="Slide title 3">
                        <img src="images/bg/3.jpg" data-bgposition="left center" data-duration="14000" data-bgpositionend="right center" alt="">

                        <div class="tp-caption lfl fadeout slider-caption slider-caption-3" data-x="center" data-y="260" data-speed="700" data-easing="easeOutBack"  data-start="1500">
                            Gofar
                        </div>
                        
                        <div href="#" class="tp-caption lfr fadeout slider-caption-sub slider-caption-sub-3" data-x="center" data-y="365" data-easing="easeOutBack" data-speed="700" data-start="2000">Take you to every corner of the world</div>
                    </li> 

                </ul>
            </div>
        </section>
        <!-- END / HERO SECTION -->


        <!-- SEARCH TABS -->
        <section>
            <div class="container">
                <div class="awe-search-tabs tabs">
                    <ul>
                        
                        <li>
                            <a href="#awe-search-tabs-6">
                                <i class="awe-icon awe-icon-bus"></i>
                            </a>
                        </li>
                    </ul>
                    <div class="awe-search-tabs__content tabs__content">
                        

                        <div id="awe-search-tabs-6" class="search-bus">
                            <h2>Search Bus</h2>
                            <form>
                                <div class="form-group">
                                    <div class="form-elements">
                                        <label>Picking up</label>
                                        <div class="form-item">
                                            <i class="awe-icon awe-icon-marker-1"></i>
                                            <input type="text" value="City, airport...">
                                        </div>
                                    </div>
                                    <div class="form-elements">
                                        <label>Droping off</label>
                                        <div class="form-item">
                                            <i class="awe-icon awe-icon-marker-1"></i>
                                            <input type="text" value="City, airport...">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-elements">
                                        <label>Pink off</label>
                                        <div class="form-item">
                                            <i class="awe-icon awe-icon-calendar"></i>
                                            <input type="text" class="awe-calendar" value="Date">
                                        </div>
                                    </div>
                                    <div class="form-elements">
                                        <label>Drop off</label>
                                        <div class="form-item">
                                            <i class="awe-icon awe-icon-calendar"></i>
                                            <input type="text" class="awe-calendar" value="Date">
                                        </div>
                                    </div>
                                </div>
                                <div class="form-actions">
                                    <input type="submit" value="Find My Car">
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- END / SEARCH TABS -->

        <!-- MASONRY -->
        <section class="masonry-section-demo">
            <div class="container">
                <div class="destination-grid-content">
                    <div class="section-title">
                        <h3>More than <a href="destinations-grid.html">238 Destinations</a> is waiting</h3>
                    </div>
                    <div class="row">
                        <div class="awe-masonry">
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/1.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Florenze</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Italy</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">845</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/2.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Toluca</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">USA</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">132</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/3.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Venice</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Italy</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2341</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/4.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Ohio</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">USA</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2531</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/5.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Venice</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Italy</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2531</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/6.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Mandives</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Mandives</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2531</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/7.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Istanbul</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Turkey</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2531</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/8.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Bali</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Thailand</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2531</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                            <!-- GALLERY ITEM -->
                            <div class="awe-masonry__item">
                                <a href="#">
                                    <div class="image-wrap image-cover">
                                        <img src="images/img/9.jpg" alt="">
                                    </div>
                                </a>
                                <div class="item-title">
                                    <h2><a href="#">Phu Quoc</a></h2>
                                    <div class="item-cat">
                                        <ul>
                                            <li><a href="#">Vietnam</a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="item-available">
                                    <span class="count">2531</span>
                                    available hotel
                                </div>
                            </div>
                            <!-- END / GALLERY ITEM -->
                        </div>
                    </div>
                    <div class="more-destination">
                        <a href="#">More Destinations</a>
                    </div>
                </div>
            </div>
        </section>
        <!-- END / MASONRY -->


        <section class="sale-flights-section-demo">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="sale-flights-tabs tabs">
                            <ul>
                                <li><a href="#sale-flights-tabs-1">Hot trips</a></li>
                                <li><a href="#sale-flights-tabs-2">Recent items</a></li>
                            </ul>
                            <div class="sale-flights-tabs__content tabs__content">
                                <div id="sale-flights-tabs-1">
                                    
                                    <!-- ITEM -->
                                <div class="trip-item">
                                    <div class="item-media">
                                        <div class="image-cover">
                                            <img src="images/trip/2.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="images/trip.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="item-body">
                                        <div class="item-title">
                                            <h2>
                                                <a href="#">Spectacular City Views</a>
                                            </h2>
                                        </div>
                                        <div class="item-list">
                                            <ul>
                                                <li>4 Attractions</li>
                                                <li>2 days, 1 night</li>
                                            </ul>
                                        </div>
                                        <div class="item-footer">
                                            <div class="item-rate">
                                                <span>7.5 Good</span>
                                            </div>
                                            <div class="item-icon">
                                                <i class="awe-icon awe-icon-gym"></i>
                                                <i class="awe-icon awe-icon-car"></i>
                                                <i class="awe-icon awe-icon-food"></i>
                                                <i class="awe-icon awe-icon-level"></i>
                                                <i class="awe-icon awe-icon-wifi"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item-price-more">
                                        <div class="price">
                                            Adult ticket
                                            <ins>
                                                <span class="amount">$200</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$200</span>
                                            </del>
                                    
                                        </div>
                                        <a href="#" class="awe-btn">Book now</a>
                                    </div>
                                </div>
                                <!-- END / ITEM -->
                                <!-- ITEM -->
                                <div class="trip-item">
                                    <div class="item-media">
                                        <div class="image-cover">
                                            <img src="images/trip/3.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="images/trip.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="item-body">
                                        <div class="item-title">
                                            <h2>
                                                <a href="#">Romantic New York</a>
                                            </h2>
                                        </div>
                                        <div class="item-list">
                                            <ul>
                                                <li>4 Attractions</li>
                                                <li>2 days, 1 night</li>
                                            </ul>
                                        </div>
                                        <div class="item-footer">
                                            <div class="item-rate">
                                                <span>7.5 Good</span>
                                            </div>
                                            <div class="item-icon">
                                                <i class="awe-icon awe-icon-gym"></i>
                                                <i class="awe-icon awe-icon-car"></i>
                                                <i class="awe-icon awe-icon-food"></i>
                                                <i class="awe-icon awe-icon-level"></i>
                                                <i class="awe-icon awe-icon-wifi"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item-price-more">
                                        <div class="price">
                                            Adult ticket
                                            <ins>
                                                <span class="amount">$200</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$200</span>
                                            </del>
                                    
                                        </div>
                                        <a href="#" class="awe-btn">Book now</a>
                                    </div>
                                </div>
                                <!-- END / ITEM -->
                                <!-- ITEM -->
                                <div class="trip-item">
                                    <div class="item-media">
                                        <div class="image-cover">
                                            <img src="images/trip/4.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="images/trip.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="item-body">
                                        <div class="item-title">
                                            <h2>
                                                <a href="#">NYC Family Fun Pass - Winter</a>
                                            </h2>
                                        </div>
                                        <div class="item-list">
                                            <ul>
                                                <li>4 Attractions</li>
                                                <li>2 days, 1 night</li>
                                            </ul>
                                        </div>
                                        <div class="item-footer">
                                            <div class="item-rate">
                                                <span>7.5 Good</span>
                                            </div>
                                            <div class="item-icon">
                                                <i class="awe-icon awe-icon-gym"></i>
                                                <i class="awe-icon awe-icon-car"></i>
                                                <i class="awe-icon awe-icon-food"></i>
                                                <i class="awe-icon awe-icon-level"></i>
                                                <i class="awe-icon awe-icon-wifi"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item-price-more">
                                        <div class="price">
                                            Adult ticket
                                            <ins>
                                                <span class="amount">$200</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$200</span>
                                            </del>
                                    
                                        </div>
                                        <a href="#" class="awe-btn">Book now</a>
                                    </div>
                                </div>
                                <!-- END / ITEM -->
                                <!-- ITEM -->
                                <div class="trip-item">
                                    <div class="item-media">
                                        <div class="image-cover">
                                            <img src="images/trip/5.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="images/trip.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="item-body">
                                        <div class="item-title">
                                            <h2>
                                                <a href="#">NYC Land &amp; Sea</a>
                                            </h2>
                                        </div>
                                        <div class="item-list">
                                            <ul>
                                                <li>4 Attractions</li>
                                                <li>2 days, 1 night</li>
                                            </ul>
                                        </div>
                                        <div class="item-footer">
                                            <div class="item-rate">
                                                <span>7.5 Good</span>
                                            </div>
                                            <div class="item-icon">
                                                <i class="awe-icon awe-icon-gym"></i>
                                                <i class="awe-icon awe-icon-car"></i>
                                                <i class="awe-icon awe-icon-food"></i>
                                                <i class="awe-icon awe-icon-level"></i>
                                                <i class="awe-icon awe-icon-wifi"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item-price-more">
                                        <div class="price">
                                            Adult ticket
                                            <ins>
                                                <span class="amount">$200</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$200</span>
                                            </del>
                                    
                                        </div>
                                        <a href="#" class="awe-btn">Book now</a>
                                    </div>
                                </div>
                                <!-- END / ITEM -->
                                <!-- ITEM -->
                                <div class="trip-item">
                                    <div class="item-media">
                                        <div class="image-cover">
                                            <img src="images/trip/1.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="images/trip.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="item-body">
                                        <div class="item-title">
                                            <h2>
                                                <a href="#">Spectacular City Views</a>
                                            </h2>
                                        </div>
                                        <div class="item-list">
                                            <ul>
                                                <li>4 Attractions</li>
                                                <li>2 days, 1 night</li>
                                            </ul>
                                        </div>
                                        <div class="item-footer">
                                            <div class="item-rate">
                                                <span>7.5 Good</span>
                                            </div>
                                            <div class="item-icon">
                                                <i class="awe-icon awe-icon-gym"></i>
                                                <i class="awe-icon awe-icon-car"></i>
                                                <i class="awe-icon awe-icon-food"></i>
                                                <i class="awe-icon awe-icon-level"></i>
                                                <i class="awe-icon awe-icon-wifi"></i>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="item-price-more">
                                        <div class="price">
                                            Adult ticket
                                            <ins>
                                                <span class="amount">$200</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$200</span>
                                            </del>
                                    
                                        </div>
                                        <a href="#" class="awe-btn">Book now</a>
                                    </div>
                                </div>
                                <!-- END / ITEM -->
                                </div>
                                <div id="sale-flights-tabs-2">
                                    
                                    <table class="sale-flights-tabs__table">
                                        <tbody>
                                            <tr>
                                                <td class="sale-flights-tabs__item-flight">
                                                    <div class="image-wrap">
                                                        <img src="images/thumb/40-40.jpg" alt="">
                                                    </div>
                                                    <div class="td-content">
                                                        <div class="title">
                                                            <h3>Lufthansa</h3>
                                                        </div>
                                                        <ul>
                                                            <li>
                                                                <span class="from">HAN <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">SVO</span>
                                                            </li>
                                                            <li>
                                                                <span class="from">SVO <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">JFK</span>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                    <div class="line"></div>
                                                </td>
                                                <td class="sale-flights-tabs__item-depart">
                                                    <h4>Depart</h4>
                                                    <ul>
                                                        <li>10:25</li>
                                                        <li>10:25</li>
                                                    </ul>
                                                    <div class="line"></div>
                                                </td>
                                                <td class="sale-flights-tabs__item-arrive">
                                                    <h4>Arrive</h4>
                                                    <ul>
                                                        <li>12:30</li>
                                                        <li>12:30</li>
                                                    </ul>
                                                    <div class="line"></div>
                                                </td>
                                                <td class="sale-flights-tabs__item-duration">
                                                    <h4>Duration</h4>
                                                    <ul>
                                                        <li>38h5m</li>
                                                        <li>38h5m</li>
                                                    </ul>
                                                    <div class="line"></div>
                                                </td>
                                                <td class="sale-flights-tabs__item-choose">
                                                    <span class="amount">$5,923</span>
                                                    <a href="#" class="awe-btn">Choose</a>
                                                    <div class="line"></div>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="sale-flights-tabs__item-flight">
                                                    <div class="image-wrap">
                                                        <img src="images/thumb/40-40.jpg" alt="">
                                                    </div>
                                                    <div class="td-content">
                                                        <div class="title">
                                                            <h3>Lufthansa</h3>
                                                        </div>
                                                        <ul>
                                                            <li>
                                                                <span class="from">HAN <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">SVO</span>
                                                            </li>
                                                            <li>
                                                                <span class="from">SVO <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">JFK</span>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td class="sale-flights-tabs__item-depart">
                                                    <h4>Depart</h4>
                                                    <ul>
                                                        <li>10:25</li>
                                                        <li>10:25</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-arrive">
                                                    <h4>Arrive</h4>
                                                    <ul>
                                                        <li>12:30</li>
                                                        <li>12:30</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-duration">
                                                    <h4>Duration</h4>
                                                    <ul>
                                                        <li>38h5m</li>
                                                        <li>38h5m</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-choose">
                                                    <span class="amount">$5,923</span>
                                                    <a href="#" class="awe-btn">Choose</a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="sale-flights-tabs__item-flight">
                                                    <div class="image-wrap">
                                                        <img src="images/thumb/40-40.jpg" alt="">
                                                    </div>
                                                    <div class="td-content">
                                                        <div class="title">
                                                            <h3>Lufthansa</h3>
                                                        </div>
                                                        <ul>
                                                            <li>
                                                                <span class="from">HAN <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">SVO</span>
                                                            </li>
                                                            <li>
                                                                <span class="from">SVO <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">JFK</span>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td class="sale-flights-tabs__item-depart">
                                                    <h4>Depart</h4>
                                                    <ul>
                                                        <li>10:25</li>
                                                        <li>10:25</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-arrive">
                                                    <h4>Arrive</h4>
                                                    <ul>
                                                        <li>12:30</li>
                                                        <li>12:30</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-duration">
                                                    <h4>Duration</h4>
                                                    <ul>
                                                        <li>38h5m</li>
                                                        <li>38h5m</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-choose">
                                                    <span class="amount">$5,923</span>
                                                    <a href="#" class="awe-btn">Choose</a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="sale-flights-tabs__item-flight">
                                                    <div class="image-wrap">
                                                        <img src="images/thumb/40-40.jpg" alt="">
                                                    </div>
                                                    <div class="td-content">
                                                        <div class="title">
                                                            <h3>Lufthansa</h3>
                                                        </div>
                                                        <ul>
                                                            <li>
                                                                <span class="from">HAN <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">SVO</span>
                                                            </li>
                                                            <li>
                                                                <span class="from">SVO <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">JFK</span>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td class="sale-flights-tabs__item-depart">
                                                    <h4>Depart</h4>
                                                    <ul>
                                                        <li>10:25</li>
                                                        <li>10:25</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-arrive">
                                                    <h4>Arrive</h4>
                                                    <ul>
                                                        <li>12:30</li>
                                                        <li>12:30</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-duration">
                                                    <h4>Duration</h4>
                                                    <ul>
                                                        <li>38h5m</li>
                                                        <li>38h5m</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-choose">
                                                    <span class="amount">$5,923</span>
                                                    <a href="#" class="awe-btn">Choose</a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="sale-flights-tabs__item-flight">
                                                    <div class="image-wrap">
                                                        <img src="images/thumb/40-40.jpg" alt="">
                                                    </div>
                                                    <div class="td-content">
                                                        <div class="title">
                                                            <h3>Lufthansa</h3>
                                                        </div>
                                                        <ul>
                                                            <li>
                                                                <span class="from">HAN <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">SVO</span>
                                                            </li>
                                                            <li>
                                                                <span class="from">SVO <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">JFK</span>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td class="sale-flights-tabs__item-depart">
                                                    <h4>Depart</h4>
                                                    <ul>
                                                        <li>10:25</li>
                                                        <li>10:25</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-arrive">
                                                    <h4>Arrive</h4>
                                                    <ul>
                                                        <li>12:30</li>
                                                        <li>12:30</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-duration">
                                                    <h4>Duration</h4>
                                                    <ul>
                                                        <li>38h5m</li>
                                                        <li>38h5m</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-choose">
                                                    <span class="amount">$5,923</span>
                                                    <a href="#" class="awe-btn">Choose</a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td class="sale-flights-tabs__item-flight">
                                                    <div class="image-wrap">
                                                        <img src="images/thumb/40-40.jpg" alt="">
                                                    </div>
                                                    <div class="td-content">
                                                        <div class="title">
                                                            <h3>Lufthansa</h3>
                                                        </div>
                                                        <ul>
                                                            <li>
                                                                <span class="from">HAN <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">SVO</span>
                                                            </li>
                                                            <li>
                                                                <span class="from">SVO <i class="awe-icon awe-icon-arrow-right"></i></span>
                                                                <span class="to">JFK</span>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </td>
                                                <td class="sale-flights-tabs__item-depart">
                                                    <h4>Depart</h4>
                                                    <ul>
                                                        <li>10:25</li>
                                                        <li>10:25</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-arrive">
                                                    <h4>Arrive</h4>
                                                    <ul>
                                                        <li>12:30</li>
                                                        <li>12:30</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-duration">
                                                    <h4>Duration</h4>
                                                    <ul>
                                                        <li>38h5m</li>
                                                        <li>38h5m</li>
                                                    </ul>
                                                </td>
                                                <td class="sale-flights-tabs__item-choose">
                                                    <span class="amount">$5,923</span>
                                                    <a href="#" class="awe-btn">Choose</a>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="awe-services">
                            <h2>Why your friends like our services?</h2>
                            <ul class="awe-services__list">
                                <li>
                                    <a href="#">
                                        <i class="awe-icon awe-icon-check"></i>
                                        <i class="awe-icon awe-icon-arrow-right"></i>
                                        100,000 real deals
                                        <span>No booking fees . No fake</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="awe-icon awe-icon-check"></i>
                                        <i class="awe-icon awe-icon-arrow-right"></i>
                                        100% trusted reviews
                                        <span>We verify them in person</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="awe-icon awe-icon-check"></i>
                                        <i class="awe-icon awe-icon-arrow-right"></i>
                                        24/7 global support
                                        <span>anytime and any where</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="awe-icon awe-icon-check"></i>
                                        <i class="awe-icon awe-icon-arrow-right"></i>
                                        24/7 global support
                                        <span>anytime and any where</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="awe-icon awe-icon-check"></i>
                                        <i class="awe-icon awe-icon-arrow-right"></i>
                                        Manage your bookings online
                                        <span>anytime and any where</span>
                                    </a>
                                </li>
                            </ul>
                            <div class="video-wrapper embed-responsive embed-responsive-16by9">
                                <iframe class="embed-responsive-item" src="https://player.vimeo.com/video/50880604"></iframe>
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
    <script type="text/javascript" src="js/lib/theia-sticky-sidebar.js"></script>
    <script type="text/javascript" src="js/lib/jquery.magnific-popup.min.js"></script>
    <script type='text/javascript' src="js/lib/jquery-ui.js"></script>
    <script type="text/javascript" src="js/scripts.js"></script>

    <!-- REVOLUTION DEMO -->
    <script type="text/javascript" src="revslider-demo/js/jquery.themepunch.revolution.min.js"></script>
    <script type="text/javascript" src="revslider-demo/js/jquery.themepunch.tools.min.js"></script>
    <script type="text/javascript">
        if($('#slider-revolution').length) {
            $('#slider-revolution').show().revolution({
                ottedOverlay:"none",
                delay:10000,
                startwidth:1600,
                startheight:650,
                hideThumbs:200,

                thumbWidth:100,
                thumbHeight:50,
                thumbAmount:5,
                
                                        
                simplifyAll:"off",

                navigationType:"none",
                navigationArrows:"solo",
                navigationStyle:"preview4",

                touchenabled:"on",
                onHoverStop:"on",
                nextSlideOnWindowFocus:"off",

                swipe_threshold: 0.7,
                swipe_min_touches: 1,
                drag_block_vertical: false,
                
                parallax:"mouse",
                parallaxBgFreeze:"on",
                parallaxLevels:[7,4,3,2,5,4,3,2,1,0],
                                        
                                        
                keyboardNavigation:"off",

                navigationHAlign:"center",
                navigationVAlign:"bottom",
                navigationHOffset:0,
                navigationVOffset:20,

                soloArrowLeftHalign:"left",
                soloArrowLeftValign:"center",
                soloArrowLeftHOffset:20,
                soloArrowLeftVOffset:0,

                soloArrowRightHalign:"right",
                soloArrowRightValign:"center",
                soloArrowRightHOffset:20,
                soloArrowRightVOffset:0,

                shadow:0,
                fullWidth:"on",
                fullScreen:"off",

                spinner:"spinner2",
                                        
                stopLoop:"off",
                stopAfterLoops:-1,
                stopAtSlide:-1,

                shuffle:"off",

                autoHeight:"off",
                forceFullWidth:"off",
                
                
                
                hideThumbsOnMobile:"off",
                hideNavDelayOnMobile:1500,
                hideBulletsOnMobile:"off",
                hideArrowsOnMobile:"off",
                hideThumbsUnderResolution:0,

                hideSliderAtLimit:0,
                hideCaptionAtLimit:0,
                hideAllCaptionAtLilmit:0,
                startWithSlide:0
            });
        }
    </script>

</body>
</html>