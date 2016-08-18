package org.packt.feedback.portal.dao;

import java.util.Date;
import java.util.List;

import org.packt.feedback.portal.model.data.CfsTopic;


public interface TopicDao {
	
	public List<CfsTopic> getAllTopics();
	public CfsTopic getTopic(int topicId);
	public void addTopic(String title, String description, Date data);
	public void delTopic(Integer id);
	public void updateTopic(CfsTopic topic);
	
}
