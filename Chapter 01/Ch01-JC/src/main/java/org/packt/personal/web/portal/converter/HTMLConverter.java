package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;

public class HTMLConverter extends PropertyEditorSupport{

	@Override
	public void setAsText(String content) throws IllegalArgumentException {
		setValue(addTags(content));
	}
	
	public String addTags(String content){
		String newContent = "";
		String paragraphs[] = null;
		if(content.equals("") || content == null){
			newContent = content;
		} else {
			paragraphs = content.split("\n");
			for(String paragraph : paragraphs){
				newContent += "<p>" + paragraph.trim() + "<p>";
			}
		}
		
		return newContent;
	}
}
