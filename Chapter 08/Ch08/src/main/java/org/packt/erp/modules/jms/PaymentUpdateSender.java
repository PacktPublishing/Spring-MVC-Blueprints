package org.packt.erp.modules.jms;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service("msgSenderSvc")
public class PaymentUpdateSender implements MessageListener {
	 @Resource(name="jmstemplate")
     private JmsTemplate jmsTemplate;
    
	 
	@Override
	public void onMessage(final Message message) {
		
		try {
			message.acknowledge();
			message.getJMSDestination();
		        if (message instanceof TextMessage) {
		               TextMessage txtmsg = (TextMessage) message;
		               // Account Id
		               // Get the PO object here and set changes
		              
		        }
		        System.out.println(message.getClass());
		        System.out.println("Done");
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
	}
}


