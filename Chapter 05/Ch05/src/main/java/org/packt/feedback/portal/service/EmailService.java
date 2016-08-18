package org.packt.feedback.portal.service;

import org.packt.feedback.portal.model.form.EmailFeedback;

public interface EmailService {
	public boolean send(EmailFeedback message);
}