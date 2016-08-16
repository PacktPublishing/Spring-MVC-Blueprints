package org.packt.personal.web.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.personal.web.portal.model.form.Professional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/pwp")
public class ProfessionalController {

	@RequestMapping(value="/professional", method=RequestMethod.GET)
	public String getProfessional(Model model){
		
			model.addAttribute("professional", initProfessional());
							
	return "professional";
	}
	
	@RequestMapping(value="/professional_redirect", method=RequestMethod.GET)
	public RedirectView updatePersonal(){

		return new RedirectView("/ch01/pwp/professional_update.html");
	}
	
	private Professional initProfessional() {
		Professional professional = new Professional();
		professional.setPosition("Java Arhitect");
		professional.setCompany("Alibata Solutions");
		professional.setYears(10);
		professional.setLocation("Asia");
		
		List<String> prevJobs = new ArrayList<>();
		prevJobs.add("Janitor");
		prevJobs.add("Agent");
		
		List<String> skillSets = new ArrayList<>();
		skillSets.add("Marketing");
		skillSets.add("Project Management");
		
		professional.setPrevJobs(prevJobs);
		professional.setSkillSets(skillSets);
		
		return professional;
	}
}
