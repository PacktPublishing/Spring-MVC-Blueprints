package org.packt.online.cart.portal.dao.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.packt.online.cart.portal.dao.LoginDao;
import org.packt.online.cart.portal.model.data.Login;
import org.packt.online.cart.portal.model.data.Permission;
import org.packt.online.cart.portal.model.data.Role;
import org.packt.online.cart.portal.model.data.RolePermission;
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

	@SuppressWarnings("unchecked")
    
	@Override
	public Login getLogin(String username) {
		List<Login> login = null;
		
			Session session = this.sessionFactory.getCurrentSession();
			Criteria crit = session.createCriteria(Login.class);
			crit.add(Restrictions.like("username", username));
			
			login = crit.list();
			
		
		return login.get(0);
	}

	@Transactional
	@Override
	public String getPassWord(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Login.class);
		crit.add(Restrictions.like("username", username));
		List<Login> login = crit.list();
		return login.get(0).getPassword();
	}

	@SuppressWarnings("unchecked")
	@Override
	public String getEncPassword(String username) {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Login.class);
		crit.add(Restrictions.like("username", username));
		List<Login> login = crit.list();
		return login.get(0).getEncPassword();
	}

    @SuppressWarnings("unchecked")
	@Override
	public Set<Integer> getUserRoleIds(int id) {
		Set<Integer> roleIds = new HashSet<>();
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(RolePermission.class);
		crit.add(Restrictions.like("login.id", id));
		List<RolePermission> permissionRoles = crit.list();

		for (RolePermission rp : permissionRoles) {
			roleIds.add(rp.getRole().getId());
		}
		return roleIds;
	}

	@Override
	public Set<Integer> getUserPermissionIds(int userId, int roleId) {
		Set<Integer> permIds = new HashSet<>();
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(RolePermission.class);
		crit.add(Restrictions.like("login.id", userId));
		crit.add(Restrictions.like("role.id", roleId));
		List<RolePermission> permissionRoles = crit.list();

		for (RolePermission rp : permissionRoles) {
			permIds.add(rp.getPermission().getId());
		}

		return permIds;
	}

	@Override
	public void setLogin(Login login) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(login);
		transaction.commit();
		session.close();

	}

	@Override
	public void setRolePermission(RolePermission roleperm) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(roleperm);
		transaction.commit();
		session.close();

	}

	@Override
	public Set<RolePermission> getRolePermission(int id) {
		Set<RolePermission> permissionSet = new HashSet<>();
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(RolePermission.class);
		crit.add(Restrictions.like("login.id", id));
		permissionSet.addAll(crit.list());
		return permissionSet;
	}

	@Override
	public Set<String> getUserRoles(int id) {
		Set<String> roleNames = new HashSet<>();
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(RolePermission.class);
		crit.add(Restrictions.like("login.id", id));
		List<RolePermission> permissionRoles = crit.list();

		for (RolePermission rp : permissionRoles) {
			roleNames.add(rp.getRole().getName());
		}
		return roleNames;
	}

	@Override
	public Set<String> getUserPermissions(int userId, int roleId) {
		Set<String> permNames = new HashSet<>();
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(RolePermission.class);
		crit.add(Restrictions.like("login.id", userId));
		crit.add(Restrictions.like("role.id", roleId));
		List<RolePermission> permissionRoles = crit.list();

		for (RolePermission rp : permissionRoles) {
			permNames.add(rp.getPermission().getName());
		}

		return permNames;
	}

	@Override
	public Map<String, Integer> getRoles() {
		Map<String, Integer> roleMap = new HashMap<>();
		Session session = this.sessionFactory.getCurrentSession();
		List<Role> roles = session.createQuery("from Role").list();
		for (Role role : roles) {
			roleMap.put(role.getName(), role.getId());
		}
		return roleMap;
	}

	@Override
	public Map<String, Integer> getPermissions() {
		Map<String, Integer> permMap = new HashMap<>();
		Session session = this.sessionFactory.getCurrentSession();
		List<Permission> perms = session.createQuery("from Permission").list();
		for (Permission perm : perms) {
			permMap.put(perm.getName(), perm.getId());
		}
		return permMap;

	}


	@Override
	public List<Login> getusers() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria("from Login");
		List<Login> login = crit.list();
		return login;
	}

}
