/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.packt.feedback.portal.model.form.EmailFeedback;
import org.packt.feedback.portal.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.octo.captcha.service.CaptchaServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

/*
 *  This controller creates the Email Feedback form view page.
 */
@Controller
@RequestMapping("/cfs/email")
public class EmailFormController {
	
	@Resource(name = "imageCaptchaService")
	private ImageCaptchaService imageCaptchaService;
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(Model model) {
		EmailFeedback emailFeedback = new EmailFeedback();
		model.addAttribute("emailForm", emailFeedback);
		return "email_form";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String send(@ModelAttribute("emailForm") EmailFeedback emailForm, HttpServletRequest req) {
		String answer = req.getParameter("captchTextResult");
		HttpSession session = req.getSession();
		if(validateJCaptcha(session, answer)){
			
			emailService.send(emailForm);
			// redirection
		}else{
			//redirection
		}
		return "email_form";
	}
	
	public boolean validateJCaptcha(HttpSession session, String captchaResult){
		boolean validCaptcha = false;
		  try {
		   validCaptcha = imageCaptchaService.validateResponseForID(session.getId(), captchaResult);
		   if(validCaptcha){
			   return true;
		   }
		  }
		  catch (CaptchaServiceException e) {
		   return false;
		  }
		return false;
	}
	

}
