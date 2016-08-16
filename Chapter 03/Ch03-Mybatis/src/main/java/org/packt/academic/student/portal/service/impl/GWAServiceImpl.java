package org.packt.academic.student.portal.service.impl;

import java.util.Iterator;
import java.util.List;

import org.packt.academic.student.portal.mapper.GWAMapper;
import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblgpa;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.data.Tblstudents;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;
import org.packt.academic.student.portal.service.GWAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GWAServiceImpl implements GWAService {
	
	@Autowired
	private GWAMapper gwaMapper;
	

	@Transactional
	@Override
	public double computeGWA(int studentId) {
		System.out.println("gwa studentId: " + studentId);
		List<Tblstudentgrades> grades = gwaMapper.getStudentGrade(studentId);
		
		double gwa = 0.0;
		for(Tblstudentgrades tg : grades){
			gwa += tg.getGrade();
			System.out.println("gwa grades");
		}
		Tblgpa gpa = new Tblgpa();
		gpa.setStudentId(studentId);
		gpa.setGpaCalculated((double)(gwa/grades.size()));
		//Tblstudents stud = new Tblstudents();
		//stud.setStudentId(studentId);
		//gpa.setTblstudents(stud);
		//gwaDao.setGWA(gpa);
		return gwa/grades.size();
	}

	@Override
	public List<Tblstudentgrades> getCoursesTaken(int studentId) {
		System.out.println("gwa studentId: " + studentId);
		List<Tblstudentgrades> grades = gwaMapper.getStudentGrade(studentId);
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
				
				gwaMapper.setStudentGrade(grade);
			}
		}
		
	}

}
