package org.packt.academic.student.portal.service;

import java.util.List;

import org.packt.academic.student.portal.model.data.Application;

public interface ApplicationService {

	public void saveApplication(Application application);
	public List<Application> retrieveApplication();
	
	public Application retrieveProfile(Integer regId);
	public boolean hasApplied(Integer regId);
	public void registerApplication(Application application);
	
	public void removePending(Application application);
	public void enableAccount(Application application);
}
