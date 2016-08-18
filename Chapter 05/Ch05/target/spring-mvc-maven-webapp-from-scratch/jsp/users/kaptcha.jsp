<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<spring:url value="/js/jquery-1.11.3.min.js"	var="bootstrapJs" />

<script src="${bootstrapJs}"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="chknumber">  
       <label>Verification code:           
       <input name="kaptcha" type="text" id="kaptcha" maxlength="4" class="chknumber_input" />               
       </label>  
       <img src="/ch05/captcha/captcha-image.do" width="55" height="20" id="kaptchaImage"  style="margin-bottom: -3px"/>
       <button type="submit" id="reloadKaptcha">Reload Kaptcha</button>
       <script type="text/javascript">      
        $(function(){           
            $('#reloadKaptcha').click(function () {//Validation code generation  
             $('#kaptchaImage').hide().attr('src', '/ch05/captcha/captcha-image.do?' + Math.floor(Math.random()*100) ).fadeIn(); })      
                  });   
  
       </script>   
     </div>  
</body>
</html>