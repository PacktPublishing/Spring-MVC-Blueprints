package org.packt.hotel.portal.web;
import org.packt.hotel.portal.jpa.data.HmsUserProfile;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hmsuserprofiles")
@Controller
@RooWebScaffold(path = "hmsuserprofiles", formBackingObject = HmsUserProfile.class)
public class HmsUserProfileController {
}
