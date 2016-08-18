package org.packt.bus.portal.service.impl;

import java.util.List;

import org.packt.bus.portal.dao.TripDao;
import org.packt.bus.portal.model.data.StationDetail;
import org.packt.bus.portal.model.data.Trip;
import org.packt.bus.portal.model.form.TripForm;
import org.packt.bus.portal.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class TripServiceImpl implements TripService {
	@Autowired
	TripDao tripDao;

	@Override
	public List<StationDetail> getAllStations() {
		
		return tripDao.getStations();
	}

	@Override
	public void addTrip(TripForm tripForm) {
		Trip trip = new Trip();
        trip.setId(tripForm.getId());
        trip.setName(tripForm.getName());
        trip.setSightsStops(tripForm.getNsights());
        trip.setDayDuration(tripForm.getDayTrip());
        trip.setNightDuration(tripForm.getNightTrip());
        trip.setTypeDuration(tripForm.getTypeTrip());
        trip.setOtherTransport(tripForm.getOtherTranspo());
        trip.setLanguage(tripForm.getLanguage());
        trip.setPriceAdult(tripForm.getAdultPrice());
        trip.setPriceKid(tripForm.getKidPrice());
        
        StationDetail detail = new StationDetail();
        detail.setId(tripForm.getStationId());
        trip.setStationDetail(detail);
        
        tripDao.setTrip(trip);
	}

	@Override
	public List<Trip> getTrips() {
		// TODO Auto-generated method stub
		return tripDao.getTrips();
	}

}
