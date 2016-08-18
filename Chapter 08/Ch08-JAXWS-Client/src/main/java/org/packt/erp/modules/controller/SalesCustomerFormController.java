package org.packt.erp.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/erp/sales/add_customer")
public class SalesCustomerFormController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model mode){
		
		return "add_customer";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(){
		
		return "add_customer";
	}

}
