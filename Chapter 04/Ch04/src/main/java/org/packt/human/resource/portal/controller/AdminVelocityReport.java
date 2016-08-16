package org.packt.human.resource.portal.controller;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminVelocityReport {
	
	@Autowired
	private LoginService loginService;

	private List<HrmsLogin> usersList;
	@RequestMapping(value = "/hrms/userVMList", method = RequestMethod.GET)  
    public String index(Model model) {  
		usersList = loginService.getUserList();
        model.addAttribute("allUsers", usersList);  
  
        return "get_vm";  
    }  


}
