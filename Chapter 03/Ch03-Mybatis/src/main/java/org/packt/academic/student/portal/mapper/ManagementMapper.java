package org.packt.academic.student.portal.mapper;

import org.packt.academic.student.portal.model.data.Tblcourses;
import org.packt.academic.student.portal.model.data.Tbldepartment;
import org.packt.academic.student.portal.model.data.Tblfaculty;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudents;

public interface ManagementMapper {
	
	public void setCourse(Tblcourses course);
	public void setDepartment(Tbldepartment dept);
	public void setStudent(Tblstudents student);
	public void setFaculty(Tblfaculty faculty);
	//public void setFaculty(Map<String, String> map);
	
	public void setFacultyLogin(Tblfacultyuser facultyUser);
	
}
