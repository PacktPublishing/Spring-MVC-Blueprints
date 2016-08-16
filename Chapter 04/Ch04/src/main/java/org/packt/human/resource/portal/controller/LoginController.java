package org.packt.human.resource.portal.controller;

import org.packt.human.resource.portal.model.form.LoginForm;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@RequestMapping("/hrms/login")
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private Validator loginValidator;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(@ModelAttribute("loginForm") LoginForm loginForm, Model model){
		loginForm = new LoginForm();
		model.addAttribute("loginForm", loginForm);
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model, @Validated @ModelAttribute("loginForm") LoginForm loginForm, BindingResult bindingResult){
		model.addAttribute("loginForm", loginForm);
	    String result = "admin_dashboard";	
		if(bindingResult.hasErrors()) {
			loginForm = new LoginForm();
			result = "login";
			model.addAttribute("loginForm", loginForm);
		} else{
			String username = loginForm.getUsername();
			String password = loginForm.getPassword();
			boolean valid = loginService.validUser(username, password);
			if(valid){
				String role = loginService.checkRole(username, password);
				if(role.equalsIgnoreCase("admin")){
					result = "admin_dashboard";
				}else if(role.equalsIgnoreCase("hr")){
					result = "hr_dashboard";
				}
				else if(role.equalsIgnoreCase("employee")){
					result = "emp_dashboard";
				}
				
			}else{
				loginForm = new LoginForm();
				result = "login";
			}
			
		}
		return result;
	}
	
	@InitBinder("loginForm")
	public void initBinder(WebDataBinder binder){
		binder.setValidator(loginValidator);
	}

}
