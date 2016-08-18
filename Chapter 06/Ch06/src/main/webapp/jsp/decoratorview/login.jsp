<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>HMS - Hotel Management System</title>
</head>
<body>
      <form:form commandName="loginForm" method="POST" id="form1">
                <h2><spring:message code="hm_login_title.label" /></h2>
                <fieldset>
                  <div class="row">
                    <form:input path="username" />
                    <spring:message code="hm_username.label" />: </div>
                  <div class="row">
                     <form:input path="password" />
                    <spring:message code="hm_password.label" />: </div>
                  
                  <div class="wrapper"> <a href="#" class="button1">Clear</a> <input type="submit" value="Login" class="button1">  </div>
                </fieldset>
              </form:form>
</body>
</html>