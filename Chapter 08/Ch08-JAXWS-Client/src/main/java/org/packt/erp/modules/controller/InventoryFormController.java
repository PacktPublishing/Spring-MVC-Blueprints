package org.packt.erp.modules.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.packt.erp.modules.model.form.InventoryForm;
import org.packt.erp.modules.service.impl.InventoryServiceImpl;
import org.packt.erp.modules.service.impl.InventoryServiceImplService;
import org.packt.erp.modules.service.impl.MaterialType;
import org.packt.erp.modules.service.impl.MaterialTypeArray;
import org.packt.erp.modules.service.impl.SalesInventoryServiceImpl;
import org.packt.erp.modules.service.impl.Supplier;
import org.packt.erp.modules.service.impl.Uom;
import org.packt.erp.modules.service.impl.UomArray;
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
	SalesInventoryServiceImpl salesInventoryServiceImpl;
	
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String initForm(Model model){
		InventoryForm invForm = new InventoryForm();
		model.addAttribute("invForm", invForm);
		references(model);
		return "add_inventory";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String submitForm(Model model, @ModelAttribute InventoryForm invForm){
		// JAX-WS RPC-based Client
		 InventoryServiceImplService inv = new InventoryServiceImplService();
	     InventoryServiceImpl invService = inv.getPort(InventoryServiceImpl.class);
	        org.packt.erp.modules.service.impl.InventoryForm wsForm = new org.packt.erp.modules.service.impl.InventoryForm();
	        wsForm.setName(invForm.getName());
	        wsForm.setDescription(invForm.getDescription());
	        wsForm.setCostPrice(invForm.getCostPrice());
	        wsForm.setRetailPrice(invForm.getRetailPrice());
	        wsForm.setWholeSalePrice(invForm.getWholeSalePrice());
	        wsForm.setVendor(invForm.getVendor());
	        wsForm.setUomId(invForm.getUomId());
	        wsForm.setTypeId(invForm.getTypeId());
	        wsForm.setStock(invForm.getStock());
	        wsForm.setTags(invForm.getTags());
	        invService.addProduct(wsForm);
		return "add_inventory";
	}
	
	public void references(Model model){
		
        // JAX-WS Document-based Client
		List<Supplier> suppliers = salesInventoryServiceImpl.getAllSuppliers();
		List<Integer> supplierNames = new ArrayList<>();
		Iterator<Supplier> iterate = suppliers.iterator();
		while(iterate.hasNext()){
			Supplier s = iterate.next();
			supplierNames.add(s.getId());
		}
		model.addAttribute("supplierNames", supplierNames);
		
		 // JAX-WS RPC-based Client
	
       InventoryServiceImplService inv = new InventoryServiceImplService();
       InventoryServiceImpl invService = inv.getPort(InventoryServiceImpl.class);
		
		MaterialTypeArray matArray =  invService.getMaterialTypes();
		
		List<MaterialType> productTypes = matArray.getItem();
		List<Integer> materialNames = new ArrayList<>();
		for(MaterialType mat: productTypes){
			 materialNames.add(mat.getId());
	     }
		model.addAttribute("materialNames", materialNames);
		
		UomArray skuArray = invService.getUnitMeasure();
		List<Uom> sku = skuArray.getItem();
		List<Integer> uomNames = new ArrayList<>();
		for(Uom u: sku){
			 uomNames.add(u.getId());
	    }
		model.addAttribute("units", uomNames);
		
		
		
	}

}
