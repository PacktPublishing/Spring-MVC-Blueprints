package org.packt.erp.modules.service.impl;

import org.packt.erp.modules.dao.InventoryDao;
import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;
import org.packt.erp.modules.model.form.InventoryForm;
import org.packt.erp.modules.service.InvoiceAddProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvoiceAddProductImpl implements InvoiceAddProduct {
	
	@Autowired
	private InventoryDao inventoryDao;
	

	@Transactional(
			propagation = Propagation.REQUIRED,
			isolation = Isolation.DEFAULT
			)
	@Override
	public void addProduct(InventoryForm invForm) {
		Catalog catalog = new Catalog();
		catalog.setName(invForm.getName());
		catalog.setDescription(invForm.getDescription());
		catalog.setCostPrice(invForm.getCostPrice());
		catalog.setRetailPrice(invForm.getRetailPrice());
		catalog.setWholesalePrice(invForm.getWholeSalePrice());
		catalog.setStock(invForm.getStock());
		catalog.setTags(invForm.getTags());
		catalog.setSupplierId(invForm.getVendor());
		
		Uom uom = new Uom();
		uom.setId(invForm.getUomId());
		
		MaterialType type = new MaterialType();
		type.setId(invForm.getTypeId());
		
		catalog.setUom(uom);
		catalog.setMaterialType(type);
		
		inventoryDao.setProduct(catalog);

	}

}
