package org.packt.human.resource.portal.validator;

import org.packt.human.resource.portal.model.form.LoginForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{
	


	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return LoginForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		LoginForm loginForm = (LoginForm) obj;
		if(loginForm.getUsername().length() == 0 || loginForm.getUsername() == null){
			errors.rejectValue("username", "error.login.username");
		}
		
		if(loginForm.getPassword().length() == 0 || loginForm.getPassword() == null){
			errors.rejectValue("password", "error.login.password");
		}
	}

}
