package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;

public class YearConverter extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Integer year = 0;
		try{
			year = Integer.parseInt(text.trim());
		}catch(Exception e){
			year = 0;
		}
		setValue(year);
	}

}
