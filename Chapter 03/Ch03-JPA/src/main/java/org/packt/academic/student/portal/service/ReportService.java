package org.packt.academic.student.portal.service;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tbladminuser;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudents;

public interface ReportService {
	public List<Tblcourses> getAllCourses();
	public List<Tblfaculty> getAllFaculty();
	public List<Tbldepartment> getAllDepartment();
	public Tblstudents getStudentId(String username);
	public Tblfaculty getFacultyId(String username);
}
