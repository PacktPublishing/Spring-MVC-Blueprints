package org.packt.academic.student.portal.dao;

import org.packt.academic.student.portal.model.data.Login;
import org.packt.academic.student.portal.model.data.Tbladminuser;
import org.packt.academic.student.portal.model.data.Tblfacultyuser;
import org.packt.academic.student.portal.model.data.Tblstudentuser;

public interface LoginDao {
	
	public Tblstudentuser getStudentUser(Login login);
	public Tblfacultyuser getFacultyUser(Login login);
	public Tbladminuser getAdmin(Login login);

}
