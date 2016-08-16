package org.packt.edms.portal.validator;

import java.util.List;

import org.packt.edms.portal.model.form.MultipleFilesUploadForm;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

public class MultipleFileValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return MultipleFilesUploadForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors error) {
		MultipleFilesUploadForm form = (MultipleFilesUploadForm) obj;
		List<MultipartFile> files = form.getFiles();
		boolean isValid = true;
		StringBuilder sb = new StringBuilder("");
		for(MultipartFile file:files)
		{
			if(file.getSize() == 0)
			{
				isValid = false;
				sb.append(file.getOriginalFilename()+" ");
			}
		}
		if(!isValid)
			error.rejectValue("files","error.file.size",new String[]{sb.toString()},"File size limit exceeded");
	}

		
}
