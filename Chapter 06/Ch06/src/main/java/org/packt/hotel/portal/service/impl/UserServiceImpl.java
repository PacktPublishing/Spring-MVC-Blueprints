package org.packt.hotel.portal.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.packt.hotel.portal.mapper.UserMapper;
import org.packt.hotel.portal.model.data.HmsLogin;
import org.packt.hotel.portal.model.form.JoinUserProfileForm;
import org.packt.hotel.portal.model.form.LoginForm;
import org.packt.hotel.portal.model.form.ProfileForm;
import org.packt.hotel.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addUser(ProfileForm form) {
		userMapper.setUserLogin(form);
		userMapper.setUserProfile(form);
		
	}

	@Override
	public List<JoinUserProfileForm> getUserProfiles() {
		// TODO Auto-generated method stub
		return userMapper.getUserProfiles();
	}

	@Override
	public boolean checkUser(LoginForm loginForm) {
		Map<String,String> login = new HashMap<>();
		login.put("username", loginForm.getUsername());
		login.put("password", loginForm.getPassword());
		HmsLogin user = userMapper.isLoginUser(login);
		if(user == null){
			return false;
		}
		return true;
		
	}

}
