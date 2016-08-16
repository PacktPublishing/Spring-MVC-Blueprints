/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */

package org.packt.academic.student.portal.controller;


import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.model.data.Login;
import org.packt.academic.student.portal.model.form.LoginForm;
import org.packt.academic.student.portal.service.LoginService;
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
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/smp/admin_login")
public class AdminLoginController {
	
	private static Logger mainLogger = LoggerFactory.getLogger(AdminLoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model, HttpServletRequest req){
		LoginForm adminLoginForm = new LoginForm();
		
		model.addAttribute("adminLoginForm", adminLoginForm);
		return "admin_login_form";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @Validated @ModelAttribute LoginForm adminLoginForm, BindingResult bindingResult){
		model.addAttribute("adminLoginForm", adminLoginForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
		if(bindingResult.hasErrors()) {
			adminLoginForm = new LoginForm();
			redirectView.setUrl("/smp/admin_login.html");
			model.addAttribute("adminLoginForm", adminLoginForm);
		} else{
			Login login = new Login();
			login.setUserName(adminLoginForm.getUsername());
			login.setPassWord(adminLoginForm.getPassword());
			if(loginService.isAdminUser(login)){
				redirectView.setUrl("/smp/admin_pending.html");
			}else{
				adminLoginForm = new LoginForm();
				redirectView.setUrl("/smp/admin_login.html");
			}
		}
		return redirectView;
	}
}
