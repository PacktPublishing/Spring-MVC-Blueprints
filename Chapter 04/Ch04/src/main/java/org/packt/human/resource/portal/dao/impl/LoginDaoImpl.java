package org.packt.human.resource.portal.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.packt.human.resource.portal.dao.LoginDao;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class LoginDaoImpl implements LoginDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	@Override
	public void setLoginInfo(HrmsLogin login) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(login);
		session.flush();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public HrmsLogin getLoginInfo(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(HrmsLogin.class);
		crit.add(Restrictions.like("username",username));
		List<HrmsLogin> users = crit.list();
        return users.get(0);
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<HrmsLogin> getLoginUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<HrmsLogin> loginUsers = session.createQuery("from HrmsLogin").list();
		
		return loginUsers;
	}

	@Transactional
	@Override
	public void removeLoginInfo(HrmsLogin login) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(login);
		session.flush();
	}

	@Transactional
	@Override
	public void updateUserRole(HrmsLogin login) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(login);

	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<HrmsLogin> getAdminUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(HrmsLogin.class);
		crit.add(Restrictions.like("role","admin"));
	
		List<HrmsLogin> users = crit.list();
		
		return users;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<HrmsLogin> getHrUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(HrmsLogin.class);
		crit.add(Restrictions.like("role","hr"));
	
		List<HrmsLogin> users = crit.list();
		
		return users;
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public List<HrmsLogin> getEmployeeUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(HrmsLogin.class);
		crit.add(Restrictions.like("role","employee"));
	
		List<HrmsLogin> users = crit.list();
		
		return users;
	}

}
