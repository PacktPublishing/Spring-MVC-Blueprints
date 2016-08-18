package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsRooms;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsroomses")
@Controller
@RooWebScaffold(path = "hmsroomses", formBackingObject = HmsRooms.class)
public class HmsRoomsController {
}
