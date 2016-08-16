package org.packt.academic.student.portal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.academic.student.portal.dao.ReportDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReportDaoImpl implements ReportDao {


	@PersistenceContext
	private EntityManager entityManagerFactory;
	
	
	@Override
	public List<Tblcourses> getCourses() {
		
	    
	    String qlString = "SELECT b FROM Tblcourses b";
		TypedQuery<Tblcourses> query = entityManagerFactory.createQuery(qlString, Tblcourses.class);
		
		return query.getResultList();
	}

	
	
	@Override
	public List<Tblfaculty> getFaculty() {
       
		
	    
	    String qlString = "SELECT b FROM Tblfaculty b";
	  		TypedQuery<Tblfaculty> query = entityManagerFactory.createQuery(qlString, Tblfaculty.class);
	  		
	  		return query.getResultList();
	}

	
	
	@Override
	public List<Tbldepartment> getDepartment() {
        
	    
	    String qlString = "SELECT b FROM Tbldepartment b";
  		TypedQuery<Tbldepartment> query = entityManagerFactory.createQuery(qlString, Tbldepartment.class);
  		
  		return query.getResultList();
	}
	
	
	
	@Override
	public Tblstudents getStudentId(String username) {
					
		String qlString = "SELECT b FROM Tblstudents b WHERE b.username = ?1";
		TypedQuery<Tblstudents> query = entityManagerFactory.createQuery(qlString, Tblstudents.class);
		query.setParameter(1, username);
		return query.getSingleResult();
	   
	}

	
	@Override
	public Tblfaculty getFacultyId(String username) {
        
		String qlString = "SELECT b FROM Tblfaculty b WHERE b.username = ?1";
		TypedQuery<Tblfaculty> query = entityManagerFactory.createQuery(qlString, Tblfaculty.class);
		query.setParameter(1, username);
		return query.getSingleResult();
	}

}
