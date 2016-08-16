/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.converter;

import java.beans.PropertyEditorSupport;

/*
 * This is a custom property editor used to convert string content to HTML snippet
 */
public class HTMLConverter extends PropertyEditorSupport {

	@Override
	public void setAsText(String content) throws IllegalArgumentException {
		setValue(addTags(content));
	}

	public String addTags(String content) {
		String newContent = "";
		String paragraphs[] = null;
		if (content.equals("") || content == null) {
			newContent = content;
		} else {
			paragraphs = content.split("\n");
			for (String paragraph : paragraphs) {
				newContent += "<p>" + paragraph.trim() + "<p>";
			}
		}

		return newContent;
	}
}
