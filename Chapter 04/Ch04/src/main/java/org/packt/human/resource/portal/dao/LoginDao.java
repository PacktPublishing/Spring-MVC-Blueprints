package org.packt.human.resource.portal.dao;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsLogin;

public interface LoginDao {
	
	public void setLoginInfo(HrmsLogin login);
	public HrmsLogin getLoginInfo(String username);
	public List<HrmsLogin> getLoginUsers();
	public void removeLoginInfo(HrmsLogin login);
	public void updateUserRole(HrmsLogin login);
	
	public List<HrmsLogin> getAdminUsers();
	public List<HrmsLogin> getHrUsers();
	public List<HrmsLogin> getEmployeeUsers();

}
