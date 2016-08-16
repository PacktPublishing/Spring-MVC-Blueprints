package org.packt.academic.student.portal.dao;

import org.packt.academic.student.portal.model.data.Login;

public interface LoginDao {
	
	public Login getStudentUser(Login login);
	public Login getFacultyUser(Login login);
	public Login getAdmin(Login login);

}
