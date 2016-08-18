package org.packt.hotel.portal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.packt.hotel.portal.model.data.HmsFreeBooking;
import org.packt.hotel.portal.model.data.Product;
import org.packt.hotel.portal.model.form.JoinRoomTypeForm;
import org.packt.hotel.portal.service.BookingService;
import org.packt.hotel.portal.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TilesController {
	@Autowired
	private BookingService bookingService;
	
	@Autowired
	private RoomService roomService;
    // Map requests to Home Page
    @RequestMapping("/hms/tilesindex")
    public String indexTilesForm(Model model){
    	HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
       
        return "hms.home";
    }
    
    @RequestMapping(value="/hms/tilesindex", method=RequestMethod.POST)
	public String indexTilesSubmit(Locale locale, Model model, @ModelAttribute HmsFreeBooking freeBookForm){
		bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		return "hms.home";
	}

    // Map requests to product Page
    @RequestMapping("/hms/tilesrooms")
    public String indexTilesRoomDetails(Model model){
    	HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
        List<JoinRoomTypeForm> roomDetails = roomService.getRoomDetails();
        model.addAttribute("roomDetails",roomDetails);
        return "hms.roomdetails";
    }
    
    @RequestMapping(value="/hms/tilesrooms", method=RequestMethod.POST)
    public String indexTilesRoomDetails(Locale locale, Model model, @ModelAttribute HmsFreeBooking freeBookForm){
    	bookingService.reserveBooking(freeBookForm);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
        List<JoinRoomTypeForm> roomDetails = roomService.getRoomDetails();
        model.addAttribute("roomDetails",roomDetails);
        return "hms.roomdetails";
    }



   /* Convenience method to get a list of In Memory products, 
     In actual scenario this should come from a Repository via a Service */

    private ArrayList<Product> getAllProducts() {

        ArrayList<Product> productList = new ArrayList<Product>();

        Product p1 = new Product("Apple iPhone 5s","Smart Phone","iphone.jpg",250);
        Product p2 = new Product("Samsung Galaxy S6","Smart Phone","s6.jpg",300);
        Product p3 = new Product("LG Nexus 5","Smart Phone","nexus.jpg",100);
        Product p4 = new Product("HTC One M9","Smart Phone","htc.jpg",300);

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);

        return productList;
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
