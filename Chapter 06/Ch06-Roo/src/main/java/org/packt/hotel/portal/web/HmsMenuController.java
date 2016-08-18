package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsMenu;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsmenus")
@Controller
@RooWebScaffold(path = "hmsmenus", formBackingObject = HmsMenu.class)
public class HmsMenuController {
}
