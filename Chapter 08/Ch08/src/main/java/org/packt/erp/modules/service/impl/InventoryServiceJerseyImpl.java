package org.packt.erp.modules.service.impl;

// Jersey REST Implementation
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.packt.erp.modules.dao.InventoryDao;
import org.packt.erp.modules.jaxb.adapter.ListUomAdapter;
import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/inventoryrest")
public class InventoryServiceJerseyImpl {
	
	@Autowired
	private InventoryDao inventoryDao;
	
	
	
	@GET
    @Path("/getRestMaterialTypes")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getMaterialTypes() {
			ArrayList<MaterialType> list = (ArrayList<MaterialType>) inventoryDao.getMaterialTypes();
			return Response.ok(list).build();
	}
	
	
	@GET
    @Path("/getRestUnits")
	@Produces(MediaType.APPLICATION_XML)
    public Response getUnits() {
			ArrayList<Uom> list = (ArrayList<Uom>) inventoryDao.getUnitMeasure();
			ListUomAdapter uomAdapter = new ListUomAdapter();
			uomAdapter.setUomList(list);
			return Response.ok(uomAdapter).build();
	}
	
	
	@GET
    @Path("/insertCatalog")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.TEXT_PLAIN)
    public Response insertCatalog(Catalog product) {
			inventoryDao.setProduct(product);
			return Response.ok("success").build();
	}

	@GET
    @Path("/getCatalog/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response getCatalog(@PathParam("id") Integer id) {
			Catalog cat = inventoryDao.getProduct(id);
			return Response.ok(cat).build();
	}
	
	@POST
	@Path("/unitform")
	@Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String setUnitForm(@FormParam("unit") String unit) {
		
        return "success";
    }

}
