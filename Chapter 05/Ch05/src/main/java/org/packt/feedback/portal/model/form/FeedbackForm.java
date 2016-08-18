/*
 *  Author: Sherwin John Caleja-Tragura
 *  Version: 1.0
 */
package org.packt.feedback.portal.model.form;

import org.packt.feedback.portal.botcaptcha.model.BotModel;


public class FeedbackForm {
	
	private Integer topicId ;
	private String name;
	private String email;
	private String feedback;
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	private BotModel botModel;

	
	public BotModel getBotModel() {
		return botModel;
	}
	public void setBotModel(BotModel botModel) {
		this.botModel = botModel;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public boolean isNew() {
		return (this.id == null);
	}
	

}
