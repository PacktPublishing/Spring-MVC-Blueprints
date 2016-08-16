package org.packt.academic.student.portal.service.impl;

import java.util.List;

import org.packt.academic.student.portal.mapper.ReportMapper;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportMapper reportMapper;
	
	
	@Override
	public List<Tblcourses> getAllCourses() {
		
		return reportMapper.getCourses();
	}

	
	@Override
	public List<Tblfaculty> getAllFaculty() {
		
		return reportMapper.getFaculty();
	}

	
	@Override
	public List<Tbldepartment> getAllDepartment() {
		
		return reportMapper.getDepartment();
	}

	@Override
	public Tblstudents getStudentId(String username) {
		// TODO Auto-generated method stub
		return reportMapper.getStudentId(username);
	}

	@Override
	public Tblfaculty getFacultyId(String username) {
		// TODO Auto-generated method stub
		return reportMapper.getFacultyId(username);
	}

}
