package org.packt.erp.modules.controller;

import java.util.List;

import org.packt.erp.modules.jaxb.adapter.ListPaymentAp;
import org.packt.erp.modules.model.data.PaymentAp;
import org.packt.erp.modules.service.PaymentApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PaymentAppController {
	
	@Autowired
	private PaymentApService paymentApService;

	@RequestMapping(value="/erp/paymentmodes.json")
	public List<PaymentAp> showPaymentApJson(){
		return paymentApService.getAllPaymentModes();
	}
	
	
	@RequestMapping(value="/erp/paymentmodes.xml")
	public ListPaymentAp showPaymentApXml(){
		ListPaymentAp listPayment = new ListPaymentAp();
		listPayment.setListPaymentAp(paymentApService.getAllPaymentModes());
		return listPayment;
	}
	

	
}
