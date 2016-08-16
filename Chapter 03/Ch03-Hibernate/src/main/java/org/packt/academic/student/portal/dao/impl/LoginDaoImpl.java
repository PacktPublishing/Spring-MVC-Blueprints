package org.packt.academic.student.portal.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
	
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Tblstudentuser getStudentUser(Login login) {
		System.out.println("dao"+login.getUserName());
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Tblstudentuser.class);
		crit.add(Restrictions.like("username",login.getUserName()));
		
		List<Tblstudentuser> student = crit.list();
		
	
		return student.get(0);
	  
	}

	@Override
	public Tblfacultyuser getFacultyUser(Login login) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Tblfacultyuser.class);
		crit.add(Restrictions.like("username",login.getUserName()));
		
		List<Tblfacultyuser> faculty = crit.list();
		return faculty.get(0);
	}

	@Override
	public Tbladminuser getAdmin(Login login) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Tbladminuser.class);
		crit.add(Restrictions.like("username",login.getUserName()));
		
		List<Tbladminuser> admin = crit.list();
		return admin.get(0);
	}
	
	
}
