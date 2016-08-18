package org.packt.erp.modules.dao;

import java.util.List;

import org.packt.erp.modules.model.data.Customer;

public interface SalesCustomerDao {
	
	public void setCustomer(Customer customer);
	public Customer getCustomer(Integer id);
	public List<Customer> getCustomers();
	

}
