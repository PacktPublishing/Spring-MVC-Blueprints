package org.packt.bus.portal.dao;

import java.util.List;

import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Login;

public interface LoginDao {
	
	public Login getLogin(String username);
	public CustomerInfo getCustomerInfo(Integer id);
	public List<CustomerInfo> getAllCustomers();

}
