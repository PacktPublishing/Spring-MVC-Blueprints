package org.packt.human.resource.portal.controller;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsEmployeeAttendance;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	@Autowired
	private AttendanceService attendanceService;
	
	@RequestMapping(value = "/hrms/dtr", method = RequestMethod.GET)
    public  List<HrmsEmployeeAttendance>  createDTRo(Model model) {                 

	  
       List<HrmsEmployeeAttendance> attendance = attendanceService.getAttendance(212);
       model.addAttribute("attendance", attendance);
      
       return attendance;

   }
	
	
	

}
