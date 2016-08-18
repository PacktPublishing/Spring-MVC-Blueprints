package org.packt.erp.modules.controller;

import org.packt.erp.modules.ws.InvoiceProductRequest;
import org.packt.erp.modules.ws.InvoiceProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.client.core.WebServiceTemplate;

@Controller
public class ProductInvoiceController {
	@Autowired
	WebServiceTemplate webServiceTemplate;

	@RequestMapping("/erp/invoice/record")
	public String invoiceRecord(Model model) {
		InvoiceProductRequest request = new InvoiceProductRequest();
		request.setInvoiceId(123);
		InvoiceProductResponse response = (InvoiceProductResponse) webServiceTemplate
				.marshalSendAndReceive(request);
		model.addAttribute("product", response.getInvoicedProduct());
		return "test";
	}

}
