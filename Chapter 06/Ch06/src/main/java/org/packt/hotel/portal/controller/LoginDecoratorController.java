package org.packt.hotel.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.hotel.portal.model.form.LoginForm;
import org.packt.hotel.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/hms/membership/login")
public class LoginDecoratorController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model, HttpServletRequest req){
		LoginForm loginForm = new LoginForm();
		
		model.addAttribute("loginForm", loginForm);
		return "hms_login";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @ModelAttribute LoginForm loginForm){
		model.addAttribute("loginForm", loginForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
					
			if(userService.checkUser(loginForm)){
				redirectView.setUrl("/hms/index.html");
			}else{
				loginForm = new LoginForm();
				redirectView.setUrl("/hms/membership/login.html");			}
	
		return redirectView;
	}

}
