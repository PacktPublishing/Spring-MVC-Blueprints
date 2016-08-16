package org.packt.academic.student.portal.service.impl;

import java.util.Iterator;
import java.util.List;

import org.packt.academic.student.portal.dao.GWADao;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;
import org.packt.academic.student.portal.service.GWAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GWAServiceImpl implements GWAService {
	
	@Autowired
	private GWADao gwaDao;
	

	@Override
	public double computeGWA(int studentId) {
		List<Tblstudentgrades> grades = gwaDao.getStudentGrade(studentId);
		double gwa = 0.0;
		for(Tblstudentgrades tg : grades){
			gwa += tg.getGrade();
		}
		gwaDao.setGWA(studentId, gwa/grades.size());
		return gwa/grades.size();
	}

	@Override
	public List<Tblstudentgrades> getCoursesTaken(int studentId) {
		List<Tblstudentgrades> grades = gwaDao.getStudentGrade(studentId);
		return grades;
	}

	@Override
	public void gradeCourse(int facultyId, ListJoinCourseTakenForm gradeSheet) {
		List<JoinStudCourseTakenForm> joinForm = gradeSheet.getListJoinedStudentList();
		Iterator<JoinStudCourseTakenForm> iterate = joinForm.iterator();
		
		while(iterate.hasNext()){
			
			JoinStudCourseTakenForm form = iterate.next();
			System.out.println(form.isGraded());
			System.out.println(form.getStudentId());
			System.out.println(form.isGraded());
			System.out.println(form.getGrade());
			System.out.println(form.getCourseCode());
			if(form.isGraded()){
				
				Tblstudentgrades grade = new Tblstudentgrades();
				Tblstudents student = new Tblstudents();
				student.setStudentId(form.getStudentId());
				grade.setTblstudents(student);
				
				Tblcourses course = new Tblcourses();
				course.setCourseCode(form.getCourseCode());
				grade.setTblcourses(course);
				
				grade.setFacultyId(facultyId);
				grade.setLevel(form.getLevel());
				grade.setSemester(form.getSemester());
				
				grade.setGrade(form.getGrade());
				
				gwaDao.setStudentGrade(grade);
			}
		}
		
	}

}
