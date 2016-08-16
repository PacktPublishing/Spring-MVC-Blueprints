package org.packt.edms.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	/*
	 * Calls the default index.html
	 */
	@RequestMapping(value = "/edms/index", method = RequestMethod.GET)
	public String getDefault() {
		return "index";
	}

}
