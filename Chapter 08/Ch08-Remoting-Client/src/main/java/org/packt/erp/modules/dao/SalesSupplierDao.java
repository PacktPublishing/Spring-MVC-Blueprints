package org.packt.erp.modules.dao;

import java.util.List;

import org.packt.erp.modules.model.data.Customer;
import org.packt.erp.modules.model.data.Supplier;

public interface SalesSupplierDao {
	
	public void setSupplier(Supplier supplier);
	public Supplier getSupplier(Integer id);
	public List<Supplier> getSuppliers();

}
