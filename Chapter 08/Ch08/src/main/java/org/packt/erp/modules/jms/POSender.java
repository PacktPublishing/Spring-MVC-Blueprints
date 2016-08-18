package org.packt.erp.modules.jms;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class POSender {
	@Autowired
	private AmqpTemplate poTemplate;
	
    public void updatePO(){
    	  for (int i = 0; i < 10; i++)
    		  poTemplate.convertAndSend("erp.po.update.", "Message # " +i +" on "+ new Date());// send
    }
}