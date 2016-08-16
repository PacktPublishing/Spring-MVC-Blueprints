/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;

/*
 * This is a custom property editor for year conversion from String to Integer
 */
public class YearConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Integer year = 0;
		try {
			year = Integer.parseInt(text.trim());
		} catch (Exception e) {
			year = 0;
		}
		setValue(year);
	}

}
