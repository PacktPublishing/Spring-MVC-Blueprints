package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsRoomType;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsroomtypes")
@Controller
@RooWebScaffold(path = "hmsroomtypes", formBackingObject = HmsRoomType.class)
public class HmsRoomTypeController {
}
