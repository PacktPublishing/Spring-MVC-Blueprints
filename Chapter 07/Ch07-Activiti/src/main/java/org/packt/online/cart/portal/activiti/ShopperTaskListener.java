package org.packt.online.cart.portal.activiti;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;

public class ShopperTaskListener implements TaskListener {

	// Log all transaction data at the Activiti Level
	
	@Override
	public void notify(DelegateTask task) {
		task.setVariable("var", "Shopping Logging Enabled");
		
	}

}
