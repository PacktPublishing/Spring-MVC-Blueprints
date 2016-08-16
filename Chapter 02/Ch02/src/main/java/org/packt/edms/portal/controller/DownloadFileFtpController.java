/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/* 
 * This controller download specified file from the FTP server to the client's filesystem.
 */
@Controller
public class DownloadFileFtpController {

	@RequestMapping(value = "/edms/download_single_ftp", method = RequestMethod.GET)
	public String downloadFile(@RequestParam("fileName") String fileName,
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		// identifies the FTP server for file retrieval
		FTPClient ftpClient = new FTPClient();
		FileOutputStream fos = null;
		String ftpServer = "ftp.alibatabusiness.com";
		
		try {
			// establishes connection to the FTP server
			ftpClient.connect(ftpServer);

			// passes the username and password to validate connection, otherwise returns false
			// successful
			boolean login = ftpClient.login(username, password);
		
			if (login) {
				// retrieves the filename from the FTP server and 
				// drops the file to a real path in the client's filesystem
				fos = new FileOutputStream(fileName);
				boolean download = ftpClient.retrieveFile(
						"C:\\Users\\sjctrags\\Downloads\\" + fileName, fos);
				if (!download) {
					throw new ServletException();
				} 

				// logout the user, otherwise returns false
				boolean logout = ftpClient.logout();
				if (!logout) {
					throw new ServletException();
				}
			} else {
				throw new ServletException();
			}

		} catch (SocketException e) {
			throw new ServletException();
		} catch (IOException e) {
			throw new ServletException();
		} finally {
			try {
				fos.close();
				ftpClient.disconnect();
			} catch (IOException e) {
				throw new ServletException();
			}
		}

		return "view_file_ftp";

	}

}
