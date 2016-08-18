package org.packt.bus.portal.service;

import java.util.List;

import org.packt.bus.portal.model.data.StationDetail;
import org.packt.bus.portal.model.data.Trip;
import org.packt.bus.portal.model.form.TripForm;

public interface TripService {
	
	public List<StationDetail> getAllStations();
	public void addTrip(TripForm tripForm);
	public List<Trip> getTrips();

}
