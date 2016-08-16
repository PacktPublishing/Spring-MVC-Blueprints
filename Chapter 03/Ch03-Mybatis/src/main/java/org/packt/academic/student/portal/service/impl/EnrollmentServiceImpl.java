package org.packt.academic.student.portal.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.packt.academic.student.portal.mapper.EnrollmentMapper;
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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
@Service
public class EnrollmentServiceImpl implements EnrollmentService {
	
	@Autowired
	private EnrollmentMapper enrollmentMapper;
	
	
	@Override
	public List<Tblcourses> getAvailCourses() {
		// TODO Auto-generated method stub
		return enrollmentMapper.getCourses();
	}

	@Override
	public List<Tblfaculty> getAvailFaculty() {
		// TODO Auto-generated method stub
		return enrollmentMapper.getFaculty();
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
			    enrollmentMapper.setCourse(grade);
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
		enrollmentMapper.setStudentGrade(grade);
		
	}

	@Override
	public List<Tblstudentgrades> getStudentList(int facultyId) {
		// TODO Auto-generated method stub
		return enrollmentMapper.getStudentList(facultyId);
	}

	@Override
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId) {
		// TODO Auto-generated method stub
		return enrollmentMapper.getFacultyStudent(facultyId);
	}

	@Override
	public ListJoinCourseTakenForm masterList(int facultyId) {
		List<JoinStudCourseTakenForm> joinForm = enrollmentMapper.getFacultyStudent(facultyId);
		System.out.println("masterlist: " + joinForm.size());
		ListJoinCourseTakenForm listForm = new ListJoinCourseTakenForm();
		listForm.setListJoinedStudentList(joinForm);
		return listForm;
	}

}
