package org.packt.online.cart.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutExpiredController {
	
	@RequestMapping("/ocs/logout")
	public String callLogout(Model model){
		return "logout-form";
	}
	
	@RequestMapping("/ocs/expired")
	public String callExpired(Model model){
		return "expired-form";
	}

}
