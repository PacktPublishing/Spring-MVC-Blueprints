package org.packt.hotel.portal.service.impl;

import java.util.List;

import org.packt.hotel.portal.mapper.RoomMapper;
import org.packt.hotel.portal.model.data.HmsRoomType;
import org.packt.hotel.portal.model.form.JoinRoomTypeForm;
import org.packt.hotel.portal.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class RoomServiceImpl implements RoomService {
   
	@Autowired
    private RoomMapper roomDao;
	
	@Transactional
	@Override
	public List<HmsRoomType> getAllRoomTypes() {
		// TODO Auto-generated method stub
		return roomDao.getRoomTypes();
	}

	@Override
	public void addRoomType(Integer id, String type) {
		HmsRoomType roomType = new HmsRoomType();
		roomType.setId(id);
		roomType.setType(type);
		roomDao.setRoomType(roomType);
	}

	@Override
	public List<JoinRoomTypeForm> getRoomDetails() {
		// TODO Auto-generated method stub
		return roomDao.getRoomDetails();
	}

	@Override
	public void deleteRoomType(HmsRoomType type) {
		roomDao.deleteRoomType(type);
		
	}

	@Override
	public void setRoomType(HmsRoomType type) {
		roomDao.setRoomType(type);
		
	}

	@Override
	public void updateRoomType(HmsRoomType type) {
		roomDao.updateRoomType(type);
		
	}

}
