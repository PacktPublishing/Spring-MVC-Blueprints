package org.packt.edms.portal.model.form;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MultipleFilesUploadForm {
	private List<MultipartFile> files;
	 
    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    } 

}
