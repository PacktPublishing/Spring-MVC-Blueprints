package org.packt.erp.modules.service;

import java.util.List;

import javax.jws.WebService;

import org.packt.erp.modules.model.data.Contact;
import org.packt.erp.modules.model.data.Supplier;

@WebService
public interface SalesInventoryService {
	
	public List<Supplier> getAllSuppliers();
	public Contact getContactInfo(Integer id);

}
