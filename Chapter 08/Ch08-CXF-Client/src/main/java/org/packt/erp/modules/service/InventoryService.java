package org.packt.erp.modules.service;

import java.util.ArrayList;

import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.ws.Action;

import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;
import org.packt.erp.modules.model.form.InventoryForm;
import org.packt.erp.modules.service.impl.ListCatalog;

// Proxy for Jax-WS RPC
@WebService(name = "InventoryService")
@SOAPBinding( style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public interface InventoryService {

	@WebMethod(operationName="getProducts")
	public Catalog[] getProducts();
	
	@WebMethod(operationName="getProduct")
	public Catalog getProduct(Integer id);
	
	@WebMethod(operationName="addProduct")
	public int addProduct(InventoryForm invForm);
	
	@WebMethod(operationName="getMaterialTypes")
	public MaterialType[] getMaterialTypes();
	
	@WebMethod(operationName="getUnitMeasure")
	public Uom[] getUnitMeasure();

}
