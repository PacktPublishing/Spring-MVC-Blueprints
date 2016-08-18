package org.packt.hotel.portal.service;

import java.util.List;

import org.packt.hotel.portal.model.data.HmsUserProfile;

public interface HotelService {
	
	public HmsUserProfile getUserProfile(Integer id);
	public List<HmsUserProfile> getUserProfiles();
	


}
