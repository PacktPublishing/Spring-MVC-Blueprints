package org.packt.hotel.portal.mapper;

import java.util.List;

import org.packt.hotel.portal.model.data.HmsRoomBooking;

public interface BookingMapper {
	
	public List<HmsRoomBooking> getUserBooking();
	public void setUserBooking(HmsRoomBooking userBooking);
}
