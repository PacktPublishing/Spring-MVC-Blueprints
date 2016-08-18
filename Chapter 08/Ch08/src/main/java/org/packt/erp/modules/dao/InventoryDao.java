package org.packt.erp.modules.dao;

import java.util.List;

import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;

// JAX-WS RPC
public interface InventoryDao {
	
	public List<Catalog> getProducts();
	public Catalog getProduct(Integer id);
	public void setProduct(Catalog product);
	public List<MaterialType> getMaterialTypes();
	public List<Uom> getUnitMeasure();

}
