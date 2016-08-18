package org.packt.bus.portal.controller;

import org.packt.bus.portal.model.form.BookingForm;
import org.packt.bus.portal.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookingController {	
	
	@Autowired
	BookService bookingService;
	
	@RequestMapping("/bts/booking")
    public String bookTrip(Model model){
		BookingForm bookingForm = new BookingForm();
		model.addAttribute("bookingForm", bookingForm);
	   return "booking";
    }
	
	
	@RequestMapping(value="/bts/bookingproto", method = RequestMethod.GET)
    public String bookTripProtoInit(Model model){
		BookingForm bookingForm = new BookingForm();
		model.addAttribute("bookingForm", bookingForm);
	   return "booking-proto";
    }
	
	
	@RequestMapping(value="/bts/bookingproto", method = RequestMethod.POST)
    public @ResponseBody String bookTripProtoSubmit(BookingForm bookingForm){
	   System.out.println("proto" + bookingForm.getId());
	   return "success";
    }
	
	
	

}
