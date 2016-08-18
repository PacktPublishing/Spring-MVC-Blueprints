package org.packt.hotel.portal.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.packt.hotel.portal.model.data.HmsRoomType;
import org.packt.hotel.portal.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hms")
public class ExtJsController {

	@Autowired
	private RoomService roomService;
	
	
	@RequestMapping(value = "/ext/extroomtypes")
	public String roomTypes(){
		return "roomtypes-extjs";
	}
	
	@RequestMapping(value = "/ext/extroomtypesgrid")
	public String roomTypesGrid(){
		return "roomtypes-extjs-grid";
	}
	
	@ResponseBody
	@RequestMapping(value = "/ext/getRoomTypes")
	public Map<String, List<HmsRoomType>> getRoomTypes() {	
		List<HmsRoomType> daoRoomTypes = roomService.getAllRoomTypes();
		
		Map<String, List<HmsRoomType>> model = new HashMap<>();
		model.put("roomTypes", daoRoomTypes);
		return model;	
	}
	
	@ResponseBody
	@RequestMapping (value = "/ext/deleteRoomType", method = RequestMethod.POST)
	public boolean deleteBooks(@RequestBody HmsRoomType roomType)	{
		roomService.deleteRoomType(roomType);
	    return true;
	}
	
	@ResponseBody
	@RequestMapping (value = "/ext/addRoomType", method = RequestMethod.POST)
	public boolean addBookType(@RequestBody HmsRoomType roomType)	{
		roomService.setRoomType(roomType);
	    return true;
	}
	
	@ResponseBody
	@RequestMapping (value = "/ext/updateRoomType", method = RequestMethod.POST)
	public boolean updateBookType(@RequestBody HmsRoomType roomType)	{
		roomService.updateRoomType(roomType);
	    return true;
	}
	
	
	
	
}
