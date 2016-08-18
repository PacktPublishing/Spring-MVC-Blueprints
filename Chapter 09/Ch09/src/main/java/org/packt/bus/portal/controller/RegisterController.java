package org.packt.bus.portal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	
	@RequestMapping("/bts/register")
	public String callRegister(Model model, HttpServletRequest req){
		String contextPath = req.getContextPath();
		model.addAttribute("contextPath", contextPath);
		return "register";
	}

}
