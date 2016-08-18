package org.packt.hotel.portal.mapper;

import java.util.List;

import org.packt.hotel.portal.model.data.HmsRoomType;
import org.packt.hotel.portal.model.form.JoinRoomTypeForm;

public interface RoomMapper {
	/*
	public List<HmsRoomsMasterlist> getRooms();
	public HmsRoomsMasterlist getRoom(Integer id);
	public void addRoom(HmsRoomsMasterlist room);
	public void deleteRoom(Integer id);
	public void updateRoom(HmsRoomsMasterlist room);
	
	*/
	
	public List<HmsRoomType> getRoomTypes();
	public void setRoomType(HmsRoomType type);
    public List<JoinRoomTypeForm> getRoomDetails();
	public void deleteRoomType(HmsRoomType type);
	public void updateRoomType(HmsRoomType type);
}
