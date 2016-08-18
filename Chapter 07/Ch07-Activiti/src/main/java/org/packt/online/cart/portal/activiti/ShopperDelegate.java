package org.packt.online.cart.portal.activiti;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ShopperDelegate implements JavaDelegate{
	
	
	private Map<String, Object> variables = new HashMap<>();

	@Override
	public void execute(DelegateExecution exec) throws Exception {
		
		// Retrieve all objects from the @Controller containing the processes
		variables = exec.getVariables();
		System.out.println("Executed process with key "
				+ "" + exec.getProcessBusinessKey() 
				+ " with process definition ID: "
				+ "" + exec.getProcessDefinitionId()
				+ " with process instance ID: "
				+ "" + exec.getProcessInstanceId()
				+ " with current task name: "
				+ "" + exec.getCurrentActivityName()
				+ "");
				
	}

}
