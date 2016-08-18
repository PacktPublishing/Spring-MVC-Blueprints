package org.packt.bus.portal.dao;

import java.util.List;

import org.packt.bus.portal.model.data.StationDetail;
import org.packt.bus.portal.model.data.Trip;

public interface TripDao {
	
	public void setTrip(Trip trip);
	public List<Trip>  getTrips();
	public Trip getTrip(Integer id);
	public List<StationDetail> getStations();

}
