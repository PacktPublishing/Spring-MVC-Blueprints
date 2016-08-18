package org.packt.erp.modules.dao.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import javax.transaction.UserTransaction;

import org.hibernate.Session;
import org.packt.erp.modules.dao.InventoryDao;
import org.packt.erp.modules.model.data.Catalog;
import org.packt.erp.modules.model.data.MaterialType;
import org.packt.erp.modules.model.data.Uom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;


@Repository
public class InventoryDaoImpl implements InventoryDao{
	
	@PersistenceUnit(unitName="erpPersistencyInventory")
	EntityManagerFactory entityManagerInventory;
	
	
	@Override
	public List<Catalog> getProducts() {
		EntityManager em = entityManagerInventory.createEntityManager();
		String sql = "SELECT c FROM Catalog c";
		TypedQuery<Catalog> query = em.createQuery(sql, Catalog.class);
	
		return query.getResultList();
		
	}

	@Override
	public Catalog getProduct(Integer id) {
		EntityManager em = entityManagerInventory.createEntityManager();
		String qlString = "SELECT c FROM Catalog c WHERE c.id = ?1";
		TypedQuery<Catalog> query = em.createQuery(qlString, Catalog.class);		
		query.setParameter(1, id);
		return query.getSingleResult();
		
	}

	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	@Override
	public void setProduct(Catalog product) {
		try {
			UserTransaction utx = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
			EntityManager em = entityManagerInventory.createEntityManager();
		    utx.begin();
		    em.joinTransaction();
		em.persist(product);
			
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

	@Override
	public List<MaterialType> getMaterialTypes() {
		EntityManager em = entityManagerInventory.createEntityManager();
		String sql = "SELECT m FROM MaterialType m";
		TypedQuery<MaterialType> query = em.createQuery(sql, MaterialType.class);
			
		return  query.getResultList();
	}

	@Override
	public List<Uom> getUnitMeasure() {
		EntityManager em = entityManagerInventory.createEntityManager();
		String sql = "SELECT u FROM Uom u";
		TypedQuery<Uom> query = em.createQuery(sql, Uom.class);
			
		return  query.getResultList();
	}

}
