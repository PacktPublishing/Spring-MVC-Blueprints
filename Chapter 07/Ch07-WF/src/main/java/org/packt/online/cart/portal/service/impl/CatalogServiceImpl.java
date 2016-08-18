package org.packt.online.cart.portal.service.impl;

import java.util.List;

import org.packt.online.cart.portal.dao.CatalogDao;
import org.packt.online.cart.portal.model.data.Catalog;
import org.packt.online.cart.portal.model.data.Category;
import org.packt.online.cart.portal.model.data.Status;
import org.packt.online.cart.portal.model.form.CatalogForm;
import org.packt.online.cart.portal.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogDao catalogDao;
	
	@Override
	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return catalogDao.getCategories();
	}

	@Override
	public List<Status> getAllStatus() {
		// TODO Auto-generated method stub
		return catalogDao.getStatus();
	}

	@Override
	public List<Catalog> getAllCatalogs() {
		// TODO Auto-generated method stub
		return catalogDao.getCatalogs();
	}

	@Override
	public void saveCatalog(CatalogForm catalog) {
		Catalog cat = new Catalog();
		cat.setName(catalog.getName());
		cat.setPrice(catalog.getPrice());
		cat.setStock(catalog.getStock());
		cat.setExpiry(catalog.getExpiryDate());
		cat.setStatus(catalog.getStatus());
		Category category = new Category();
		category.setId(catalog.getCategory());
		cat.setCategory(category);
		catalogDao.addProduct(cat);
		
	}

}
