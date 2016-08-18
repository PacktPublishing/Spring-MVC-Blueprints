package org.packt.bus.portal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.packt.bus.portal.dao.BookingDao;
import org.packt.bus.portal.model.data.BookedTrip;
import org.packt.bus.portal.model.data.BookingPayment;
import org.packt.bus.portal.model.data.CustomerInfo;
import org.packt.bus.portal.model.data.Trip;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookingDaoImpl implements BookingDao {
	
	@PersistenceContext(unitName="btsPersistenceUnit" )
	EntityManager entityManagerFactory;

	@Override
	public List<BookedTrip> getBookings(Integer userId) {
		String qlString = "SELECT b FROM BookedTrip b WHERE b.customerInfo.id = ?1";
		TypedQuery<BookedTrip> query = entityManagerFactory.createQuery(qlString, BookedTrip.class);
		query.setParameter(1, userId);
		return query.getResultList();
	}

	@Override
	public BookingPayment getPayment(Integer id) {
		String qlString = "SELECT b FROM BookingPayment b WHERE b.id = ?1";
		TypedQuery<BookingPayment> query = entityManagerFactory.createQuery(qlString, BookingPayment.class);
		query.setParameter(1, id);
		return query.getSingleResult();
	}

	@Transactional
	@Override
	public void setBooking(BookedTrip booking) {
		entityManagerFactory.persist(booking);
		entityManagerFactory.flush();
	}

	@Override
	public void deleteBooking(BookedTrip booking) {
		entityManagerFactory.remove(booking);
		entityManagerFactory.flush();
		
	}

	@Override
	public BookedTrip getBooking(Integer id) {
		String qlString = "SELECT b FROM BookedTrip b WHERE b.id = ?1";
		TypedQuery<BookedTrip> query = entityManagerFactory.createQuery(qlString, BookedTrip.class);
		query.setParameter(1, id);
		return query.getSingleResult();
	}

}
