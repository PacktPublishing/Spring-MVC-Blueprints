package org.packt.erp.modules.jaxb.adapter;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.packt.erp.modules.model.data.PaymentAp;

@XmlRootElement(name="paymentmodes")
public class ListPaymentAp {
	
	private List<PaymentAp> listPaymentAp;

	public List<PaymentAp> getListPaymentAp() {
		return listPaymentAp;
	}

	public void setListPaymentAp(List<PaymentAp> listPaymentAp) {
		this.listPaymentAp = listPaymentAp;
	}
	
	

}
