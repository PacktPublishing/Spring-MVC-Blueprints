package org.packt.online.cart.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/ocs/login")
	public String callLogin(){
		return "login-form";
	}

}
