package org.packt.erp.modules.jms;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;


@Service("msgProviderSvc")
public class PaymentProvider {
	 @Resource(name="jmstemplate")
     private JmsTemplate jmsTemplate;

      public void sendMessage(String message){
            final String  msg = message;
            jmsTemplate.send(new MessageCreator() {               
                   @Override
                   public Message createMessage(Session session) throws JMSException {
                         TextMessage txtMsg = session.createTextMessage(msg);
                         return txtMsg;
                   }
            });
     }
}

