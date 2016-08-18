package org.packt.online.cart.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.online.cart.portal.model.data.Category;
import org.packt.online.cart.portal.model.data.Status;
import org.packt.online.cart.portal.model.form.CatalogForm;
import org.packt.online.cart.portal.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ocs/inventory/catalog")
public class CatalogController {
	
	@Autowired
	private CatalogService catalogService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		CatalogForm catalogForm = new CatalogForm();
		model.addAttribute("catalogForm", catalogForm);
		references(model);
		return "catalog";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model, @ModelAttribute CatalogForm catalogForm){
		model.addAttribute("catalogForm", catalogForm);
		references(model);
		catalogService.saveCatalog(catalogForm);
		return "catalog";
	}
	
	
	public void references(Model model){
		List<Category> cat = catalogService.getAllCategories();
		List<Status> status = catalogService.getAllStatus();
		
		List<Integer> catId = new ArrayList<>();
		List<Integer> statusId = new ArrayList<>();
		
		for(Category c : cat){
			catId.add(c.getId());
		}
		
		for(Status s : status){
			statusId.add(s.getId());
		}
		
		model.addAttribute("catId", catId);
		model.addAttribute("statusId", statusId);
	}

}
