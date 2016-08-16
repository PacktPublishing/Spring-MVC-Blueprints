package org.packt.academic.student.portal.service;


public interface LoginService {
	
	public boolean isAdminUser(String username, String password);
	public boolean isStudentUser(String username, String password);
	public boolean isFacultyUser(String username, String password);

}
