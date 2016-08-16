package org.packt.academic.student.portal.service;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.form.AvailCourseForm;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;
import org.packt.academic.student.portal.model.form.ListAvailCourseForm;
import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;

public interface EnrollmentService {
	
	public List<Tblcourses> getAvailCourses();
	public List<Tblfaculty> getAvailFaculty();
	
	public void enroll(ListAvailCourseForm course, int studentId);
	public  ListAvailCourseForm listForm();
	
	public void setStudentGrade(Tblstudentgrades grade);
	public List<Tblstudentgrades> getStudentList(int facultyId);
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId);
	public ListJoinCourseTakenForm masterList(int facultyId);

}
