/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 *  This controller downloads and decrypts the file from the repository
 */
@Controller
public class DownloadDecryptFileController {
	
	@RequestMapping(value = "/edms/download_single_decrypt", method = RequestMethod.GET)
	public String downloadFile(@RequestParam("fileName") String fileName, @RequestParam("key") String key, 
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		// retrieves the filename and removes .signed from
		StringBuilder sb = new StringBuilder(fileName);
		String newFilename = sb.delete(fileName.length()-7, fileName.length()).toString();
		
		// gets the real path of the signed document
		String filePath = System.getProperty("catalina.home") + File.separator
				+ "tmpFiles" + File.separator + fileName;
		File downloadFile = new File(filePath);
		
		// creates a real path for the decrypted file
		String newFilePath = System.getProperty("catalina.home") + File.separator
				+ "tmpFiles" + File.separator + newFilename;
		
		// decrypts the signed document from the repository using DES Algorithm
		byte[] decryptedFile = decryptedContent(downloadFile, key);
		
		// copy the decrypted file to the path
		downloadFile(newFilePath, downloadFile, decryptedFile, request, response);
		return "";

	}
	
	public byte[] decryptDESFile(String key, byte[] cipherText) {
		BlockCipher engine = new DESEngine();
        byte[] bytes = key.getBytes();
        BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(engine));
        cipher.init(false, new KeyParameter(bytes));
        byte[] rv = new byte[cipher.getOutputSize(cipherText.length)];
        int tam = cipher.processBytes(cipherText, 0, cipherText.length, rv, 0);
        try {
            cipher.doFinal(rv, tam);
        } catch (Exception ce) {
            ce.printStackTrace();
        }
        return rv;
    }
	
	private byte[] decryptedContent(File downloadFile, String key) throws IOException{
		
		FileInputStream fis = new FileInputStream(downloadFile);
		byte[] bytes= new byte[(int) downloadFile.length()];
		fis.read(bytes);
		
		byte[] decryptedFile = decryptDESFile(key, bytes);
		return decryptedFile;
	}
	
	private void downloadFile(String newFilePath, File downloadFile,byte[] decryptedFile, HttpServletRequest request, HttpServletResponse response) throws IOException{
		FileOutputStream decryptFos = 
                new FileOutputStream(newFilePath); 
		decryptFos.write(decryptedFile);
		decryptFos.close();
		
		File downloadedFile = new File(newFilePath);
			
		// identifies the rendition types
		ServletContext context = request.getServletContext();
		String mimeType = context.getMimeType(newFilePath);
		if (mimeType == null) {
			// set to binary type if MIME mapping not found
			mimeType = "application/octet-stream";
		}
		
		// sets content attributes for the response
		response.setContentType(mimeType);
		response.setContentLength((int) downloadFile.length());

		// sets headers for the response for the decrypted file
		String headerKey = "Content-Disposition";
		String headerValue = String.format("attachment; filename=\"%s\"", downloadedFile.getName());
		response.setHeader(headerKey, headerValue);
		
		FileInputStream fiss;
		try {
			fiss = new FileInputStream(downloadedFile);
			FileCopyUtils.copy(fiss, response.getOutputStream());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
