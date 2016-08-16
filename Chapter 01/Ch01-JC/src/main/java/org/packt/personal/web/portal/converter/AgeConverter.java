package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;

public class AgeConverter extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Integer age = 0;
		try{
			age = Integer.parseInt(text.trim());
		}catch(Exception e){
			age = 18;
		}
		
		setValue(age);
	}

}
