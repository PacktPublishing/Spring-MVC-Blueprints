/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import javax.servlet.ServletException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.packt.edms.portal.model.form.SingleFileUploadFtpForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 *  This controller uploads single file to the FTP server
 */
@Controller
@RequestMapping("/edms/upload_single_ftp")
public class UploadSingleFileFtpController {
	
	@InitBinder
	public void initBinder(){
		
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		SingleFileUploadFtpForm singleFtpForm = new SingleFileUploadFtpForm();
		model.addAttribute("singleFtpForm", singleFtpForm);
		return "upload_single_ftp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model, @Validated @ModelAttribute("singleFtpForm") SingleFileUploadFtpForm singleFtpForm, BindingResult bindingResult) throws ServletException, IOException{
		  String returnVal = "view_file_ftp";
		  if (bindingResult.hasErrors()) {
			model.addAttribute("singleFtpForm", singleFtpForm);
			returnVal = "upload_single_ftp";
		  } else {
			  
			    model.addAttribute("singleFtpForm",singleFtpForm);
			    FTPClient ftpClient = new FTPClient();
			    FileInputStream inputStream = null;
			    try {
			    	if (isFtpAccessValid(ftpClient, "<FTP URL here>", singleFtpForm)) {
			    			ftpClient.enterLocalPassiveMode(); // entry point to the FTP server
			    			ftpClient.setFileType(FTP.BINARY_FILE_TYPE); // file byte type
			    			
			    			 // accesses the repository otherwise creates it
			    			 // creates the file system folder or repository
							File dir = createUploadDirectory("tmpFiles");

			    			// creates the empty file on server
			    			File serverFile = new File(dir.getAbsolutePath()
			    								+ File.separator + singleFtpForm.getFile().getOriginalFilename());
			    			inputStream = new FileInputStream(serverFile);

			    			// uploads the file, returns false if errors are encountered
			    			boolean uploaded = ftpClient.storeFile(singleFtpForm.getFile().getOriginalFilename(), inputStream);
			    		    if(!uploaded) throw new ServletException();
			    						    
			    			// logout the user, returned true if logout successfully
			    			boolean logout = ftpClient.logout();
			    			if(!logout) throw new ServletException();
			    					    			
			    			model.addAttribute("singleFtpForm",singleFtpForm);
			    			model.addAttribute("username",singleFtpForm.getUsername());
			    			model.addAttribute("password",singleFtpForm.getPassword());
			    	} else {
			    			throw new ServletException();
			    	}

			  } catch (SocketException e) {
				  throw new ServletException();
			  } catch (IOException e) {
				  throw new ServletException();
			  } finally {
				  try {
					  ftpClient.disconnect();
				  } catch (IOException e) {
					  throw new ServletException();
				  }
			  }
		  }
		    
		return returnVal;
	}
	
	public boolean isFtpAccessValid(FTPClient ftpClient, String ftpUrl, SingleFileUploadFtpForm singleFtpForm) throws SocketException, IOException{
    	// the server FTP address
    	String ftpServer = "<FTP URL here>";
    	ftpClient.connect(ftpServer);
    	String str = "";
    	
    	// access the file system folder or repository otherwise it creates it
    	boolean login = ftpClient.login(singleFtpForm.getUsername(),singleFtpForm.getPassword());
    	return login;
	}
	
	private File createUploadDirectory(String dirName){
		String rootPath = System.getProperty("catalina.home");
		File dir = new File(rootPath + File.separator + dirName);
		if (!dir.exists())
			dir.mkdirs();
		return dir;
	}

}
