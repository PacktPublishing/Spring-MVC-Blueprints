package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsRoomsMasterlist;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsroomsmasterlists")
@Controller
@RooWebScaffold(path = "hmsroomsmasterlists", formBackingObject = HmsRoomsMasterlist.class)
public class HmsRoomsMasterlistController {
}
