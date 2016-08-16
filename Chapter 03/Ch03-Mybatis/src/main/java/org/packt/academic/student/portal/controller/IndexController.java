package org.packt.academic.student.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/smp/index")
	public String getIndex(){
		return "index";
	}

}
