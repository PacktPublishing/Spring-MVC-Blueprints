package org.packt.academic.student.portal.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.packt.academic.student.portal.dao.ReportDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ReportDaoImpl implements ReportDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Tblcourses> getCourses() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Tblcourses> courses = session.createQuery("from Tblcourses").list();
		
		
	    
	    return courses;
	}

	
	@Transactional
	@Override
	public List<Tblfaculty> getFaculty() {
       
		
         Session session = this.sessionFactory.getCurrentSession();
 		List<Tblfaculty> faculty = session.createQuery("from Tblfaculty").list();
 		
	    
	    return faculty;
	}

	
	@Transactional
	@Override
	public List<Tbldepartment> getDepartment() {
        Session session = this.sessionFactory.getCurrentSession();
		List<Tbldepartment> dept = session.createQuery("from Tbldepartment").list();
	    
	    return dept;
	}
	
	
	@Transactional
	@Override
	public Tblstudents getStudentId(String username) {
			
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Tblstudents.class);
		crit.add(Restrictions.like("username",username));
		
		List<Tblstudents> students = crit.list();
		
		return students.get(0);
	   
	}

	@Transactional
	@Override
	public Tblfaculty getFacultyId(String username) {
        Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Tblfaculty.class);
		crit.add(Restrictions.like("username",username));
		
		List<Tblfaculty> faculty = crit.list();
		
		return faculty.get(0);
	}

}
