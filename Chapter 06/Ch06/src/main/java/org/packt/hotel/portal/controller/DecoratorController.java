package org.packt.hotel.portal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.packt.hotel.portal.mapper.UserMapper;
import org.packt.hotel.portal.model.data.HmsFreeBooking;
import org.packt.hotel.portal.model.data.HmsMenu;
import org.packt.hotel.portal.model.form.JoinUserProfileForm;
import org.packt.hotel.portal.service.BookingService;
import org.packt.hotel.portal.service.MenuService;
import org.packt.hotel.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DecoratorController {

	@Autowired
	private UserService userService;

	@Autowired
	private BookingService bookingService;

	@Autowired
	private MenuService menuService;

	@RequestMapping("/hms/decorate/profiles")
	public String getFirst(Model model) {
		List<JoinUserProfileForm> profiles = userService.getUserProfiles();
		model.addAttribute("profiles", profiles);
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "profiles";
	}

	@RequestMapping(value = "/hms/decorate/profiles", method = RequestMethod.POST)
	public String getFirst(Locale locale, Model model,
			@ModelAttribute HmsFreeBooking freeBookForm) {
		List<JoinUserProfileForm> profiles = userService.getUserProfiles();
		model.addAttribute("profiles", profiles);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "profiles";
	}

	@RequestMapping("/hms/decorate/menu")
	public String getSecond(Model model) {
		List<HmsMenu> menu = menuService.getAllMenuOptions();
		model.addAttribute("menu", menu);
		HmsFreeBooking freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "menu";
	}
	
	@RequestMapping(value = "/hms/decorate/menu", method = RequestMethod.POST)
	public String getSecond(Locale locale, Model model,
			@ModelAttribute HmsFreeBooking freeBookForm) {
		List<HmsMenu> menu = menuService.getAllMenuOptions();
		model.addAttribute("menu", menu);
		freeBookForm = new HmsFreeBooking();
		model.addAttribute("freeBookForm", freeBookForm);
		references(model);
		return "menu";
	}


	public void references(Model model) {
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
