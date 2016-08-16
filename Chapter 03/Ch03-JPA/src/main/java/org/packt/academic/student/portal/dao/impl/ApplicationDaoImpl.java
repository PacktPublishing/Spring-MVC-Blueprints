package org.packt.academic.student.portal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.academic.student.portal.dao.ApplicationDao;
import org.packt.academic.student.portal.model.data.Tblregistration;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	
	@PersistenceContext
	private EntityManager entityManagerFactory;
	 
	
	public void setPendingApp(Tblregistration registration) {
		entityManagerFactory.persist(registration);
		entityManagerFactory.flush();
        
		
	}

	@SuppressWarnings("unchecked")
	public List<Tblregistration> getPendingApp() {
		String qlString = "SELECT b FROM Tblregistration b";
		TypedQuery<Tblregistration> query = entityManagerFactory.createQuery(qlString, Tblregistration.class);
		return query.getResultList();
		
		
	}

	
	public Tblregistration getPending(Integer regId) {
		String qlString = "SELECT b FROM Tblregistration b WHERE b.regId = ?1";
		TypedQuery<Tblregistration> query = entityManagerFactory.createQuery(qlString, Tblregistration.class);
		query.setParameter(1, regId);
		return query.getSingleResult();
		
	
	}

	@Transactional
	public void setRegister(Tblstudents applicant) {
		
		entityManagerFactory.persist(applicant);
		entityManagerFactory.flush();
       
		
		
	}

	@Transactional
	public void deletePending(Tblregistration registration) {
		
	        
	    	entityManagerFactory.remove(entityManagerFactory.contains(registration) ? registration : entityManagerFactory.merge(registration));
			entityManagerFactory.flush();
	       
	
	}

	@Transactional
	public void setStudentAccount(Tblstudentuser user) {
		entityManagerFactory.persist(user);
		entityManagerFactory.flush();
        
		
		
	}
	
	
	

}
