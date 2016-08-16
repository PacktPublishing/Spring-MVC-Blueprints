package org.packt.academic.student.portal.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.packt.academic.student.portal.dao.ManagementDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ManagementDaoImpl implements ManagementDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	@Override
	public void setCourse(Tblcourses course) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(course);
        transaction.commit();
        session.close();
       

	}

	@Transactional
	@Override
	public void setDepartment(Tbldepartment dept) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(dept);
        transaction.commit();
        session.close();

	}

	@Transactional
	@Override
	public void setStudent(Tblstudents student) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(student);
        transaction.commit();
        session.close();

	}

	@Transactional
	@Override
	public void setFaculty(Tblfaculty faculty, String username) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(faculty);
        transaction.commit();
        session.close();

	}

	@Transactional
	@Override
	public void setFacultyLogin(Tblfacultyuser facultyUser) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
        session.persist(facultyUser);
        transaction.commit();
        session.close();
		
	}

}
