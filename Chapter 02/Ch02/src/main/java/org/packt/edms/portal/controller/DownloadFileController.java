/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 *  Downloads the file from the application's repository to the client's desired location.
 * 
 */
@Controller
public class DownloadFileController {

	@RequestMapping(value = "/edms/download_single_file", method = RequestMethod.GET)
	public String downloadFile(@RequestParam("fileName") String fileName, 
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		// locates the file to be downloaded
		String filePath = System.getProperty("catalina.home") + File.separator
				+ "tmpFiles" + File.separator + fileName;
		File downloadFile = new File(filePath);

		// identifies the rendition type of the file
		ServletContext context = request.getServletContext();
		String mimeType = context.getMimeType(filePath);
		if (mimeType == null) {
			// set to binary type if MIME mapping not found
			mimeType = "application/octet-stream";
		}
		
		// sets content attributes for the response
		response.setContentType(mimeType);
		response.setContentLength((int) downloadFile.length());

		// sets headers for the response
		String headerKey = "Content-Disposition";
		String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
		response.setHeader(headerKey, headerValue);
		
		// copies the file to the desired location
		FileInputStream fis;
		try {
			fis = new FileInputStream(downloadFile);
			FileCopyUtils.copy(fis, response.getOutputStream());
		} catch (FileNotFoundException e) {
			throw new ServletException();
		} catch (IOException e) {
			throw new ServletException();
		}

		return "";

	}
}
