/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * This is a custom property editor for birthday conversion from String to Date object
 */
public class BirthDateConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat format = new SimpleDateFormat("mm/yy/dd");
		Date birthDate;
		try {
			birthDate = format.parse(text.trim());
		} catch (ParseException e) {

			birthDate = new Date();
		}
		setValue(birthDate);
	}
}
