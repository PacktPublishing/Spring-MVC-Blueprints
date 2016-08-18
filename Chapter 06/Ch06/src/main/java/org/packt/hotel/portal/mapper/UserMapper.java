package org.packt.hotel.portal.mapper;

import java.util.List;
import java.util.Map;

import org.packt.hotel.portal.model.data.HmsLogin;
import org.packt.hotel.portal.model.form.JoinUserProfileForm;
import org.packt.hotel.portal.model.form.ProfileForm;

public interface UserMapper {
	
	public void setUserProfile(ProfileForm form);
	public void setUserLogin(ProfileForm form);
    public List<JoinUserProfileForm> getUserProfiles();
    public HmsLogin isLoginUser(Map login);

}
