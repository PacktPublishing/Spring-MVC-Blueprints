package org.packt.human.resource.portal.service;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsEmployeeAttendance;

public interface AttendanceService {
	
	public List<HrmsEmployeeAttendance> getAttendance(int empid);

}
