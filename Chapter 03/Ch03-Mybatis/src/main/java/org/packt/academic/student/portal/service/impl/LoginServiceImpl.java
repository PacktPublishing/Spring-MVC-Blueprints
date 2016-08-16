package org.packt.academic.student.portal.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.packt.academic.student.portal.mapper.LoginMapper;
import org.packt.academic.student.portal.model.data.Tbladminuser;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudentuser;
import org.packt.academic.student.portal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginMapper loginMapper;

	public boolean isAdminUser(String username, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		map.put("password", password);
		Tbladminuser user = loginMapper.getAdmin(map);
		if(user == null){
			return false;
		}
		return true;
	}

	public boolean isStudentUser(String username, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		map.put("password", password);
		Tblstudentuser user = loginMapper.getStudentUser(map);
		if(user == null){
			return false;
		}
		return true;
	}

	public boolean isFacultyUser(String username, String password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		map.put("password", password);
		Tblfacultyuser user = loginMapper.getFacultyUser(map);
		if(user == null){
			return false;
		}
		return true;
		
	}

	
	
	
}
