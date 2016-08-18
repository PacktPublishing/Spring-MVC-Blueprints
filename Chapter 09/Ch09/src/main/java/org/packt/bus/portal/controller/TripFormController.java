package org.packt.bus.portal.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.packt.bus.portal.model.data.StationDetail;
import org.packt.bus.portal.model.form.TripForm;
import org.packt.bus.portal.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonView;

@Controller
@RequestMapping("/bts/add_destination")
public class TripFormController {
	@Autowired
	TripService tripService;
	
	@RequestMapping(method=RequestMethod.GET)
    public String initForm(Model model) {
        TripForm tripForm = new TripForm();
        model.addAttribute("tripForm", tripForm);
        //references(model);
        return "add-trip";
    }
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody String submitForm(TripForm tripForm){
		
		System.out.println(tripForm.getName());
		
       tripService.addTrip(tripForm);
       
        
		return "Success";
	}
	
	public void references(Model model){
		List<StationDetail> stations = tripService.getAllStations();
		List<Integer> ids = new ArrayList<>();
		Iterator<StationDetail> iterate = stations.iterator();
		while(iterate.hasNext()){
			ids.add(iterate.next().getId());
		}
		//model.addAttribute(JsonView., ids);
		model.addAttribute("stations", ids);
	}


}
