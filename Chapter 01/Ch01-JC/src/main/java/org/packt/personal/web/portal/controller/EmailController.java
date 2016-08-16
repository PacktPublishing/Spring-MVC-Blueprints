package org.packt.personal.web.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmailController {
	
	@RequestMapping(value="/pwp/contact", method=RequestMethod.GET)
	public String emailUs(){
		return "contact_us";
	}

}
