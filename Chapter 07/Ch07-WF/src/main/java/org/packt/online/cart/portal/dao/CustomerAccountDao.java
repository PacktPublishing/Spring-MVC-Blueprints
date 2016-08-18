package org.packt.online.cart.portal.dao;

import java.util.List;

import org.packt.online.cart.portal.model.data.CustomerAccount;

public interface CustomerAccountDao {
	
	public void setCustomerProfile(CustomerAccount account);
	public CustomerAccount getCustomerProfile(String username);
	public List<CustomerAccount> getAllCustomers();

}
