package org.packt.feedback.portal.dao;

import java.util.List;

import org.packt.feedback.portal.model.data.CfsFeedback;
import org.packt.feedback.portal.model.form.FeedbackForm;

public interface FeedbackDao {
	public List<CfsFeedback> getAllFeedbacks(Integer topicId);
	public void addFeedback(Integer topicId, FeedbackForm feedback);
	public void delFeedback(Integer topicId, Integer feedbackId);
	public void updateFeedback(Integer topicId, FeedbackForm feedback);
	public CfsFeedback getFeedback(Integer topicId, Integer feedbackId);

}
