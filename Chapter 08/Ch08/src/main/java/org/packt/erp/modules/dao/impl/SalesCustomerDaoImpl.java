package org.packt.erp.modules.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.packt.erp.modules.dao.SalesCustomerDao;
import org.packt.erp.modules.model.data.Customer;
import org.packt.erp.modules.model.data.User;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class SalesCustomerDaoImpl implements SalesCustomerDao {

	@PersistenceContext(unitName="erpPersistencySales")
	EntityManager entityManagerFactorySales;
	
	@Override
	public void setCustomer(Customer customer) {
		entityManagerFactorySales.persist(customer);
		entityManagerFactorySales.flush();

	}

	@Override
	public Customer getCustomer(Integer id) {
		String qlString = "SELECT c FROM Customer c WHERE c.id = ?1";
		TypedQuery<Customer> query = entityManagerFactorySales.createQuery(qlString, Customer.class);		
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public List<Customer> getCustomers() {
		String sql = "SELECT c FROM Customer c";
		TypedQuery<Customer> query = entityManagerFactorySales.createQuery(sql, Customer.class);
			
		return query.getResultList();
	}

}
