package org.packt.bus.portal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.bus.portal.dao.LoginDao;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Login;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext(unitName="btsPersistenceUnit" )
	EntityManager entityManagerFactory;
	
	@Override
	public Login getLogin(String username) {
		String qlString = "SELECT l FROM Login l WHERE l.username like ?1";
		TypedQuery<Login> query = entityManagerFactory.createQuery(qlString, Login.class);		
		query.setParameter(1, username);
		
		return query.getSingleResult();
	}

	@Override
	public CustomerInfo getCustomerInfo(Integer id) {
		String qlString = "SELECT c FROM CustomerInfo c WHERE l.id = ?1";
		TypedQuery<CustomerInfo> query = entityManagerFactory.createQuery(qlString, CustomerInfo.class);
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public List<CustomerInfo> getAllCustomers() {
		String qlString = "SELECT c FROM CustomerInfo c";
		TypedQuery<CustomerInfo> query = entityManagerFactory.createQuery(qlString, CustomerInfo.class);
		return query.getResultList();
	}

}
