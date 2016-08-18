package org.packt.erp.modules.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.packt.erp.modules.dao.SalesSupplierDao;
import org.packt.erp.modules.model.data.Person;
import org.packt.erp.modules.model.data.Supplier;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class SalesSupplierDaoImpl implements SalesSupplierDao {

	@PersistenceContext(unitName="erpPersistencySales")
	EntityManager entityManagerFactorySales;
	
	@Override
	public void setSupplier(Supplier supplier) {
		entityManagerFactorySales.persist(supplier);
		entityManagerFactorySales.flush();


	}

	@Override
	public Supplier getSupplier(Integer id) {
		String qlString = "SELECT s FROM Supplier s WHERE s.id = ?1";
		TypedQuery<Supplier> query = entityManagerFactorySales.createQuery(qlString, Supplier.class);		
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public List<Supplier> getSuppliers() {
		String sql = "SELECT s FROM Supplier s";
		TypedQuery<Supplier> query = entityManagerFactorySales.createQuery(sql, Supplier.class);
			
		return query.getResultList();
	}

}
