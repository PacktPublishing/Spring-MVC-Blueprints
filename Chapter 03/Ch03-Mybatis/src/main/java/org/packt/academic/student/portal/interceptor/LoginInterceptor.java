package org.packt.academic.student.portal.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
	
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// long timeStarted = System.currentTimeMillis();
		// HttpSession session = request.getSession();
		// session.setAttribute("timeStarted", timeStarted);

		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		 //long timeStarted = System.currentTimeMillis();
		Date date = new Date();
		long timeStarted = date.getTime();
		 HttpSession session = request.getSession();
		 session.setAttribute("timeStarted", timeStarted);
	// session = request.getSession();
		
	   // long timeStarted = (long)session.getAttribute("timeStarted");
	   // long timeUsed = System.currentTimeMillis() - timeStarted;
	    
	   // session.setAttribute("timeUsed", timeUsed);
	}

}
