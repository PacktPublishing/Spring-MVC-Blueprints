package org.packt.bus.portal.dwr.service.impl;

import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.packt.bus.portal.dwr.dao.RegisterDao;
import org.packt.bus.portal.dwr.service.RegisterService;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Login;
import org.packt.bus.portal.model.form.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RemoteProxy
@Transactional
@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterDao registerDao;

	@Transactional
	@RemoteMethod
	@Override
	public void registerUser(RegisterForm registerForm) {
		CustomerInfo customerInfo = new CustomerInfo();
		customerInfo.setFirstName(registerForm.getFirstName());
		customerInfo.setMiddleName(registerForm.getMiddleName());
		customerInfo.setLastName(registerForm.getLastName());
		customerInfo.setAge(registerForm.getAge());
		
		registerDao.setCustomerInfo(customerInfo);
		Login login = new Login();
		login.setCustomerInfo(customerInfo);
		login.setUsername(registerForm.getUsername());
		login.setPassword(registerForm.getPassword());
		registerDao.setLogin(login);

	}

}
