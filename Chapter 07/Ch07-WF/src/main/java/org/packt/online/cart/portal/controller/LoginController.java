package org.packt.online.cart.portal.controller;

import org.packt.online.cart.portal.model.form.LoginForm;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	
	public LoginForm createLoginForm() {
		LoginForm loginForm = new LoginForm();
		return loginForm;
	}


}
