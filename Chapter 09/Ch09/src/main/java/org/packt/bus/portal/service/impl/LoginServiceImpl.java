package org.packt.bus.portal.service.impl;

import org.packt.bus.portal.dao.LoginDao;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Login;
import org.packt.bus.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	@Override
	public int validateUser(String username) {
		Login login = loginDao.getLogin(username.trim());
		if(login == null){
			return 0;
		}
		return login.getId();
	}

	@Override
	public CustomerInfo getCustomerInfo(Integer id) {
		return loginDao.getCustomerInfo(id);
	}

}
