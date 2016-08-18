package org.packt.hotel.portal.service;

import java.util.List;

import org.packt.hotel.portal.model.data.HmsRoomType;
import org.packt.hotel.portal.model.form.JoinRoomTypeForm;

public interface RoomService {
	
	public List<HmsRoomType> getAllRoomTypes();
	public void addRoomType(Integer id, String type);
	
	public List<JoinRoomTypeForm> getRoomDetails();
	public void deleteRoomType(HmsRoomType type);
	public void setRoomType(HmsRoomType type);
	public void updateRoomType(HmsRoomType type);
}
