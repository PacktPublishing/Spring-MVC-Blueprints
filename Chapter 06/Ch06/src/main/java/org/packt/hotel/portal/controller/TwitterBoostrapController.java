package org.packt.hotel.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwitterBoostrapController {
	
	@RequestMapping("/hms/tabletpending")
	public String tabletRooms(){
	    return "tablet";	
	}
	
	@RequestMapping("/hms/androidpending")
	public String androidRooms(){
	    return "android";	
	}
	
	@RequestMapping("/hms/largepending")
	public String largeRooms(){
	    return "large";	
	}

}
