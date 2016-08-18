package org.packt.hotel.portal.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.packt.hotel.portal.model.data.HmsMenuBooking;
import org.packt.hotel.portal.model.data.HmsRoomBooking;
import org.packt.hotel.portal.model.data.HmsRoomType;
import org.packt.hotel.portal.model.data.HmsRoomsMasterlist;
import org.packt.hotel.portal.model.data.HmsUserProfile;
import org.packt.hotel.portal.service.BookingService;
import org.packt.hotel.portal.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hms")
public class AngularController {
	
	@Autowired
	private BookingService bookService;
	
	@Autowired
	private RoomService roomService;

	
		
	
	
	@RequestMapping(value = "/ng/getUserBooking")
	public @ResponseBody List<Map<String, Object>> getUserRoomTypes() {	
		List<Map<String, Object>> allTypes = new ArrayList<Map<String,Object>>();
		List<HmsRoomBooking> userBooked = bookService.getUserBooking();
		System.out.println(userBooked.size());
		for (int i = 0; i < userBooked.size(); i++) {
			Map<String, Object> record = new HashMap<String, Object>();
			HmsRoomBooking booking = userBooked.get(i);
			record.put("id", booking.getId());
			record.put("bookingDate", booking.getBookingDate());
			record.put("roomId", booking.getHmsRoomsMasterlist().getId());
			record.put("bookingStatus", booking.getBookingStatus());
			record.put("profileId", booking.getHmsUserProfile().getId());
			record.put("bookingMenuId", booking.getHmsMenuBooking().getBookId());
			
			allTypes.add(record);
		}
		
		return allTypes;	
	}

	@RequestMapping("/ng/addUserBooking")
	public String getAddUserBooking(){
		return "add_user_booking";
	}
	
	@RequestMapping(value = "/ng/addBooking", method = RequestMethod.POST)
	public String addRoomType(@RequestParam("bookingDate") Date bookingDate,
			                  @RequestParam("roomId") Integer roomId,
			                  @RequestParam("bookingStatus") String bookingStatus,
			                  @RequestParam("profileId") Integer profileId,
			                  @RequestParam("bookingMenuId") Integer bookingMenuId){
		HmsRoomBooking userBooking = new HmsRoomBooking();
		userBooking.setBookingDate(bookingDate);
		HmsRoomsMasterlist room = new HmsRoomsMasterlist();
		room.setId(roomId);
		userBooking.setHmsRoomsMasterlist(room);
		userBooking.setBookingStatus(bookingStatus);
		HmsUserProfile user = new HmsUserProfile();
		user.setId(profileId);
		userBooking.setHmsUserProfile(user);
		HmsMenuBooking menu = new HmsMenuBooking();
		menu.setBookId(bookingMenuId);
		userBooking.setHmsMenuBooking(menu);
		bookService.userBooking(userBooking);
		return "add_user_booking";
	}
	
	
	@RequestMapping(value = "/getRoomTypes")
	public @ResponseBody List<Map<String, Object>> getRoomTypes() {	
		List<Map<String, Object>> allTypes = new ArrayList<Map<String,Object>>();
		List<HmsRoomType> daoRoomTypes = roomService.getAllRoomTypes();
		for (int i = 0; i < daoRoomTypes.size(); i++) {
			Map<String, Object> record = new HashMap<String, Object>();
			HmsRoomType roomType = daoRoomTypes.get(i);
			record.put("id", roomType.getId());
			record.put("type", roomType.getType());
			allTypes.add(record);
		}
		
		return allTypes;	
	}
	
	@RequestMapping(value = "/addRoomType", method = RequestMethod.POST)
	public String addRoomType(@RequestParam("id") Integer id,
			                  @RequestParam("type") String type){
		roomService.addRoomType(id, type);
		return "room_types_page";
	}
	
	@RequestMapping(value = "/ng/getRoomTypesPage")
	public String callRoomTypes(){
		
		return "room_types_page";
	}
}
