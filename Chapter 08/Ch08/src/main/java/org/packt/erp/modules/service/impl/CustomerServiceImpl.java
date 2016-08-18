package org.packt.erp.modules.service.impl;

import java.util.List;

import org.packt.erp.modules.dao.SalesCustomerDao;
import org.packt.erp.modules.model.data.Customer;
import org.packt.erp.modules.model.form.CustomerForm;
import org.packt.erp.modules.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// HTTP Invoker Implementation

@Service("/customerService.http")
@Transactional
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	SalesCustomerDao customerDao;

	@Transactional
	@Override
	public void setCustomer(CustomerForm customer) {
		Customer customerData = new Customer();
		customerData.setName(customer.getName());
		customerData.setStreet(customer.getStreet());
		customerData.setCity(customer.getCity());
		customerData.setCountry(customer.getCountry());
		customerData.setZip(customer.getZip());
		customerData.setFax(customer.getFax());
		customerData.setTelephone(customer.getTelephone());
		customerDao.setCustomer(customerData);
	}

	@Override
	public Customer getCustomer(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}

	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getCustomers();
	}

}
