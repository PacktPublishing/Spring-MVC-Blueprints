package org.packt.bus.portal.controller;

import java.util.ArrayList;
import java.util.List;

import org.packt.bus.portal.model.form.TripDateData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoogleAjaxController {
	
	
	@RequestMapping(value="/bts/trips/year", headers="Accept=application/json")
	public List<TripDateData> getYearlyStats(){
		
		return getYearlyTrips();
	}
	
	public List<TripDateData> getYearlyTrips(){
		TripDateData jan = new TripDateData();
		jan.setMonth(1);
		jan.setNumTrips(300);
		TripDateData feb = new TripDateData();
		feb.setMonth(2);
		feb.setNumTrips(200);
		TripDateData mar = new TripDateData();
		mar.setMonth(3);
		mar.setNumTrips(100);
		TripDateData apr = new TripDateData();
		apr.setMonth(4);
		apr.setNumTrips(500);
		TripDateData may = new TripDateData();
		may.setMonth(5);
		may.setNumTrips(600);
		TripDateData jun = new TripDateData();
		jun.setMonth(6);
		jun.setNumTrips(50);
		TripDateData jul = new TripDateData();
		jul.setMonth(7);
		jul.setNumTrips(20);
		TripDateData aug = new TripDateData();
		aug.setMonth(8);
		aug.setNumTrips(150);
		TripDateData sep = new TripDateData();
		sep.setMonth(9);
		sep.setNumTrips(100);
		TripDateData oct = new TripDateData();
		oct.setMonth(10);
		oct.setNumTrips(130);
		TripDateData nov = new TripDateData();
		nov.setMonth(11);
		nov.setNumTrips(400);
		TripDateData dec = new TripDateData();
		dec.setMonth(12);
		dec.setNumTrips(1000);
		
		List<TripDateData> year = new ArrayList<>();
		
		year.add(jan);
		year.add(feb);
		year.add(mar);
		year.add(apr);
		year.add(may);
		year.add(jun);
		year.add(jul);
		year.add(aug);
		year.add(sep);
		year.add(oct);
		year.add(nov);
		year.add(dec);
		
		
		return year;
	}

}
