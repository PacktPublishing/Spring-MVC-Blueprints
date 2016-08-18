package org.packt.online.cart.portal.dao.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import org.packt.online.cart.portal.dao.LoginDao;
import org.packt.online.cart.portal.model.data.Login;
import org.packt.online.cart.portal.model.data.Permission;
import org.packt.online.cart.portal.model.data.Role;
import org.packt.online.cart.portal.model.data.RolePermission;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao {

	@PersistenceContext(unitName="profilePersistency")
	EntityManager entityManagerFactory;
	
	@SuppressWarnings("unchecked")
    
	@Transactional
	@Override
	public Login getLogin(String username) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT l FROM Login l WHERE l.username = ?1";
		TypedQuery<Login> query = entityManagerFactory.createQuery(qlString, Login.class);		
		query.setParameter(1, username);
		
		return query.getSingleResult();
	}

	@Transactional
	@Override
	public String getPassWord(String username) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT l FROM Login l WHERE l.username = ?1";
		TypedQuery<Login> query = entityManagerFactory.createQuery(qlString, Login.class);		
		query.setParameter(1, username);
		
		return query.getSingleResult().getPassword();
		
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Override
	public String getEncPassword(String username) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT l FROM Login l WHERE l.username = ?1";
		TypedQuery<Login> query = entityManagerFactory.createQuery(qlString, Login.class);		
		query.setParameter(1, username);
		
		return query.getSingleResult().getEncPassword();
	}

	@Transactional
    @SuppressWarnings("unchecked")
	@Override
	public Set<Integer> getUserRoleIds(int id) {
		Set<Integer> roleIds = new HashSet<>();
		// entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT p FROM RolePermission p where p.login.id = ?1";
		TypedQuery<RolePermission> query = entityManagerFactory.createQuery(qlString, RolePermission.class);		
		query.setParameter(1, id);
		
		List<RolePermission> permissionRoles = query.getResultList();

		for (RolePermission rp : permissionRoles) {
			roleIds.add(rp.getRole().getId());
		}
		return roleIds;
	}

	@Transactional
	@Override
	public Set<Integer> getUserPermissionIds(int userId, int roleId) {
		Set<Integer> permIds = new HashSet<>();
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT p FROM RolePermission p where p.login.id = ?1 and p.role.id = ?2";
		TypedQuery<RolePermission> query = entityManagerFactory.createQuery(qlString, RolePermission.class);		
		query.setParameter(1, userId);
		query.setParameter(2, roleId);
		
		List<RolePermission> permissionRoles = query.getResultList();

		for (RolePermission rp : permissionRoles) {
			permIds.add(rp.getPermission().getId());
		}

		return permIds;
	}

	@Transactional
	@Override
	public void setLogin(Login login) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		try {
			UserTransaction utx = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
			
		    utx.begin();
		    entityManagerFactory.joinTransaction();
		    entityManagerFactory.persist(login);
			
			utx.commit();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //entityManagerFactory.persist(login);
			//entityManagerFactory.flush();

	}

	@Transactional
	@Override
	public void setRolePermission(RolePermission roleperm) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		try {
			UserTransaction utx = (UserTransaction)new InitialContext().lookup("java:comp/UserTransaction");
			
		    utx.begin();
		    entityManagerFactory.joinTransaction();
		    entityManagerFactory.persist(roleperm);
			
			utx.commit();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicMixedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeuristicRollbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //entityManagerFactory.persist(roleperm);
		//	entityManagerFactory.flush();

	}

	@Transactional
	@Override
	public Set<RolePermission> getRolePermission(int id) {
		Set<RolePermission> permissionSet = new HashSet<>();
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT p FROM RolePermission p where p.login.id = ?1";
		TypedQuery<RolePermission> query = entityManagerFactory.createQuery(qlString, RolePermission.class);		
		
		query.setParameter(1, id);
		permissionSet.addAll(query.getResultList());
		
		return permissionSet;
	}

	@Transactional
	@Override
	public Set<String> getUserRoles(int id) {
		Set<String> roleNames = new HashSet<>();
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT p FROM RolePermission p where p.login.id = ?1";
		TypedQuery<RolePermission> query = entityManagerFactory.createQuery(qlString, RolePermission.class);
		query.setParameter(1, id);
		
		List<RolePermission> permissionRoles =query.getResultList();
		for (RolePermission rp : permissionRoles) {
			roleNames.add(rp.getRole().getName());
		}
		return roleNames;
	}

	@Transactional
	@Override
	public Set<String> getUserPermissions(int userId, int roleId) {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		Set<String> permNames = new HashSet<>();
		String qlString = "SELECT p FROM RolePermission p where p.login.id = ?1 and p.role.id = ?2";
		TypedQuery<RolePermission> query = entityManagerFactory.createQuery(qlString, RolePermission.class);		
		query.setParameter(1, userId);
		query.setParameter(2, roleId);
		
		List<RolePermission> permissionRoles = query.getResultList();
	

		for (RolePermission rp : permissionRoles) {
			permNames.add(rp.getPermission().getName());
		}

		return permNames;
	}

	@Transactional
	@Override
	public Map<String, Integer> getRoles() {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		Map<String, Integer> roleMap = new HashMap<>();
		String qlString = "SELECT r FROM Role r";
		TypedQuery<Role> query = entityManagerFactory.createQuery(qlString, Role.class);		
		
		List<Role> roles = query.getResultList();
		for (Role role : roles) {
			roleMap.put(role.getName(), role.getId());
		}
		return roleMap;
	}

	@Transactional
	@Override
	public Map<String, Integer> getPermissions() {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		Map<String, Integer> permMap = new HashMap<>();
		String qlString = "SELECT p FROM Permission p";
		TypedQuery<Permission> query = entityManagerFactory.createQuery(qlString, Permission.class);		
		
		List<Permission> perms = query.getResultList();
		for (Permission perm : perms) {
			permMap.put(perm.getName(), perm.getId());
		}
		return permMap;

	}

	@Transactional
	@Cacheable("users")
	@Override
	public List<Login> getusers() {
		//EntityManager entityManagerFactory = entityManagerFactory.createEntityManager();
		String qlString = "SELECT l FROM Login l";
		TypedQuery<Login> query = entityManagerFactory.createQuery(qlString, Login.class);	
		List<Login> login = query.getResultList();
		
		return login;
	}

}
