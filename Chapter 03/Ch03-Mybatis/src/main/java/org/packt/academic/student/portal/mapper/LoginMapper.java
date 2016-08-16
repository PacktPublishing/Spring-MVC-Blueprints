package org.packt.academic.student.portal.mapper;

import java.util.Map;

import org.packt.academic.student.portal.model.data.Tbladminuser;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudentuser;

public interface LoginMapper {
	public Tblstudentuser getStudentUser(Map<String, String> map);
	public Tblfacultyuser getFacultyUser(Map<String, String> map);
	public Tbladminuser getAdmin(Map<String, String> map);
}
