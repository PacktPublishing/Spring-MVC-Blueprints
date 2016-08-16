package org.packt.human.resource.portal.service.impl;

import java.util.List;

import org.packt.human.resource.portal.dao.AttendanceDao;
import org.packt.human.resource.portal.model.data.HrmsEmployeeAttendance;
import org.packt.human.resource.portal.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	
	@Autowired
	private AttendanceDao attendanceDao;

	@Override
	public List<HrmsEmployeeAttendance> getAttendance(int empid) {
		
		return attendanceDao.getAttendance(empid);
	}

}
