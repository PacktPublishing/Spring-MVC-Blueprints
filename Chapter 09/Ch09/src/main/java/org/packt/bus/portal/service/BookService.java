package org.packt.bus.portal.service;

import javax.ws.rs.core.Response;

import org.packt.bus.portal.model.form.BookingForm;

public interface BookService {
	
	public Response reserveSeat(BookingForm bookForm);
	public Response deleteSeat(Integer id);

}
