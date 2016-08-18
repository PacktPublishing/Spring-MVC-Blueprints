package org.packt.bus.portal.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.packt.bus.portal.model.data.StationDetail;
import org.packt.bus.portal.model.data.Trip;
import org.packt.bus.portal.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerData {
	
	@Autowired
	TripService tripService;
	
	
	@RequestMapping(value="/bts/stations", method=RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody List<Integer> getStationDetail(){
		List<StationDetail> stations = tripService.getAllStations();
		List<Integer> ids = new ArrayList<>();
		Iterator<StationDetail> iterate = stations.iterator();
		while(iterate.hasNext()){
			ids.add(iterate.next().getId());
		}
		System.out.println("stations: " + stations.size());
		return ids;
	}
	
	@RequestMapping(value="/bts/name", method=RequestMethod.GET, headers = "Accept=text/plain;charset=UTF-8")
	public @ResponseBody String getDefaultName(){
		return "Alibata Liner";
	}
	
	@RequestMapping(value="/bts/trips", method=RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody List<Trip> getTrips(){
		return tripService.getTrips();
	}


}
