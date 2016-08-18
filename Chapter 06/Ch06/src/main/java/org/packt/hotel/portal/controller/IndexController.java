 package org.packt.hotel.portal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.packt.hotel.portal.model.data.HmsFreeBooking;
import org.packt.hotel.portal.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@Autowired
	private BookingService bookingService;
	
	@RequestMapping(value="/hms/index", method=RequestMethod.GET)
	public String getIndexGet(Locale locale, Model model){
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "index";
	}
	
	
	@RequestMapping(value="/hms/index", method=RequestMethod.POST)
	public String getIndexForm(Locale locale, Model model, @ModelAttribute HmsFreeBooking freeBookForm){
		bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		return "index";
	}
	
	@RequestMapping(value="/hms/booking", method=RequestMethod.GET)
    public String getBookingGet(Model model){
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "booking";
	}
	
	@RequestMapping(value="/hms/booking", method=RequestMethod.POST)
    public String getBookingPost(Model model, @ModelAttribute HmsFreeBooking freeBookForm){
		bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		return "booking";
	}
    
	@RequestMapping(value="/hms/locations", method=RequestMethod.GET)
    public String getLocationsGet(Model model){
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "locations";
    }
    
	@RequestMapping(value="/hms/locations", method=RequestMethod.POST)
    public String getLocationsPost(Model model, @ModelAttribute HmsFreeBooking freeBookForm){
		bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		return "locations";
    }
		
	@RequestMapping(value="/hms/services", method=RequestMethod.GET)
    public String getServicesGet(Model model){
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "services";
    }
	
	@RequestMapping(value="/hms/services", method=RequestMethod.POST)
    public String getServicesPost(Model model, @ModelAttribute HmsFreeBooking freeBookForm){
		bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		return "services";
    }
    
	@RequestMapping(value="/hms/rooms", method=RequestMethod.GET)
    public String getRoomsGet(Model model){
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "rooms";
    }
	
	@RequestMapping(value="/hms/rooms", method=RequestMethod.POST)
    public String getRoomsPost(Model model, @ModelAttribute HmsFreeBooking freeBookForm){
		bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		return "rooms";
    }
	
	public void references(Model model){
		List<Integer> stays = new ArrayList<>();
		stays.add(1);
		stays.add(2);
		stays.add(3);
		stays.add(4);
		stays.add(5);
		stays.add(6);
		stays.add(7);
		
		List<Integer> heads = new ArrayList<>();
		heads.add(1);
		heads.add(2);
		heads.add(3);
		heads.add(4);
		heads.add(5);
		heads.add(6);
		heads.add(7);
		
		model.addAttribute("stays", stays);
		model.addAttribute("heads", heads);
		
	}
    

}
