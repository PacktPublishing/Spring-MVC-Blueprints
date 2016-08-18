package org.packt.bus.portal.socket;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.web.socket.handler.TextWebSocketHandler;

@ServerEndpoint("/chat/feedback")
public class EchoHandler extends TextWebSocketHandler {

	@OnMessage
	public void onMessage(String message, Session session) throws IOException,
			InterruptedException {	
		session.getBasicRemote().sendText("Your complaint: " + message + " is being taken into consideration. Thank you!");
	}

	@OnOpen
	public void onOpen() {
		// Logs open connection
	}

	@OnClose
	public void onClose() {
	   // Logs close connection with or without errors	
	}
}