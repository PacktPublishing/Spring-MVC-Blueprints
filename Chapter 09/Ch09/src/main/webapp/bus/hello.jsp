<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<title>Pretech blog testing web sockets</title>
</head>
<body>
	<div>
		<input type="text" id="userinput" /> <br> <input type="submit"
			value="Send Message to Server" onclick="start()" />
	</div>
	<div id="messages"></div>
	<script type="text/javascript">
		var webSocket = new WebSocket(
				'ws://localhost:8080/ch09/websocket');

		webSocket.onerror = function(event) {
			onError(event)
		};

		webSocket.onopen = function(event) {
			onOpen(event)
		};

		webSocket.onmessage = function(event) {
			onMessage(event)
		};

		function onMessage(event) {
			document.getElementById('messages').innerHTML += '<br />'
					+ event.data;
		}

		function onOpen(event) {
			document.getElementById('messages').innerHTML = 'Now Connection established';
		}

		function onError(event) {
			alert(event.data);
		}

		function start() {
			var text = document.getElementById("userinput").value;

			webSocket.send(text);
			return false;
		}
	</script>
</body>
</html>