package org.packt.human.resource.portal.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.packt.human.resource.portal.dao.LoginDao;
import org.packt.human.resource.portal.model.data.HrmsLogin;
import org.packt.human.resource.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Transactional
	@Override
	public boolean validUser(String username, String password) {
		boolean valid = true;
		HrmsLogin loginAccount = loginDao.getLoginInfo(username);
		if(loginAccount == null){
			valid = false;
		}
		return valid;
	}

	@Transactional
	public String checkRole(String username, String password) {
		HrmsLogin login = loginDao.getLoginInfo(username);
		
		return login.getRole();
	}

	@Override
	public Map<String, Integer> mapUsers() {
		Map<String, Integer> tblUsers = new HashMap<>();
		tblUsers.put("admin", loginDao.getAdminUsers().size());
		tblUsers.put("employee", loginDao.getHrUsers().size());
		tblUsers.put("hr", loginDao.getHrUsers().size());
	
		return tblUsers;
	}

	@Override
	public List<HrmsLogin> getUserList() {
		// TODO Auto-generated method stub
		return loginDao.getLoginUsers();
	}

}
