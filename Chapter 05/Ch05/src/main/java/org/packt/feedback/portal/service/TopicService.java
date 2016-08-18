package org.packt.feedback.portal.service;

import java.util.List;

import org.packt.feedback.portal.model.data.CfsTopic;
import org.packt.feedback.portal.model.form.TopicForm;

public interface TopicService {
	
	public void addTopic(TopicForm topicForm);
	public List<CfsTopic> retrieveAllTopics();
	public CfsTopic retrieveTopic(Integer topicId);
	public void removeTopic(Integer topicId);
	public void updateTopic(TopicForm topicForm);

}
