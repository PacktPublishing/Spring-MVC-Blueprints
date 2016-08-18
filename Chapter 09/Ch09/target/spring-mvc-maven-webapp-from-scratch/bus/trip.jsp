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
                            <li class="menu-item-has-children">
                                <a href="destinations-list.html">Destinations</a>
                                <ul class="sub-menu">
                                    <li><a href="destinations-list.html">List</a></li>
                                    
                                </ul>
                            </li>
                            <li class="menu-item-has-children current-menu-parent">
                                <a href="trip.html">Trips</a>
                                <ul class="sub-menu">
                                    <li class="current-menu-item"><a href="trip.html">Trips</a></li>
                                    
                                </ul>
                            </li>
                            
                            <li class="menu-item-has-children current-menu-parent">
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

        <!-- HEADING PAGE -->
        <section class="awe-parallax category-heading-section-demo">
            <div class="awe-overlay"></div>
            <div class="container">
                <div class="category-heading-content category-heading-content__2 text-uppercase">
                    <!-- BREADCRUMB -->
                    <div class="breadcrumb">
                        <ul>
                            <li><a href="#">Home</a></li>
                            <li><span>Trips</span></li>
                        </ul>
                    </div>
                    <!-- BREADCRUMB -->
                    <div class="find">
                        <h2 class="text-center">Find Your Trip</h2>
                        <form>
                            <div class="form-group">
                                <div class="form-elements">
                                    <label>Location</label>
                                    <div class="form-item">
                                        <i class="awe-icon awe-icon-marker-1"></i>
                                        <input type="text">
                                    </div>
                                </div>
                                <div class="form-elements">
                                    <label>Check in</label>
                                    <div class="form-item">
                                        <i class="awe-icon awe-icon-calendar"></i>
                                        <input type="text" class="awe-calendar" value="Date">
                                    </div>
                                </div>
                                <div class="form-elements">
                                    <label>Check out</label>
                                    <div class="form-item">
                                        <i class="awe-icon awe-icon-calendar"></i>
                                        <input type="text" class="awe-calendar" value="Date">
                                    </div>
                                </div>
                                <div class="form-elements">
                                    <label>Budget</label>
                                    <div class="form-item">
                                        <select class="awe-select">
                                            <option>All types</option>
                                            <option>1</option>
                                            <option>2</option>
                                            <option>3</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="form-actions">
                                    <input type="submit" value="Find My Trip">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <!-- END / HEADING PAGE -->

        
        <section class="filter-page">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="page-top">
                            <select class="awe-select">
                                <option>Best Match</option>
                                <option>Best Rate</option>
                            </select>
                        </div>
                    </div>
                    <div class="col-md-9 col-md-push-3">
                        <div class="filter-page__content">
                            <div class="filter-item-wrapper">
                                <!-- ITEM -->
                                <div class="trip-item">
                                    <div class="item-media">
                                        <div class="image-cover">
                                            <img src="../images/trip/1.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="../images/trip.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="item-body">
                                        <div class="item-title">
                                            <h2>
                                                <a href="#">All Around Town Tour by City Sights</a>
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
                                            <img src="../images/trip/2.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="../images/trip.jpg" alt="">
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
                                            <img src="../images/trip/3.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="../images/trip.jpg" alt="">
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
                                            <img src="../images/trip/4.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="../images/trip.jpg" alt="">
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
                                            <img src="../images/trip/5.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="../images/trip.jpg" alt="">
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
                                            <img src="../images/trip/1.jpg" alt="">
                                        </div>
                                        <div class="trip-icon">
                                            <img src="../images/trip.jpg" alt="">
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


                            <!-- PAGINATION -->
                            <div class="page__pagination">
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
                    <div class="col-md-3 col-md-pull-9">
                        <div class="page-sidebar">
                            <div class="sidebar-title">
                                <h2>Trip</h2>
                                <div class="clear-filter">
                                    <a href="#">Clear all</a>
                                </div>
                            </div>
                            <!-- WIDGET -->
                            <div class="widget widget_has_radio_checkbox">
                                <h3>Trip Type</h3>
                                <ul>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Amusement park
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Natural sight-seeing
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Pool &amp; Waterpark
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Museum
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Religious and Cultural place
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Shoping mall &amp; Market
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Others
                                        </label>
                                    </li>
                                </ul>
                            </div>
                            <!-- END / WIDGET -->

                            <!-- WIDGET -->
                            <div class="widget widget_price_filter">
                                <h3>Price Level</h3>
                                <div class="price-slider-wrapper">
                                    <div class="price-slider"></div>
                                    <div class="price_slider_amount">
                                        <div class="price_label">
                                            <span class="from"></span> - <span class="to"></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- END / WIDGET -->

                            <!-- WIDGET -->
                            <div class="widget widget_has_radio_checkbox">
                                <h3>Star Rating</h3>
                                <ul>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            <span class="rating">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            <span class="rating">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            <span class="rating">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            <span class="rating">
                                                <i class="fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            <span class="rating">
                                                <i class="fa fa-star"></i>
                                            </span>
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            <span class="rating">
                                                Unrated
                                            </span>
                                        </label>
                                    </li>
                                </ul>
                            </div>
                            <!-- END / WIDGET -->

                            <!-- WIDGET -->
                            <div class="widget widget_has_radio_checkbox">
                                <h3>Distance</h3>
                                <ul>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Near Airport
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Near Shopping District
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Near Attractions
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Near Traffic station
                                        </label>
                                    </li>
                                </ul>
                            </div>
                            <!-- END / WIDGET -->

                            <!-- WIDGET -->
                            <div class="widget widget_has_radio_checkbox">
                                <h3>Service Include</h3>
                                <ul>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Room service
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Laundry
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Meal at room
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Wifi &amp; internet
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Parking lot
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            TV and appliances
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Pool
                                        </label>
                                    </li>
                                    <li>
                                        <label>
                                            <input type="checkbox">
                                            <i class="awe-icon awe-icon-check"></i>
                                            Gym and Spa
                                        </label>
                                    </li>
                                </ul>
                            </div>
                            <!-- END / WIDGET -->

                            <!-- WIDGET -->
                            <div class="widget widget_product_tag_cloud">
                                <h3>Tags</h3>
                                <div class="tagcloud">
                                    <a href="#">Hotel</a>
                                    <a href="#">Motel</a>
                                    <a href="#">Hostel</a>
                                    <a href="#">Homestay</a>
                                </div>
                            </div>
                            <!-- END / WIDGET -->

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