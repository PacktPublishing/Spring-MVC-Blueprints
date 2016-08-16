package org.packt.academic.student.portal.dao;

import java.util.List;

import org.packt.academic.student.portal.model.data.Application;

public interface ApplicationDao {
	
	public void setPendingApp(Application application);
	public List<Application> getPendingApp();
	
	public Application getPending(Integer regId);
	public void setRegister(Application application);
	
	public void deletePending(Application application);
	public void setStudentAccount(Application application);
	

}
