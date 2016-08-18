package org.packt.online.cart.portal.dao;

import java.util.List;

import org.packt.online.cart.portal.model.data.Catalog;
import org.packt.online.cart.portal.model.data.Category;
import org.packt.online.cart.portal.model.data.Status;

public interface CatalogDao {
	
	public List<Catalog> getCatalogs();
	public List<Status>  getStatus();
	public List<Category> getCategories();
    public void addProduct(Catalog catalog);
}
