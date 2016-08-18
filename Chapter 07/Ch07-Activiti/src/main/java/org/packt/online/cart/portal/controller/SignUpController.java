package org.packt.online.cart.portal.controller;


import java.util.Set;

import org.activiti.engine.IdentityService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.identity.User;
import org.packt.online.cart.portal.model.form.LoginForm;
import org.packt.online.cart.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/ocs/signup")
public class SignUpController {
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ProcessEngine processEngine;


	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		LoginForm signupForm = new LoginForm();
		references(model);
		model.addAttribute("signupForm", signupForm);
		return "signup-form";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @ModelAttribute LoginForm signupForm, BindingResult bindingResult){
		model.addAttribute("signupForm", signupForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
		if(bindingResult.hasErrors()) {
			signupForm = new LoginForm();
			redirectView.setUrl("/ocs/signup");
			references(model);
			model.addAttribute("signupForm", signupForm);
		} else{
			loginService.addAccount(signupForm);
			IdentityService identityService = processEngine.getIdentityService();
		    User user = identityService.newUser(signupForm.getUsername());
		    user.setPassword(signupForm.getPassword());
		    identityService.saveUser(user);
		    
		    try{
		    	identityService.saveGroup(identityService.newGroup("payor"));
				identityService.saveGroup(identityService.newGroup("shipper"));
				identityService.saveGroup(identityService.newGroup("shopper"));
				identityService.saveGroup(identityService.newGroup("buyer"));
		    }catch(Exception e){
		    	System.out.println("Groups already exists....");
		    }
		   
		    identityService.createMembership(signupForm.getUsername(), "shopper");
		    identityService.createMembership(signupForm.getUsername(), "buyer");
		    identityService.createMembership(signupForm.getUsername(), "payor");
		    identityService.createMembership(signupForm.getUsername(), "shipper");
		      		
			redirectView.setUrl("/ocs/login");
			
		}
		return redirectView;
	}
	
	public void references(Model model){
		Set<String> roles = loginService.retrieveRoles();
		Set<String> permissions = loginService.retrieverPermissions();
		
		model.addAttribute("roles", roles);
		model.addAttribute("permissions", permissions);
		
	}

}
