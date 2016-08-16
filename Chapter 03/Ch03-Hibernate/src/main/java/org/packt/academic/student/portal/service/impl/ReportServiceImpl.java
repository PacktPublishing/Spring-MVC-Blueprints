package org.packt.academic.student.portal.service.impl;

import java.util.List;

import org.packt.academic.student.portal.dao.ReportDao;
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
	private ReportDao reportDao;
	
	@Transactional
	@Override
	public List<Tblcourses> getAllCourses() {
		
		return reportDao.getCourses();
	}

	@Transactional
	@Override
	public List<Tblfaculty> getAllFaculty() {
		
		return reportDao.getFaculty();
	}

	@Transactional
	@Override
	public List<Tbldepartment> getAllDepartment() {
		
		return reportDao.getDepartment();
	}

	@Override
	public Tblstudents getStudentId(String username) {
		// TODO Auto-generated method stub
		return reportDao.getStudentId(username);
	}

	@Override
	public Tblfaculty getFacultyId(String username) {
		// TODO Auto-generated method stub
		return reportDao.getFacultyId(username);
	}

}
