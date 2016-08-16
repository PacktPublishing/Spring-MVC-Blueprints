package org.packt.academic.student.portal.dao;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblstudentgrades;

public interface GWADao {
	
	public List<Tblstudentgrades> getStudentGrade(int studId);
	public void setStudentGrade(Tblstudentgrades enrolledCourse);
	public void setGWA(int studentId, double gpa);

}
