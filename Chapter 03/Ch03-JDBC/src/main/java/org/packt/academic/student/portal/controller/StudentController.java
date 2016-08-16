/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */
package org.packt.academic.student.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.service.GWAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Student General Transactions

@Controller
public class StudentController {
	
	@Autowired
	private GWAService gwaService;
	
	@RequestMapping(value="/smp/stud_main", method=RequestMethod.GET)
	public String getStudMain(Model model){
	    return "stud_main";	
	}
	
	
	@RequestMapping(value="/smp/stud_gwa", method=RequestMethod.GET)
	public String getStudGWA(Model model, HttpServletRequest request){
		int studentId = (int) request.getSession().getAttribute("studId");
		model.addAttribute("gwa", gwaService.computeGWA(studentId));
		model.addAttribute("courseTaken", gwaService.getCoursesTaken(studentId));
	    return "stud_gwa";	
	}

}
