package org.packt.erp.modules.service.impl;

import java.util.List;

import org.packt.erp.modules.dao.SalesSupplierDao;
import org.packt.erp.modules.model.data.Supplier;
import org.packt.erp.modules.model.form.SupplierForm;
import org.packt.erp.modules.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Burlap Remoting
@Service("/supplierService.http")
@Transactional
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	SalesSupplierDao supplierDao;

	@Override
	public void setSupplier(SupplierForm supplier) {
		Supplier supplierData = new Supplier();
		supplierData.setName(supplier.getName());
		supplierData.setStreet(supplier.getStreet());
		supplierData.setCity(supplier.getCity());
		supplierData.setCountry(supplier.getCountry());
		supplierData.setZip(supplier.getZip());
		supplierData.setFax(supplier.getFax());
		supplierData.setTelephone(supplier.getTelephone());
		supplierData.setEmail(supplier.getEmail());
		supplierDao.setSupplier(supplierData);
		
	}

	@Override
	public Supplier getSupplier(Integer id) {
		// TODO Auto-generated method stub
		return supplierDao.getSupplier(id);
	}

	@Override
	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return supplierDao.getSuppliers();
	}

}
