package org.packt.online.cart.portal.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.packt.online.cart.portal.dao.CustomerAccountDao;
import org.packt.online.cart.portal.model.data.CustomerAccount;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CustomerAccountDaoImpl implements CustomerAccountDao {
	
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void setCustomerProfile(CustomerAccount account) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(account);
		transaction.commit();
		session.close();


	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public CustomerAccount getCustomerProfile(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(CustomerAccount.class);
		crit.add(Restrictions.like("username",username));
		List<CustomerAccount> login = crit.list();
		return login.get(0);

	}

	
	@Transactional

   
	@Override
	public List<CustomerAccount> getAllCustomers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<CustomerAccount> customers = session.createQuery("from CustomerAccount").list();
		
		return customers;
	}

}
