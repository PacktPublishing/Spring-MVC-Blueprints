package org.packt.hotel.portal.service;

import java.util.List;

import org.packt.hotel.portal.model.data.HmsFreeBooking;
import org.packt.hotel.portal.model.data.HmsRoomBooking;

public interface BookingService {

	public void reserveBooking(HmsFreeBooking bookForm);
	public void userBooking(HmsRoomBooking userBookForm);
	public List<HmsRoomBooking> getUserBooking();
}
