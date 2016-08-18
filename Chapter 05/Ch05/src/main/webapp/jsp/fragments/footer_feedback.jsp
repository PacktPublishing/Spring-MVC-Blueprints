<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="container">
	<hr>
	<footer>
		<p>&copy; Alibata Forum 2015</p>
	</footer>
</div>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<spring:url value="/js/hello.js" var="coreJs" />
<spring:url value="/js/bootstrap.min.js"	var="bootstrapJs" />
<spring:url value="/js/jquery-1.11.3.min.js"	var="jsEvents" />

<script src="${coreJs}"></script>
<script src="${bootstrapJs}"></script>
<script src="${ jsEvents }"></script>

<script type="text/javascript">      
        $(function(){           
            $('#reloadKaptcha').click(function () {//Validation code generation  
             $('#kaptchaImage').hide().attr('src', '/ch05/captcha/kaptcha-image.do?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
   
 </script>   
 
 <script type="text/javascript">
 $(function(){           
    $('#reloadSimpleCaptcha').click(function () {//Validation code generation  
        $('#simpleCaptcha').hide().attr('src', '/ch05/captcha/simple.png?' + Math.floor(Math.random()*100) ).fadeIn(); })      
             });   
</script>

<script type="text/javascript">
 $(function(){           
    $('#reloadJCaptcha').click(function () {//Validation code generation  
        $('#jcaptcha').hide().attr('src', '/ch05/cfs/captcha/emailCaptcha?' + Math.floor(Math.random()*100) ).fadeIn(); })      
             });   
</script>

