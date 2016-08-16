package org.packt.academic.student.portal.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.packt.academic.student.portal.dao.ApplicationDao;
import org.packt.academic.student.portal.model.data.Tblregistration;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	 
	
	public void setPendingApp(Tblregistration registration) {
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(registration);
        
		
	}

	@SuppressWarnings("unchecked")
	public List<Tblregistration> getPendingApp() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Tblregistration> pendingList = session.createQuery("from Tblregistration").list();
		
		return pendingList;
	}

	@Transactional
	public Tblregistration getPending(Integer regId) {
		Session session = this.sessionFactory.getCurrentSession(); 
		Tblregistration applicant = (Tblregistration)  session.get(Tblregistration.class, regId);  
		
		return applicant;
	}

	@Transactional
	public void setRegister(Tblstudents applicant) {
		
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(applicant);
        transaction.commit();
        session.close();
       
		
		
	}

	@Transactional
	public void deletePending(Tblregistration registration) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	
		session.delete(registration);
		 transaction.commit();
	        session.close();
	       
	
	}

	@Transactional
	public void setStudentAccount(Tblstudentuser user) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	
        session.persist(user);
        transaction.commit();
        session.close();
        
		
		
	}
	
	
	

}
