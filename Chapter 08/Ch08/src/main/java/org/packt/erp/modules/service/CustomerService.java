package org.packt.erp.modules.service;

import java.util.List;

import org.packt.erp.modules.model.data.Customer;
import org.packt.erp.modules.model.form.CustomerForm;

public interface CustomerService {
	
	public void setCustomer(CustomerForm customer);
	public Customer getCustomer(Integer id);
	public List<Customer> getCustomers();
	

}
