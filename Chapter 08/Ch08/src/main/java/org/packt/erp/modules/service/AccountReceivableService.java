package org.packt.erp.modules.service;

import java.util.List;

import org.packt.erp.modules.ws.InvoicedProducts;


// Proxy for Spring-WS
public interface AccountReceivableService {
	
	public InvoicedProducts getInvProduct(Integer id);
	public List<InvoicedProducts> getInvProducts();
	public void setInvoicedProduct(InvoicedProducts invoicedProduct);

}
