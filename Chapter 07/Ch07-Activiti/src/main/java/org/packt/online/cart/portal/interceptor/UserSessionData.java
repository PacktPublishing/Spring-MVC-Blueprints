package org.packt.online.cart.portal.interceptor;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserSessionData extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		Principal username = request.getUserPrincipal();

		HttpSession currentSession = request.getSession();
		currentSession.setAttribute("cartUser", username.getName());

		System.out.println("hi" + username);
	}

}
