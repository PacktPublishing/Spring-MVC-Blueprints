package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsRoomBooking;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsroombookings")
@Controller
@RooWebScaffold(path = "hmsroombookings", formBackingObject = HmsRoomBooking.class)
public class HmsRoomBookingController {
}
