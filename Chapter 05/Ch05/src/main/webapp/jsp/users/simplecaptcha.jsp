<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function reloadCapctha() {
    document.getElementById('iframeCaptch').src="/ch05/captcha/getSimpleCaptchaImage.sp";
}
</script>
</head>
<body>
 <spring:url value="/ch05/captcha/getSimpleCaptchaImage.sp" var="userActionUrl" />
	<table align="center" width="98%" border="0" cellpadding="2"
		cellspacing="2">
		<tr>
			<td colspan="2" style="font-size: 11px; font-weight: bold">
		</tr>
		<tr>
			<td class="ClsLabel" width="35%"><fmt:message
					key="captcha.label.picture" />:</td>
			<td>
					<img src="/ch05/captcha/getSimpleCaptchaImage.do"/>
				</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			
		</tr>
		<tr>
			<td class="ClsLabel"><span class="ClsRequiredFields">*</span>
		
			<td><input type="text" maxlength="8" name="txtCaptchaAnswer"
				id="txtCaptchaAnswer" value="" style="width: 250px"
				class="validate[required,minSize[8]]"></td>
		</tr>
	</table>

</body>
</html>