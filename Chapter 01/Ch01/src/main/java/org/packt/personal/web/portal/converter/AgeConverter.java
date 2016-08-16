/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;

/*
 * This is a custom property editor for age conversion from String to Integer
 */
public class AgeConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Integer age = 0;
		try {
			age = Integer.parseInt(text.trim());
		} catch (Exception e) {
			age = 18;
		}

		setValue(age);
	}

}
