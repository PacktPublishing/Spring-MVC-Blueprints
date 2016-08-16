package org.packt.academic.student.portal.dao;

import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudents;

public interface ManagementDao {
	
	public void setCourse(Tblcourses course);
	public void setDepartment(Tbldepartment dept);
	public void setStudent(Tblstudents student);
	public void setFaculty(Tblfaculty faculty, String username);
	public void setFacultyLogin(Tblfacultyuser facultyUser);
	
}
