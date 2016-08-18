package org.packt.erp.modules;

import java.net.MalformedURLException;

import org.codehaus.xfire.XFire;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

	@RequestMapping("/erp/profiles/list")
	public String listProfiles(Model model) {
		Service serviceModel = new ObjectServiceFactory()
				.create(XfireService.class);
		XFire xfire = XFireFactory.newInstance().getXFire();
		XFireProxyFactory factory = new XFireProxyFactory(xfire);
		String serviceUrl = "http://localhost:8080/ch08-xfire-ws/service/XfireService";
		XfireService client = null;
		try {
			client = (XfireService) factory.create(serviceModel, serviceUrl);

		} catch (MalformedURLException e) {
			
		}

		Person[] persons = client.getAllPersons();
		model.addAttribute("persons", persons);

		return "list";
	}

}
