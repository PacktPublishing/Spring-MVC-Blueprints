package org.packt.academic.student.portal.controller;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.form.DepartmentForm;
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
@RequestMapping("/smp/admin_add_department")
public class AdminDepartmentFromController {
	
	@Autowired
	private ManagementService managementService;
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		DepartmentForm deptForm = new DepartmentForm();
	
		model.addAttribute("deptForm", deptForm);
	    List<Tbldepartment> depts = reportService.getAllDepartment();
		model.addAttribute("depts", depts);
		
		return "admin_add_department";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public RedirectView submitForm(Model model, @Validated @ModelAttribute("deptForm") DepartmentForm deptForm, BindingResult bindingResult){
		model.addAttribute("deptForm", deptForm);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/smp/admin_add_department.html");
		
		List<Tbldepartment> depts = reportService.getAllDepartment();
	    model.addAttribute("depts", depts);
		
	  
	    
		if(bindingResult.hasErrors()) {
			deptForm = new DepartmentForm();
			model.addAttribute("deptForm", deptForm);
			
		} else{
			managementService.addDepartment(deptForm);
			deptForm = new DepartmentForm();
			model.addAttribute("deptForm", deptForm);
			
		}
		return redirectView;
	}
	
	
}
