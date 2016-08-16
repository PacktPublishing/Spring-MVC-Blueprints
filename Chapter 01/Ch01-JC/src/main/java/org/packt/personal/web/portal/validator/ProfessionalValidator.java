package org.packt.personal.web.portal.validator;

import org.packt.personal.web.portal.model.form.Professional;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component("professionalValidator")
public class ProfessionalValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return Professional.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		//Professional professional = (Professional) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "position", "position.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "company", "company.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "years", "years.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "location", "location.empty");
		
	}

}
