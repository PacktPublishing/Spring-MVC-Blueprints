package org.packt.erp.modules.controller;

import java.util.List;

import org.packt.erp.modules.model.data.Person;
import org.packt.erp.modules.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RemotePersonsController {
	
	@Autowired
	PersonService personService;
	
	@Autowired
	PersonService personServiceBurlap;
	
	@RequestMapping("/erp/admin/hessianlist")
	public String testHessian(Model model){
		
		List<Person> persons = personService.getPersons();
		model.addAttribute("persons", persons);
		return "hessian-test";
	}
	
	@RequestMapping("/erp/admin/burlaplist")
	public String testBurlap(Model model){
		
		List<Person> persons = personService.getPersons();
		model.addAttribute("persons", persons);
		return "burlap-test";
	}

}
