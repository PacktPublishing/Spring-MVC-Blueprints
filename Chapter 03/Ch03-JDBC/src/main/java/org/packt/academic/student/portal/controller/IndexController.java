/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */

package org.packt.academic.student.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// General Transactions

@Controller
public class IndexController {
	
	@RequestMapping("/smp/index")
	public String getIndex(){
		return "index";
	}

}
