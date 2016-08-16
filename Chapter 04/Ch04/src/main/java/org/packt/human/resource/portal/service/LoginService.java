package org.packt.human.resource.portal.service;

import java.util.List;
import java.util.Map;

import org.packt.human.resource.portal.model.data.HrmsLogin;

public interface LoginService {
	
	public boolean validUser(String username, String password);
	public String checkRole(String username, String password);
	public Map<String,Integer> mapUsers();
	public List<HrmsLogin> getUserList();

}
