package org.packt.human.resource.portal.dao;

import java.util.List;

import org.packt.human.resource.portal.model.data.HrmsEmployeeAttendance;

public interface AttendanceDao {
	
	public List<HrmsEmployeeAttendance> getAttendance(int empId);

}
