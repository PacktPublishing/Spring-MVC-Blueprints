package org.packt.erp.modules.dao;

import org.packt.erp.modules.model.data.InvoicedProducts;


public interface AccountReceivableDao {
	
	public InvoicedProducts getInvoicedProduct(Integer id);

}
