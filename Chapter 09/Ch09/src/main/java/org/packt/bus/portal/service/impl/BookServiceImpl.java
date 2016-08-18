package org.packt.bus.portal.service.impl;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.packt.bus.portal.dao.BookingDao;
import org.packt.bus.portal.model.data.BookedTrip;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Trip;
import org.packt.bus.portal.model.form.BookingForm;
import org.packt.bus.portal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

@Path("/rest")
public class BookServiceImpl implements BookService {
	@Autowired
	BookingDao bookingDao;

	@Path("/reserveSeat")
    @POST
    @Consumes("application/json")
	@Produces("text/plain")
	@Override
	public Response reserveSeat(BookingForm bookForm) {
		System.out.println("bookForm" + bookForm.getId());
		System.out.println("bookForm" + bookForm.getBooked());
		try{
		CustomerInfo customer = new CustomerInfo();
		Trip trip = new Trip();
		customer.setId(bookForm.getUserId());
		trip.setId(bookForm.getTripId());
		
		BookedTrip bookedTrip = new BookedTrip();
		bookedTrip.setId(bookForm.getId());
		bookedTrip.setCustomerInfo(customer);
		bookedTrip.setTrip(trip);
		bookedTrip.setBooked(new Date());
		bookedTrip.setAdults(bookForm.getAdults());
		bookedTrip.setKids(bookForm.getKids());
		bookedTrip.setStatus(bookForm.getStatus());
		bookedTrip.setTotal(bookForm.getTotal());
		bookingDao.setBooking(bookedTrip);
		 return Response.ok().entity("Success").build();
		}catch(Exception e){
			 return Response.ok().entity("Failure").build();
		}

	}

	@Override
	public Response deleteSeat(Integer id) {
		BookedTrip booking = bookingDao.getBooking(id);
		if(booking.getStatus().equalsIgnoreCase("unpaid")){
			bookingDao.deleteBooking(booking);
		}
		return Response.ok().entity("Success").build();
	}

}
