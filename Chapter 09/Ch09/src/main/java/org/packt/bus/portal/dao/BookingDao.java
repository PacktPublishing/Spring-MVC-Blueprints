package org.packt.bus.portal.dao;

import java.util.List;

import org.packt.bus.portal.model.data.BookedTrip;
import org.packt.bus.portal.model.data.BookingPayment;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Trip;

public interface BookingDao {
	
	public List<BookedTrip> getBookings(Integer userId);
	public BookedTrip getBooking(Integer id);
	public void setBooking(BookedTrip booking);
	public void deleteBooking(BookedTrip booking);
	public BookingPayment getPayment(Integer id);

}
