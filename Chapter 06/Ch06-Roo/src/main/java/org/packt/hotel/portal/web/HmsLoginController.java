package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsLogin;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
@RooWebScaffold(path = "login", formBackingObject = HmsLogin.class)
public class HmsLoginController {
}
