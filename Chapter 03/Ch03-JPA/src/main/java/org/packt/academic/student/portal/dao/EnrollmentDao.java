package org.packt.academic.student.portal.dao;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.form.JoinStudCourseTakenForm;

public interface EnrollmentDao {
	
	public List<Tblcourses> getCourses();
	public List<Tblfaculty> getFaculty();
	public void setCourse(Tblstudentgrades enrolledCourse);
	
	public void setStudentGrade(Tblstudentgrades grade);
	public List<Tblstudentgrades> getStudentList(int facultyId);
	public List<JoinStudCourseTakenForm> getFacultyStudent(int facultyId);

}
