package org.packt.erp.modules.service;

import java.util.List;

import org.packt.erp.modules.model.data.Supplier;
import org.packt.erp.modules.model.form.SupplierForm;

public interface SupplierService {
	
	public void setSupplier(SupplierForm supplier);
	public Supplier getSupplier(Integer id);
	public List<Supplier> getSuppliers();

}
