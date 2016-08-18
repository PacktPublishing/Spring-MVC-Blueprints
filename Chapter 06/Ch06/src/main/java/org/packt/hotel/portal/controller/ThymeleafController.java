package org.packt.hotel.portal.controller;

import org.packt.hotel.portal.exception.GuestFoundException;
import org.packt.hotel.portal.model.data.HmsUserProfile;
import org.packt.hotel.portal.model.form.ProfileForm;
import org.packt.hotel.portal.service.HotelService;
import org.packt.hotel.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {
    @Autowired
    private HotelService hotelService;
    
    @Autowired
    private UserService userService;
    
   
    @RequestMapping(value = "/hms/thyme/users", method = RequestMethod.GET)
    public String showUsers(Model model) {
        model.addAttribute("users", hotelService.getUserProfiles());
        
        return "result";
    }
    
    @RequestMapping(value = "/hms/thyme/addprofile", method = RequestMethod.GET)
    public String showHome(Model model) {
    	ProfileForm user = new ProfileForm();
        model.addAttribute("user", user);
        
        return "home";
    }
    
   
    
    @RequestMapping(value = "/hms/guests/insert", method = RequestMethod.POST)
	public String insertGuest(Model model, @ModelAttribute ProfileForm user) {
		userService.addUser(user);
		 model.addAttribute("user", user);
		return "home";
	}
	
	@ExceptionHandler({GuestFoundException.class})
	public ModelAndView handleDatabaseError(GuestFoundException e) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		modelAndView.addObject("errorMessage", "error.user.exist");
		
	
		
		return modelAndView;
	}

    
    
}
