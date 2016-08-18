package org.packt.erp.modules.service.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.packt.erp.modules.dao.InventoryDao;
import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;
import org.packt.erp.modules.model.form.InventoryForm;
import org.packt.erp.modules.service.InventoryService;
import org.packt.erp.modules.service.InvoiceAddProduct;
import org.springframework.beans.factory.annotation.Autowired;

// JAX-RPC
@WebService(name = "InventoryServiceImpl", targetNamespace="http://impl.service.modules.erp.packt.org/")
@SOAPBinding( style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	InventoryDao inventoryDao;
		
	@Autowired
	InvoiceAddProduct invoiceAddProductService;

	@WebResult(name="result", partName="result")
	@RequestWrapper(partName="getProducts", targetNamespace="http://impl.service.modules.erp.packt.org/GetProductsRequest")
	@ResponseWrapper(partName="getProducts", targetNamespace="http://impl.service.modules.erp.packt.org/GetProductsResponse")
	@WebMethod(operationName="getProducts")
	@Override
	public Catalog[] getProducts() {
		List<Catalog> cats = inventoryDao.getProducts();
		Catalog[] catArray =new Catalog[cats.size()]; 
		for(int i =0; i < catArray.length; i++){
			catArray[i] = cats.get(i);
			
		}
		return catArray;
	}

	
	@WebResult(name="result", partName="result")
	@RequestWrapper(partName="getProduct", targetNamespace="http://impl.service.modules.erp.packt.org/GetProductRequest")
	@ResponseWrapper(partName="getProduct", targetNamespace="http://impl.service.modules.erp.packt.org/GetProductResponse")
	@WebMethod(operationName="getProduct")
	@Override
	public Catalog getProduct(Integer id) {
		Catalog cat = inventoryDao.getProduct(id);
		return cat;
	}

	
	@WebResult(name="result", partName="result")
	@RequestWrapper(partName="addProduct", targetNamespace="http://impl.service.modules.erp.packt.org/AddProductRequest")
	@ResponseWrapper(partName="addProduct", targetNamespace="http://impl.service.modules.erp.packt.org/AddProductResponse")
	@WebMethod(operationName="addProduct")
	@Override
	public int addProduct(InventoryForm invForm) {
		invoiceAddProductService.addProduct(invForm);
		return 1;
	}

	@WebResult(name="result", partName="result")
	@RequestWrapper(partName="getMaterialTypes", targetNamespace="http://impl.service.modules.erp.packt.org/GetMaterialTypesRequest")
	@ResponseWrapper(partName="getMaterialTypes", targetNamespace="http://impl.service.modules.erp.packt.org/GetMaterialTypesResponse")
	@WebMethod(operationName="getMaterialTypes")
	@Override
	public MaterialType[] getMaterialTypes() {
		List<MaterialType> mats = inventoryDao.getMaterialTypes();
		MaterialType[] catArray =new MaterialType[mats.size()]; 
		for(int i =0; i < catArray.length; i++){
			catArray[i] = mats.get(i);
			
		}
		return catArray;
	}

	@Override
	public Uom[] getUnitMeasure() {
		List<Uom> uoms = inventoryDao.getUnitMeasure();
		Uom[] catArray =new Uom[uoms.size()]; 
		for(int i =0; i < catArray.length; i++){
			catArray[i] = uoms.get(i);
			
		}
		return catArray;
	}

}
