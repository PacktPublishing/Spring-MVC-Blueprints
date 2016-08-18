package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsFreeBooking;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsfreebookings")
@Controller
@RooWebScaffold(path = "hmsfreebookings", formBackingObject = HmsFreeBooking.class)
public class HmsFreeBookingController {
}
