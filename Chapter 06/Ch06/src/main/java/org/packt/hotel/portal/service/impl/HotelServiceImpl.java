package org.packt.hotel.portal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.packt.hotel.portal.model.data.HmsUserProfile;
import org.packt.hotel.portal.service.HotelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class HotelServiceImpl implements HotelService {
	
	public List<HmsUserProfile> getUsers(){
		List<HmsUserProfile> users = new ArrayList<>();
		HmsUserProfile u1 = new HmsUserProfile();
		u1.setId(56);
		u1.setFirstName("Sherwin John");
		u1.setLastName("Tragura");
		u1.setEmail("sjctrags@yahoo.com");
		
		HmsUserProfile u2 = new HmsUserProfile();
		u2.setId(56);
		u2.setFirstName("Sherwin John");
		u2.setLastName("Tragura");
		u2.setEmail("sjctrags@yahoo.com");
		
		HmsUserProfile u3 = new HmsUserProfile();
		u3.setId(56);
		u3.setFirstName("Sherwin John");
		u3.setLastName("Tragura");
		u3.setEmail("sjctrags@yahoo.com");
		
		HmsUserProfile u4 = new HmsUserProfile();
		u4.setId(56);
		u4.setFirstName("Sherwin John");
		u4.setLastName("Tragura");
		u4.setEmail("sjctrags@yahoo.com");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		return users;
	}

	@Override
	public HmsUserProfile getUserProfile(Integer id) {
		// TODO Auto-generated method stub
		return  getUsers().get(id);
	}

	@Override
	public List<HmsUserProfile> getUserProfiles() {
		// TODO Auto-generated method stub
		return  getUsers();
	}

}
