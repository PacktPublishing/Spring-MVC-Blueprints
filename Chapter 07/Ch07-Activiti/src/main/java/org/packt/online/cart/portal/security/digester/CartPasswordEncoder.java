package org.packt.online.cart.portal.security.digester;

/*
 *  Sherwin John C. Tragura
 *  Standalone encryption decryption with salt using ShaPasswordEncoder
 *  
 */

import org.jasypt.digest.StandardStringDigester;
import org.jasypt.digest.StringDigester;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

public class CartPasswordEncoder implements StringDigester {

	public StandardStringDigester digester = null;
	public CartPasswordEncoder(){
		digester = new StandardStringDigester();
	}
	
	public String digest(String password) {	
		digester.setAlgorithm("SHA-512");
		digester.setIterations(1000);
		String newpassword = digester.digest(password);
		return newpassword;
	}

	public boolean matches(String password, String encpassword) {
		if (digester.matches(password, encpassword)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ShaPasswordEncoder enc = new ShaPasswordEncoder(512);
		enc.setIterations(1000);
		enc.setEncodeHashAsBase64(true);
		String encodedPass = enc.encodePassword("nesa", "nesa");
		System.out.println(encodedPass);
		System.out.println(enc.isPasswordValid(encodedPass, "nesa", "nesa"));
	}

}
