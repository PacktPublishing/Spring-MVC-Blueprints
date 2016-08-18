package org.packt.online.cart.portal;

import java.util.HashSet;
import java.util.Set;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.RenderRequest;

import org.packt.online.cart.portal.model.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("VIEW")
public class SignupController {

	@RequestMapping(params = "action=signup")
	public void action(ActionRequest request, ActionResponse response,
			LoginForm loginForm, Errors errors, SessionStatus sessionStatus) {
		ValidationUtils.rejectIfEmpty(errors, "firstName", "firstName.empty",
				"Please, fill in your first name");
		ValidationUtils.rejectIfEmpty(errors, "lastName", "lastName.empty",
				"Please, fill in your last name");
		if (!errors.hasErrors()) {
			response.setRenderParameter("action", "login");
		}
	}

	@RequestMapping(params = "action=signup")
	public ModelAndView renderForm(RenderRequest request, ModelMap modelMap) {
		return new ModelAndView("signup");
	}

	@RequestMapping(params = "action=login")
	public ModelAndView renderGreeting(RenderRequest request) {
		return new ModelAndView("signup");
	}

	@RequestMapping
	public ModelAndView renderFormFirst(RenderRequest request) {
		ModelAndView modelAndView = new ModelAndView("login");

		LoginForm loginForm = new LoginForm();
		references(modelAndView);
		modelAndView.addObject("loginForm", loginForm);
		return modelAndView;
	}

	public void references(ModelAndView model) {
		// Set<String> roles = loginService.retrieveRoles();
		// Set<String> permissions = loginService.retrieverPermissions();

		Set<String> roles = new HashSet<>();
		roles.add("User");
		roles.add("Client");
		Set<String> permissions = new HashSet<>();
		permissions.add("Read");
		permissions.add("Create");
		model.addObject("roles", roles);
		model.addObject("permissions", permissions);

	}

}
