package org.packt.hotel.portal.service;

import java.util.List;

import org.packt.hotel.portal.model.form.JoinUserProfileForm;
import org.packt.hotel.portal.model.form.LoginForm;
import org.packt.hotel.portal.model.form.ProfileForm;

public interface UserService {
	
	public void addUser(ProfileForm form);
    public List<JoinUserProfileForm> getUserProfiles();
    public boolean checkUser(LoginForm loginForm);
}
