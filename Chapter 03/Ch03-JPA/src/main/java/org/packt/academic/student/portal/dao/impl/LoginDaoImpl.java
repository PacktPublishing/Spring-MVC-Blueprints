package org.packt.academic.student.portal.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.academic.student.portal.dao.LoginDao;
import org.packt.academic.student.portal.model.data.Login;
import org.packt.academic.student.portal.model.data.Tbladminuser;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class LoginDaoImpl implements LoginDao {
	
	@PersistenceContext
	private EntityManager entityManagerFactory;
	
	@Override
	public Tblstudentuser getStudentUser(Login login) {
		String qlString = "SELECT b FROM Tblstudentuser b WHERE b.username = ?1";
		TypedQuery<Tblstudentuser> query = entityManagerFactory.createQuery(qlString, Tblstudentuser.class);
		query.setParameter(1, login.getUserName());
		return query.getSingleResult();
	  
	}

	@Override
	public Tblfacultyuser getFacultyUser(Login login) {
		String qlString = "SELECT b FROM Tblfacultyuser b WHERE b.username = ?1";
		TypedQuery<Tblfacultyuser> query = entityManagerFactory.createQuery(qlString, Tblfacultyuser.class);
		query.setParameter(1, login.getUserName());
		return query.getSingleResult();
	}

	@Override
	public Tbladminuser getAdmin(Login login) {
		String qlString = "SELECT b FROM Tbladminuser b WHERE b.username = ?1";
		TypedQuery<Tbladminuser> query = entityManagerFactory.createQuery(qlString, Tbladminuser.class);
		query.setParameter(1, login.getUserName());
		return query.getSingleResult();
	}
	
	
}
