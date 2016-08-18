package org.packt.erp.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/erp/login")
public class LoginFormController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		return "";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model){
		return "";
	}

}
