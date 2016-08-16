package org.packt.academic.student.portal.service;

import java.util.List;

import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.model.data.Tblregistration;

public interface ApplicationService {

	public void saveApplication(Application form);
	public List<Tblregistration> retrieveApplication();
	
	public Tblregistration retrieveProfile(Integer regId);
	public boolean hasApplied(Integer regId);
	public void registerApplication(Tblregistration application);
	
	public void removePending(Tblregistration application);
	public void enableAccount(Application form );
}
