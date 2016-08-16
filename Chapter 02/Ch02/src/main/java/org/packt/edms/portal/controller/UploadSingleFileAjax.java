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
import java.util.Iterator;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/*
 *  This controller is responsible for the upload of single file to the filesystem. This can be modified to cater multiple file uploads.
 */
@Controller
public class UploadSingleFileAjax {
	
	@RequestMapping(value="/edms/single_upload_ajax_form", method=RequestMethod.GET)
	public String getForm(){
		return "single_upload_ajax_form";
	}
	
	@RequestMapping(value="/edms/single_upload_ajax", method=RequestMethod.GET)
	public String getPlugin(){
		return "single_upload_ajax";
	}
	
	
	@RequestMapping(value="/edms/call_ajax", method=RequestMethod.POST)
	public String getFile(Model model, MultipartHttpServletRequest request, HttpServletResponse response){
		
		 Iterator<String> itr =  request.getFileNames();
		 
	     MultipartFile multipart = request.getFile(itr.next());
	   
		 try {
			  
			   
			 // access the file system folder or repository otherwise it creates it
			  File dir = createUploadDirectory("tmpFiles");

	         // copies the file on server
	        uploadAjaxFile(dir, multipart, model);
	         
		} catch (IOException e) {
			return "single_upload_ajax_form";
		}
	  
		return "view_ajax";
	}
	
	private File createUploadDirectory(String dirName){
		String rootPath = System.getProperty("catalina.home");
		File dir = new File(rootPath + File.separator + dirName);
		if (!dir.exists())
			dir.mkdirs();
		return dir;
	}
	
	private void uploadAjaxFile(File dir, MultipartFile multipart, Model model) throws IOException{
		 File serverFile = new File(dir.getAbsolutePath()
                 + File.separator + multipart.getOriginalFilename());
         BufferedOutputStream stream = new BufferedOutputStream(
                 new FileOutputStream(serverFile));
         byte[] bytes = multipart.getBytes();
         stream.write(bytes);
         stream.close();
         model.addAttribute("multipart", multipart);
	}

}
