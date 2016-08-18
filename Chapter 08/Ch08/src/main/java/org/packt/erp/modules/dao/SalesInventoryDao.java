package org.packt.erp.modules.dao;

// JAX-WS-Document
import java.util.List;

import org.packt.erp.modules.model.data.Contact;
import org.packt.erp.modules.model.data.Supplier;

public interface SalesInventoryDao {
	
	public List<Supplier> getSuppliers();
	public Contact getContact(Integer id);

}
