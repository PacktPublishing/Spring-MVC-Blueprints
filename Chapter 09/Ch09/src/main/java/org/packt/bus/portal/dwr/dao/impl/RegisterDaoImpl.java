package org.packt.bus.portal.dwr.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.packt.bus.portal.dwr.dao.RegisterDao;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Login;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class RegisterDaoImpl implements RegisterDao {
	
	@PersistenceContext(unitName="btsPersistenceUnit" )
	EntityManager entityManagerFactory;

	@Override
	public void setLogin(Login login) {
		entityManagerFactory.persist(login);
		entityManagerFactory.flush();
	}

	@Override
	public void setCustomerInfo(CustomerInfo customerInfo) {
		entityManagerFactory.persist(customerInfo);
		entityManagerFactory.flush();
	}

}
