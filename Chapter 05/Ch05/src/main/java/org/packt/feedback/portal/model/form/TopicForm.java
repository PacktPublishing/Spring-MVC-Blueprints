package org.packt.feedback.portal.model.form;

import org.packt.feedback.portal.botcaptcha.model.BotModel;

public class TopicForm {
	
	private Integer id;
	private String title;
	private String description;
	
	private BotModel botModel;
	
	
		
	public BotModel getBotModel() {
		return botModel;
	}
	public void setBotModel(BotModel botModel) {
		this.botModel = botModel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isNew() {
		return (this.id == null);
	}
	

}
