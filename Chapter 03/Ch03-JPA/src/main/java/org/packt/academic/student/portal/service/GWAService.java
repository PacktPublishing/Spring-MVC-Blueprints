package org.packt.academic.student.portal.service;

import java.util.List;

import org.packt.academic.student.portal.model.data.Tblstudentgrades;
import org.packt.academic.student.portal.model.form.ListJoinCourseTakenForm;

public interface GWAService {
	
	public double computeGWA(int studentId);
	public List<Tblstudentgrades> getCoursesTaken(int studentId);
	public void gradeCourse(int facultyId, ListJoinCourseTakenForm gradeSheet);
	

}
