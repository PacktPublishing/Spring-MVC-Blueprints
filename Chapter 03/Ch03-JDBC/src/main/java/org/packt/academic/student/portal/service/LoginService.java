package org.packt.academic.student.portal.service;

import org.packt.academic.student.portal.model.data.Login;

public interface LoginService {
	
	public boolean isAdminUser(Login login);
	public boolean isStudentUser(Login login);
	public boolean isFacultyUser(Login login);

}
