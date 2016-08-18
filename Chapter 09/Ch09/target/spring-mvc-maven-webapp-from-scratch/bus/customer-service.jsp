<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="//cdn.sockjs.org/sockjs-0.3.min.js"></script>

<script type="text/javascript">
	var ws = new WebSocket('ws://localhost:8080/ch09/chat/feedback');
	ws.onopen = function() {
		$('#console').append('websocket opened' + '<br>');
	};
	ws.onmessage = function(message) {
		$('#console').append('receive message : ' + message.data + '<br>');
	};
	ws.onclose = function(event) {
		$('#console').append(
				'websocket closed : ' + event.reason + ' code: ' + event.code);
	};
	function messageSend() {
		ws.send($('#message').val());
	}
</script>
</head>
<body>
	<input type="text" id="message" />
	<input type="button" value="Send Message" onclick="messageSend();" />
	<div id="console"></div>
</body>
</html>