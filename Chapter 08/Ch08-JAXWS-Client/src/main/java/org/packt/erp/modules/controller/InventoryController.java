package org.packt.erp.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InventoryController {
	
	@RequestMapping("/erp/inventory")
	public String indexInventory(){
		return "catalog";
	}

}
