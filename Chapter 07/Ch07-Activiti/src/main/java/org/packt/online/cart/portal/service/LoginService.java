package org.packt.online.cart.portal.service;

import java.util.Set;

import org.packt.online.cart.portal.model.data.Login;
import org.packt.online.cart.portal.model.data.RolePermission;
import org.packt.online.cart.portal.model.form.LoginForm;

public interface LoginService {
	
	public void addAccount(LoginForm login);
	public void addRolePermission(RolePermission roleperm);
	public Login retrieveAccount(String username);
	public String retrievePassWord(String username);
	public String retrieveEncPassword(String username);
	public Set<String> retrieveRoles();
	public Set<String> retrieverPermissions();

}
