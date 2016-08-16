package org.packt.academic.student.portal.controller;

import org.packt.academic.student.portal.model.data.Tblregistration;
import org.packt.academic.student.portal.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AdminController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value="/smp/admin_pending", method=RequestMethod.GET)
	public String getPendingStudents(Model model){
		model.addAttribute("listPending", applicationService.retrieveApplication());
	    return "admin_pending";	
	}
	
	@RequestMapping(value="/smp/admin_pending_assess", method=RequestMethod.GET)
	public RedirectView assessPending(@RequestParam("decision") String decision, @RequestParam("regId") Integer regId, Model model){
		if(decision.equalsIgnoreCase("yes")){ 
			Tblregistration application = applicationService.retrieveProfile(regId);
			applicationService.registerApplication(application);
		}else{
			Tblregistration application = applicationService.retrieveProfile(regId);
			applicationService.removePending(application);
		}
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/smp/admin_pending.html");
	    return redirectView;	
	}

}
