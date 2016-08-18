package org.packt.erp.modules.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;
import org.packt.erp.modules.model.form.InventoryForm;
import org.packt.erp.modules.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/erp/inventory/add")
public class InventoryFormController {
	
	@Autowired
	InventoryService inventoryService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		InventoryForm invForm = new InventoryForm();
		model.addAttribute("invForm", invForm);
		references(model);
		return "add_inventory";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model, @ModelAttribute InventoryForm invForm){
		inventoryService.addProduct(invForm);
		invForm = new InventoryForm();
		model.addAttribute("invForm", invForm);
		references(model);
		
		return "add_inventory";
	}
	
	public void references(Model model){
		
		Catalog[] products = inventoryService.getProducts();
		List<Integer> suppliers = new ArrayList<>();
		for(int i =0; i < products.length; i++){
			Catalog c = products[i];
			suppliers.add(c.getId());
		}
		model.addAttribute("suppliers", suppliers);
		
		
		MaterialType[] mats = inventoryService.getMaterialTypes();
		List<Integer> materialTypes = new ArrayList<>();
		for(int i =0; i < mats.length; i++){
			MaterialType m = mats[i];
			materialTypes.add(m.getId());
		}
		model.addAttribute("materialTypes", materialTypes);
		
		
		Uom[] uoms = inventoryService.getUnitMeasure();
		List<Integer> uomTypes = new ArrayList<>();
		for(int i =0; i < uoms.length; i++){
			Uom u = uoms[i];
			uomTypes.add(u.getId());
		}
		model.addAttribute("uomTypes", uomTypes);
	}

}
