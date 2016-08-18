package org.packt.online.cart.portal.dao.impl;

import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import org.packt.online.cart.portal.dao.CustomerAccountDao;
import org.packt.online.cart.portal.model.data.CustomerAccount;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CustomerAccountDaoImpl implements CustomerAccountDao {
	
	@PersistenceContext(unitName="profilePersistency")
	EntityManager entityManagerFactory;

	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	@Override
	public void setCustomerProfile(CustomerAccount account) {
		try {
			UserTransaction utx = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
			
		    utx.begin();
		    entityManagerFactory.joinTransaction();
		    entityManagerFactory.persist(account);
			
			utx.commit();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//entityManagerFactory.persist(account);
		//entityManagerFactory.flush();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public CustomerAccount getCustomerProfile(String username) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT c FROM CustomerAccount c WHERE c.username = ?1";
		TypedQuery<CustomerAccount> query = entityManagerFactory.createQuery(qlString, CustomerAccount.class);		
		query.setParameter(1, username);
 
		return query.getSingleResult();
		

	}

	
	@Transactional

    @CacheEvict(value="customers", allEntries=true)
	@Override
	public List<CustomerAccount> getAllCustomers() {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String sql = "SELECT c FROM CustomerAccount c";
		TypedQuery<CustomerAccount> query = entityManagerFactory.createQuery(sql, CustomerAccount.class);
			
		return query.getResultList();
	}

}
