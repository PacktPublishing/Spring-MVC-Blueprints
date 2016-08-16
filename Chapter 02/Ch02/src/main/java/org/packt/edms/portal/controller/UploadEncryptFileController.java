/*
 *  Author: Sherwin John Calleja-Tragura
 *  Version: 1.0
 *  Date: June 5, 2015
 */

package org.packt.edms.portal.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.packt.edms.portal.model.form.SingleFileEncryptForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/*
 *  This controller upload and encrypt the file for security purposes
 */

@Controller
@RequestMapping("/edms/upload_single_encrypt")
public class UploadEncryptFileController {
	

	@InitBinder
	public void initBinder(WebDataBinder binder) {
        
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		SingleFileEncryptForm singleFileEncryptForm = new SingleFileEncryptForm();
		model.addAttribute("singleFileEncryptForm", singleFileEncryptForm);
		return "upload_single_encrypt";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(
			Model model,
			@Validated @ModelAttribute("singleFileEncryptForm") SingleFileEncryptForm singleFileEncryptForm,
			BindingResult bindingResult) {
		String returnVal = "view_file_encrypt";

		if (bindingResult.hasErrors()) {
			model.addAttribute("singleFileEncryptForm", singleFileEncryptForm);
			returnVal = "upload_single_encrypt";
		} else {

			MultipartFile multipartFile = singleFileEncryptForm.getFile();

			try {
				
				// encrypts the file using DES Algorithm
				byte[] encContent = encryptedContent(multipartFile, "12345678");
				
				// accesses the repository otherwise creates it
				File dir = createUploadDirectory("tmpFiles");

				// Create the file on server with the .signed appended
			//	File serverFile = new File(dir.getAbsolutePath()
			//			+ File.separator + multipartFile.getOriginalFilename() +".signed");
				FileOutputStream imageOutFile = new FileOutputStream(dir.getAbsolutePath()
						+ File.separator + multipartFile.getOriginalFilename() +".signed");
				BufferedOutputStream stream = new BufferedOutputStream(imageOutFile);
				stream.write(encContent);
				stream.flush();
				stream.close();
				
				
				imageOutFile.close();

				model.addAttribute("signedFileName",  multipartFile.getOriginalFilename() +".signed");
				
			} catch (Exception e) {
				model.addAttribute("singleFileEncryptForm", singleFileEncryptForm);
				returnVal = "upload_single_encrypt";
			}
		}
		return returnVal;
	}
	
	private byte[] encryptedContent(MultipartFile multipartFile, String cipher) throws Exception, IOException{
		File convFile = new File( multipartFile.getOriginalFilename());
		multipartFile.transferTo(convFile);
		FileInputStream imageInFile = new FileInputStream(convFile);
		byte imageData[] = new byte[(int) convFile.length()];
		imageInFile.read(imageData);
		
		byte[] bytes = encryptDESFile(cipher,imageData);
		imageInFile.close();
		
		return bytes;
	}
	
	private byte[] encryptDESFile(String keys, byte[] plainText) {
		BlockCipher engine = new DESEngine();

        byte[] key = keys.getBytes();
        byte[] ptBytes = plainText;
        BufferedBlockCipher cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(engine));
        cipher.init(true, new KeyParameter(key));
        byte[] rv = new byte[cipher.getOutputSize(ptBytes.length)];
        int tam = cipher.processBytes(ptBytes, 0, ptBytes.length, rv, 0);
        try {
            cipher.doFinal(rv, tam);
        } catch (Exception ce) {
            ce.printStackTrace();
        }
        return rv;
    }
	
	
	
	private File createUploadDirectory(String dirName){
		String rootPath = System.getProperty("catalina.home");
		File dir = new File(rootPath + File.separator + dirName);
		if (!dir.exists())
			dir.mkdirs();
		return dir;
	}
	
	

}
