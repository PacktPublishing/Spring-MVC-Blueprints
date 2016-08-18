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

import org.packt.online.cart.portal.dao.CatalogDao;
import org.packt.online.cart.portal.model.data.Catalog;
import org.packt.online.cart.portal.model.data.Category;
import org.packt.online.cart.portal.model.data.Status;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("catalogDao")
@Transactional
public class CatalogDaoImpl implements CatalogDao {
	
	@PersistenceContext
	EntityManager entityManagerFactory;

	@Override
	public List<Catalog> getCatalogs() {
		String qlString = "SELECT c FROM Catalog c";
		TypedQuery<Catalog> query = entityManagerFactory.createQuery(qlString, Catalog.class);	
		List<Catalog> cat = query.getResultList();
		return cat;
	}

	@Override
	public List<Status> getStatus() {
		String qlString = "SELECT s FROM Status s";
		TypedQuery<Status> query = entityManagerFactory.createQuery(qlString, Status.class);	
		List<Status> status = query.getResultList();
		return status;
	}

	@Override
	public List<Category> getCategories() {
		String qlString = "SELECT c FROM Category c";
		TypedQuery<Category> query = entityManagerFactory.createQuery(qlString, Category.class);	
		List<Category> cat = query.getResultList();
		
		return cat;
	}

	@Override
	public void addProduct(Catalog catalog) {
		try {
			UserTransaction utx = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
			
		    utx.begin();
		    entityManagerFactory.joinTransaction();
		    entityManagerFactory.persist(catalog);
			
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
		
	}

}
