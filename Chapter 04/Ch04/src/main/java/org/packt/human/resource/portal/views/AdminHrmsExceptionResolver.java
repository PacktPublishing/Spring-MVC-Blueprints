package org.packt.human.resource.portal.views;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class AdminHrmsExceptionResolver extends
		SimpleMappingExceptionResolver {

	@Override
	public String buildLogMessage(Exception ex, HttpServletRequest request) {
        return "Admin Module exception: " + ex.getLocalizedMessage();
    }
}
