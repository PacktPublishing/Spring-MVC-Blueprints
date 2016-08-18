package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.Status;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/statuses")
@Controller
@RooWebScaffold(path = "statuses", formBackingObject = Status.class)
public class StatusController {
}
