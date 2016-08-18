/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */

package org.packt.feedback.portal.controller;

import javax.servlet.http.HttpServletRequest;

import net.tanesha.recaptcha.ReCaptcha;
import net.tanesha.recaptcha.ReCaptchaResponse;

import org.packt.feedback.portal.botcaptcha.model.BotModel;
import org.packt.feedback.portal.model.form.TopicForm;
import org.packt.feedback.portal.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import botdetect.web.Captcha;

/* 
 *  This controller generates the form page for the Main Topic page.
 */
@Controller
public class TopicFormController {

	static {
		System.setProperty("java.net.useSystemProxies", "true");
	}

	@Autowired
	private ReCaptcha reCaptcha = null;

	@Autowired
	TopicService topicService;

	@RequestMapping(value = "/cfs/topic_process_add", method = RequestMethod.POST)
	public RedirectView submitForAdd(
			@ModelAttribute("topicForm") @Validated TopicForm topicForm,
			HttpServletRequest request, BindingResult result, Model model,
			final RedirectAttributes redirectAttributes,
			@RequestParam("recaptcha_challenge_field") String challangeField,
			@RequestParam("recaptcha_response_field") String responseField) {

		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/cfs/topics.html");
	
		
		if (result.hasErrors()) {
			redirectView.setUrl("/cfs/topics.html");
		} else {
			redirectAttributes.addFlashAttribute("css", "success");

			String remoteAddress = request.getRemoteAddr();
			ReCaptchaResponse reCaptchaResponse = this.reCaptcha.checkAnswer(
					remoteAddress, challangeField, responseField);
			if (reCaptchaResponse.isValid()) {
				redirectAttributes.addFlashAttribute("msg",
						"New topic added successfully!");
				topicService.addTopic(topicForm);
				redirectView.setUrl("/cfs/topics.html");
			} else {
				redirectView.setUrl("/cfs/topics_add.html");
			}

		}

		return redirectView;
	}

	@RequestMapping(value = "/cfs/topic_process_update", method = RequestMethod.POST)
	public RedirectView submitForUpdate(
			@ModelAttribute("topicForm") @Validated TopicForm topicForm,
			HttpServletRequest request, BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) {

		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);

		redirectView.setUrl("/cfs/topics.html");

		if (result.hasErrors()) {
			redirectView.setUrl("/cfs/topics.html");
		} else {
			redirectAttributes.addFlashAttribute("css", "success");

			boolean botCaptchaValid = createBotCaptcha(topicForm.getBotModel(),
					request);
			if (botCaptchaValid) {
				redirectAttributes.addFlashAttribute("msg",
						"Topic " + topicForm.getId() +" updated successfully!");
				topicService.updateTopic(topicForm);
				redirectView.setUrl("/cfs/topics.html");
			} else {
				redirectView.setUrl("/cfs/topics/" + topicForm.getId()
						+ "/update");
			}

		}

		return redirectView;
	}

	/*
	 * This method validates the BotCaptcha text image from the view.
	 */
	public boolean createBotCaptcha(BotModel botModel,
			HttpServletRequest request) {
		Captcha captcha = Captcha.load(request, "updateTopicCaptcha");
		boolean isHuman = captcha.validate(request,
				botModel.getCaptchaCodeTextBox());
		if (isHuman) {
			return true;

		} else {
			return false;

		}

	}

	// show add user form
	@RequestMapping(value = "/cfs/topics_add", method = RequestMethod.GET)
	public String initForm(Model model) {

		TopicForm topicForm = new TopicForm();

		BotModel botModel = new BotModel();
		topicForm.setBotModel(botModel);
		model.addAttribute("topicForm", topicForm);

		return "topic_form";

	}

}
