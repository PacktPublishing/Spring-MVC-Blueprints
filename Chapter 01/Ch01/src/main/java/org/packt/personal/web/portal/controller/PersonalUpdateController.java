/*
 * Author: Sherwin John Calleja-Tragura
 * Version: 1.0
 * Date: May 30, 2015
 */
package org.packt.personal.web.portal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.packt.personal.web.portal.converter.AgeConverter;
import org.packt.personal.web.portal.converter.BirthDateConverter;
import org.packt.personal.web.portal.converter.YearConverter;
import org.packt.personal.web.portal.model.form.Biography;
import org.packt.personal.web.portal.model.form.Education;
import org.packt.personal.web.portal.model.form.Personal;
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
 * This controller processes content update for the Personal Information Page
 */
@Controller
@SessionAttributes(value = { "pStatusSess", "personSess" })
@RequestMapping("/pwp/personal_update")
public class PersonalUpdateController {

	@Autowired
	Validator personalValidator;

	@InitBinder("personForm")
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(personalValidator);
		binder.registerCustomEditor(Integer.class, "biography.age",
				new AgeConverter());
		binder.registerCustomEditor(Integer.class, "education.year",
				new YearConverter());
		binder.registerCustomEditor(Date.class, "biography.birthDate",
				new BirthDateConverter());
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initForm(Model model) {
		Biography bio = new Biography();
		Education educ = new Education();
		Personal personForm = new Personal();
		personForm.setBiography(bio);
		personForm.setEducation(educ);
		references(model);
		model.addAttribute("personForm", personForm);
		return "personal_update";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(Model model,
			@ModelAttribute("personForm") @Validated Personal personForm,
			BindingResult binding) {
		model.addAttribute("personForm", personForm);
		String returnVal = "personal";
		if (binding.hasErrors()) {
			references(model);
			returnVal = "personal_update";
		} else {
			model.addAttribute("personSess", personForm);
			model.addAttribute("pStatusSess", "undefault");
		}
		return returnVal;

	}

	public void references(Model model) {
		List<String> hobbiesList = new ArrayList<String>();
		hobbiesList.add("Not Applicable");
		hobbiesList.add("Singing");
		hobbiesList.add("Painting");
		hobbiesList.add("Traveling");
		hobbiesList.add("Writing");
		hobbiesList.add("Swimming");
		model.addAttribute("hobbiesList", hobbiesList);

		List<String> readingsList = new ArrayList<String>();
		readingsList.add("Not Applicable");
		readingsList.add("Novel");
		readingsList.add("Magazine");
		readingsList.add("Newspaper");
		readingsList.add("Diaries");
		model.addAttribute("readingsList", readingsList);

		List<String> educLevelList = new ArrayList<String>();
		educLevelList.add("Not Applicable");
		educLevelList.add("Doctoral");
		educLevelList.add("Masters");
		educLevelList.add("College");
		educLevelList.add("Vocational");
		educLevelList.add("High School");
		model.addAttribute("educLevelList", educLevelList);

	}

}
