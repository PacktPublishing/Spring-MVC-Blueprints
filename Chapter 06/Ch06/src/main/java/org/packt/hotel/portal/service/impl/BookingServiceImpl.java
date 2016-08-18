package org.packt.hotel.portal.service.impl;

import java.util.List;

import org.packt.hotel.portal.mapper.BookingMapper;
import org.packt.hotel.portal.mapper.FreeBookingMapper;
import org.packt.hotel.portal.model.data.HmsFreeBooking;
import org.packt.hotel.portal.model.data.HmsRoomBooking;
import org.packt.hotel.portal.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class BookingServiceImpl implements BookingService {

	@Autowired
	private FreeBookingMapper freeBookingMapper;
	
	@Autowired
	private BookingMapper bookingMapper;
	
	@Override
	public void reserveBooking(HmsFreeBooking bookForm) {
		freeBookingMapper.setFreeBooking(bookForm);
	}

	@Override
	public void userBooking(HmsRoomBooking userBookForm) {
		bookingMapper.setUserBooking(userBookForm);
		
	}

	@Override
	public List<HmsRoomBooking> getUserBooking() {
		return bookingMapper.getUserBooking();
	}

}
