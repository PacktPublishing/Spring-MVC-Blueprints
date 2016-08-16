package org.packt.human.resource.portal.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.packt.human.resource.portal.dao.AttendanceDao;
import org.packt.human.resource.portal.model.data.HrmsEmployeeAttendance;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AttendanceDaoImpl implements AttendanceDao {
	
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	@Override
	public List<HrmsEmployeeAttendance> getAttendance(int empId) {
		Session session = this.sessionFactory.getCurrentSession();
		List<HrmsEmployeeAttendance> attendance = session.createQuery("from HrmsEmployeeAttendance").list();
		return attendance;
	}

}
