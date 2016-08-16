package org.packt.personal.web.portal.validator;

import org.packt.personal.web.portal.model.form.Home;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("indexValidator")
public class IndexValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Home.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Home homeForm = (Home) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "message", "message.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "quote", "quote.empty");
	
		if(homeForm.getMessage().length() > 500){
			errors.rejectValue("message", "message.maxlength");
		}
		if(homeForm.getMessage().length() < 50){
			errors.rejectValue("message", "message.minlength");
		}
		
		
		if(homeForm.getQuote().length() > 500){
			errors.rejectValue("quote", "quote.maxlength");
		}
		if(homeForm.getQuote().length() < 50){
			errors.rejectValue("quote", "quote.minlength");
		}
	}

}
