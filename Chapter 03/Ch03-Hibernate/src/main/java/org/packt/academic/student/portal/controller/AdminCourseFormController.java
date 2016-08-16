package org.packt.academic.student.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.form.CourseForm;
import org.packt.academic.student.portal.service.ManagementService;
import org.packt.academic.student.portal.service.ReportService;
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
@RequestMapping("/smp/admin_add_course")
public class AdminCourseFormController {
	
	@Autowired
	private ManagementService managementService;
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		CourseForm courseForm = new CourseForm();
		model.addAttribute("courseForm", courseForm);
	    List<Tblcourses> courses = reportService.getAllCourses();
		model.addAttribute("courses", courses);
		references(model);
		return "admin_add_course";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @Validated @ModelAttribute("courseForm") CourseForm courseForm, BindingResult bindingResult){
		model.addAttribute("courseForm", courseForm);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/smp/admin_add_course.html");
		
		List<Tblcourses> courses = reportService.getAllCourses();
		model.addAttribute("courses", courses);
		
	    references(model);
	    
		if(bindingResult.hasErrors()) {
			courseForm =  new CourseForm();
			model.addAttribute("courseForm", courseForm);
			
		} else{
			managementService.addCourse(courseForm);
			courseForm =  new CourseForm();	
			model.addAttribute("courseForm", courseForm);
			
		}
		return redirectView;
	}
	
	public void references(Model model){
		
		List<Integer> deptId = new ArrayList<Integer>();
		for(Tbldepartment dept : reportService.getAllDepartment()){
			deptId.add(dept.getDepartmentId());
		}
		model.addAttribute("deptId", deptId);
		
		List<Integer> units = new ArrayList<Integer>();
		units.add(1);
		units.add(2);
		units.add(3);
		units.add(4);
		units.add(5);
		units.add(6);
		model.addAttribute("units", units);
		
	}

}
