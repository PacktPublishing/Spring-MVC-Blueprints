package org.packt.bus.portal.controller;

import org.packt.bus.portal.model.form.LoginForm;
import org.packt.bus.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller("/bts/login")
public class LoginFormController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String inputForm(Model model){
		LoginForm loginForm = new LoginForm();
		model.addAttribute("loginForm", loginForm);
		return "login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(@RequestBody LoginForm loginForm) {
		if(loginService.validateUser(loginForm.getUsername()) == 0){
			return new RedirectView("/ch09/bts/login.html");
		}
		return new RedirectView("/ch09/bts/index.html");
	}

}
