package org.packt.erp.modules.dao;

import java.util.List;

import org.packt.erp.modules.model.data.Login;
import org.packt.erp.modules.model.data.User;


public interface LoginDao {
	
	public void setUser(User user);
	public void setLogin(Login login);
	public Login getLoginCredential(Integer id, String username);
	public User getUserProfile(Integer id);
	public List<User> getUsers();

}
