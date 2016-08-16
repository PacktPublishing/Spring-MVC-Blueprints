package org.packt.academic.student.portal.service.impl;

import org.packt.academic.student.portal.dao.LoginDao;
import org.packt.academic.student.portal.model.data.Login;
import org.packt.academic.student.portal.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LoginServiceImpl implements LoginService {
	
	private LoginDao loginDao;
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}


	@Transactional
	@Override
	public boolean isAdminUser(Login login) {
		Login dbData = loginDao.getAdmin(login);
		if(dbData == null){
			return false;
		}
		return true;
	}


	@Transactional
	@Override
	public boolean isStudentUser(Login login) {
		Login dbData = loginDao.getStudentUser(login);
		if(dbData == null){
			return false;
		}
		return true;
	}


	@Transactional
	@Override
	public boolean isFacultyUser(Login login) {
		Login dbData = loginDao.getFacultyUser(login);
		if(dbData == null){
			return false;
		}
		return true;
	}

}
