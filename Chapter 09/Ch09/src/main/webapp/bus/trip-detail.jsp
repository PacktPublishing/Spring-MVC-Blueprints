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
                                    <li><a href="trip.html">Trips</a></li>
                                    <li class="current-menu-item"><a href="trip-detail.html">Trips Detail</a></li>
                                    
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

        <!-- BREADCRUMB -->
        <section>
            <div class="container">
                <div class="breadcrumb">
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Destinations</a></li>
                        <li><a href="#">North America</a></li>
                        <li><a href="#">USA</a></li>
                        <li><span>NewYork</span></li>
                    </ul>
                </div>
            </div>
        </section>
        <!-- BREADCRUMB -->

        
        <section class="product-detail">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div class="product-detail__info">
                            <div class="product-title">
                                <h2>Shop, Hop, and Top (4 Day Value Package)</h2>
                            </div>
                            <div class="product-address">
                                <span>9579 Wishing Mount, Wynot, ND,  US. | +1-888-8765-1234</span>
                            </div>
                            <div class="product-email">
                                <i class="fa fa-envelope"></i>
                                <a href="#">Send Email Inquiry</a>
                            </div>

                            <div class="trips">
                                <div class="item">
                                    <h6>Sights and Stops</h6>
                                    <p><i class="awe-icon awe-icon-attraction"></i>78</p>
                                </div>
                                <div class="item">
                                    <h6>Time length</h6>
                                    <p><i class="fa fa-clock-o"></i>4 days 3 nights</p>
                                </div>
                                <div class="item">
                                    <h6>Type</h6>
                                    <p>Long duration</p>
                                </div>
                                <div class="item">
                                    <h6>Transport includes</h6>
                                    <p>Bus, car, plane, boat</p>
                                </div>
                                <div class="item">
                                    <h6>Language spoken</h6>
                                    <p title="English, Germans, Italy,  Vienamese">English, Germans, Italy,  Vienamese</p>
                                </div>
                            </div>

                            <!-- <div class="rating-trip-reviews">
                                <div class="item good">
                                    <span class="count">7.5</span>
                                    <h6>Average rating</h6>
                                    <p>Good</p>
                                </div>
                                <div class="item">
                                    <h6>TripAdvisor ></h6>
                                    <img src="../images/trips.png" alt="">
                                </div>
                                <div class="item">
                                    <h6>Reviews</h6>
                                    <p>No review yet</p>
                                </div>
                            </div> -->

                            <table class="ticket-price">
                                <thead>
                                    <tr>
                                        <th class="ticket-price"><p>Ticket Price :</p></th>
                                        <th class="adult"><span>Adult</span></th>
                                        <th class="kid"><span>Kid</span></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="ticket-price">
                                            <em>* Vouchers valid for 12 months after purchase.</em>
                                        </td>
                                        <td class="adult">
                                            <ins>
                                                <span class="amount">$109</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$119.00</span>
                                            </del>
                                        </td>
                                        <td class="kid">
                                            <ins>
                                                <span class="amount">$80</span>
                                            </ins>
                                            <del>
                                                <span class="amount">$119.00</span>
                                            </del>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>

                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="product-detail__gallery">
                            <div class="product-slider-wrapper">
                                <div class="product-slider">
                                    <div class="item">
                                        <img src="../images/img/1.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/2.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/3.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/4.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/5.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/6.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/7.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/8.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/9.jpg" alt="">
                                    </div>
                                    <div class="item">
                                        <img src="../images/img/10.jpg" alt="">
                                    </div>
                                </div>
                                <div class="product-slider-thumb-row">
                                    <div class="product-slider-thumb">
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-1.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-2.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-3.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-4.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-5.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-1.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-2.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-3.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-4.jpg" alt="">
                                        </div>
                                        <div class="item">
                                            <img src="../images/img/demo-thumb-5.jpg" alt="">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-9">
                        <div class="product-tabs tabs">
                            <ul>
                                <li>
                                    <a href="#tabs-1">Trip schedule</a>
                                </li>
                                <li>
                                    <a href="#tabs-2">Good to know</a>
                                </li>
                                <li>
                                    <a href="#tabs-3">Review &amp; rating</a>
                                </li>
                            </ul>
                            <div class="product-tabs__content">
                                <div id="tabs-1">
                                    <div class="trip-schedule-accordion accordion">
                                        <h3>Day 1 : Downtown Tour</h3>
                                        <div>
                                            <div class="tour-map-wrapper">
                                                <div class="tour-map">
                                                    <div data-latlong="21.036697, 105.834871"></div>
                                                </div>

                                                <div class="trips">
                                                    <div class="item">
                                                        <h6>Sights and Stops</h6>
                                                        <p><i class="awe-icon awe-icon-attraction"></i>26</p>
                                                    </div>
                                                    <div class="item">
                                                        <h6>Time length</h6>
                                                        <p><i class="fa fa-clock-o"></i>2 hours</p>
                                                    </div>
                                                </div>
                                                <br>
                                                <h6>Departure time</h6>
                                                <p>Departs: 08:00 am - 6:00 pm (Every 25-30 minutes)</p>
                                                <p>Citysights NY Visitor Center (in lobby of Madame Tussauds) 234 W.42nd st. Times Square and 8th Avenue between 49th and 50th Streets, New York, NY 10018</p>
                                            </div>
                                            <br>
                                            <p>Get on and go places! If you want to hit the most-visited spots in New York City, this is the one: CitySights NY’s Downtown Tour. You’ll get easy access to the most popular sites in town: the Statue of Liberty, the Empire State Building and “Ground Zero,” where the World Trade Center once stood and where a stunning new skyscraper soars today. Narrated by licensed NYC tour guides who know the city inside and out, this hop on/hop off excursion on a double-decker bus takes you through Greenwich Village, Little Italy, Chinatown, Wall Street and the Financial District, Battery Park City, South Street Seaport, the Lower East Side, along with Rockefeller Center, the United Nations building, Carnegie Hall, the Broadway theater district and more.</p>
                                            <p>Get on and go places! If you want to hit the most-visited spots in New York City, this is the one: CitySights NY’s Downtown Tour. You’ll get easy access to the most popular sites in town: the Statue of Liberty, the Empire State Building and “Ground Zero,” where the World Trade Center once stood and where a stunning new skyscraper soars today. Narrated by licensed NYC tour guides who know the city inside and out, this hop on/hop off excursion on a double-decker bus takes you through Greenwich Village, Little Italy, Chinatown, Wall Street and the Financial District, Battery Park City, South Street Seaport, the Lower East Side, along with Rockefeller Center, the United Nations building, Carnegie Hall, the Broadway theater district and more.</p>
                                        </div>
                                        <h3>Day 2 : Uptown Treasures &amp; Harlem Tour</h3>
                                        <div>
                                            <p>
                                            Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet
                                            purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor
                                            velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In
                                            suscipit faucibus urna.
                                            </p>
                                        </div>
                                        <h3>Day 3 : Chinatown</h3>
                                        <div>
                                            <p>
                                            Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis.
                                            Phasellus pellentesque purus in massa. Aenean in pede. Phasellus ac libero
                                            ac tellus pellentesque semper. Sed ac felis. Sed commodo, magna quis
                                            lacinia ornare, quam ante aliquam nisi, eu iaculis leo purus venenatis dui.
                                            </p>
                                            <ul>
                                                <li>List item one</li>
                                                <li>List item two</li>
                                                <li>List item three</li>
                                            </ul>
                                        </div>
                                        <h3>Day 4 : Parks &amp; Bridges</h3>
                                        <div>
                                            <p>
                                            Cras dictum. Pellentesque habitant morbi tristique senectus et netus
                                            et malesuada fames ac turpis egestas. Vestibulum ante ipsum primis in
                                            faucibus orci luctus et ultrices posuere cubilia Curae; Aenean lacinia
                                            mauris vel est.
                                            </p>
                                            <p>
                                            Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus.
                                            Class aptent taciti sociosqu ad litora torquent per conubia nostra, per
                                            inceptos himenaeos.
                                            </p>
                                        </div>
                                    </div>
                                </div>

                                <div id="tabs-2">
                                    <table class="good-to-know-table">
                                        <tbody>
                                            <tr>
                                                <th>
                                                    <p>Check in</p>
                                                </th>
                                                <td>
                                                    <p>From 15:00 hours</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Check out</p>
                                                </th>
                                                <td>
                                                    <p>Until 11:00 hours</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Cancellation / prepayment</p>
                                                </th>
                                                <td>
                                                    <p>Cancellation and prepayment policies vary according to room type. Please check the room conditions when selecting your room above.</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Children and extra beds</p>
                                                </th>
                                                <td>
                                                    <p>The maximum number of children’s cots/cribs in a room is 1.</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Internet</p>
                                                </th>
                                                <td>
                                                    <p>free! WiFi is available in all areas and is free of charge.</p>
                                                    <p><span class="light">Free</span>children under 2 years stay free of charge when using existing beds.</p>
                                                    <p><span class="light">Free</span>children under 2 years stay free of charge when using existing beds.</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Pets</p>
                                                </th>
                                                <td>
                                                    <p>Pets are allowed. Charges may be applicable.</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Groups</p>
                                                </th>
                                                <td>
                                                    <p>When booking for more than 11 persons, different policies and additional supplements may apply.</p>
                                                </td>
                                            </tr>
                                            <tr>
                                                <th>
                                                    <p>Accepted cards for payment</p>
                                                </th>
                                                <td>
                                                    <p><img src="../images/paypal2.png" alt=""></p>
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div id="tabs-3">
                                    <div id="reviews">
                                        <div class="rating-info">
                                            <div class="average-rating-review good">
                                                <span class="count">7.5</span>
                                                <em>Average rating</em>
                                                <span>Good</span>
                                            </div>
                                            <ul class="rating-review">
                                                <li>
                                                    <em>Facility</em>
                                                    <span>7.5</span>
                                                </li>
                                                <li>
                                                    <em>Human</em>
                                                    <span>9.0</span>
                                                </li>
                                                <li>
                                                    <em>Service</em>
                                                    <span>9.5</span>
                                                </li>
                                                <li>
                                                    <em>Interesting</em>
                                                    <span>8.7</span>
                                                </li>
                                            </ul>
                                            <a href="#" class="write-review">Write a review</a>
                                        </div>
                                        <div id="add_review">
                                            <h3 class="comment-reply-title">Add a review</h3>
                                            <form>
                                                <div class="comment-form-author">
                                                    <label for="author">Name <span class="required">*</span></label>
                                                    <input id="author" type="text">
                                                </div>
                                                <div class="comment-form-email">
                                                    <label for="email">Email <span class="required">*</span></label>
                                                    <input id="email" type="text">
                                                </div>
                                                <div class="comment-form-rating">
                                                    <h4>Your Rating</h4>
                                                    <div class="comment-form-rating__content">
                                                        <div class="item facility">
                                                            <label>Facility</label>
                                                            <select class="awe-select">
                                                                <option>5.0</option>
                                                                <option>6.5</option>
                                                                <option>7.5</option>
                                                                <option>8.5</option>
                                                                <option>9.0</option>
                                                                <option>10</option>
                                                            </select>
                                                        </div>
                                                        <div class="item human">
                                                            <label>Human</label>
                                                            <select class="awe-select">
                                                                <option>5.0</option>
                                                                <option>6.5</option>
                                                                <option>7.5</option>
                                                                <option>8.5</option>
                                                                <option>9.0</option>
                                                                <option>10</option>
                                                            </select>
                                                        </div>
                                                        <div class="item service">
                                                            <label>Service</label>
                                                            <select class="awe-select">
                                                                <option>5.0</option>
                                                                <option>6.5</option>
                                                                <option>7.5</option>
                                                                <option>8.5</option>
                                                                <option>9.0</option>
                                                                <option>10</option>
                                                            </select>
                                                        </div>
                                                        <div class="item interesting">
                                                            <label>Interesting</label>
                                                            <select class="awe-select">
                                                                <option>5.0</option>
                                                                <option>6.5</option>
                                                                <option>7.5</option>
                                                                <option>8.5</option>
                                                                <option>9.0</option>
                                                                <option>10</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="comment-form-comment">
                                                    <label for="comment">Your Review</label>
                                                    <textarea id="comment"></textarea>
                                                </div>
                                                <div class="form-submit">
                                                    <input type="submit" class="submit" value="Submit">
                                                </div>
                                            </form>
                                        </div>
                                        <div id="comments">
                                            <ol class="commentlist">
                                                <li>
                                                    <div class="comment-box">
                                                        <div class="avatar">
                                                            <img src="../images/img/demo-thumb.jpg" alt="">
                                                        </div>
                                                        <div class="comment-body">
                                                            <p class="meta">
                                                                <strong>Nguyen Gallahendahry</strong>
                                                                <span class="time">December 10, 2012</span>
                                                            </p>
                                                            <div class="description">
                                                                <p>Takes me back to my youth. I love the design of this soda machine. A bit pricy though..!</p>
                                                            </div>

                                                            <div class="rating-info">
                                                                <div class="average-rating-review good">
                                                                    <span class="count">7.5</span>
                                                                    <em>Average rating</em>
                                                                    <span>Good</span>
                                                                </div>
                                                                <ul class="rating-review">
                                                                    <li>
                                                                        <em>Facility</em>
                                                                        <span>7.5</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Human</em>
                                                                        <span>9.0</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Service</em>
                                                                        <span>9.5</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Interesting</em>
                                                                        <span>8.7</span>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="comment-box">
                                                        <div class="avatar">
                                                            <img src="../images/img/demo-thumb.jpg" alt="">
                                                        </div>
                                                        <div class="comment-body">
                                                            <p class="meta">
                                                                <strong>James Bond not 007</strong>
                                                                <span class="time">December 10, 2012</span>
                                                            </p>
                                                            <div class="description">
                                                                <p>Takes me back to my youth. I love the design of this soda machine. A bit pricy though..!</p>
                                                            </div>

                                                            <div class="rating-info">
                                                                <div class="average-rating-review good">
                                                                    <span class="count">7.5</span>
                                                                    <em>Average rating</em>
                                                                    <span>Good</span>
                                                                </div>
                                                                <ul class="rating-review">
                                                                    <li>
                                                                        <em>Facility</em>
                                                                        <span>7.5</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Human</em>
                                                                        <span>9.0</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Service</em>
                                                                        <span>9.5</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Interesting</em>
                                                                        <span>8.7</span>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                                <li>
                                                    <div class="comment-box">
                                                        <div class="avatar">
                                                            <img src="../images/img/demo-thumb.jpg" alt="">
                                                        </div>
                                                        <div class="comment-body">
                                                            <p class="meta">
                                                                <strong>Bratt not Pitt</strong>
                                                                <span class="time">December 10, 2012</span>
                                                            </p>
                                                            <div class="description">
                                                                <p>Takes me back to my youth. I love the design of this soda machine. A bit pricy though..!</p>
                                                            </div>

                                                            <div class="rating-info">
                                                                <div class="average-rating-review fine">
                                                                    <span class="count">5.0</span>
                                                                    <em>Average rating</em>
                                                                    <span>Fine</span>
                                                                </div>
                                                                <ul class="rating-review">
                                                                    <li>
                                                                        <em>Facility</em>
                                                                        <span>7.5</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Human</em>
                                                                        <span>9.0</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Service</em>
                                                                        <span>9.5</span>
                                                                    </li>
                                                                    <li>
                                                                        <em>Interesting</em>
                                                                        <span>8.7</span>
                                                                    </li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </li>
                                            </ol>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="detail-sidebar">
                            <div class="call-to-book">
                                <i class="awe-icon awe-icon-phone"></i>
                                <em>Call to book</em>
                                <span>+1-888-8765-1234</span>
                            </div>
                            <div class="booking-info">
                                <h3>Booking info</h3>
                                <div class="form-select-date">
                                    <div class="form-elements">
                                        <label>Select Travel Date</label>
                                        <div class="form-item">
                                            <i class="awe-icon awe-icon-calendar"></i>
                                            <input type="text" class="awe-calendar" value="Date">
                                        </div>
                                        <span>* Vouchers valid for 12 months after purchase.</span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="form-elements form-adult">
                                        <label>Adult</label>
                                        <div class="form-item">
                                            <select class="awe-select">
                                                <option>0</option>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                            </select>
                                        </div>
                                        <span>12 yo and above</span>
                                    </div>
                                    <div class="form-elements form-kids">
                                        <label>Kids</label>
                                        <div class="form-item">
                                            <select class="awe-select">
                                                <option>0</option>
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                            </select>
                                        </div>
                                        <span>11 and under</span>
                                    </div>
                                </div>
                                <div class="price">
                                    <em>Total for this booking</em>
                                    <span class="amount">$5,923</span>
                                </div>
                                <div class="form-submit">
                                    <div class="add-to-cart">
                                        <button type="submit">
                                            <i class="awe-icon awe-icon-cart"></i>Add this to Cart
                                        </button>
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
    <script type="text/javascript" src="../js/lib/theia-sticky-sidebar.js"></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?v=3"></script>
    <script type="text/javascript" src="../js/lib/md-map-extend.js"></script>
    <script type="text/javascript" src="../js/lib/jquery.magnific-popup.min.js"></script>
    <script type='text/javascript' src="../js/lib/jquery-ui.js"></script>
    <script type="text/javascript" src="../js/scripts.js"></script>
</body>
</html>