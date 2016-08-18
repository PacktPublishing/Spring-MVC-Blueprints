package org.packt.erp.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountReceivableController {
	
	@RequestMapping("/erp/invoice")
	public String attachInvoice(){
		return "invoice";
	}

}
