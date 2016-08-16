/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.controller;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.validation.constraints.NotNull;

import org.packt.personal.web.portal.model.domain.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * This controller processes the sending of email in Reach Out page
 */
@Controller
@RequestMapping("/pwp/contact")
public class EmailController {

	@NotNull
	@Autowired
	private SimpleMailMessage emailTemplate;

	@NotNull
	@Autowired
	private JavaMailSender emailSender;

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		Email emailForm = new Email();
		model.addAttribute("emailForm", emailForm);
		return "contact_us";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(Model model,
			@Validated @ModelAttribute("emailForm") Email emailForm,
			BindingResult binding) {
		model.addAttribute("emailForm", emailForm);
		String returnVal = "contact_us";
		if (binding.hasErrors()) {
			returnVal = "contact_us";
		} else {
			model.addAttribute("emailForm", emailForm);
			sendSimpleMail(emailForm);
			sendMailHTML(emailForm);
			sendMailWithTemplate(emailForm.getSendTo(), emailForm.getMessage());
		}
		return returnVal;
	}

	public void sendMailWithTemplate(String dear, String content) {

		String fromEmail = emailTemplate.getFrom();
		String[] toEmail = emailTemplate.getTo();
		String emailSubject = emailTemplate.getSubject();
		String emailBody = String
				.format(emailTemplate.getText(), dear, content);

		MimeMessage mimeMessage = emailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

			helper.setFrom(fromEmail);
			helper.setTo(toEmail);
			helper.setSubject(emailSubject);
			helper.setText(emailBody);

			/*
			 * If there is an attachment, uncomment this line...
			 * FileSystemResource file = new FileSystemResource("attachment.jpg");
			 * helper.addAttachment(file.getFilename(), file);
			 */

			emailSender.send(mimeMessage);
			System.out.println("Mail sent successfully.");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	public void sendSimpleMail(Email emailForm) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(emailForm.getSendTo());
		message.setSubject(emailForm.getSubject());
		message.setText(emailForm.getMessage());
		emailSender.send(message);
	}

	public void sendMailHTML(Email emailForm) {

		String fromEmail = emailForm.getSendTo();
		String toEmail = emailForm.getSendTo();
		String emailSubject = emailForm.getSubject();
		String emailBody = emailForm.getMessage();

		MimeMessage mimeMessage = emailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true,
					"utf-8");
			mimeMessage.setContent("<i><b>" + emailBody + "</b></i>",
					"text/html");
			helper.setFrom(fromEmail);
			helper.setTo(toEmail);
			helper.setSubject(emailSubject);

		
		} catch (MessagingException e) { }

		/*
		 * uncomment the following lines for attachment FileSystemResource file
		 * = new FileSystemResource("attachment.jpg");
		 * helper.addAttachment(file.getFilename(), file);
		 */

		emailSender.send(mimeMessage);
		System.out.println("Mail sent successfully.");

	}

}
