/*
 * Sherwin John Calleja-Tragura
 * Student Management Portal
 */

package org.packt.academic.student.portal.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// Computes number of users

public class LogoutInterceptor extends HandlerInterceptorAdapter  {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//HttpSession session = request.getSession();
		//session.invalidate();
		//session = request.getSession(true);
		
		 
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		 HttpSession session = request.getSession();
		   // long timeUsed = System.currentTimeMillis();
		   Date date = new Date();
		   long timeUsed = date.getTime();
		    
		    session.setAttribute("timeUsed", timeUsed);
		  //  HttpSession session = request.getSession();
		 //   long timeStarted = (long)session.getAttribute("timeStarted");
		 //   long timeUsed = System.currentTimeMillis() - timeStarted;
		 //   session.setAttribute("timeUsed", timeUsed);
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		return true;
	}
}
