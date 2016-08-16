/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */

package org.packt.academic.student.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.model.form.ApplicationForm;
import org.packt.academic.student.portal.service.ApplicationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/smp/stud_application")
public class ApplicationController {
	 private static Logger mainLogger = LoggerFactory.getLogger("generic");
	@Autowired
	private ApplicationService applicationService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		 ApplicationForm applicationForm = new ApplicationForm();
		 references(model);
		 model.addAttribute("applicationForm", applicationForm);
		 return "application_form";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model, @Validated @ModelAttribute ApplicationForm applicationForm, BindingResult bindingResult){
		model.addAttribute("applicationForm", applicationForm);
    	String returnVal = "application_form";
		if(bindingResult.hasErrors()) {
			references(model);
		} else{
			Application application = new Application();
			application.setFirstName(applicationForm.getFirstName());
			application.setMidName(applicationForm.getMidName());
			application.setLastName(applicationForm.getLastName());
			application.setGender(applicationForm.getGender());
			application.setBirthDate(applicationForm.getBirthDate());
			application.setAddress(applicationForm.getAddress());
			application.setMobile(applicationForm.getMobile());
			application.setEmail(applicationForm.getEmail());
			application.setUsername(applicationForm.getUsername());
			application.setPassword(applicationForm.getPassword());
			applicationForm = new ApplicationForm();
			applicationService.saveApplication(application);
			applicationService.enableAccount(application);
			references(model);
			model.addAttribute("applicationForm", applicationForm);
			model.addAttribute("dataEntry", "Application has already been submitted. Thank you!");
		}
		return returnVal;
	}
	
	
	public void references(Model model){
		List<String> gender = new ArrayList<String>();
		gender.add("Male");
		gender.add("Female");
		model.addAttribute("gender", gender);
	}

}
