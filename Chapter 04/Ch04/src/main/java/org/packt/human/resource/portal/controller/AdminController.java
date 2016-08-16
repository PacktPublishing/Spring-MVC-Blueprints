package org.packt.human.resource.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
 
	@RequestMapping(value="/hrms/admin_reports", method=RequestMethod.GET)
	public String getAdminReports(){
		
		return "admin_reports";
	}
	
	@RequestMapping(value="/hrms/hr_reports", method=RequestMethod.GET)
	public String getHRReports(){
		
		return "hr_reports";
	}
	
	
	
}
