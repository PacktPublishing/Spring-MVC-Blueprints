/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.tanesha.recaptcha.ReCaptcha;
import nl.captcha.Captcha;

import org.packt.feedback.portal.botcaptcha.model.BotModel;
import org.packt.feedback.portal.model.form.FeedbackForm;
import org.packt.feedback.portal.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/*
 *  This controller generates the form view page of the Feedback form page. 
 *  BotCaptcha and ReCaptcha integration is highlighted here.
 */
@Controller
public class FeedbackFormController {

	// Enabling System proxy for BotCaptcha and ReCaptcha
	static {
		System.setProperty("java.net.useSystemProxies", "true");
	}

	@Autowired
	private ReCaptcha reCaptcha = null;

	@Autowired
	FeedbackService feedbackService;

	@RequestMapping(value = "/cfs/feedbacks_add/{topicId}", method = RequestMethod.GET)
	public String initForm(@PathVariable("topicId") int topicId, Model model) {

		FeedbackForm feedbackForm = new FeedbackForm();
		BotModel botModel = new BotModel();
		feedbackForm.setTopicId(topicId);
		feedbackForm.setBotModel(botModel);
		model.addAttribute("feedbackForm", feedbackForm);

		return "feedback_form";

	}

	@RequestMapping(value = "/cfs/feedback_process_add", method = RequestMethod.POST)
	public RedirectView submitForAdd(
			@ModelAttribute("feedbackForm") @Validated FeedbackForm feedbackForm,
			HttpServletRequest request, BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) {

		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);

		redirectView.setUrl("/cfs/feedbacks/" + feedbackForm.getTopicId());

		if (result.hasErrors()) {
			redirectView.setUrl("/cfs/feedbacks/" + feedbackForm.getTopicId());
		} else {
			redirectAttributes.addFlashAttribute("css", "success");
            String answer = request.getParameter("kaptchaAnswer");
			HttpSession session = request.getSession();
			if (validateKaptcha(session, answer)) {
				redirectAttributes.addFlashAttribute("msg",
						"New feedback added successfully!");
				feedbackService.addFeedback(feedbackForm.getTopicId(),
						feedbackForm);
				;
				redirectView.setUrl("/cfs/feedbacks/"
						+ feedbackForm.getTopicId());
			} else {
				redirectView.setUrl("/cfs/feedbacks_add/"
						+ feedbackForm.getTopicId());
			}

		}

		return redirectView;
	}

	@RequestMapping(value = "/cfs/feedback_process_edit", method = RequestMethod.POST)
	public RedirectView submitForUpdate(
			@ModelAttribute("feedbackForm") @Validated FeedbackForm feedbackForm,
			HttpServletRequest request, BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) {

		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		System.out.println("form: " + feedbackForm.getTopicId());
		System.out.println("form: " + feedbackForm.getId());
		redirectView.setUrl("/cfs/feedbacks/" + feedbackForm.getTopicId());

		if (result.hasErrors()) {
			redirectView.setUrl("/cfs/feedbacks/" + feedbackForm.getTopicId());
		} else {
			redirectAttributes.addFlashAttribute("css", "success");

			   String answer = request.getParameter("simpleCaptchaAnswer");
				HttpSession session = request.getSession();
			if (validateSimpleCaptcha(session, answer)) {
				redirectAttributes.addFlashAttribute("msg",
						"Feedback "+ feedbackForm.getId() +" updated successfully!");
				feedbackService.updateFeedback(feedbackForm.getTopicId(),
						feedbackForm);
				
			} else {
				redirectView.setUrl("/cfs/feedbacks/"+feedbackForm.getTopicId()+"/"+feedbackForm.getId()+"/update");
			}

		}

		return redirectView;
	}
	
	

	 public static boolean validateSimpleCaptcha( HttpSession session, String answer) {
	        Captcha captcha = (Captcha) session.getAttribute( Captcha.NAME );
	        String code = captcha.getAnswer();
	        if( code.equals(answer) ) {
	            return true;
	        }
	        return false;
	    }
	 
	 public boolean validateKaptcha(HttpSession session, String kaptchaResult) {
			String code = (String) session
					.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
			if (code.equals(kaptchaResult)) {
				return true;
			}
			return false;
		}

}
