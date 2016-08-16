package org.packt.academic.student.portal.service.impl;

import java.util.List;

import org.packt.academic.student.portal.dao.ApplicationDao;
import org.packt.academic.student.portal.model.data.Application;
import org.packt.academic.student.portal.service.ApplicationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	private ApplicationDao applicationDao;
	
	
	public ApplicationDao getApplicationDao() {
		return applicationDao;
	}

	public void setApplicationDao(ApplicationDao applicationDao) {
		this.applicationDao = applicationDao;
	}

	@Transactional
	@Override
	public void saveApplication(Application application) {
		applicationDao.setPendingApp(application);

	}


	@Transactional
	@Override
	public List<Application> retrieveApplication() {
		// TODO Auto-generated method stub
		return applicationDao.getPendingApp();
	}


	@Transactional
	@Override
	public Application retrieveProfile(Integer regId) {
		// TODO Auto-generated method stub
		return applicationDao.getPending(regId);
	}


	@Transactional
	@Override
	public boolean hasApplied(Integer regId) {
		Application profile = applicationDao.getPending(regId);
		if(profile == null){
			return false;
		}
		return true;
	}


	@Transactional
	@Override
	public void registerApplication(Application application) {
		applicationDao.setRegister(application);
		applicationDao.deletePending(application);

	}


	@Transactional
	@Override
	public void removePending(Application application) {
		applicationDao.deletePending(application);
		
	}


	@Transactional
	@Override
	public void enableAccount(Application application) {
		applicationDao.setStudentAccount(application);
		
	}

}
