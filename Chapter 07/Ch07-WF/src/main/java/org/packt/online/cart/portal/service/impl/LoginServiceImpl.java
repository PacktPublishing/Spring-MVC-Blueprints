package org.packt.online.cart.portal.service.impl;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.packt.online.cart.portal.dao.CustomerAccountDao;
import org.packt.online.cart.portal.dao.LoginDao;
import org.packt.online.cart.portal.model.data.CustomerAccount;
import org.packt.online.cart.portal.model.data.Login;
import org.packt.online.cart.portal.model.data.Permission;
import org.packt.online.cart.portal.model.data.Role;
import org.packt.online.cart.portal.model.data.RolePermission;
import org.packt.online.cart.portal.model.form.CustomerForm;
import org.packt.online.cart.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	@Autowired
	CustomerAccountDao customerAccountDao;
	
	@Override
	public Login retrieveAccount(String username) {
		// TODO Auto-generated method stub
		return loginDao.getLogin(username);
	}

	@Override
	public String retrievePassWord(String username) {
		// TODO Auto-generated method stub
		return loginDao.getPassWord(username);
	}

	@Override
	public String retrieveEncPassword(String username) {
		// TODO Auto-generated method stub
		return loginDao.getEncPassword(username);
	}

	

	@Override
	public void addAccount(CustomerForm login) {
		
		
		CustomerAccount account = new CustomerAccount();
		account.setFirstName(login.getFirstName());
		account.setMidName(login.getMidName());
		account.setLastName(login.getLastName());
		account.setBirthDate(new Date());
		account.setAddress(login.getAddress());
		account.setEmail(login.getEmail());
		account.setMobile(login.getMobile());
		account.setStartDate(new Date());
		account.setUsername(login.getUsername());
		customerAccountDao.setCustomerProfile(account);
		
		//CustomerAccount currentAcct = customerAccountDao.getCustomerProfile(login.getUsername());
		
		Login credential = new Login();
		credential.setUsername(login.getUsername().trim());
		credential.setPassword(login.getPassword().trim());
		credential.setEncPassword("");
		credential.setCustomerAccount(account);
		loginDao.setLogin(credential);
		
		
		
		
		Map<String, Integer> roleTbl = loginDao.getRoles();
		Map<String,Integer> permTbl = loginDao.getPermissions();
		
		//Login currentLog = loginDao.getLogin(login.getUsername());
		
		Set<String> roles = login.getRoles();
		for(String role : roles){
			Set<String> permissions = login.getPermissions();
			for(String perm : permissions){
				RolePermission roleperm = new RolePermission();
				roleperm.setLogin(credential);
				Role r = new Role();
				r.setId(roleTbl.get(role));
				Permission p = new Permission();
				p.setId(permTbl.get(perm));
				roleperm.setPermission(p);
				roleperm.setRole(r);
				loginDao.setRolePermission(roleperm);
			}
		}
	}

	@Override
	public void addRolePermission(RolePermission roleperm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> retrieveRoles() {
		Map<String, Integer> roleTbl = loginDao.getRoles();
		return roleTbl.keySet();
	}

	@Override
	public Set<String> retrieverPermissions() {
		Map<String,Integer> permTbl = loginDao.getPermissions();
		return permTbl.keySet();
	}

}
