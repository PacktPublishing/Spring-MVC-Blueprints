package org.packt.academic.student.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.form.FacultyForm;
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
@RequestMapping("/smp/admin_add_faculty")
public class AdminFacultyFormController {
	
	@Autowired
	private ManagementService managementService;
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		FacultyForm facultyForm = new FacultyForm();
		model.addAttribute("facultyForm", facultyForm);
	    List<Tblfaculty> faculty = reportService.getAllFaculty();
	   
		model.addAttribute("faculty", faculty);
		references(model);
		return "admin_add_faculty";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @Validated @ModelAttribute("facultyForm") FacultyForm facultyForm, BindingResult bindingResult){
		model.addAttribute("facultyForm", facultyForm);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/smp/admin_add_faculty.html");
		
		List<Tblfaculty> faculty = reportService.getAllFaculty();
		model.addAttribute("faculty", faculty);
		
	    references(model);
	    
		if(bindingResult.hasErrors()) {
			facultyForm = new FacultyForm();
			model.addAttribute("facultyForm", facultyForm);
			
		} else{
			managementService.addFaculty(facultyForm);
			facultyForm = new FacultyForm();
			model.addAttribute("facultyForm", facultyForm);
			
		}
		return redirectView;
	}
	
	public void references(Model model){
		
		List<Integer> deptId = new ArrayList<Integer>();
		for(Tbldepartment dept : reportService.getAllDepartment()){
			deptId.add(dept.getDepartmentId());
		}
		model.addAttribute("deptId", deptId);
		
				
	}

}
