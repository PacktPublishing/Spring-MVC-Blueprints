package org.packt.feedback.portal.service.impl;

import org.packt.feedback.portal.model.form.EmailFeedback;
import org.packt.feedback.portal.service.EmailService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class EmailServiceImpl implements EmailService {
	private RestTemplate restTemplate = new RestTemplate();
	
	
	
	@Value("${sendgrid.api.user}")
	private String sendgridApiUser;
	
	@Value("${sendgrid.api.key}")
	private String sendgridApiKey;

	@Override
	public boolean send(EmailFeedback message) {
		try {
			MultiValueMap<String, Object> vars = new LinkedMultiValueMap<String, Object>();
			vars.add("api_user", sendgridApiUser);
			vars.add("api_key", sendgridApiKey);
			vars.add("fromname", message.getSenderName());
			vars.add("from", message.getSenderEmail());
			vars.add("bcc", message.getCcEmail());
			vars.add("subject", message.getSubject());
			vars.add("text", "");
			vars.add("html", message.getBody());
			vars.add("to", message.getReceiverEmail());
			vars.add("toname", message.getReceiverName());
			
			restTemplate.postForLocation("http://sendgrid.com/api/mail.send.json", vars);
		} catch (Exception ex) {
			
			return false;
		}

		return true;
	}
	

}
