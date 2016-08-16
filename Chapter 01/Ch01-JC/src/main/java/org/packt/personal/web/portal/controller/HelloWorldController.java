package org.packt.personal.web.portal.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public ModelAndView helloworld(){
		
		Map<String, Object> model = new HashMap<>();
		model.put("greeting", "Magandang Umaga");
		
		return new ModelAndView("hello", "myModel", model);
		
	}

}
