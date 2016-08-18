package org.packt.erp.modules.service.impl;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.packt.erp.modules.dao.InventoryDao;
import org.packt.erp.modules.jaxb.adapter.ListCatalogAdapter;
import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// CXF Rest
@Service
@Transactional
public class InventoryServiceRestImpl {

	@Autowired
	private InventoryDao inventoryDao;

	@GET
	@Path("/getProductsJson")
	@Produces("application/json")
	public Response getProductsJson() {
		
		
		ArrayList<Catalog> list = (ArrayList<Catalog>) inventoryDao
				.getProducts();

		return Response.ok(list).build();
	}

	@GET
	@Path("/getProductsXML")
	@Produces("application/xml")
	public Response getProductsXml() {
		
		
		ArrayList<Catalog> list = (ArrayList<Catalog>) inventoryDao
				.getProducts();

		ListCatalogAdapter catAdapter = new ListCatalogAdapter();
		catAdapter.setCatList(list);
		return Response.ok(catAdapter).build();
	}

	@GET
	@Path("/getMaterialTypes")
	@Produces("application/json")
	public Response getMaterialTypes() {
	
		
		ArrayList<MaterialType> list = (ArrayList<MaterialType>) inventoryDao
				.getMaterialTypes();

		return Response.ok(list).build();
	}

}
