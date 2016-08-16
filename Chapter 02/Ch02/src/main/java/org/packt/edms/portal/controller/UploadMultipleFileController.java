/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.packt.edms.portal.model.form.MultipleFilesUploadForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/*
 *  This controller let user uploads multiple files into the filesystem
 */
@Controller
@RequestMapping("/edms/upload_multiple_form")
public class UploadMultipleFileController {

	@Autowired
	Validator multipleFileValidator;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(multipleFileValidator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		MultipleFilesUploadForm multipleFileUploadForm = new MultipleFilesUploadForm();
		model.addAttribute("multipleFileUploadForm", multipleFileUploadForm);
		return "upload_multiple_form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(
			Model model,
			@Validated @ModelAttribute("multipleFileUploadForm") MultipleFilesUploadForm multipleFileUploadForm,
			BindingResult bindingResult) {
		String returnVal = "view_files_form";
		if (bindingResult.hasErrors()) {
			model.addAttribute("multipleFileUploadForm", multipleFileUploadForm);
			returnVal = "upload_multiple_form";
		} else {
			List<MultipartFile> docFiles = multipleFileUploadForm.getFiles();
			if (docFiles.size() > 0 || docFiles != null) {
				Iterator<MultipartFile> iterate = docFiles.iterator();
				
				// accesses the repository otherwise creates it
				File dir = createUploadDirectory("tmpFiles");
				
				// retrieve all the files objects
				while (iterate.hasNext()) {
					MultipartFile multipartFile = iterate.next();
					returnVal = uploadIndividualFile(dir, multipartFile, model, multipleFileUploadForm);
					
				}
				
				model.addAttribute("multipleFileUploadForm", multipleFileUploadForm);

			}
			
		}

		return returnVal;
	}
	
	private File createUploadDirectory(String dirName){
		String rootPath = System.getProperty("catalina.home");
		File dir = new File(rootPath + File.separator + dirName);
		if (!dir.exists())
			dir.mkdirs();
		return dir;
	}
	
	private String uploadIndividualFile(File dir, MultipartFile multipartFile, Model model, MultipleFilesUploadForm multipleFileUploadForm){
		try {
			byte[] bytes = multipartFile.getBytes();

			// accesses the file from the source folder and copies it to the repository
			File serverFile = new File(dir.getAbsolutePath()
					+ File.separator
					+ multipartFile.getOriginalFilename());
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(serverFile));
			stream.write(bytes);
			stream.close();
            return "view_files_form";
		} catch (Exception e) {
			model.addAttribute("multipleFileUploadForm", multipleFileUploadForm);
			return "upload_multiple_form";
			
		}
	}

}
