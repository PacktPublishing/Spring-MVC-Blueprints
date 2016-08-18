<%@ tag import="net.tanesha.recaptcha.ReCaptcha" %>
<%@ tag import="net.tanesha.recaptcha.ReCaptchaFactory" %>
<%@ attribute name="privateKey" required="true" rtexprvalue="false" %>
<%@ attribute name="publicKey" required="true" rtexprvalue="false" %>

<%
	ReCaptcha c = ReCaptchaFactory.newReCaptcha(publicKey, privateKey, false);
	out.print(c.createRecaptchaHtml(null, null));
%>