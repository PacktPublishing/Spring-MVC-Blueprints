package org.packt.academic.student.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;
import org.packt.academic.student.portal.service.EnrollmentService;
import org.packt.academic.student.portal.service.GWAService;
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
@RequestMapping("/smp/faculty_grading")
public class FacultyGradingController {
	
	
	
	@Autowired
	private EnrollmentService enrollmentService;
	
	@Autowired
	private GWAService gwaService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model, HttpServletRequest req){
		ListJoinCourseTakenForm listForm = new ListJoinCourseTakenForm();
		int facultyId = (Integer) req.getSession().getAttribute("facultyId");
		listForm = enrollmentService.masterList(facultyId);
		System.out.println(listForm.getListJoinedStudentList().size());
		model.addAttribute("listForm", listForm);
		return "faculty_grading";
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, HttpServletRequest request, @Validated @ModelAttribute ListJoinCourseTakenForm listForm, BindingResult bindingResult){
		System.out.println("controller: " + listForm.getListJoinedStudentList().get(0).getCourseCode());
		System.out.println("controller: " + listForm.getListJoinedStudentList().get(0).getStudentId());
		System.out.println("controller: " + listForm.getListJoinedStudentList().get(0).getLevel());
		System.out.println("controller: " + listForm.getListJoinedStudentList().get(0).getSemester());
		model.addAttribute("listForm", listForm);
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		
		if(bindingResult.hasErrors()) {
			redirectView.setUrl("/smp/faculty_grading.html");
			int facultyId = (Integer) request.getSession().getAttribute("facultyId");
			listForm = enrollmentService.masterList(facultyId);
			model.addAttribute("listForm", listForm);
		} else{
			// update grade
			int facultyId = (Integer) request.getSession().getAttribute("facultyId");
			gwaService.gradeCourse(facultyId, listForm);
			redirectView.setUrl("/smp/faculty_grading.html");
			
		}
		return redirectView;
	}

}
