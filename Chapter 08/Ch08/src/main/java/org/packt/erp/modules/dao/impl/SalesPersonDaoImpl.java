package org.packt.erp.modules.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.packt.erp.modules.dao.SalesPersonDao;
import org.packt.erp.modules.model.data.Customer;
import org.packt.erp.modules.model.data.Person;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class SalesPersonDaoImpl implements SalesPersonDao {

	@PersistenceContext(unitName="erpPersistencySales")
	EntityManager entityManagerFactorySales;
	
	@Override
	public void setPerson(Person person) {
		entityManagerFactorySales.persist(person);
		entityManagerFactorySales.flush();


	}

	@Override
	public Person getPerson(Integer id) {
		String qlString = "SELECT p FROM Person p WHERE p.id = ?1";
		TypedQuery<Person> query = entityManagerFactorySales.createQuery(qlString, Person.class);		
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public List<Person> getPersons() {
		String sql = "SELECT p FROM Person p";
		TypedQuery<Person> query = entityManagerFactorySales.createQuery(sql, Person.class);
			
		return query.getResultList();
	}

}
