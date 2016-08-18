package org.packt.erp.modules.jms;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class POListener implements MessageListener {
    
	@Override
	public void onMessage(Message message) {
		 String messageBody= new String(message.getBody());
		   // Retrieve the PO
	        
		
	}
}