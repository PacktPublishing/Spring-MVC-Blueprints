/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */

package org.packt.academic.student.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.model.data.Login;
import org.packt.academic.student.portal.model.form.LoginForm;
import org.packt.academic.student.portal.service.LoginService;
import org.packt.academic.student.portal.service.ReportService;
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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

// Faculty Login

@Controller
@SessionAttributes(value={"facultyId"})
@RequestMapping("/smp/faculty_login")
public class FacultyLoginController {
	
private static Logger mainLogger = LoggerFactory.getLogger(FacultyLoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ReportService reportService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model, HttpServletRequest req){
		LoginForm facultyLoginForm = new LoginForm();
		
		model.addAttribute("facultyLoginForm", facultyLoginForm);
		return "faculty_login_form";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @Validated @ModelAttribute LoginForm facultyLoginForm, BindingResult bindingResult){
		model.addAttribute("facultyLoginForm", facultyLoginForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
		if(bindingResult.hasErrors()) {
			facultyLoginForm = new LoginForm();
			redirectView.setUrl("/smp/faculty_login.html");
			model.addAttribute("facultyLoginForm", facultyLoginForm);
		} else{
			Login login = new Login();
			login.setUserName(facultyLoginForm.getUsername());
			login.setPassWord(facultyLoginForm.getPassword());
			if(loginService.isFacultyUser(login)){
				model.addAttribute("facultyId", reportService.getFacultyId(login.getUserName()).getFacultyId());
				redirectView.setUrl("/smp/faculty_masterlist.html");
			}else{
				facultyLoginForm = new LoginForm();
				redirectView.setUrl("/smp/faculty_login.html");
			}
		}
		return redirectView;
	}

}
