package org.packt.academic.student.portal.service.impl;

import org.packt.academic.student.portal.dao.ManagementDao;
import org.packt.academic.student.portal.model.data.Level;
import org.packt.academic.student.portal.model.data.Semester;
import org.packt.academic.student.portal.model.data.Status;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.CourseForm;
import org.packt.academic.student.portal.model.form.DepartmentForm;
import org.packt.academic.student.portal.model.form.FacultyForm;
import org.packt.academic.student.portal.model.form.StudentForm;
import org.packt.academic.student.portal.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ManagementServiceImpl implements ManagementService {
	
	@Autowired
	private ManagementDao managementDao;
	
	@Transactional
	@Override
	public void addCourse(CourseForm course) {
		Tblcourses courseDb = new Tblcourses();
		Tbldepartment dept = new Tbldepartment();
		dept.setDepartmentId(course.getDeptId());
		courseDb.setTbldepartment(dept);
		courseDb.setCourseCode(course.getCourseCode());
		courseDb.setCourseName(course.getCourseName());
		courseDb.setCourseUnit(course.getCourseUnit());
		managementDao.setCourse(courseDb);
	}

	@Transactional
	@Override
	public void addDepartment(DepartmentForm dept) {
		Tbldepartment deptDb = new Tbldepartment();
		deptDb.setDepartmentId(dept.getDeptId());
		deptDb.setDepartmentName(dept.getDeptName());
		managementDao.setDepartment(deptDb);
		
	}

	@Transactional
	@Override
	public void addStudent(StudentForm student) {
		Tblstudents studDb = new Tblstudents();
		studDb.setStudentId(student.getStudentID());
		studDb.setFirstName(student.getFirstName());
		studDb.setLastName(student.getLastName());
		studDb.setMiddleName(student.getMiddleName());
		studDb.setDegree(student.getDegree());
		Level level = new Level();
		level.setLevel(student.getLevel());
		studDb.setLevel(level);
		Semester sem = new Semester();
		sem.setSemester(student.getSemester());
		studDb.setSemester(sem);
		Status status = new Status();
		status.setStatus(student.getStatus());
		studDb.setStatus(status);
		studDb.setAddress(student.getAddress());
		studDb.setMobile(student.getMobile());
		studDb.setEmail(student.getEmail());
		managementDao.setStudent(studDb);
		
	}

	@Transactional
	@Override
	public void addFaculty(FacultyForm faculty) {
		Tblfaculty facultyDb = new Tblfaculty();
		Tbldepartment dept = new Tbldepartment();
		dept.setDepartmentId(faculty.getDeptId());
		facultyDb.setTbldepartment(dept);
		facultyDb.setFacultyId(faculty.getFacultyId());
		facultyDb.setFirstName(faculty.getFirstName());
		facultyDb.setLastName(faculty.getLastName());
		facultyDb.setMiddleName(faculty.getMiddleName());
		facultyDb.setUsername(faculty.getUsername());
		
		Tblfacultyuser facultyUser = new Tblfacultyuser();
		facultyUser.setUsername(faculty.getUsername());
		facultyUser.setPassword(faculty.getPassword());
		
	
		managementDao.setFaculty(facultyDb, faculty.getUsername());
		managementDao.setFacultyLogin(facultyUser);
		
	}

}
