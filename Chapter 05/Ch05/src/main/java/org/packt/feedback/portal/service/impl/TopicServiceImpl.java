package org.packt.feedback.portal.service.impl;

import java.util.Date;
import java.util.List;

import org.packt.feedback.portal.dao.TopicDao;
import org.packt.feedback.portal.model.data.CfsTopic;
import org.packt.feedback.portal.model.form.TopicForm;
import org.packt.feedback.portal.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	TopicDao topicDao;

	@Transactional
	@Override
	public List<CfsTopic> retrieveAllTopics() {
		return topicDao.getAllTopics();
	}

	@Transactional
	@Override
	public CfsTopic retrieveTopic(Integer topicId) {
		// TODO Auto-generated method stub
		return topicDao.getTopic(topicId);
	}

	@Transactional
	@Override
	public void removeTopic(Integer topicId) {
		topicDao.delTopic(topicId);
		
	}

	@Transactional
	@Override
	public void updateTopic(TopicForm topicForm) {
		CfsTopic topic = new CfsTopic();
		topic.setId(topicForm.getId());
		topic.setTitle(topicForm.getTitle());
		topic.setDescription(topicForm.getDescription());
		topic.setDate(new Date());
		topicDao.updateTopic(topic);

	}

	@Transactional
	@Override
	public void addTopic(TopicForm topicForm) {
		topicDao.addTopic(topicForm.getTitle(), topicForm.getDescription() , new Date());
		
	}

}
