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


@Controller
@SessionAttributes(value={"studId"})
@RequestMapping("/smp/stud_login")
public class StudentLoginController {
    private static Logger mainLogger = LoggerFactory.getLogger(StudentLoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model, HttpServletRequest req){
		LoginForm adminLoginForm = new LoginForm();
		
		model.addAttribute("studLoginForm", adminLoginForm);
		return "stud_login_form";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @Validated @ModelAttribute LoginForm studLoginForm, BindingResult bindingResult){
		model.addAttribute("studLoginForm", studLoginForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
		if(bindingResult.hasErrors()) {
			studLoginForm = new LoginForm();
			redirectView.setUrl("/smp/stud_login.html");
			model.addAttribute("studLoginForm", studLoginForm);
		} else{
			Login login = new Login();
			login.setUserName(studLoginForm.getUsername());
			login.setPassWord(studLoginForm.getPassword());
			if(loginService.isStudentUser(login.getUserName(), login.getPassWord())){
				redirectView.setUrl("/smp/stud_enroll.html");
				model.addAttribute("studId", reportService.getStudentId(login.getUserName()).getStudentId());
			}else{
				studLoginForm = new LoginForm();
				redirectView.setUrl("/smp/stud_login.html");
			}
		}
		return redirectView;
	}
}
