package org.packt.erp.modules.service.impl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.packt.erp.modules.dao.LoginDao;
import org.packt.erp.modules.model.data.Login;
import org.packt.erp.modules.model.data.User;
import org.packt.erp.modules.model.form.SignupForm;
import org.packt.erp.modules.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// CXF-WS
@WebService(targetNamespace = "/loginServiceWS")
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;

	@Override
	public void addUserAccount(SignupForm signupForm) {
            User user = new User();
            user.setFirstName(signupForm.getFirstName());
            user.setMiddleName(signupForm.getMiddleName());
            user.setLastName(signupForm.getMiddleName());
            user.setAge(signupForm.getAge());
            user.setBirthDate(new Date());
            user.setRole(signupForm.getRole());
            
            loginDao.setUser(user);
            
            Login login = new Login();
            login.setUserId(user.getId() );
            login.setUsername(signupForm.getUsername());
            login.setPassword(signupForm.getPassword());
            loginDao.setLogin(login);

	}

	

	
	@Override
	public User getUserAccount(Integer id) {
		
		return loginDao.getUserProfile(id);
	}

	@Override
	public List<User> getUserAccounts() {
		
		return loginDao.getUsers();
	}

}
