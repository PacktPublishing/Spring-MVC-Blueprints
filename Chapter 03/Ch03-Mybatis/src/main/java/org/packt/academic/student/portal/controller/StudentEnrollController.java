/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */

package org.packt.academic.student.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.model.form.ListAvailCourseForm;
import org.packt.academic.student.portal.service.EnrollmentService;
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
@RequestMapping("/smp/stud_enroll")
public class StudentEnrollController {
	
private static Logger mainLogger = LoggerFactory.getLogger(StudentEnrollController.class);
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model, HttpServletRequest req){
		ListAvailCourseForm listForm = new ListAvailCourseForm();
		listForm = enrollmentService.listForm();
		System.out.println("controller"+listForm.getAvailCourseFormList().get(0).getCourseName());
		model.addAttribute("listForm", listForm);
		return "stud_enroll_form";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, HttpServletRequest request, @Validated @ModelAttribute ListAvailCourseForm listForm, BindingResult bindingResult){
		
		model.addAttribute("listForm", listForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
		if(bindingResult.hasErrors()) {
			redirectView.setUrl("/smp/stud_enroll.html");
			listForm = enrollmentService.listForm();
			model.addAttribute("listForm", listForm);
		} else{
			int studentId = (Integer) request.getSession().getAttribute("studId");
			enrollmentService.enroll(listForm,studentId);
			listForm = enrollmentService.listForm();
			redirectView.setUrl("/smp/stud_enroll.html");
			
		}
		return redirectView;
	}

}
