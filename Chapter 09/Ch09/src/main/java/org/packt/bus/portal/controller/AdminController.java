package org.packt.bus.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	

	
	@RequestMapping("/bts/hotline")
	public String hotline(){
		return "customer-service";
	}
	
	@RequestMapping("/hello")
	public  String hello(){
		return "hello";
	}
	
	@RequestMapping("/bts/destinations")
	public String listDestinations(){
		return "destinations-list";
	}
	
	@RequestMapping("/bts/statsperyear")
	public String yearlyStats(){
		return "yearly-stats";
	}
	
	@RequestMapping("/bts/googlechart")
	public String googleStats(){
		return "google-js";
	}



}
