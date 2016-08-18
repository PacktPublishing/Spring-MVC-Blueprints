package org.packt.feedback.portal.service;

import java.util.List;

import org.packt.feedback.portal.model.data.CfsFeedback;
import org.packt.feedback.portal.model.form.FeedbackForm;

public interface FeedbackService {
	
	public void addFeedback(Integer topicId, FeedbackForm feedbackForm);
	public List<CfsFeedback> retrieveAllFeedbacks(Integer topicId);
	public CfsFeedback retrieveFeedback(Integer topicId, Integer feedbackId);
	public void removeFeedback(Integer topicId, Integer feedbackId);
	public void updateFeedback(Integer topicId, FeedbackForm feedbackForm);


}
