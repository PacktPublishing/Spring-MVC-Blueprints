package org.packt.hotel.portal.controller;

import org.springframework.mobile.device.Device;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MobileAdaptiveController {
	
	    @RequestMapping(value={"/hms/desktop", "/hms/mobile","/hms/tablet"})
	    public String showAdaptive(SitePreference spf, Device device, Model model) {

	        switch(spf){
	        case MOBILE:
	        	model.addAttribute("siteType", "Mobile Version");
	        	return "mobile";
	        	
	        case NORMAL: 
	        	model.addAttribute("siteType", "Desktop Version");
	        	return "desktop";
	        case TABLET: 
	        	model.addAttribute("siteType", "Tablet Version");
	        	return "tablet";
	        }
	        return "mobile";
	    }
	
}
