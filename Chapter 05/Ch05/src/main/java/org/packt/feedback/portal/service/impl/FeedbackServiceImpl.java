package org.packt.feedback.portal.service.impl;

import java.util.List;

import org.packt.feedback.portal.dao.FeedbackDao;
import org.packt.feedback.portal.model.data.CfsFeedback;
import org.packt.feedback.portal.model.form.FeedbackForm;
import org.packt.feedback.portal.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	FeedbackDao feedbackDao;

	@Override
	public void addFeedback(Integer topicId, FeedbackForm feedbackForm) {
		feedbackDao.addFeedback(topicId, feedbackForm);
		
	}

	@Override
	public List<CfsFeedback> retrieveAllFeedbacks(Integer topicId) {
		// TODO Auto-generated method stub
		return feedbackDao.getAllFeedbacks(topicId);
	}

	@Override
	public CfsFeedback retrieveFeedback(Integer topicId, Integer feedbackId) {
		// TODO Auto-generated method stub
		return feedbackDao.getFeedback(topicId, feedbackId);
	}

	@Override
	public void removeFeedback(Integer topicId, Integer feedbackId) {
		feedbackDao.delFeedback(topicId, feedbackId);
		
	}

	@Override
	public void updateFeedback(Integer topicId, FeedbackForm feedbackForm) {
		feedbackDao.updateFeedback(topicId, feedbackForm);
		
	}

}
