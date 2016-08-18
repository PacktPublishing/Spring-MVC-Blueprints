package org.packt.erp.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PurchasingController {
	
	@RequestMapping("/erp/po")
	public String issuePO(){
		return "po";
	}

}
