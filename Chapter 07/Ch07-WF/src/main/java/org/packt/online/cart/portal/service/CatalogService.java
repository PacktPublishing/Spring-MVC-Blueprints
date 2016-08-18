package org.packt.online.cart.portal.service;

import java.util.List;

import org.packt.online.cart.portal.model.data.Catalog;
import org.packt.online.cart.portal.model.data.Category;
import org.packt.online.cart.portal.model.data.Status;
import org.packt.online.cart.portal.model.form.CatalogForm;

public interface CatalogService {
	
	public List<Category> getAllCategories();
	public List<Status>  getAllStatus();
	public List<Catalog> getAllCatalogs();
    public void saveCatalog(CatalogForm catalog);
}
