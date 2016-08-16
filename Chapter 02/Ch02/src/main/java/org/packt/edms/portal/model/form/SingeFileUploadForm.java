package org.packt.edms.portal.model.form;


import org.springframework.web.multipart.MultipartFile;


public class SingeFileUploadForm {
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	 
    
}
