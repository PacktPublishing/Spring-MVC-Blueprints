<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
	<title>HMS - Hotel Management System</title>
	<meta charset="utf-8" />
	<meta name = "viewport" content = "width=device-width, maximum-scale = 1, minimum-scale=1" />
	<link rel="stylesheet" type="text/css" href="../css/default.css" media="all" />
	<link rel="stylesheet" href="../css/flexslider.css" type="text/css" />
	<link rel="stylesheet" href="../css/fixed-navigation.css" type="text/css" />
	<link href='http://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css' />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src="../js/jquery.flexslider.js"></script>
	<script src="../js/default.js"></script>
	<script type="text/javascript"
	    src="https://maps.google.com/maps/api/js?sensor=false">
	</script>
	<script type="text/javascript">
	  function initialize() {
	    var latlng = new google.maps.LatLng(-34.397, 150.644);
	    var myOptions = {
	      zoom: 8,
	      center: latlng,
	      mapTypeId: google.maps.MapTypeId.ROADMAP
	    };
	    var map = new google.maps.Map(document.getElementById("map_canvas"),
	        myOptions);
	  }

	</script>
	<!--[if lt IE 9]>
		<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body onload="initialize()">
	<div id="pagewidth">
		<header id="header">
			<div class="center">
				<nav id="mainNav">
					<ul>
						<li class="active"><a href="#pagewidth"><span>Home</span></a></li>
						<li><a href="#twoColumnLayout"><span>Rooms</span></a></li>
						<li><a href="#threeColumnLayout"><span>Services</span></a></li>
						<li><a href="#boxes"><span>Booking</span></a></li>
						<li><a href="#testiomonialsTab"><span>Testimonials</span></a></li>
						<li><a href="#contactUs"><span>About Us</span></a></li>
					</ul>
				</nav>
			</div>
		</header>
		<div id="content">
			<section class="row">
				<div class="center">
					<h1>Hotel Management System</h1>
					<strong class="subHeading">HoteLounge - <c:out value='${siteType}'/></strong>
					<div class="gallery">
						<ul class="slides">
							<li><img src="../images/img1.jpg" alt="image" /></li>
							<li><img src="../images/img2.jpg" alt="image" /></li>
							<li><img src="../images/img3.jpg" alt="image" /></li>
						</ul>
					</div>
				
				</div>
			</section>
			<section id="twoColumnLayout" class="row grey">
				<div class="center">
					<h1>Rooms</h1>
					<strong class="subHeading">lorem ipsum dolor sit amet, consectetur adipiscing elit</strong>
					<div class="columns">
						<div class="half">
							<div class="imgHolder alignLeft"><img src="../images/page3_img1.jpg" alt="image" /></div>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar urna risus a orci.</p>
							<p>Ut scelerisque, sapien in luctus ultrices, magna ante convallis</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar urna risus a orci.</p>
							<p>Ut scelerisque, sapien in luctus ultrices, magna ante convallis orci, vel iaculis massa sapien sed risus.</p>
							<ul>
								<li>Lorem ipsum dolor sit amet, consectetur </li>
								<li>adipiscing elit. In luctus, tortor vel</li>
							</ul>
							<p>Ut scelerisque, sapien in luctus ultrices, <a href="#">magna ante convallis</a> orci, vel iaculis massa sapien sed risus.</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar urna risus a orci.</p>
						</div>
						<div class="half">
							<div class="imgHolder fullWidth"><img src="../images/page3_img4.jpg" alt="image" /></div>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar urna risus a orci.</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar urna risus a orci.</p>
						</div>
					</div>
				</div>
			</section>
			<section id="threeColumnLayout" class="row">
				<div class="center">
					<h1>Services</h1>
					<strong class="subHeading">lorem ipsum dolor sit amet, consectetur adipiscing elit</strong>
					<div class="columns">
						<div class="oneThird">
							<div class="imgHolder fullWidth"><img src="../images/content03.jpg" alt="image" /></div>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa <a href="#">tellus elementum</a> nunc, eu pulvinar urna risus a orci.</p>
							<p>Ut scelerisque, sapien in luctus ultrices, magna ante convallis orci</p>
						</div>
						<div class="oneThird">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc.</p>
							<ul>
								<li>Lorem ipsum dolor sit amet, consectetur </li>
								<li>adipiscing elit. In luctus, tortor vel</li>
								<li>pharetra, massa tellus elementum nunc</li>
							</ul>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus. </p>
							<p>In luctus, tortor vel vehicula pharetra, massa tellus. S ss fit amet, consectetur adipiscing elit. </p>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus. </p>
						</div>
						<div class="oneThird">
							<div class="imgHolder alignLeft"><img src="../images/content05.jpg" alt="image" /></div>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus.</p>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar urna risus a orci.</p>
							<p>Ut scelerisque, sapien in luctus ultrices, magna ante convallis orci, vel iaculis massa sapien sed risus.</p>
							<p>Ut scelerisque, sapien in luctus ultrices, magna ante convallis orci, vel iaculis massa sapien sed risus.</p>
							<p>Ut scelerisque, sapien in luctus ultrices, magna ante convallis orc.</p>
						</div>
					</div>
				</div>
			</section>
			<section id="boxes" class="row grey">
				<div class="center">
					<h1>Booking Services</h1>
					<strong class="subHeading">lorem ipsum dolor sit amet, consectetur adipiscing elit</strong>
					<div class="columns">
						<article class="news oneThird">
							<div>
								<h3><a href="#">Lorem ipsum dolor</a></h3>
								<div class="content">
									<a href="#" class="imgHolder fullWidth"><img src="../images/img-news01.jpg" alt="" /></a>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra.</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
								</div>
								<div class="readMore"><a href="#" class="btn btnSmall"><span>Read More</span></a></div>
							</div>
						</article>
						<article class="news oneThird">
							<div>
								<h3><a href="#">Lorem ipsum dolor</a></h3>
								<div class="content">
									<a href="#" class="imgHolder fullWidth"><img src="../images/img-news01.jpg" alt="" /></a>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra.</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
								</div>
								<div class="readMore"><a href="#" class="btn btnSmall"><span>Read More</span></a></div>
							</div>
						</article>
						<article class="news oneThird">
							<div>
								<h3><a href="#">Lorem ipsum dolor</a></h3>
								<div class="content">
									<a href="#" class="imgHolder fullWidth"><img src="../images/img-news01.jpg" alt="" /></a>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra.</p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
								</div>
								<div class="readMore"><a href="#" class="btn btnSmall"><span>Read More</span></a></div>
							</div>
						</article>
					</div>
				</div>
			</section>
			<section id="testiomonialsTab" class="row">
				<div class="center">
					<h1>Testimonials</h1>
					<strong class="subHeading">lorem ipsum dolor sit amet, consectetur adipiscing elit</strong>
					<div id="testimonials" class="gallery">
						<ul class="slides">
							<li>
								<div class="row">
									<blockquote>
										<q>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar </q>
									</blockquote>
									<blockquote>
										<q>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar </q>
									</blockquote>
								</div>
								<div class="row">
									<blockquote>
										<q>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar </q>
									</blockquote>
									<blockquote>
										<q>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, massa tellus elementum nunc, eu pulvinar. Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus, tortor vel vehicula pharetra, mas</q>
									</blockquote>
								</div>
							</li>
						</ul>
					</div>
				</div>
			</section>
			<section id="contactUs" class="row grey">
				<div class="center">
					<h1>Contact Us</h1>
					<strong class="subHeading">lorem ipsum dolor sit amet, consectetur adipiscing elit</strong>
					<div class="columns">
						<div class="half">
							<form method="post" action="#" class="form contact-form">
								<fieldset>
									<h2>Feedback form</h2>
									<div id="message"></div>
									<div class="formRow">
										<div class="textField"><input type="text" name="contact-name" id="name" placeholder="Your name ..." /></div>	
									</div>
									<div class="formRow">
										<div class="textField"><input type="text" name="contact-email" id="email" placeholder="Your Email ..." /></div>
									</div>
									<div class="formRow">
										<div class="textField"><textarea cols="20" name="contact-comment" id="comment" rows="4" placeholder="Your Comment ..."></textarea></div>
									</div>
									<div class="formRow">
										<button class="btnSmall btn submit right">
											<span>Send Message</span>
										</button>
									</div>
								</fieldset>
							</form>
						</div>
						<div class="half">
							<h2>How to find us</h2>
							<div id="map">
								<div class="imgHolder"><div id="map_canvas" style="width:445px; height:392px"></div></div>
							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
		<footer id="footer">
			<div class="center">
				<span class="copy">Created by <a href="http://webcodebuilder.com">WebCodeBuilder.com</a></span>
				Subscribe to our <a href="http://webcodebuilder.com/feed/">blog</a> and follow us on <a href="https://twitter.com/#!/webcodebuilder">Twitter</a>
			</div>
		</footer>
	</div>
</body>
</html>