package org.packt.hotel.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KickstrapController {
	
	@RequestMapping("/hms/kick/addbook")
	public String callKicks(){
		return "kicks";
	}

}
