package org.packt.online.cart.portal.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CartController {
	
	@Autowired
	private ProcessEngine processEngine;

	private String processId;
	
	@RequestMapping("/ocs/order")
	public String startOrder(HttpServletRequest req){
		String cartUser = (String)req.getSession().getAttribute("cartUser");
		System.out.println("Cart user" + cartUser);
		
		ProcessInstance processInstance = getRuntimeService().startProcessInstanceByKey("shopping");
		processId = processInstance.getId();
		execAndCompleteTask(processId, cartUser, "start");
	
		return "order";
	}
	
	
	@RequestMapping("/ocs/billing")
	public String viewOrder(HttpServletRequest req){
		String cartUser = (String)req.getSession().getAttribute("cartUser");
		
		execAndCompleteTask(processId, cartUser, "shopper");
		execAndCompleteServices(processId, cartUser, "buyProduct");
				
		return "billing-form";
	}
	
	
	@RequestMapping("/ocs/shipping")
	public String shipProducts(HttpServletRequest req){
		String cartUser = (String)req.getSession().getAttribute("cartUser");
		execAndCompleteTask(processId, cartUser,"buyer");
		execAndCompleteServices(processId, cartUser, "chooseProduct");
		return "shipping-form";
	}
	
	
	
	@RequestMapping("/ocs/payment")
	public String payment(HttpServletRequest req){
		String cartUser = (String)req.getSession().getAttribute("cartUser");
		execAndCompleteTask(processId, cartUser, "payor");
		execAndCompleteServices(processId, cartUser, "deliverProduct");
		return "payment";
	}
	
	@RequestMapping("/ocs/receipt")
	public String receipt(HttpServletRequest req){
		String cartUser = (String)req.getSession().getAttribute("cartUser");
		execAndCompleteTask(processId, cartUser, "shipper");
		execAndCompleteTask(processId, cartUser, "end");
		
		return "receipt";
	}

    
	private RuntimeService getRuntimeService() {
		return processEngine.getRuntimeService();
	}

	private TaskService getTaskService() {
		return processEngine.getTaskService();
	}
	
	private void execAndCompleteTask(String processInstanceId, String cartUser, String taskName) {
		List<Task> tasks = getTaskService().createTaskQuery()
				.taskCandidateUser(cartUser).list();
		Task task = getTask(tasks, processInstanceId, taskName);
		if (task != null) {
			getTaskService().claim(task.getId(), cartUser);
			getTaskService().complete(task.getId());
		}
	}
	
	
	
	
	private void execAndCompleteServices(String processInstanceId, String cartUser, String serviceName) {
		
		List<Task> tasks = getTaskService().createTaskQuery()
				.taskCandidateUser(cartUser).list();
		Task task = getTask(tasks, processInstanceId, serviceName);
		if (task != null) {
			
			System.out.println(task.getName() + " : " + task.getId());
			getTaskService().claim(task.getId(), cartUser);
			
			// All Objects for Delegation created and dispatched here
			Map<String, Object> variables = new HashMap<>();
			variables.put("project", "ocp");
			
			getTaskService().complete(task.getId(),variables);
		}
	}
	
	
	private Task getTask(List<Task> tasks, String processInstanceId, String taskId) {
		for (Task task : tasks) {
			
			if (task.getProcessInstanceId().equals(processInstanceId) && taskId.equals(taskId)) {
				return task;
			}
		}
		return null;
	}
	
}
