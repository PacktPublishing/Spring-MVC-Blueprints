/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */
package org.packt.academic.student.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

// Administrator Transactions

@SessionAttributes(value={"accessTime"})
@Controller
public class AdminController {
	 private static Logger mainLogger = LoggerFactory.getLogger("generic");
	 
	 @ModelAttribute("accessTime")
	 public long getAccessTime(){
		 return 0;
	 }

	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(value="/smp/admin_pending", method=RequestMethod.GET)
	public String getPendingStudents(Model model){
		mainLogger.info("hello");
		model.addAttribute("listPending", applicationService.retrieveApplication());
	    return "admin_pending";	
	}
	
	@RequestMapping(value="/smp/admin_pending_assess", method=RequestMethod.GET)
	public RedirectView assessPending(@RequestParam("decision") String decision, @RequestParam("regId") Integer regId, Model model){
		if(decision.equalsIgnoreCase("yes")){ 
			Application application = applicationService.retrieveProfile(regId);
			applicationService.registerApplication(application);
		}else{
			Application application = applicationService.retrieveProfile(regId);
			applicationService.removePending(application);
		}
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/smp/admin_pending.html");
	    return redirectView;	
	}
	
	@RequestMapping("/smp/admin_logout.html")
	public RedirectView logout(Model model, HttpServletRequest req){
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/smp/admin_login.html");
		long end = 0;
		long start = 0;
		try{
			end = (Long) req.getSession().getAttribute("timeUsed");
			start = (Long) req.getSession().getAttribute("timeStarted");
		}catch(NullPointerException e){
			end = 0;
			start = 0;
		}
		
		long accessTime = (start-end)/1000;
		model.addAttribute("accessTime", accessTime);
		
		return redirectView;
	}
	
	
	

}
