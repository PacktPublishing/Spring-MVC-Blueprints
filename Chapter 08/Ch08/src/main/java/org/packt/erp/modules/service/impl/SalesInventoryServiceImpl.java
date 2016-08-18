
package org.packt.erp.modules.service.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;





import org.springframework.beans.factory.annotation.Autowired;
import org.packt.erp.modules.dao.SalesInventoryDao;
import org.packt.erp.modules.model.data.Contact;
import org.packt.erp.modules.model.data.Supplier;
import org.packt.erp.modules.service.SalesInventoryService;


@WebService
public class SalesInventoryServiceImpl implements SalesInventoryService{

	@Autowired
	SalesInventoryDao salesDao;
	
	@WebMethod(operationName="getAllSuppliers")
	@Override
	public List<Supplier> getAllSuppliers() {
		
		return salesDao.getSuppliers();
	}

	@WebMethod(operationName="getContactInfo")
	@Override
	public Contact getContactInfo(Integer id) {
		// TODO Auto-generated method stub
		return salesDao.getContact(id);
	}
}
