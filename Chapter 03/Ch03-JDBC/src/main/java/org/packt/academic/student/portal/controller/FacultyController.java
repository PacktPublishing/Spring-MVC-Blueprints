/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */
package org.packt.academic.student.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;
import org.packt.academic.student.portal.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Faculty General Transaction

@Controller
public class FacultyController {

	@Autowired
	private EnrollmentService enrollmentService;
	
	@RequestMapping("/smp/faculty_masterlist")
	public String initForm(Model model, HttpServletRequest req){
		ListJoinCourseTakenForm listForm = new ListJoinCourseTakenForm();
		int facultyId = (Integer) req.getSession().getAttribute("facultyId");
		listForm = enrollmentService.masterList(facultyId);
		System.out.println(listForm.getListJoinedStudentList().size());
		model.addAttribute("listForm", listForm);
		return "faculty_masterlist";
		
	}
	
	
}
