package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsMenuBooking;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsmenubookings")
@Controller
@RooWebScaffold(path = "hmsmenubookings", formBackingObject = HmsMenuBooking.class)
public class HmsMenuBookingController {
}
