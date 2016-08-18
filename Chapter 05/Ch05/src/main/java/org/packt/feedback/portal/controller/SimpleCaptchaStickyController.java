/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.controller;


import static nl.captcha.Captcha.NAME;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.captcha.CaptchaBean;
import nl.captcha.servlet.CaptchaServletUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  This class generates the SimpleCaptcha images for the client-side validation
 */

@Controller
public class SimpleCaptchaStickyController{
	
    @Autowired 
	private CaptchaBean captchaBean;

	
	@RequestMapping("/captcha/simple")
	public String getSimple(){
		return "sc";
	}
	
	
	@RequestMapping("/captcha/getSimpleCaptchaImage.bmp")
	public void getSimpleCaptchaImage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
       
	 captchaBean.build();
	 
	 CaptchaServletUtil.writeImage(response, captchaBean.getImage());
	    request.getSession().setAttribute(NAME, captchaBean);
	}
	
	
	 
}
