package org.packt.edms.portal.validator;

import org.packt.edms.portal.model.form.SingeFileUploadForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SingleFileValidator implements Validator{

	public boolean supports(Class<?> clazz) {
		return SingeFileUploadForm.class.equals(clazz);
	}

	public void validate(Object obj, Errors errors) {
		SingeFileUploadForm file = (SingeFileUploadForm) obj;
		  if (file.getFile().getSize() == 0) {
		   errors.rejectValue("file", "file.size");
		  }
	}

}
