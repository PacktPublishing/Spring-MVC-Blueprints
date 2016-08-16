package org.packt.edms.portal.model.form;

import org.springframework.web.multipart.MultipartFile;

public class SingleFileEncryptForm {
	
	private MultipartFile file;
	private String key;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	

}
