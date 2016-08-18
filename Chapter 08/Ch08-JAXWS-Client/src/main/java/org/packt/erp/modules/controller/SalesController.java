package org.packt.erp.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalesController {
	
	@RequestMapping("/erp/sales")
	public String addSales(){
		return "sales";
	}
	
	
	

}
