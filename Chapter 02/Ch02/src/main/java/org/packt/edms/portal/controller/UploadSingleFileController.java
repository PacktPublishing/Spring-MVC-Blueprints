/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.packt.edms.portal.model.form.SingeFileUploadForm;
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
 *  This controller is responsible for uploading single file to the filesystem.
 */
@Controller
@RequestMapping("/edms/upload_single_form")
public class UploadSingleFileController {
	
	@Autowired
	Validator singleFileValidator;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
        binder.setValidator(singleFileValidator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		SingeFileUploadForm singleFileForm = new SingeFileUploadForm();
		model.addAttribute("singleFileForm", singleFileForm);
		return "upload_single_form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(
			Model model,
			@Validated @ModelAttribute("singleFileForm") SingeFileUploadForm singleFileForm,
			BindingResult bindingResult) {
		String returnVal = "view_file_form";

		if (bindingResult.hasErrors()) {
			model.addAttribute("singleFileForm", singleFileForm);
			returnVal = "upload_single_form";
		} else {
			MultipartFile multipartFile = singleFileForm.getFile();
			
			try {
				 // creates the file system folder or repository
				File dir = createUploadDirectory("tmpFiles");

				// copies the file on server
				returnVal = uploadSingleFile(dir, multipartFile, model, singleFileForm);
			} catch (Exception e) {
				model.addAttribute("singleFileForm", singleFileForm);
				returnVal = "upload_single_form";
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
	
	private String uploadSingleFile(File dir, MultipartFile multipartFile, Model model, SingeFileUploadForm singleFileForm) throws IOException{
		File serverFile = new File(dir.getAbsolutePath()
				+ File.separator + multipartFile.getOriginalFilename());
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(serverFile));
		
		byte[] bytes = multipartFile.getBytes();
		stream.write(bytes);
		stream.close();
		model.addAttribute("singleFileForm", singleFileForm);
	    return "view_file_form";	
	}

}
