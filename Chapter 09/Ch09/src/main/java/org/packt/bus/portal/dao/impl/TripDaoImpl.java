package org.packt.bus.portal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.bus.portal.dao.TripDao;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.StationDetail;
import org.packt.bus.portal.model.data.Trip;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TripDaoImpl implements TripDao {
	
	@PersistenceContext(unitName="btsPersistenceUnit" )
	EntityManager entityManagerFactory;

	@Transactional
	@Override
	public void setTrip(Trip trip) {
		entityManagerFactory.persist(trip);
		entityManagerFactory.flush();

	}

	@Override
	public List<Trip> getTrips() {
		String qlString = "SELECT t FROM Trip t";
		TypedQuery<Trip> query = entityManagerFactory.createQuery(qlString, Trip.class);
		return query.getResultList();
		
	}

	@Override
	public Trip getTrip(Integer id) {
		String qlString = "SELECT t FROM Trip t WHERE t.id = ?1";
		TypedQuery<Trip> query = entityManagerFactory.createQuery(qlString, Trip.class);
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Override
	public List<StationDetail> getStations() {
		String qlString = "SELECT s FROM StationDetail s";
		TypedQuery<StationDetail> query = entityManagerFactory.createQuery(qlString, StationDetail.class);
		return query.getResultList();
	}

}
