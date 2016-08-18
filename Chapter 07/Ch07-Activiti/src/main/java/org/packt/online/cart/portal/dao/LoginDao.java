package org.packt.online.cart.portal.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.packt.online.cart.portal.model.data.Login;
import org.packt.online.cart.portal.model.data.RolePermission;

public interface LoginDao {
	
	public void setLogin(Login login);
	public void setRolePermission(RolePermission roleperm);
	public Login getLogin(String username);
	public String getPassWord(String username);
	public String getEncPassword(String username);
	public Set<Integer> getUserRoleIds(int id);
	public Set<String> getUserRoles(int id);
	public Set<String> getUserPermissions(int userId, int roleId);
	public Set<Integer> getUserPermissionIds(int userId, int roleId);
	public Set<RolePermission> getRolePermission(int id);
	
	public Map<String, Integer> getRoles();
	public Map<String, Integer> getPermissions();
	
	public List<Login> getusers();
	

}
