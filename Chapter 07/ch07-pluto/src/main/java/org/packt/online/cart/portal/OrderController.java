package org.packt.online.cart.portal;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("VIEW")
public class OrderController {

	@RequestMapping(params = "action=order")
	public void action(ActionRequest request, ActionResponse response,
			SessionStatus sessionStatus) {

		response.setRenderParameter("action", "login");

	}

	@RequestMapping(params = "action=order")
	public ModelAndView renderForm(RenderRequest request, ModelMap modelMap) {
		return new ModelAndView("order");
	}

	@RequestMapping(params = "action=login")
	public ModelAndView renderGreeting(RenderRequest request) {
		return new ModelAndView("login");
	}

	@RequestMapping
	public ModelAndView renderFormFirst(RenderRequest request) {
		ModelAndView modelAndView = new ModelAndView("order");

		return modelAndView;
	}

	public void references(ModelAndView model) {

	}

}
