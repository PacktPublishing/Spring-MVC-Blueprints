package org.packt.academic.student.portal.mapper;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblgpa;
import org.packt.academic.student.portal.model.data.Tblstudentgrades;

public interface GWAMapper {
	
	public List<Tblstudentgrades> getStudentGrade(int studId);
	public void setStudentGrade(Tblstudentgrades enrolledCourse);
	public void setGWA(Tblgpa gpa);

}
