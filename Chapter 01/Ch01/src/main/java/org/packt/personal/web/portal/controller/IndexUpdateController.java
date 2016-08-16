/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.controller;

import org.packt.personal.web.portal.model.form.Home;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/*
 * This controller calls processes form transactions for home page content updates
 */
@Controller
@SessionAttributes(value = { "statusSess", "homeSess" })
@RequestMapping("/pwp/index_update")
public class IndexUpdateController {

	@Autowired
	private Validator indexValidator;

	@InitBinder("homeForm")
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(indexValidator);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		Home homeForm = new Home();
		model.addAttribute("homeForm", homeForm);
		return "index_update";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(Model model,
			@ModelAttribute("homeForm") @Validated Home homeForm,
			BindingResult binding) {
		model.addAttribute("homeForm", homeForm);
		String returnVal = "index";
		if (binding.hasErrors()) {
			returnVal = "index_update";
		} else {
			model.addAttribute("homeSess", homeForm);
			model.addAttribute("statusSess", "undefault");
		}
		return returnVal;

	}

}
