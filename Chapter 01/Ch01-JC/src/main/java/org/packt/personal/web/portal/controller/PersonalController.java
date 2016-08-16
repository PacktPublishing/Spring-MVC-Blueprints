package org.packt.personal.web.portal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.packt.personal.web.portal.model.form.Biography;
import org.packt.personal.web.portal.model.form.Education;
import org.packt.personal.web.portal.model.form.Personal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/pwp/")
public class PersonalController {
	
	@RequestMapping(value="/personal", method=RequestMethod.GET)
	public String getPersonal(Model model){
		
			model.addAttribute("person", initPersonal());
							
	return "personal";
	}
	
	@RequestMapping(value="/personal_redirect", method=RequestMethod.GET)
	public RedirectView updatePersonal(){

		return new RedirectView("/ch01/pwp/personal_update.html");
	}
	
	@SuppressWarnings("deprecation")
	public Personal initPersonal(){
		Biography bio = new Biography();
		bio.setFirstName("Johnny");
		bio.setLastName("Lopez");
		bio.setAge(67);
		bio.setBirthDate(new Date(78,9,30));
		bio.setLocation("Asia");
		bio.setCountry("Philippines");
		
		List<String> hobbies = new ArrayList<>();
		hobbies.add("Music");
		hobbies.add("Painting");
		hobbies.add("Travel");
		List<String> readings = new ArrayList<>();
		readings.add("Novel");
		readings.add("Magazine");
		
		bio.setHobbies(hobbies);
		bio.setReadings(readings);
		
		Education educ = new Education();
		educ.setEducLevel("College");
		educ.setDegree("BS Computer Science");
		educ.setInstitution("UPLB");
		educ.setSpecialization("Algorithm");
		educ.setYear(2000);
		
		Personal person = new Personal();
		person.setEducation(educ);
		person.setBiography(bio);
		
		
		return person;
	}
	
	
}
