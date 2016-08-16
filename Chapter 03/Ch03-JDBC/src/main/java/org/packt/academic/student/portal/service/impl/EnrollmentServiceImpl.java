package org.packt.academic.student.portal.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.packt.academic.student.portal.dao.EnrollmentDao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.AvailCourseForm;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.packt.academic.student.portal.model.form.ListAvailCourseForm;
import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;
import org.packt.academic.student.portal.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnrollmentServiceImpl implements EnrollmentService {
	
	@Autowired
	private EnrollmentDao enrollmentDao;
	
	public EnrollmentDao getEnrollmentDao() {
		return enrollmentDao;
	}

	public void setEnrollmentDao(EnrollmentDao enrollmentDao) {
		this.enrollmentDao = enrollmentDao;
	}

	@Override
	public List<Tblcourses> getAvailCourses() {
		// TODO Auto-generated method stub
		return enrollmentDao.getCourses();
	}

	@Override
	public List<Tblfaculty> getAvailFaculty() {
		// TODO Auto-generated method stub
		return enrollmentDao.getFaculty();
	}

	@Override
	public void enroll(ListAvailCourseForm course, int studentId) {
		List<AvailCourseForm> enrolledCourses = course.getAvailCourseFormList();
		for(AvailCourseForm form: enrolledCourses ){
			if(form.isEnroll()){
				Tblstudentgrades grade = new Tblstudentgrades();
				grade.setFacultyId(form.getFacultyId());
				grade.setGrade(0.0);
				grade.setLevel(form.getLevel());
				grade.setSemester(form.getSemester());
				Tblstudents stud = new Tblstudents();
				stud.setStudentId(studentId);
			    grade.setTblstudents(stud);
				Tblcourses cTaken = new Tblcourses();
				cTaken.setCourseCode(form.getCourseCode());
			    grade.setTblcourses(cTaken);
				enrollmentDao.setCourse(grade);
			}
		}

	}

	@Override
	public ListAvailCourseForm listForm() {
		List<AvailCourseForm> list = new ArrayList<>();
		Iterator<Tblcourses> iterateCourse = getAvailCourses().iterator();
		while(iterateCourse.hasNext()){
			Tblcourses course = iterateCourse.next();
			AvailCourseForm form = new AvailCourseForm();
			System.out.println(course.getCourseCode());
			form.setCourseCode(course.getCourseCode());
			form.setCourseName(course.getCourseName());
			form.setCourseUnit(course.getCourseUnit());
			form.setSemester(1);
			form.setLevel(1);
			form.setFacultyId(50);
			list.add(form);
			
		}
		ListAvailCourseForm formList = new ListAvailCourseForm();
		formList.setAvailCourseFormList(list);
		return formList;
	}

	@Override
	public void setStudentGrade(Tblstudentgrades grade) {
		enrollmentDao.setStudentGrade(grade);
		
	}

	@Override
	public List<Tblstudentgrades> getStudentList(int facultyId) {
		// TODO Auto-generated method stub
		return enrollmentDao.getStudentList(facultyId);
	}

	@Override
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId) {
		// TODO Auto-generated method stub
		return enrollmentDao.getFacultyStudent(facultyId);
	}

	@Override
	public ListJoinCourseTakenForm masterList(int facultyId) {
		List<JoinStudCourseTakenForm> joinForm = enrollmentDao.getFacultyStudent(facultyId);
		System.out.println("masterlist: " + joinForm.size());
		ListJoinCourseTakenForm listForm = new ListJoinCourseTakenForm();
		listForm.setListJoinedStudentList(joinForm);
		return listForm;
	}

}
