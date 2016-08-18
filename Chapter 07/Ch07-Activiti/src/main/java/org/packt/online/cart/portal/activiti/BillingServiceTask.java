package org.packt.online.cart.portal.activiti;

import org.springframework.stereotype.Service;

@Service("buyerService")
public class BillingServiceTask {
	
	// Log all transaction data at the Activiti Level
	
	public void printData(String var){
		System.out.println(var);
	}
}
