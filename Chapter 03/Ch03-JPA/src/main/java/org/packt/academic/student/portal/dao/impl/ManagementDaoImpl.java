package org.packt.academic.student.portal.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.packt.academic.student.portal.dao.ManagementDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ManagementDaoImpl implements ManagementDao {
	
	@PersistenceContext
	private EntityManager entityManagerFactory;

	@Transactional
	@Override
	public void setCourse(Tblcourses course) {
		entityManagerFactory.persist(course);
		entityManagerFactory.flush();

       

	}

	@Transactional
	@Override
	public void setDepartment(Tbldepartment dept) {
		entityManagerFactory.persist(dept);
		entityManagerFactory.flush();

	}

	@Transactional
	@Override
	public void setStudent(Tblstudents student) {
		entityManagerFactory.persist(student);
		entityManagerFactory.flush();

	}

	@Transactional
	@Override
	public void setFaculty(Tblfaculty faculty, String username) {
		entityManagerFactory.persist(faculty);
		entityManagerFactory.flush();

	}

	@Transactional
	@Override
	public void setFacultyLogin(Tblfacultyuser facultyUser) {
		entityManagerFactory.persist(facultyUser);
		entityManagerFactory.flush();
		
	}

}
