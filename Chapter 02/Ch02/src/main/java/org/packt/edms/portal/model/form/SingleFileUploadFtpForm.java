package org.packt.edms.portal.model.form;

import org.springframework.web.multipart.MultipartFile;

public class SingleFileUploadFtpForm {

	private MultipartFile file;
	private String username;
	private String password;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
