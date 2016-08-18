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
    <link rel="stylesheet" type="text/css" href="../css/lib/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/awe-booking-font.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="../css/lib/jquery-ui.css">

    <!-- MAIN STYLE -->
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/demo.css">
    
    <!-- CSS COLOR -->
    <link id="colorreplace" rel="stylesheet" type="text/css" href="../css/colors/blue.css">
    
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
                        <a href="index.html"><img src="../images/logo.png" alt=""></a>
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
                            <li class="menu-item-has-children current-menu-parent">
                                <a href="destinations-list.html">Destinations</a>
                                
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
        
        <section class="travelling-block-section-demo awe-parallax">
            <div class="container">
                <div class="travelling-block text-center">
                    <div class="title">
                        <h2>I am travelling for</h2>
                    </div>
                    <div class="travelling-tabs tabs">
                        <ul>
                            <li><a href="#tabs-1">Purpose</a></li>
                            <li><a href="#tabs-2">Region</a></li>
                            <li><a href="#tabs-3">Price</a></li>
                            <li><a href="#tabs-4">Time</a></li>
                            <li><a href="#tabs-5">Advance Filter</a></li>
                        </ul>
                        <div class="travelling-tabs__content">
                            <div id="tabs-1">
                                <div class="purpose-slider">
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-food"></i>
                                            <span>Foodie &amp; Culinary</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-bag"></i>
                                            <span>Fashion &amp; Shopping</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-music"></i>
                                            <span>Music &amp; Festival</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-culture"></i>
                                            <span>History &amp; Culture</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-nature"></i>
                                            <span>Sports &amp; Nature</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-entertain"></i>
                                            <span>Entertain &amp; Gamble</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-briefcase-plus"></i>
                                            <span>Health &amp; Beauty</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-food"></i>
                                            <span>Foodie &amp; Culinary</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-bag"></i>
                                            <span>Fashion &amp; Shopping</span>
                                        </a>
                                    </div>
                                </div>
                            </div>

                            <div id="tabs-2">
                                <div class="travelling-tabs__region">
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-north-america"></i>
                                            <span>North America</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-south-america"></i>
                                            <span>South America</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-europe"></i>
                                            <span>Europe</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-australia"></i>
                                            <span>Australia</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-asia"></i>
                                            <span>Asia</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-antarctica"></i>
                                            <span>Antarctica</span>
                                        </a>
                                    </div>
                                    <div class="item">
                                        <a href="#">
                                            <i class="awe-icon awe-icon-africa"></i>
                                            <span>Africa</span>
                                        </a>
                                    </div>
                                </div>
                            </div>

                            <div id="tabs-3">
                                <div class="travelling-tabs__price">
                                    <div class="budget-level">
                                        <label>Budget level</label>
                                        <div class="price-slider-wrapper">
                                            <div class="price-slider"></div>
                                            <div class="price_slider_amount">
                                                <div class="price_label">
                                                    <span class="from"></span> - <span class="to"></span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="currency">
                                        <label>Currency</label>
                                        <div class="select-item">
                                            <select class="awe-select">
                                                <option>$ - US Dollar </option>
                                                <option>$ - US Dollar </option>
                                            </select>
                                        </div>
                                        <span>Currency you want to use</span>
                                    </div>
                                </div>
                            </div>

                            <div id="tabs-4">
                                <div class="travelling-tabs__time">
                                    <div class="season">
                                        <div class="item spring">
                                            <a href="#">
                                                <i class="awe-icon awe-icon-spring"></i>
                                                <span>Spring</span>
                                            </a>
                                        </div>
                                        <div class="item summer">
                                            <a href="#">
                                                <i class="awe-icon awe-icon-summer"></i>
                                                <span>Summer</span>
                                            </a>
                                        </div>
                                        <div class="item autumn">
                                            <a href="#">
                                                <i class="awe-icon awe-icon-autumn"></i>
                                                <span>Autumn</span>
                                            </a>
                                        </div>
                                        <div class="item winter">
                                            <a href="#">
                                                <i class="awe-icon awe-icon-winter"></i>
                                                <span>Winter</span>
                                            </a>
                                        </div>
                                    </div>
                                    <div class="month">
                                        <div class="item jan" data-season="spring">
                                            <a href="#">Jan</a>
                                        </div>
                                        <div class="item feb" data-season="spring">
                                            <a href="#">Feb</a>
                                        </div>
                                        <div class="item mar" data-season="spring">
                                            <a href="#">Mar</a>
                                        </div>
                                        <div class="item apr" data-season="summer">
                                            <a href="#">Apr</a>
                                        </div>
                                        <div class="item may" data-season="summer">
                                            <a href="#">May</a>
                                        </div>
                                        <div class="item jun" data-season="summer">
                                            <a href="#">Jun</a>
                                        </div>
                                        <div class="item jul" data-season="autumn">
                                            <a href="#">Jul</a>
                                        </div>
                                        <div class="item aug" data-season="autumn">
                                            <a href="#">Aug</a>
                                        </div>
                                        <div class="item sep" data-season="autumn">
                                            <a href="#">Sep</a>
                                        </div>
                                        <div class="item oct" data-season="winter">
                                            <a href="#">Oct</a>
                                        </div>
                                        <div class="item nov" data-season="winter">
                                            <a href="#">Nov</a>
                                        </div>
                                        <div class="item dec" data-season="winter">
                                            <a href="#">Dec</a>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div id="tabs-5">
                                <div class="travelling-tabs__advance-filter">
                                    <div class="form-group">
                                        <div class="form-elements from">
                                            <label>From</label>
                                            <div class="form-item">
                                                <i class="awe-icon awe-icon-marker-1"></i>
                                                <input type="text" value="Ho Chi Minh, Hanoi, Vietnam">
                                            </div>
                                        </div>
                                        <div class="form-elements to">
                                            <label>To</label>
                                            <div class="form-item">
                                                <i class="awe-icon awe-icon-marker-1"></i>
                                                <input type="text" value="Ankara, Turkey">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-elements form-checkin">
                                            <label>Depart on</label>
                                            <div class="form-item">
                                                <i class="awe-icon awe-icon-calendar"></i>
                                                <input type="text" class="awe-calendar" value="Check in">
                                            </div>
                                        </div>
                                        <div class="form-elements form-checkout">
                                            <label>Return on</label>
                                            <div class="form-item">
                                                <i class="awe-icon awe-icon-calendar"></i>
                                                <input type="text" class="awe-calendar" value="Check out">
                                            </div>
                                        </div>
                                        <div class="form-elements form-references">
                                            <label>References</label>
                                            <div class="select-item">
                                                <select class="awe-select">
                                                    <option>For business</option>
                                                    <option>For business</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-elements budget-level">
                                            <label>Budget level</label>
                                            <div class="price-slider-wrapper">
                                                <div class="price-slider"></div>
                                                <div class="price_slider_amount">
                                                    <div class="price_label">
                                                        <span class="from"></span> - <span class="to"></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="form-elements currency">
                                            <label>Currency</label>
                                            <div class="select-item">
                                                <select class="awe-select">
                                                    <option>All types</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="your-destinations-section-demo">
            <div class="container">
                <div class="your-destinations">
                    <div class="your-destionations__top">
                        <div class="title">
                            <h2>Your Destinations</h2>
                        </div>
                        <div class="your-destinations__bar">
                            <div class="view-switcher">
                                <div class="view-item view-active">
                                    <a href="destinations-list.html">
                                        <i class="awe-icon awe-icon-list"></i>
                                    </a>
                                </div>
                                <div class="view-item">
                                    <a href="destinations-grid.html">
                                        <i class="awe-icon awe-icon-grid"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="order">
                                <select class="orderby awe-select">
                                    <option>Best Match</option>
                                </select>
                            </div>
                        </div>
                    </div>

                    <div class="destination-list__content">
                        <!-- ITEM -->
                        <div class="destinations-item">
                            <div class="item-media">
                                <div class="image-cover">
                                    <img src="../../images/img/2.jpg" alt="">
                                </div>
                                <div class="item-cat">
                                    <ul>
                                        <li><a href="#">Capiz, Panay island</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-body">
                                <div class="item-title">
                                    <h2>
                                        <a href="#">Boracay Island</a>
                                    </h2>
                                </div>
                                <div class="item-description">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam</p>
                                </div>
                                <div class="item-footer">
                                    <ul>
                                        <li>
                                            <h6>Flight</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-plane"></i>
                                                <span class="count">089</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Train</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-train"></i>
                                                <span class="count">589</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Hotel</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-hotel"></i>
                                                <span class="count">8632</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Attraction</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-attraction"></i>
                                                <span class="count">25</span>
                                            </p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-price-more">
                                <div class="price">
                                    one night from
                                    <span class="amount">$200</span>
                                </div>
                                <a href="#" class="awe-btn">more</a>
                            </div>
                        </div>
                        <!-- END / ITEM -->
                        <!-- ITEM -->
                        <div class="destinations-item">
                            <div class="item-media">
                                <div class="image-cover">
                                    <img src="../images/img/3.jpg" alt="">
                                </div>
                                <div class="item-cat">
                                    <ul>
                                        <li><a href="#">Puerto Princesa, Palawan</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-body">
                                <div class="item-title">
                                    <h2>
                                        <a href="#">El Nido Islands</a>
                                    </h2>
                                </div>
                                <div class="item-description">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam</p>
                                </div>
                                <div class="item-footer">
                                    <ul>
                                        <li>
                                            <h6>Flight</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-plane"></i>
                                                <span class="count">089</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Train</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-train"></i>
                                                <span class="count">589</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Hotel</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-hotel"></i>
                                                <span class="count">8632</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Attraction</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-attraction"></i>
                                                <span class="count">25</span>
                                            </p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-price-more">
                                <div class="price">
                                    one night from
                                    <span class="amount">$200</span>
                                </div>
                                <a href="#" class="awe-btn">more</a>
                            </div>
                        </div>
                        <!-- END / ITEM -->
                        <!-- ITEM -->
                        <div class="destinations-item">
                            <div class="item-media">
                                <div class="image-cover">
                                    <img src="../images/img/4.jpg" alt="">
                                </div>
                                <div class="item-cat">
                                    <ul>
                                        <li><a href="#">Ilcoso Sur</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-body">
                                <div class="item-title">
                                    <h2>
                                        <a href="#">Vigan</a>
                                    </h2>
                                </div>
                                <div class="item-description">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam</p>
                                </div>
                                <div class="item-footer">
                                    <ul>
                                        <li>
                                            <h6>Flight</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-plane"></i>
                                                <span class="count">089</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Train</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-train"></i>
                                                <span class="count">589</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Hotel</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-hotel"></i>
                                                <span class="count">8632</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Attraction</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-attraction"></i>
                                                <span class="count">25</span>
                                            </p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-price-more">
                                <div class="price">
                                    one night from
                                    <span class="amount">$200</span>
                                </div>
                                <a href="#" class="awe-btn">more</a>
                            </div>
                        </div>
                        <!-- END / ITEM -->
                        <!-- ITEM -->
                        <div class="destinations-item">
                            <div class="item-media">
                                <div class="image-cover">
                                    <img src="../images/img/5.jpg" alt="">
                                </div>
                                <div class="item-cat">
                                    <ul>
                                        <li><a href="#">Baguio</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-body">
                                <div class="item-title">
                                    <h2>
                                        <a href="#">Baguio City</a>
                                    </h2>
                                </div>
                                <div class="item-description">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam</p>
                                </div>
                                <div class="item-footer">
                                    <ul>
                                        <li>
                                            <h6>Flight</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-plane"></i>
                                                <span class="count">089</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Train</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-train"></i>
                                                <span class="count">589</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Hotel</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-hotel"></i>
                                                <span class="count">8632</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Attraction</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-attraction"></i>
                                                <span class="count">25</span>
                                            </p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-price-more">
                                <div class="price">
                                    one night from
                                    <span class="amount">$200</span>
                                </div>
                                <a href="#" class="awe-btn">more</a>
                            </div>
                        </div>
                        <!-- END / ITEM -->
                        <!-- ITEM -->
                        <div class="destinations-item">
                            <div class="item-media">
                                <div class="image-cover">
                                    <img src="../images/img/6.jpg" alt="">
                                </div>
                                <div class="item-cat">
                                    <ul>
                                        <li><a href="#">Mindoro</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-body">
                                <div class="item-title">
                                    <h2>
                                        <a href="#">Puerto Galera White Beaches</a>
                                    </h2>
                                </div>
                                <div class="item-description">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam</p>
                                </div>
                                <div class="item-footer">
                                    <ul>
                                        <li>
                                            <h6>Flight</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-plane"></i>
                                                <span class="count">089</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Train</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-train"></i>
                                                <span class="count">589</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Hotel</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-hotel"></i>
                                                <span class="count">8632</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Attraction</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-attraction"></i>
                                                <span class="count">25</span>
                                            </p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-price-more">
                                <div class="price">
                                    one night from
                                    <span class="amount">$200</span>
                                </div>
                                <a href="#" class="awe-btn">more</a>
                            </div>
                        </div>
                        <!-- END / ITEM -->
                        <!-- ITEM -->
                        <div class="destinations-item">
                            <div class="item-media">
                                <div class="image-cover">
                                    <img src="../images/img/7.jpg" alt="">
                                </div>
                                <div class="item-cat">
                                    <ul>
                                        <li><a href="#">Cebu City</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-body">
                                <div class="item-title">
                                    <h2>
                                        <a href="#">Oslo island</a>
                                    </h2>
                                </div>
                                <div class="item-description">
                                    <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam</p>
                                </div>
                                <div class="item-footer">
                                    <ul>
                                        <li>
                                            <h6>Flight</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-plane"></i>
                                                <span class="count">089</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Train</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-train"></i>
                                                <span class="count">589</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Hotel</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-hotel"></i>
                                                <span class="count">8632</span>
                                            </p>
                                        </li>
                                        <li>
                                            <h6>Attraction</h6>
                                            <p>
                                                <i class="awe-icon awe-icon-attraction"></i>
                                                <span class="count">25</span>
                                            </p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="item-price-more">
                                <div class="price">
                                    one night from
                                    <span class="amount">$200</span>
                                </div>
                                <a href="#" class="awe-btn">more</a>
                            </div>
                        </div>
                        <!-- END / ITEM -->
                    </div>


                    <!-- PAGINATION -->
                    <div class="page__pagination text-center">
                        <span class="pagination-prev"><i class="fa fa-caret-left"></i></span>
                        <span class="current">1</span>
                        <a href="#">2</a>
                        <a href="#">3</a>
                        <a href="#">4</a>
                        <a href="#" class="pagination-next"><i class="fa fa-caret-right"></i></a>
                    </div>
                    <!-- END / PAGINATION -->
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
                                <img src="../images/logo-footer.png" alt="">
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
    <script type="text/javascript" src="../js/lib/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="../js/lib/masonry.pkgd.min.js"></script>
    <script type="text/javascript" src="../js/lib/jquery.parallax-1.1.3.js"></script>
    <script type="text/javascript" src="../js/lib/jquery.owl.carousel.js"></script>
    <script type='text/javascript' src="../js/lib/jquery-ui.js"></script>
    <script type="text/javascript" src="../js/scripts.js"></script>
</body>
</html>